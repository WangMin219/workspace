package com.springboot.service;

import com.springboot.dao.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/10/5 0005.
 */

@Service
public class ProductService {

    @Autowired
    private ProductMapper productMapper;

    public Integer getRecentMonthRecord() {
        return productMapper.selectRecentWeekProduct();
    }
}
