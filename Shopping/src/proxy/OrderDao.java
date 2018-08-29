package proxy;

public interface OrderDao {
    //添加订单
    public int save();
    //修改订单
    public int update();
    //删除订单
    public int delete();

    //查询总记录数
    public int query();

}
