package com.xulin.proxypattern.dynamicproxy.jdk;

/**
 * @ClassName TeacherDao
 * @Description
 * @Author xulin
 * @Date 2019/10/25 上午9:53
 **/
public class TeacherDao implements ITeacherDao{
    @Override
    public void teach() {
        System.out.println("老师授课中...");
    }

    @Override
    public void sayHello(String name) {
        System.out.println("Hello "+name);
    }
}
