package cn.itcast.service;

import cn.itcast.domain.Account;

import java.util.List;

public interface AccountService {
    /**
     * 查询所有的账户
     * @return
     */
    public List<Account> findAll();

    /**
     * 保存账户
     * @param account
     * @return
     */
    public void add(Account account);
}
