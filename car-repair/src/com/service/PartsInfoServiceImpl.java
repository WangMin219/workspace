package com.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.PartsInfoDao;
import com.entity.PartsInfo;
import com.util.Result;

@Service
public class PartsInfoServiceImpl implements PartsInfoService{
	@Resource
	PartsInfoDao dao;

	@Override
	public Result buyParts(String id) {
		// TODO Auto-generated method stub
		dao.buyParts(id);
		return new Result("0", "�������ɹ�", null);
	}

	@Override
	public Result findAllParts() {
		// TODO Auto-generated method stub
		List<PartsInfo> list=dao.findAllParts();
		return new Result("0", "�����Ϣ���سɹ�", list);
	}

	@Override
	public Result useParts(String id) {
		// TODO Auto-generated method stub
		dao.useParts(id);
		return new Result("0", "�����ʹ��", null);
	}
	
}
