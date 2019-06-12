package cn.itcast.test;

import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@Component
@RequestMapping("/user")
public class ControllerTest {

@Autowired
    AccountService service;

   @RequestMapping("/findAll")
    public  String findAll(){

       System.out.println("findAll");
       service.findAll();
       return "succes";
    }

    @RequestMapping("/add")
    public String add(Account account){
        System.out.println("AccountController---add");
        service.add(account);
        return "succes";
    }

}
