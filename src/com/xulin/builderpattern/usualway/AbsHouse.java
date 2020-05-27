package com.xulin.builderpattern.usualway;

/**
 * @ClassName AbsHouse
 * @Description 房子抽象类
 * @Author xulin
 * @Date 2019/10/18 下午10:08
 **/
public abstract class AbsHouse {
    //打地基
    public abstract void buildBasic();

    //砌墙
    public abstract void buildwalls();

    //封顶
    public abstract void roofed();

    public void build(){
        buildBasic();
        buildwalls();
        roofed();
        System.out.println("普通房子盖好了");
    }
}
