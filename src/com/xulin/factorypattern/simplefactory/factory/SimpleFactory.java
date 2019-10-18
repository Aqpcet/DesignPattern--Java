package com.xulin.factorypattern.simplefactory.factory;

import com.xulin.factorypattern.simplefactory.pizza.CheesePizza;
import com.xulin.factorypattern.simplefactory.pizza.GreekPizza;
import com.xulin.factorypattern.simplefactory.pizza.Pizza;

/**
 * @ClassName SimpleFactory
 * @Description 简单工厂类
 * @Author xulin
 * @Date 2019/10/16 下午10:25
 **/
public class SimpleFactory {

    //根据orderType返回对应的pizza
    public Pizza createPizza(String orderType){
        System.out.println("使用简单工厂模式");

        Pizza pizza=null;
        if (orderType.equals("greek")){
            pizza=new GreekPizza();
            pizza.setName("希腊披萨");
        }else if (orderType.equals("cheese")){
            pizza=new CheesePizza();
            pizza.setName("起司披萨");
        }

        return pizza;
    }
}
