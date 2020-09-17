package cn.ezeeship.e_proxy.dbroute.proxy;

import cn.ezeeship.e_proxy.dbroute.db.DynamicDataSourceEntity;
import cn.ezeeship.e_proxy.dynamicproxy.myproxy.proxy.MyClassLoader;
import cn.ezeeship.e_proxy.dynamicproxy.myproxy.proxy.MyInvocationHandler;
import cn.ezeeship.e_proxy.dynamicproxy.myproxy.proxy.MyProxy;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * lxc
 */
public class OrderServiceDynamicProxy implements MyInvocationHandler {

    private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");

    Object proxyObj;
    public Object getInstance(Object proxyObj) {
        this.proxyObj = proxyObj;
        Class<?> clazz = proxyObj.getClass();
        return MyProxy.newProxyInstance(new MyClassLoader(),clazz.getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(args[0]);
        Object object = method.invoke(proxyObj,args);
        after();
        return object;
    }

    private void after() {
        System.out.println("Proxy after method");
        //还原成默认的数据源
        DynamicDataSourceEntity.restore();
    }

    //target 应该是订单对象Order
    private void before(Object target) {
        try {
            //进行数据源的切换
            System.out.println("Proxy before method");

            //约定优于配置
            Long time = (Long) target.getClass().getMethod("getCreateTime").invoke(target);
            Integer dbRouter = Integer.valueOf(yearFormat.format(new Date(time)));
            System.out.println("静态代理类自动分配到【DB_" + dbRouter + "】数据源处理数据");
            DynamicDataSourceEntity.set(dbRouter);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
