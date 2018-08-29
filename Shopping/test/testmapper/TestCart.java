package testmapper;

import com.shopping.impl.CartImpl;
import com.shopping.mapper.CartMapper;
import com.shopping.pojo.Cart;
import org.junit.Test;

import java.util.Date;

public class TestCart {
    CartMapper cartMapper = new CartImpl();
    @Test
    public void testInsertCart(){
        Cart c1 = new Cart("x001","g001",101,500,new Date());
        cartMapper.insert(c1);
    }
}
