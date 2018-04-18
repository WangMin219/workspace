package com.service;

import com.dao.IStuDao;
import com.vo.Student;

public class StuService implements IStuService {
	private IStuDao stuDao;
	

	public StuService() {
		super();
	}

	public IStuDao getStuDao() {
		return stuDao;
	}

	public void setStuDao(IStuDao stuDao) {
		this.stuDao = stuDao;
	}

	@Override
	public boolean checkStu(Student stu) {
		boolean result= stuDao.checkStu(stu);
		if(result) {
			return true;
		}
		else {
			return false;
		}
	}





	


	

}
