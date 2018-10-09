package net.wanho.service.impl;

import net.wanho.mapper.LogInMapper;
import net.wanho.model.LogIn;
import net.wanho.model.LogInExample;
import net.wanho.service.LoginService;
import net.wanho.util.MD5Util;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by sapling on 2017-12-25.
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Resource
    private LogInMapper logInMapper;

    @Override
    public LogIn login(LogIn logIn)  {
    	//login  zhf198821   zhf
            logIn.setEmmPassword(MD5Util.md5(logIn.getEmmPassword()));
            LogInExample example = new LogInExample();
            LogInExample.Criteria criteria = example.createCriteria();
            // 利用反抽的实体类 进行and连接查询 记住 只能是 单表的
        /*    criteria.andEmployeeIdEqualTo(logIn.getEmployeeId()).andEmmPasswordEqualTo(logIn.getEmmPassword());*/
            
            
            List<LogIn> logs = logInMapper.selectByExample(example);
            return (logs == null || logs.size() == 0 )? null : logs.get(0);
    }
}
