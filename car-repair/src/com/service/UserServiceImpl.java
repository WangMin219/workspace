
package com.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.PersonalInfoDao;
import com.dao.UserDao;
import com.dao.VisitorDao;
import com.entity.User;
import com.entity.Visitor;
import com.util.MD5Util;
import com.util.Result;
import com.util.IDUtil;
@Service
public class UserServiceImpl implements UserService{
	
	@Resource
	private UserDao dao;
	
	@Resource
	private VisitorDao vd;
	
	@Resource
	private PersonalInfoDao pidao;
	
	public Result login(String userName, String userPwd) {
		// TODO Auto-generated method stub
		User user=dao.userLogin(userName);
		Result nr=null;
		String md5Password=MD5Util.md5(userPwd);
		if(user==null){
			nr=new Result("1", "�û�������", null);
		}else if(!user.getPassword().equals(md5Password)){
			nr=new Result("1", "�������", null);
		}else if(user.getStatus()==1){
			nr=new Result("1", "���û��ѱ�����", null);
		}else{
			Integer type=user.getType();
			String userId=user.getId();
			Map<String,Object> data=new HashMap<String, Object>();
			data.put("type", type);
			data.put("userId", userId);
			nr=new Result("0", "��½�ɹ�", data);//���û����id����
			//��ӷÿ�
			if(user.getType()==0){	
				List<Visitor> v_list=vd.visitorList();
				if(v_list.size()>=12){
					vd.delVisitor();
				}
				Visitor v=new Visitor();
				v.setId(IDUtil.createId());
				v.setV_name(userName);
				v.setV_time(getTime());
				v.setLong_time(System.currentTimeMillis());
				vd.addVisitor(v);
			}
		}
		return nr;	
	}
	
	private static String getTime(){
		SimpleDateFormat formatter=new SimpleDateFormat("yyyy��MM��dd��   HH:mm:ss");       
		Date curDate=new Date(System.currentTimeMillis());//��ȡ��ǰʱ��       
		String str=formatter.format(curDate); 
		return str;
	}
	

	public Result changePwd(String user_id, String mpass, String newpass) {
		User user=dao.findUser(user_id);
		Result nr=null;
		if(mpass.equals("")){
			nr=new Result("1", "������ԭʼ����", null);
		}else if(newpass.equals("")){
			nr=new Result("1", "������������", null);
		}else if(mpass.equals("") && newpass.equals("")){
			nr=new Result("1", "����������", null);
		}else if(!MD5Util.md5(mpass).equals(user.getPassword())){
			nr=new Result("1", "ԭʼ���벻��ȷ", null);
		}else{
			dao.changPwd(user_id, MD5Util.md5(newpass));
			nr=new Result("0", "�����޸ĳɹ�", null);
		}
		return nr;		
	}

	@Override
	public Result userList() {
		// TODO Auto-generated method stub
		List<User> list=dao.userList();		
		return new Result("0", "�û���Ϣ���سɹ�", list);
	}

	@Override
	public Result addUser(String name, String password, Integer type) {
		// TODO Auto-generated method stub
		List<User> list=dao.userList();		
		Result nr=null;
		if(name.equals("")){
			nr=new Result("1", "�������û���", null);
		}else if(password.equals("")){
			nr=new Result("1", "����������", null);
		}else{
			for(int i=0;i<list.size();i++){
				if(list.get(i).getName().equals(name)){
					nr=new Result("1", "���û����Ѵ���", null);
					return nr;
				}
			}
			User user=new User();
			String id=IDUtil.createId();
			user.setId(id);
			user.setName(name);
			user.setPassword(MD5Util.md5(password));
			user.setType(type);
			user.setStatus(0);
			dao.addUser(user);
			
			pidao.addUserId(id);
			nr=new Result("0", "�û���ӳɹ�", null);
		}			
			return nr;

	}

	@Override
	public Result changeStatus(String id) {
		// TODO Auto-generated method stub
		User user=dao.findUser(id);
		Integer status=user.getStatus();
		if(status==0){
			dao.changStatus(id, 1);
		}else{
			dao.changStatus(id, 0);
		}
		return new Result("0", "�û�״̬���ĳɹ�", null);
	}
	
}
