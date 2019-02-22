package cn.itcast.service;

import cn.itcast.domain.Account;

import java.util.List;

public interface AccountService {

    //查询所有的方法
    public List<Account> findAll();

    //保存的Account方法
    public void save(Account account);

    //xml
    // 查询所有的方法
    public List<Account> find();

    //测试动态sql
    public List<Account> findByName(String name);

}
