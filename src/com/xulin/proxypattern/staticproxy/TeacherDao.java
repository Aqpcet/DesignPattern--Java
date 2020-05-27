package com.xulin.proxypattern.staticproxy;

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
}
