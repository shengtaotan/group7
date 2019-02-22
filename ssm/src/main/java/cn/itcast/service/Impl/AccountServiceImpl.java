package cn.itcast.service.Impl;

import cn.itcast.dao.AccountDao;
import cn.itcast.dao.UserDao;
import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    @Qualifier("accountDao")
    private  AccountDao dao;
    @Autowired
    @Qualifier("userDao")
    private UserDao userDao;
    @Override
    public List<Account> findAll() {
        System.out.println("业务层，findAll方法执行了");
        List<Account> all = dao.findAll();
        return all;
    }

    @Override
    public void save(Account account) {
        System.out.println("业务层，findAll方法执行了");
        dao.save(account);

    }

    @Override
    public List<Account> find() {
        List<Account> list = userDao.find();
        System.out.println("accountserviceImpl 方法执行了");
        return list;
    }

    @Override
    public List<Account> findByName(String name) {
        System.out.println(name);
        return dao.findByName(name);
    }

}
