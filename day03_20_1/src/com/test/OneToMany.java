package com.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mapper.CardMapper;
import com.mapper.ClazzMapper;
import com.mapper.PersonMapper;
import com.mapper.StudentMapper;
import com.vo.Card;
import com.vo.Clazz;
import com.vo.Person;
import com.vo.Student;

public class OneToMany {
	public static void main(String[] args) {
		try {
			InputStream inputStream=Resources.getResourceAsStream("mybatis.cfg.xml");
			SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
			
			SqlSession session=sqlSessionFactory.openSession();
			//查询测试
			ClazzMapper cm23=session.getMapper(ClazzMapper.class);

			//删除学生
			StudentMapper sm1=session.getMapper(StudentMapper.class);
			List<Student> list=sm1.selectStudentByClazzId(2);
			if(list.size()>0) {
				System.out.println("班级游学生，无法删除");
			}else {
				cm23.deleteClazzById(2);
			}
			
		    session.commit();
		    session.close();
			
	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
