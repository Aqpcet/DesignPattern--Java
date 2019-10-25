package com.xulin.proxypattern.staticproxy;

/**
 * @ClassName Client
 * @Description
 * @Author xulin
 * @Date 2019/10/25 上午9:59
 **/
public class Client {
    public static void main(String[] args) {
        ITeacherDao teacherDao=new TeacherDao();
        ITeacherDao teacherDaoProxy=new TeacherDaoProxy(teacherDao);

        System.out.println("---代理模式：静态代理---");

        teacherDaoProxy.teach();
    }
}
