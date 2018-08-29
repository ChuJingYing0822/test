package testmapper;

import com.shopping.impl.MyOrderImpl;
import com.shopping.mapper.MyorderMapper;

import com.shopping.pojo.Myorder;
import org.junit.Test;

import java.util.Date;

public class TestMyOrder {
    MyorderMapper myorderMapper = new MyOrderImpl();
    @Test
    public void testInsertMyOrder(){

        Myorder o1 = new Myorder(001,901,"x001",new Date(),120.3F,0);
        Myorder o2 = new Myorder(002,902,"x002",new Date(),133.3F,0);
        Myorder o3 = new Myorder(003,903,"x003",new Date(),153.3F,1);
        myorderMapper.insert(o3);
    }
}
