package com.springboot.controller;

import com.springboot.vo.MsgVO;
import com.springboot.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by Administrator on 2018/9/27 0027.
 */

@Controller
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;


    @RequestMapping("/login")
    public ModelAndView loginCheck() {
        return new ModelAndView("login");
    }


    @RequestMapping("/loginCheck")
    @ResponseBody
    public MsgVO loginCheck(@RequestBody Map<String, String> map, HttpServletResponse response, HttpSession session) {
        Integer employeeId = Integer.parseInt(map.get("employee_id"));
        session.setAttribute("employeeId",employeeId);
        String password = map.get("emm_password");
        return userService.checkUser(employeeId, password, response);
    }


    @PostMapping("/sureUpdatePd")
    @ResponseBody
    public MsgVO sureUpdatePd(@RequestBody Map<String, String> map) {
        map.keySet().forEach(key -> System.out.println("map.get(" + key + ")=" + map.get(key)));
        Integer employeeId = Integer.parseInt(map.get("employeeId"));
        String oldpassword = map.get("oldpassword");
        String newpassword = map.get("newpassword");
        return userService.updateUserPs(employeeId, oldpassword, newpassword);
    }

    @RequestMapping(value = "/updatePd")
    public String updatePs() {
        return "updatepassword";
    }


    @RequestMapping("/logout")
    public ModelAndView logout(HttpServletRequest request,
                               HttpServletResponse response
    ) {
        return userService.logout(response, request);
    }
}
