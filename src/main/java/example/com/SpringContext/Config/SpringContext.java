package example.com.SpringContext.Config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import example.com.SpringContext.bean.HelloWorld;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= HelloContext.class)
public class SpringContext {
	@Autowired
	 HelloWorld service;
	
	@Test
	public void dummyTest() {
		System.out.println(service.sayHello());
	}
}

