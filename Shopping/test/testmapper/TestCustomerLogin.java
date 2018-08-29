package testmapper;

import com.shopping.impl.CustomerLoginImpl;
import com.shopping.mapper.CustomerLoginMapper;
import com.shopping.pojo.CustomerLogin;
import org.junit.Test;

import java.util.Date;

public class TestCustomerLogin {
    private Integer loginId;

    private String loginName;

    private String loginPwd;

    private Date loginTime;

    private String loginIp;

    private Date preLoginTime;

    private Integer loginStatus;

    private String custId;
    CustomerLoginMapper customerLoginMapper = new CustomerLoginImpl();
    @Test
    public void testInsertCustomerLogin(){
        CustomerLogin l1 = new CustomerLogin(1001,"Dog","1923476",new Date(),"192.168.1.32" ,preLoginTime,0,"x001");
        CustomerLogin l2 = new CustomerLogin(1002,"Cat","1324765",new Date(),"192.168.1.36" ,preLoginTime,0,"x002");
        CustomerLogin l3 = new CustomerLogin(1003,"Fish","1786990",new Date(),"192.168.1.99" ,preLoginTime,1,"x003");
        customerLoginMapper.insert(l3);
    }
    @Test
    public void testSelectCustomerLogin(){
        customerLoginMapper.selectByPrimaryKey(1001);
    }
}
