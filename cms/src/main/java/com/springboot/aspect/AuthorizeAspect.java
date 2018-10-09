package com.springboot.aspect;

import com.springboot.config.Information;
import com.springboot.excpetion.AuthorizeException;
import com.springboot.util.CookieUtils;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by 廖师兄
 * 2017-07-30 17:31
 */
@Aspect
@Component
@Slf4j
public class AuthorizeAspect {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Autowired
    private Information information;

    @Pointcut("execution(public * com.springboot.controller.*.*(..)) " +
            "&& !execution(public * com.springboot.controller.UserController.*(..))")
    public void verify() {
    }

    @Before("verify()")
    public void doVerify() {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        //查询cookie
        Cookie cookie = CookieUtils.get(request, information.getToken());
        if (cookie == null) {
            log.warn("【登录校验】Cookie中查不到token");
            throw new AuthorizeException();
        }

        //去redis里查询
        String tokenValue = redisTemplate.opsForValue().get(String.format(information.getToken_prefix(), cookie.getValue()));
        if (StringUtils.isEmpty(tokenValue)) {
            log.warn("【登录校验】Redis中查不到token");
            throw new AuthorizeException();
        }
    }
}
