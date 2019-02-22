package cn.itcast.dao;

import cn.itcast.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("accountDao")
public interface AccountDao {
    //查询所有的方法
    @Select("select * from  account ")
    public List<Account> findAll();

    //保存的Account方法
    @Insert("insert into account (name,money) values (#{name},#{money})")
     public void save(Account account);
    //条件查询

    @Select("<script>" +
            "select * from account " +
            "<where> " +
              "<if test='_parameter != null'> " +
                 "and name like concat('%', #{name}, '%')" +
               "</if>" +
            "</where>" +
            "</script>")
//    @SelectProvider()
    public List<Account> findByName(String name);
}
