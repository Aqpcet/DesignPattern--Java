package com.xulin.factorypattern.absfactory.pizza;

/**
 * @ClassName BJCheesePizza
 * @Description 北京的起司披萨
 * @Author xulin
 * @Date 2019/10/16 上午11:05
 **/
public class BJCheesePizza extends Pizza {

    @Override
    public void prepare() {
        setName("北京的起司披萨");
        System.out.println("给北京的起司披萨准备原材料");
    }
}


