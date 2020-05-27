package com.xulin.builderpattern.usualway;

/**
 * @ClassName Client
 * @Description
 * @Author xulin
 * @Date 2019/10/18 下午10:12
 **/
public class Client {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        commonHouse.build();
    }
}
