package com.xulin.factorypattern.factorymethod.pizza;

/**
 * @ClassName LDCheesePizza
 * @Description 伦敦的起司披萨
 * @Author xulin
 * @Date 2019/10/16 上午11:05
 **/
public class LDCheesePizza extends Pizza{

    @Override
    public void prepare() {
        setName("伦敦的起司披萨");
        System.out.println("给伦敦的起司披萨准备原材料");
    }

}
