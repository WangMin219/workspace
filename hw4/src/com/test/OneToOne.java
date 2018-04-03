package com.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.mapping.CacheBuilder;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mapper.CardMapper;
import com.mapper.StudentMapper;
import com.vo.Card;
import com.vo.Student;

public class OneToOne {
	public static void main(String[] args) {
		try {
			InputStream inputStream = Resources.getResourceAsStream("mybatis.cfg.xml");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			SqlSession session = sqlSessionFactory.openSession();
			// 获得mapper接口的代理对象
			// StudentMapper sm=session.getMapper(StudentMapper.class);
			// ֱ直接调用接口的方法，查询id为1的Person数据
			// Student st= sm.selectStudentById(1);
			// System.out.println(st);
			// System.out.println(st.getCard());
			//

			// 插入Card
			// CardMapper cm=session.getMapper(CardMapper.class);
			// Card card=new Card();
			// card.setCardNo(112343);
			// card.setDepartName("计算机");
			// card.setBirthplace("徐州");
			// cm.insertCard(card);
			// //插入Student
			// StudentMapper sm=session.getMapper(StudentMapper.class);
			// Student stu2=new Student();
			// stu2.setStuNo(123434);
			// stu2.setStuName("王平");
			// stu2.setClassName("1611");
			// stu2.setStuId(card.getId());
			// sm.insertStudent(stu2);

			// 调用删除 删除副表时会删除掉自己的id 我要做的就是删除副表的一条信息也删除主表的那条信息 -->
			// CardMapper cm=session.getMapper(CardMapper.class);
			// cm.deleteCardById(1);

			// 获得mapper接口的代理对象
			StudentMapper sm = session.getMapper(StudentMapper.class);

			CardMapper cm = session.getMapper(CardMapper.class);
			// 插入Card
			 Card card=new Card();
			 card.setId(4);
			 card.setCardNo(112354566);
			 card.setDepartName("会计");
			 card.setBirthplace("徐州");
			 cm.updateCardById(card);
			 //插入Student
			 Student stu2=new Student();
			 stu2.setId(15);
			 stu2.setStuNo(123434);
			 stu2.setStuName("王minmin");
			 stu2.setClassName("1611");
			 stu2.setStuId(card.getId());
			 sm.updateStudentById(stu2);

			// 提交会话
			session.commit();
			// 关闭会话
			session.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
