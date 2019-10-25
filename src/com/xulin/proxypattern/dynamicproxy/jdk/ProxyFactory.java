package com.xulin.proxypattern.dynamicproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName ProxyFactory
 * @Description
 * @Author xulin
 * @Date 2019/10/25 上午10:09
 **/
public class ProxyFactory {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object newProxyInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), new InvocationHandler() {

                    //匿名内部类
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("---JDK代理开始---");
                        Object returnValue = method.invoke(target, args);
                        System.out.println("---JDK代理结束---");
                        return returnValue;
                    }
                });
    }
}
