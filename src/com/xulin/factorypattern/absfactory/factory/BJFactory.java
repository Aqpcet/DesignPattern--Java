package com.xulin.factorypattern.absfactory.factory;

import com.xulin.factorypattern.absfactory.pizza.BJCheesePizza;
import com.xulin.factorypattern.absfactory.pizza.BJGreekPizza;
import com.xulin.factorypattern.absfactory.pizza.Pizza;

/**
 * @ClassName BJFactory
 * @Description 北京工厂类
 * @Author xulin
 * @Date 2019/10/18 上午11:12
 **/
public class BJFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用的是抽象工厂模式");

        Pizza pizza=null;

        if (("cheese").equals(orderType)){
            pizza=new BJCheesePizza();
        }else if (("greek").equals(orderType)){
            pizza=new BJGreekPizza();
        }

        return pizza;
    }
}
