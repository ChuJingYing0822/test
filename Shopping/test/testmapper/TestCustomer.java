package testmapper;

import com.shopping.impl.CustomerImpl;
import com.shopping.mapper.CustomerMapper;
import com.shopping.pojo.Customer;
import com.shopping.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.List;

public class TestCustomer {
    CustomerMapper customerMapper = new CustomerImpl();
    @Test
    public void testInsertCustomer(){
        Customer c1 = new Customer("x001",
                "小猫猫",
                "123456789",
                20,
                13004567,
                "1069994673@qq.com"
                ,new Date(),new Date(),
                "xx1");
        Customer c2 = new Customer("x002",
                "小狗狗",
                "987654321",
                21,
                13115161,
                "1305376869@qq.com"
                ,new Date(),new Date(),
                "xx2");
        Customer c3 = new Customer("x003",
                "小猪猪",
                "135792468",
                22,
                18545804,
                "11022012@qq.com"
                ,new Date(),new Date(),
                "xx3");
        Customer c4= new Customer("x004",
                "小兔兔",
                "13467890",
                23,
                13345678,
                "131145117@qq.com"
                ,new Date(),new Date(),
                "x004");
        customerMapper.insert(c4);
    }
    @Test
    public void testSelectCustomer(){
        customerMapper.selectByPrimaryKey("x002");
    }
    @Test
    public void testCache1(){
        SqlSession sqlSession = MybatisUtil.getSession();
        sqlSession.selectOne("com.shopping.mapper.CustomerMapper.selectByPrimaryKey","x001");

        sqlSession.selectOne("com.shopping.mapper.CustomerMapper.selectByPrimaryKey","x001");
    }

}
