package com.proxycode.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proxycode.dao.PersonDao;
import com.proxycode.model.Student;
import com.proxycode.model.Teacher;

public class MainMethod {

	public static void main(String[] args) {
		MainMethod mainMethod=new MainMethod();
		mainMethod.operation();
	}
	
	void operation(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
		PersonDao dao=context.getBean(PersonDao.class);
		
		Student student=new Student();
		student.setName("Smith");
		
		Teacher teacher=new Teacher();
		teacher.setName("Judith");
		
		dao.save(student);
		dao.save(teacher);
		
		context.close();
		
	}

}
