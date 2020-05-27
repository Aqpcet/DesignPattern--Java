package com.xulin.proxypattern.dynamicproxy.jdk;

import org.w3c.dom.ls.LSOutput;

/**
 * @ClassName Client
 * @Description
 * @Author xulin
 * @Date 2019/10/25 上午10:28
 **/
public class Client {
    public static void main(String[] args) {
        /**
         * 创建目标对象
         */
        ITeacherDao target=new TeacherDao();

        /**
         * 给目标对象创建代理对象，要强制装换
         */
        ITeacherDao proxy= (ITeacherDao) new ProxyFactory(target).newProxyInstance();

        System.out.println("---代理模式：JDK动态代理---");

        /**
         * 通过代理对象调用目标对象的方法
         */
        proxy.teach();

        proxy.sayHello("xulin");

        /**
         * proxy：class com.sun.proxy.$Proxy0，$Proxy0内存中动态生成了代理对象
         */
        System.out.println("proxy："+proxy.getClass());
    }
}
