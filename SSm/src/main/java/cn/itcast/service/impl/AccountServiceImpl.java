package cn.itcast.service.impl;

import cn.itcast.dao.AccountDao;
import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountDao dao;

    @Override
    public List<Account> findAll() {

        System.out.println("AccountServiceImpl-------findall");
        return dao.findAll();
    }

    @Override
    public void add(Account account) {
        System.out.println("AccountServiceImpl-------add");
        dao.add(account);
    }
}
