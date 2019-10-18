package com.xulin.factorypattern.pizzastore.main;

import com.xulin.factorypattern.pizzastore.order.OrderPizza;

/**
 * @ClassName PizzaStore
 * @Description 披萨店
 * @Author xulin
 * @Date 2019/10/16 下午10:07
 **/
//相当于一个客户端
public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza();
    }
}
