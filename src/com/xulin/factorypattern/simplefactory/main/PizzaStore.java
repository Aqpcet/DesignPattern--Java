package com.xulin.factorypattern.simplefactory.main;

import com.xulin.factorypattern.simplefactory.factory.SimpleFactory;
import com.xulin.factorypattern.simplefactory.order.OrderPizza;

/**
 * @ClassName PizzaStore
 * @Description 披萨店
 * @Author xulin
 * @Date 2019/10/16 下午10:07
 **/
//相当于一个客户端
public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new SimpleFactory());
        System.out.println("退出了程序！");
    }
}
