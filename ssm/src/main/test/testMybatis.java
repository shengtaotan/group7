import cn.itcast.dao.AccountDao;
import cn.itcast.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;



//老坛酸菜牛肉面
//老坛酸菜牛肉面
//老坛酸菜牛肉面
//哈哈哈哈哈哈111111
//哈哈哈哈哈哈2222378214612784198324

//哈哈哈哈哈哈2222222224444

public class testMybatis {
    @Test
    public void  test1() throws IOException {
        InputStream is = Resources.getResourceAsStream("SQLMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession();
        AccountDao dao= session.getMapper(AccountDao.class);
        List<Account> all = dao.findAll();
        for (Account account : all) {
            System.out.println(account);
        }
        session.close();
        is.close();
    }

    @Test
    public void  test2() throws IOException {
        Account a = new Account();
        a.setName("嘿嘿");
        a.setMoney(300d);
        InputStream is = Resources.getResourceAsStream("SQLMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession();
        AccountDao dao= session.getMapper(AccountDao.class);
         dao.save(a);
         session.commit();
        session.close();
        is.close();
    }
}
