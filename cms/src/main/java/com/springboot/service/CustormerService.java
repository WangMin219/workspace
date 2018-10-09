package com.springboot.service;

import com.springboot.dao.CustormerMapper;
import com.springboot.dataobject.Department;
import com.springboot.config.Information;
import com.springboot.dataobject.Position;
import com.springboot.dataobject.Employee;
import com.springboot.vo.BusinessAndProductVO;
import com.springboot.vo.MenuVO;
import com.springboot.dto.EmployeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Administrator on 2018/9/28 0028.
 */


@Service
public class CustormerService {
    @Autowired
    private CustormerMapper custormerMapper;

    @Autowired
    private Information information;

    public List getSonMenu(Integer emplyee_id) {
        List sonMenu = custormerMapper.selectSonMenu(emplyee_id);
        return sonMenu;
    }

    public List<MenuVO> getFatherMenu(Integer emplyee_id) {
        List<MenuVO> fatherMenu = custormerMapper.selectFather(emplyee_id);
        return fatherMenu;
    }

    public List<List> getMenu(Integer emplyee_id) {
        List<MenuVO> sonMenu = custormerMapper.selectSonMenu(emplyee_id);
        List<MenuVO> fatherMenu = custormerMapper.selectFather(emplyee_id);
        List<List> result = new ArrayList<>();
        for (MenuVO menu : fatherMenu
                ) {
            List<Object> list = new ArrayList<>();
            List<Object> sonList = new ArrayList<>();
            menu.setSonList(sonMenu.stream().filter(x -> x.getParent_menu_id() == menu.getMenu_id()).collect(Collectors.toList()));
            ;
            list.add(menu);
            result.add(list);
        }
        return result;
    }

    public List<Employee> getEmployee() {
        return custormerMapper.selectEmployeeMange();
    }

    public Employee getEmployeeBy(Integer employee_id, String employee_name) {
        return custormerMapper.selectEmployeeByIdAndName(employee_id, employee_name);
    }

    @Transactional
    public Boolean updatEmployeeStatus(Integer employee_id) {
        Integer result = custormerMapper.updateEmployeeStatus(employee_id);
        Boolean flag = false;
        if (result != 0) {
            flag = true;
        }
        return flag;
    }

    @Transactional
    public Boolean updatEmployeeBanStatus(Integer employee_id) {
        Integer result = custormerMapper.updateEmployeeBanStatus(employee_id);
        Boolean flag = false;
        if (result != 0) {
            flag = true;
        }
        return flag;
    }

    public List<Department> getDepartList() {
        return custormerMapper.getDepartList();
    }

    public List<Position> getPositionList() {
        return custormerMapper.getPositionList();
    }

    public Boolean isExistParentEmployeeId(Integer employeeId) {
        boolean flag = false;
        Employee employee = custormerMapper.isExistParentEmployeeId(employeeId);
        if (employee != null) {
            flag = true;
        }
        return flag;
    }

    @Transactional
    public Boolean updateEmployee(EmployeeDTO employee) {
        /*
        配置和设定执行器，SIMPLE 执行器执行其它语句。
        REUSE 执行器可能重复使用prepared statements 语句，
        BATCH执行器可以重复执行语句和批量更新。默认是SIMPLE
        可以自定义配置如下：
        <setting name="defaultExecutorType" value="SIMPLE" />
        */
        Integer count = custormerMapper.updateEmployee(employee);//这里由于没有配置BATCH，因此三张表的批量更新返回null，因此这里就不判断了。
        boolean flag = true;
        return flag;
    }

    public Integer getDepartmentId(String departmentName) {
        return custormerMapper.selectByDepartmentName(departmentName);
    }

    public Integer getPositionId(String positionName) {
        return custormerMapper.selectByPositionName(positionName);
    }

    @Transactional
    public Boolean insertEmployee(EmployeeDTO employeeDTO) {
        Integer insertEmployee = custormerMapper.insertEmployee(employeeDTO);
        //返回自增主键
        Integer employee_id = employeeDTO.getEmployee_id();
        //在log_in表中插入账号信息 默认密码123456
        Integer insertUserCount = custormerMapper.insertUserCount(employee_id, information.getInitialPassword());
        boolean flag = false;
        if (insertEmployee != 0 && insertUserCount != 0) {
            flag = true;
        }
        return flag;
    }

    public Integer getRecentWeekRecord() {
        return custormerMapper.selectWeekRecord();
    }

    public Integer getRecentMonthRecord() {
        return custormerMapper.selectMonthRecord();
    }

    //查询 本月客户,商机
    public List<BusinessAndProductVO> getInfo(Integer employee_id) {
        return custormerMapper.selectInfo(employee_id);
    }
}
