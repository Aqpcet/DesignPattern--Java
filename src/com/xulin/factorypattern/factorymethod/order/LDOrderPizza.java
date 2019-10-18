package com.xulin.factorypattern.factorymethod.order;

import com.xulin.factorypattern.factorymethod.pizza.LDCheesePizza;
import com.xulin.factorypattern.factorymethod.pizza.LDGreekPizza;
import com.xulin.factorypattern.factorymethod.pizza.Pizza;

/**
 * @ClassName LDOrderPizza
 * @Description 订购北京的披萨
 * @Author xulin
 * @Date 2019/10/17 下午10:41
 **/
public class LDOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String orderType) {
        System.out.println("使用的是工厂方法模式");

        Pizza pizza=null;
        
        if (orderType.equals("cheese")){
            pizza=new LDCheesePizza();
        }else if (orderType.equals("greek")){
            pizza=new LDGreekPizza();
        }
        
        return pizza;
    }
}
