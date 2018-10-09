package com.springboot.excpetion;

import com.springboot.enums.ResultEnum;

/**
 * Created by Administrator on 2018/10/5 0005.
 */
public class CmsException extends RuntimeException {
    private Integer code;

    public CmsException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public CmsException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
