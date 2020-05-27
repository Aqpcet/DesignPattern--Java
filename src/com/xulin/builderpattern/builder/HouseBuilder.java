package com.xulin.builderpattern.builder;

/**
 * @ClassName HouseBuilder
 * @Description
 * @Author xulin
 * @Date 2019/10/18 下午10:29
 **/
public abstract class HouseBuilder {
    protected House house=new House();

    //将建造的流程的抽象方法写好
    public abstract void buildBasic();

    public abstract void buildWall();

    public abstract void roofed();

    //建造房子
    public House buildHouse(){
        return house;
    }
}
