package com.xulin.factorypattern.factorymethod.order;

import com.xulin.factorypattern.factorymethod.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName OrderPizza
 * @Description 订购披萨
 * @Author xulin
 * @Date 2019/10/16 下午9:57
 **/
public abstract class OrderPizza {

    //定义一个抽象方法，让各个工厂子类自己实现
    abstract Pizza createPizza(String orderType);

    public OrderPizza(){
        Pizza pizza=null;
        String orderType;

        do {
            orderType=getType();
            pizza=createPizza(orderType); //由工厂子类完成

            if (pizza!=null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                break;
            }
        }while (true);
    }

    //获取客户希望订购的披萨种类
    private String getType(){
        try{
            BufferedReader strin=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Input pizza type:");
            String str=strin.readLine();
            return str;
        }catch (IOException e){
            e.printStackTrace();
            return "";
        }
    }
}
