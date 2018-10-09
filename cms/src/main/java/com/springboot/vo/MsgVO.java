package com.springboot.vo;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * 通用返回状态类
 * Created by Administrator on 2018/9/27 0027.
 */

@Data
public class MsgVO {
    //状态码 100-success  200-fail  300-修改初始密码 400-两次结果是否一致
    private int code;

    //提示信息
    private String msg;

    //用户要返回给浏览器的数据
    private Map<String, Object> map = new HashMap<>();

    public static MsgVO success() {
        MsgVO result = new MsgVO();
        result.setCode(100);
        result.setMsg("处理成功！");
        return result;
    }

    public static MsgVO successToUpdatePs() {
        MsgVO result = new MsgVO();
        result.setCode(300);
        result.setMsg("请立即修改初始密码！");
        return result;
    }

    public static MsgVO fail() {
        MsgVO result = new MsgVO();
        result.setCode(200);
        result.setMsg("处理失败！");
        return result;
    }

    public static MsgVO isSame() {
        MsgVO result = new MsgVO();
        result.setCode(400);
        result.setMsg("处理失败！");
        return result;
    }

    public MsgVO add(String key, Object value){
        this.getMap().put(key, value);
        return this;
    }
}
