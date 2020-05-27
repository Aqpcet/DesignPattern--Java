package com.xulin.factorypattern.absfactory.factory;

import com.xulin.factorypattern.absfactory.pizza.LDCheesePizza;
import com.xulin.factorypattern.absfactory.pizza.LDGreekPizza;
import com.xulin.factorypattern.absfactory.pizza.Pizza;

/**
 * @ClassName LDFactory
 * @Description 伦敦工厂类
 * @Author xulin
 * @Date 2019/10/18 上午11:16
 **/
public class LDFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用的是抽象工厂模式");

        Pizza pizza=null;

        if (("cheese").equals(orderType)){
            pizza=new LDCheesePizza();
        }else if (("greek").equals(orderType)){
            pizza=new LDGreekPizza();
        }
        return pizza;
    }
}
