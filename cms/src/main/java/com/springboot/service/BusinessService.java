package com.springboot.service;

import com.springboot.dao.BussinessMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/10/5 0005.
 */

@Service
public class BusinessService {
    @Autowired
    private BussinessMapper bussinessMapper;

    public Integer getWeekBusiness(){
        return bussinessMapper.selectWeekBusiness();
    }
}
