import com.shopping.impl.OrderDetailImpl;
import com.shopping.mapper.OrderDetailMapper;
import com.shopping.pojo.OrderDetail;
import org.junit.Test;

public class TestOrderDetail {
    OrderDetailMapper orderDetailMapper = new OrderDetailImpl();
    @Test
     public void testInsertOrderDetail(){
        OrderDetail r1 = new OrderDetail(001,"g001",5000);
        orderDetailMapper.insert(r1);
    }
}
