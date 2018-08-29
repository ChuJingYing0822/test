package proxy;

public class OrderDaoImpl implements OrderDao {
    @Override
    public int save() {
        //1.JDBC,Mybatis实现添加订单的业务
        System.out.println("实现save添加订单的业务");
        return 1;
    }

    @Override
    public int update() {
        //1.JDBC,Mybatis实现修改订单的业务
        System.out.println("实现update修改订单的业务");
        return 1;
    }

    @Override
    public int delete() {
        //1.JDBC,Mybatis实现删除订单的业务
        System.out.println("实现delete删除订单的业务");
        return 1;
    }

    @Override
    public int query() {
        //1.JDBC,Mybatis实现查询订单的业务
        System.out.println("实现query查询订单的业务");
        return 200;
    }
}
