package cn.itcast.dao;

import cn.itcast.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import javax.xml.bind.SchemaOutputResolver;
import java.util.List;
@Repository
public interface AccountDao {

    /**
     * 查询所有的账户
     * @return
     */
    @Select("select * from account")
    public List<Account> findAll();

    /**
     * 保存账户
     * @param account
     * @return
     */
    @Insert(value="insert into account (name,money) values (#{name},#{money})")
    public void add(Account account);





}
