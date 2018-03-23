package com.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mapper.ClazzMapper;
import com.mapper.StudentMapper;
import com.vo.Student;

public class Test1 {

	public static void main(String[] args) {
		try {
			InputStream inputStream=Resources.getResourceAsStream("mybatis.cfg.xml");
			SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
			
			SqlSession session=sqlSessionFactory.openSession();
			//��ѯ����
			ClazzMapper cm23=session.getMapper(ClazzMapper.class);

			//ɾ���༶
			StudentMapper sm1=session.getMapper(StudentMapper.class);
			List<Student> list=sm1.selectStudentByClazzId(2);
			if(list.size()>0) {
				System.out.println("�༶��ѧ�����޷�ɾ��");
			}else {
				cm23.deleteClazzById(2);
			}
			
			
			//ɾ��ѧ��
			sm1.deleteStudentById(2);
			
		    session.commit();
		    session.close();
		    
			
	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}