import com.shopping.impl.GoodsImpl;
import com.shopping.mapper.GoodsMapper;
import com.shopping.pojo.Goods;
import com.shopping.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class TestGoods {
    GoodsMapper goodsMapper = new GoodsImpl();
    @Test
    public void testInsertGoods(){
        Goods g1 = new Goods("g001","肥皂","无脂",5.9,0,"gxx",1000,01,"在售","y001");
        Goods g2 = new Goods("g002","裤子","棉质",159.9,0,"gyy",1000,02,"在售","y002");
        goodsMapper.insert(g2);
    }
    @Test
    public void testSelectGoods(){
        goodsMapper.selectByPrimaryKey("g001");
    }

    }

