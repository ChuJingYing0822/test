package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class OrderProxy implements InvocationHandler {
    //目标对象
    private Object target;

    public OrderProxy(Object target) {
        this.target = target;
    }
    //1.生成代理对象：
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
