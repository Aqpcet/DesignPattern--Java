package com.xulin.builderpattern.builder;

/**
 * @ClassName HouseDirector
 * @Description
 * @Author xulin
 * @Date 2019/10/18 下午10:35
 **/
public class HouseDirector {
    HouseBuilder houseBuilder=null;

    //构造器传入houseBuilder
    public HouseDirector(HouseBuilder houseBuilder){
        this.houseBuilder=houseBuilder;
    }

    //setter方法传入houseBuilder
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //建造房子的流程（指挥者）
    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWall();
        houseBuilder.roofed();

        return houseBuilder.buildHouse();
    }
}
