package com.springboot.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/9/27 0027.
 */

@Data
@Component
@ConfigurationProperties(prefix = "infomation")
public class Information {
    /**
     * 初始密码
     */
    private String initialPassword;

    /**
     * token前缀
     */
    private String token_prefix;

    /**
     * token时间
     */
    private Integer expire;

    /**
     * token
     */
    private String token;

    /**
     * 显示的总页数
     */
    private  Integer totalPage;

    /**
     * 每页显示的总记录数
     */
    private Integer pageNum;

    /**
     * 禁用用户状态码
     */
    private Integer banStatus;

    /**
     * 正常用户状态码
     */
    private Integer nomalStatus;
}
