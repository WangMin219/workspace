package net.wanho.controller.systemMgr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by sapling on 2017-12-24.
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @RequestMapping("/getAllEmployee")
    public String getAllEmployee() {
        return "systemSettings/manage/index";
    }
    @RequestMapping("/findEmployeeById")
    public String findEmployeeById() {
        return "systemSettings/manage/update";
    }

    @RequestMapping("/getDeapartAndPostionInfo")
    public String getDeapartAndPostionInfo() {
        return "systemSettings/manage/create";
    }

    @RequestMapping("/checkParentEmployee")
    @ResponseBody
    public Object checkParentEmployee() {
        return null;
    }

    @RequestMapping("/addEmployee")

    public String addEmployee() {
        return "redirect:getAllEmployee";
    }

    @RequestMapping("/updateEmployee")
    public String updateEmployee() {
        return "redirect:getAllEmployee";
    }

    @RequestMapping("/updateEmployeeStatus")
    public String updateEmployeeStatus() {
        return "redirect:getAllEmployee";
    }
}
