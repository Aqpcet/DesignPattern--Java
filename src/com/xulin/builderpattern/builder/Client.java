package com.xulin.builderpattern.builder;

/**
 * @ClassName Client
 * @Description
 * @Author xulin
 * @Date 2019/10/18 下午10:42
 **/
public class Client {
    public static void main(String[] args) {
        //指定产品
        CommonHouse commonHouse = new CommonHouse();

        //准备指挥者盖房子
        HouseDirector houseDirector = new HouseDirector(commonHouse);

        //完成盖房子，返回产品
        House house = houseDirector.constructHouse();
    }
}
