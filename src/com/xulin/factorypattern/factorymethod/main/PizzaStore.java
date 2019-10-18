package com.xulin.factorypattern.factorymethod.main;

import com.xulin.factorypattern.factorymethod.order.BJOrderPizza;
import com.xulin.factorypattern.factorymethod.order.LDOrderPizza;

/**
 * @ClassName PizzaStore
 * @Description 披萨店
 * @Author xulin
 * @Date 2019/10/16 下午10:07
 **/
//相当于一个客户端
public class PizzaStore {
    public static void main(String[] args) {

        String locate="BJ";

        if (("BJ").equals(locate)) {
            //创建北京的各种披萨
            new BJOrderPizza();
        }else{
            //创建伦敦的各种披萨
            new LDOrderPizza();
        }
        System.out.println("退出了程序！");
    }
}
