package cn.itcast.test;

import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;

import cn.itcast.service.impl.AccountServiceImpl;
import org.junit.Before;
import org.junit.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class ServiceTest {

    private AccountService service;

    @Before
    public void testService(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");
         service = context.getBean(AccountService.class);
    }

    @Test
    public void test(){
        List<Account> list = service.findAll();
    }


}


