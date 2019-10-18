package com.xulin.factorypattern.simplefactory.pizza;

/**
 * @ClassName CheesePizza
 * @Description 起司披萨
 * @Author xulin
 * @Date 2019/10/16 上午11:05
 **/
public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("给起司披萨准备原材料");
    }

}
