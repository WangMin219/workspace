package com.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mapper.CardMapper;
import com.mapper.PersonMapper;
import com.vo.Card;
import com.vo.Person;

public class OneToOne {
	public static void main(String[] args) {
		try {
			InputStream inputStream=Resources.getResourceAsStream("mybatis.cfg.xml");
			SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
			
			SqlSession session=sqlSessionFactory.openSession();
			PersonMapper pm=session.getMapper(PersonMapper.class);
			CardMapper cm=session.getMapper(CardMapper.class);
			CardMapper cm1=session.getMapper(CardMapper.class);
			
			
			
			//����selectPersonById����
			Person person=pm.selectPersonById(1);
			System.out.println(person);
			System.out.println(person.getCard());
			//�����ͨ���޸ĸ����id��������Ҳ������ʾ
			Card card=new Card();
			card.setCode(1313);
			
			Person person3=new Person();
			person3.setName("sd");
			person3.setSex("Ů");
			person3.setAge(23);
			
			
			cm1.saveCard(card);			
			person3.setCard_id(card.getId());			
			pm.savePerson(person3);	
			
			//�޸�Card����Ϣ
		    Card card1=new Card();
		    card1.setCode(747382);
		    card1.setId(3);
		    cm.updateCard(card1);
		    
		    
		    session.commit();
		    session.close();
			
	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
