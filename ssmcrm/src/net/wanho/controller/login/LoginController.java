package net.wanho.controller.login;

import net.wanho.model.LogIn;
import net.wanho.service.LoginService;
import net.wanho.util.CrmResult;
import net.wanho.util.MD5Util;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by sapling on 2017-12-24.
 */
@Controller
@RequestMapping("/login")
public class LoginController {
    @Resource
    private LoginService loginService;

    @RequestMapping(value = "/loginCheck", method = RequestMethod.POST)
    @ResponseBody
    public CrmResult loginCheck(LogIn logIn) {
        CrmResult result = new CrmResult();
        
        result.setData(1);
        return result;
    }

    @RequestMapping("/loginToCms")
    public String loginToCms() {
        return "redirect:/control/countAll";
    }

    @RequestMapping("/updatePassword")
    @ResponseBody
    public CrmResult updatePassword() {
        return null;
    }

    @RequestMapping("/logout")
    public String logout() {
        return "redirect:/login.jsp";
    }
    
    
    @RequestMapping("/modify")
    public String modify() {
        return "redirect:/updatepassword.jsp";
    }
}
