package com.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.CarInfoDao;
import com.dao.UserDao;
import com.entity.CarInfo;
import com.entity.User;
import com.util.Result;
import com.util.IDUtil;

@Service
public class CarInfoServiceImpl implements CarInfoService{

	@Resource
	CarInfoDao dao;
	
	@Resource
	UserDao ud;
	
	@Override
	public Result addCarInfo(String user_id, String plate, String brand, String model, String color, String price,
			String date, String remark) {
		// TODO Auto-generated method stub
		if(plate.equals("")){
			return new Result("1", "�����복��", null);
		}
		
		CarInfo ci=new CarInfo();
		ci.setId(IDUtil.createId());
		ci.setUser_id(user_id);
		User user=ud.findUser(user_id);
		ci.setUser_name(user.getName());
		ci.setPlate(plate);
		ci.setBrand(brand);
		ci.setModel(model);
		ci.setPrice(price);
		ci.setDate(date);
		ci.setColor(color);
		ci.setRemark(remark);
		dao.addCarInfo(ci);
		
		return new Result("0", "������Ϣ��ӳɹ�", null);
	}

	@Override
	public Result showCarInfo(String user_id) {
		// TODO Auto-generated method stub
		List<CarInfo> list=dao.showCarInfo(user_id);
		System.out.println(list.size()+"������");
		return new Result("0", "������Ϣ���سɹ�", list);
	}

	@Override
	public Result delCarInfo(String id) {
		// TODO Auto-generated method stub
		dao.delCarInfo(id);
		return new Result("0", "������Ϣɾ���ɹ�", null);
	}

	@Override
	public Result updateCarInfo(String id, String plate, String brand, String model, String color, String price,
			String date, String remark) {
		// TODO Auto-generated method stub
		if(plate.equals("")){
			return new Result("1", "�����복��", null);
		}
		CarInfo ci=new CarInfo();
		ci.setId(id);
		ci.setPlate(plate);
		ci.setBrand(brand);
		ci.setDate(date);
		ci.setColor(color);
		ci.setModel(model);
		ci.setPrice(price);
		ci.setRemark(remark);
		dao.updateCarInfo(ci);
		return new Result("0", "������Ϣ�޸ĳɹ�", null);
	}

	@Override
	public Result showOneCar(String id) {
		// TODO Auto-generated method stub
		CarInfo ci=dao.showOneCar(id);
		return new Result("0", "������Ϣ���سɹ�", ci);
	}

	@Override
	public Result showAllCar() {
		// TODO Auto-generated method stub
		List<CarInfo> list =dao.showAllCar();
		return new Result("0", "������Ϣ���سɹ�", list);
	}

	@Override
	public Result searchCar(String type,String keywords) {
		// TODO Auto-generated method stub
		Map<String,Object> params=new HashMap<String,Object>();

		if(type.equals("")){
			return new Result("1", "��ѡ�����", null);
		}else if(keywords.equals("")){
			return new Result("1", "������ؼ���", null);
		}else if(type.equals("1")){
			params.put("plate", "%"+keywords+"%");
		}else if(type.equals("2")){
			params.put("brand", "%"+keywords+"%");
		}else if(type.equals("3")){
			params.put("user_name", "%"+keywords+"%");
		}
		List<CarInfo> list=dao.searchCarInfo(params);
		return new Result("0", "������Ϣ���سɹ�", list);
	}

}
