package cn.itcast.dao;

import cn.itcast.domain.Account;
import org.springframework.stereotype.Repository;

import java.util.List;
/*
��ȥ
*/
@Repository("userDao")
public interface UserDao {
    public List<Account> find();

}
