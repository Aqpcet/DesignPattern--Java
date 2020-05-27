package com.xulin.factorypattern.factorymethod.order;

import com.xulin.factorypattern.factorymethod.pizza.BJCheesePizza;
import com.xulin.factorypattern.factorymethod.pizza.BJGreekPizza;
import com.xulin.factorypattern.factorymethod.pizza.Pizza;



/**
 * @ClassName BJOrderPizza
 * @Description 订购北京的披萨
 * @Author xulin
 * @Date 2019/10/17 下午10:41
 **/
public class BJOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String orderType) {
        System.out.println("使用的是工厂方法模式");

        Pizza pizza=null;

        if (orderType.equals("cheese")){
            pizza=new BJCheesePizza();
        }else if (orderType.equals("greek")){
            pizza=new BJGreekPizza();
        }else {
            System.out.println("订购披萨失败！");
        }

        return pizza;
    }
}

