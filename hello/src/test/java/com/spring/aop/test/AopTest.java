package com.spring.aop.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.service.AService;
import com.spring.service.BServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/springConfig.xml"})
public class AopTest{
	@Autowired
	private AService aService;
	@Autowired
    private BServiceImpl bService; 
	@Test
	public void testAop(){
		System.out.println("SpringTest JUnit test");  
        aService.fooA("JUnit test fooA");  
        aService.barA();  
        bService.fooB();  
        bService.barB("JUnit test barB",0); 
	}
	


}