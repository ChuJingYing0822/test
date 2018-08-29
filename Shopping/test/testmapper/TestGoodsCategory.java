package testmapper;

import com.shopping.impl.GoodsCategoryImpl;
import com.shopping.mapper.GoodsCategoryMapper;
import com.shopping.pojo.GoodsCategory;
import org.junit.Test;

public class TestGoodsCategory {
    GoodsCategoryMapper goodsCategoryMapper = new GoodsCategoryImpl();
    @Test
    public void testInsertGoodsCategory(){
        GoodsCategory y1 = new GoodsCategory("y001","AA类","便宜","在售");
        GoodsCategory y2 = new GoodsCategory("y002","BB类","好吃","在售");
        GoodsCategory y3 = new GoodsCategory("y003","CC类","干净","在售");
        goodsCategoryMapper.insert(y3);
    }
}
