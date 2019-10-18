package com.xulin.factorypattern.absfactory.main;


import com.xulin.factorypattern.absfactory.factory.BJFactory;
import com.xulin.factorypattern.absfactory.factory.LDFactory;
import com.xulin.factorypattern.absfactory.order.OrderPizza;

/**
 * @ClassName PizzaStore
 * @Description 披萨商店
 * @Author xulin
 * @Date 2019/10/18 上午11:39
 **/
public class PizzaStore {
    public static void main(String[] args) {

        String factory="LD";

        if (("BJ").equals(factory)) {
            new OrderPizza(new BJFactory());
        }else if (("LD").equals(factory)){
            new OrderPizza(new LDFactory());
        }

        System.out.println("退出了程序");
    }
}
