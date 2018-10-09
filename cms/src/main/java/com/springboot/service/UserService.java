package com.springboot.service;

import com.springboot.dao.UserMapper;
import com.springboot.config.Information;
import com.springboot.vo.MsgVO;
import com.springboot.dataobject.User;
import com.springboot.util.CookieUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2018/9/27 0027.
 */

@Service
@Slf4j
public class UserService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private Information information;

    @Autowired
    private StringRedisTemplate redisTemplate;

    //登录验证
    public MsgVO checkUser(Integer employeeId, String password, HttpServletResponse response) {
        User user = userMapper.selectUser(employeeId, password);
        if (user != null) {
            if (!user.getEmm_password().equals(information.getInitialPassword())) {
                //用户名密码正确  设置token到redis中
                String token = UUID.randomUUID().toString();
                Integer expire = information.getExpire();

                //存入redis中
                redisTemplate.opsForValue().set(String.format(information.getToken_prefix(), token), String.valueOf(employeeId), expire, TimeUnit.SECONDS);
                log.info("[登录验证]，token成功存入redis");

                //设置token至cookie
                CookieUtils.set(response, information.getToken(), token, expire);
                return MsgVO.success();
            } else if (user.getEmm_password().equals(information.getInitialPassword())) {
                log.info("[登录认证]，密码为初始密码");
                //密码为初始密码
                return MsgVO.successToUpdatePs();
            }
        }
        return MsgVO.fail();
    }

    //修改密码
    @Transactional
    public MsgVO updateUserPs(Integer employeeId, String oldpassword, String newpassword) {
        User user = userMapper.selectUser(employeeId, oldpassword);
        //判断旧密码是否正确
        if (user == null) {
            log.info("[修改密码]，旧密码不正确");
            return MsgVO.fail();
        }
        //判断修改后的密码是否一致
        else if (oldpassword.equals(newpassword)) {
            log.info("[修改密码]，修改后的密码一致");
            return MsgVO.isSame();
        } else {
            User u = new User();
            u.setEmployee_id(employeeId);
            u.setEmm_password(newpassword);
            if (userMapper.updateUserPs(u) == 1) {
                log.info("[修改密码]，修改成功!");
                return MsgVO.success();
            }
            return MsgVO.fail();
        }
    }

    //登出
    public ModelAndView logout(HttpServletResponse response,
                               HttpServletRequest request
    ) {
        //从cookie中查询
        Cookie cookie = CookieUtils.get(request, information.getToken());
        if (cookie != null) {
            //清除redis
            redisTemplate.opsForValue().getOperations().delete(String.format(information.getToken_prefix(), cookie.getValue()));

            //清除cookie
            CookieUtils.set(response, information.getToken(), null, 0);
        }
        return new ModelAndView("login");
    }
}
