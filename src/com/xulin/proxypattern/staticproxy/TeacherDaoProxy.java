package com.xulin.proxypattern.staticproxy;

/**
 * @ClassName TeacherDaoProxy
 * @Description 静态代理，代理对象
 * @Author xulin
 * @Date 2019/10/25 上午9:54
 **/
public class TeacherDaoProxy implements ITeacherDao{
    private ITeacherDao target;

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("---代理开始---");
        target.teach();
        System.out.println("---代理结束---");
    }
}
