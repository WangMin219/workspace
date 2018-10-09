package com.springboot.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springboot.dataobject.Department;
import com.springboot.config.Information;
import com.springboot.enums.ResultEnum;
import com.springboot.excpetion.CmsException;
import com.springboot.service.BusinessService;
import com.springboot.service.ProductService;
import com.springboot.vo.BusinessAndProductVO;
import com.springboot.vo.MsgVO;
import com.springboot.dataobject.Position;
import com.springboot.service.CustormerService;
import com.springboot.service.UserService;
import com.springboot.dataobject.Employee;
import com.springboot.dto.EmployeeDTO;
import com.sun.org.apache.regexp.internal.RE;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by Administrator on 2018/9/28 0028.
 */

@Controller
@Slf4j
public class CustormerController {
    @Autowired
    private UserService userService;

    @Autowired
    private CustormerService custormerService;

    @Autowired
    private BusinessService businessService;

    @Autowired
    private ProductService productService;

    @Autowired
    private Information information;

    @RequestMapping("loginToCms")
    public ModelAndView loginToCms() {
        return new ModelAndView("main/index");
    }

    @RequestMapping("/getMenu")
    @ResponseBody
    public List<List> getMenu(HttpSession session) {
        Integer employeeId = (Integer) session.getAttribute("employeeId");
        List<List> menu = custormerService.getMenu(employeeId);
        return menu;
    }

    @RequestMapping("/indexInfo")
    @ResponseBody
    public MsgVO getIndexInfo() {
        //近七日新增客户
        Integer newRecentWeekCustormer = custormerService.getRecentWeekRecord();
        //近七日新增商机
        Integer newRecentWeekBusiness = businessService.getWeekBusiness();
        //近一个月新增客户
        Integer newRecentMonthCustormer = custormerService.getRecentMonthRecord();
        //近七日新增订单
        Integer newRencentWeekProduct = productService.getRecentMonthRecord();
        List<Integer> resultData = new ArrayList<>();
        resultData.add(newRecentWeekCustormer);
        resultData.add(newRecentWeekBusiness);
        resultData.add(newRencentWeekProduct);
        resultData.add(newRecentMonthCustormer);
        return MsgVO.success().add("resultData", resultData);
    }

    @RequestMapping("/getBusAndPro")
    @ResponseBody
    public MsgVO getBusAndPro(HttpSession session) {
        try {
            List<BusinessAndProductVO> businessAndProductVOList =  custormerService.getInfo((Integer) session.getAttribute("employeeId"));
            return MsgVO.success().add("resultData",businessAndProductVOList);
        }catch (Exception e){

        }
        return MsgVO.fail();
    }


    @RequestMapping("/systemSettings/manage/index/emps")
    public ModelAndView update(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
        //每页的显示条数
        PageHelper.startPage(pn, information.getPageNum());
        List<Employee> employees = custormerService.getEmployee();
        //设置连续显示的页数
        PageInfo page = new PageInfo(employees, information.getTotalPage());
        Map<String, Object> map = new HashMap<>();
        map.put("pageInfo", page);
        return new ModelAndView("systemSettings/manage/index", map);
    }


    @RequestMapping("/searchEmployee")
    @ResponseBody
    public Employee searchEmployee(@RequestBody Map<String, String> map) {
        Integer emmployeeId = Integer.parseInt(map.get("emmployeeId"));
        String emmployeename = map.get("emmployeename");
        Employee employee = new Employee();
        try {
            employee = custormerService.getEmployeeBy(emmployeeId, emmployeename);
            log.info("[查询员工] 员工信息：{}", employee);
        } catch (Exception e) {
            log.error("[查询员工]");
            throw new CmsException(ResultEnum.SEARCH_EMPLOEE_ERR);
        }
        return employee;
    }

    @RequestMapping("/updateStatus")
    @ResponseBody
    public MsgVO updateStatus(@RequestBody Map<String, String> map) {
        Integer employeeId = Integer.parseInt(map.get("employeeId"));
        Boolean flag = custormerService.updatEmployeeStatus(employeeId);
        log.info("[修改员工状态]，恢复账户：{}", flag);
        if (flag) {
            return MsgVO.success();
        } else {
            log.error("[修改员工账户状态失败]");
            throw new CmsException(ResultEnum.UPDATE_EMPLOYEE_ERR);
        }
    }

    @RequestMapping("/banCount")
    @ResponseBody
    public MsgVO banCount(@RequestBody Map<String, String> map) {
        Integer employeeId = Integer.parseInt(map.get("employeeId"));
        Boolean flag = custormerService.updatEmployeeBanStatus(employeeId);
        log.info("[修改员工状态]，禁用账户：{}", flag);
        if (flag) {
            return MsgVO.success();
        } else {
            log.error("[禁用员工账户状态失败]");
            throw new CmsException(ResultEnum.BAN_EMPLOYEE_fail);
        }
    }

    @RequestMapping("/systemSettings/manage/update/{employeeId}/{employeeName}")
    public ModelAndView toUpdatePage(@PathVariable("employeeId") Integer employeeId,
                                     @PathVariable("employeeName") String employeeName) {
        log.info("[员工信息修改]");
        Employee employee = new Employee();
        try {
            employee = custormerService.getEmployeeBy(employeeId, employeeName);
        } catch (Exception e) {
            log.error("[员工查询失败]");
            throw new CmsException(ResultEnum.SEARCH_EMPLOEE_ERR);
        }
        Map<String, Object> map = new HashMap<>();
        map.put("employee", employee);
        return new ModelAndView("/systemSettings/manage/update", map);
    }


    @RequestMapping("/getDepartmentList")
    @ResponseBody
    public MsgVO getDepartmentList() {
        List<Department> departList = custormerService.getDepartList();
        return MsgVO.success().add("departList", departList);
    }

    @RequestMapping("/getPositionList")
    @ResponseBody
    public MsgVO getPositionList() {
        List<Position> PositionList = custormerService.getPositionList();
        return MsgVO.success().add("PositionList", PositionList);
    }

    @RequestMapping("/isParent_employee_id")
    @ResponseBody
    public MsgVO validParentEmployeeId(@RequestBody Map<String, String> map) {
        Integer parentemployeeId = 0;
        try {
            parentemployeeId = Integer.parseInt(map.get("parentemployeeId"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        boolean result = custormerService.isExistParentEmployeeId(parentemployeeId);
        log.info("[验证上级工号],上级工号是否存在：{}", result);
        if (result) {
            return MsgVO.success();
        }
        return MsgVO.fail();
    }

    @RequestMapping("/sureToUpdateEmployee")
    @ResponseBody
    public MsgVO updateEnployee(@RequestBody Map<String, String> map) {
        Integer employee_id = Integer.parseInt(map.get("employee_id"));
        String employee_name = map.get("employee_name");
        String department_name = map.get("department_name");
        String position_name = map.get("position_name");
        String phone = map.get("phone");
        String email = map.get("email");
        Integer parent_employee_id = Integer.parseInt(map.get("parent_employee_id"));

        //根据department_name 查询对应id
        Integer department_id = custormerService.getDepartmentId(department_name);
        //根据position_name 查询对应id
        Integer positionId = custormerService.getPositionId(position_name);
        EmployeeDTO employee = new EmployeeDTO(employee_id, employee_name, department_id, positionId, phone, email, parent_employee_id);
        custormerService.updateEmployee(employee);
        log.info("[更新员工信息],员工信息：{}", employee);
        return MsgVO.success();
    }

    @RequestMapping("/systemSettings/manage/create")
    public ModelAndView toCreatePage() {
        return new ModelAndView("systemSettings/manage/create");

    }

    @RequestMapping("/createEmployee")
    @ResponseBody
    public MsgVO createEmployee(@RequestBody Map<String, String> map) {
        //接收创建信息
        String employee_name = map.get("employee_name");
        String department_name = map.get("department_name");
        String position_name = map.get("position_name");
        String phone = map.get("phone");
        String email = map.get("email");
        Integer parent_employee_id = Integer.parseInt(map.get("parent_employee_id"));

        //根据department_name 查询对应id
        Integer department_id = custormerService.getDepartmentId(department_name);
        //根据position_name 查询对应id
        Integer positionId = custormerService.getPositionId(position_name);
        EmployeeDTO employeeDTO = new EmployeeDTO(employee_name, department_id, positionId, phone, email, parent_employee_id);

        //插入员工信息（插入登录用户）
        Boolean insertEmployee = custormerService.insertEmployee(employeeDTO);
        Map<String, Object> returnMap = new HashMap<>();
        if (insertEmployee) {
            returnMap.put("message", MsgVO.success());
            log.info("[创建员工],创建成功！");
        } else {
            returnMap.put("message", MsgVO.fail());
            log.info("[创建员工],创建失败！");
            throw new CmsException(ResultEnum.CREATE_EMOLOYEE_FAIL);
        }
        return MsgVO.success();
    }
}
