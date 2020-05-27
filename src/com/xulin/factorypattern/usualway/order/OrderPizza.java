package com.xulin.factorypattern.usualway.order;

import com.xulin.factorypattern.usualway.pizza.CheesePizza;
import com.xulin.factorypattern.usualway.pizza.GreekPizza;
import com.xulin.factorypattern.usualway.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName OrderPizza
 * @Description 订购披萨
 * @Author xulin
 * @Date 2019/10/16 下午9:57
 **/
public class OrderPizza {

    //构造器
    public OrderPizza()
    {
        Pizza pizza=null;
        String orderType; //订购披萨的类型

        do{
            orderType=getType();

            if (orderType.equals("greek")){
                pizza=new GreekPizza();
                pizza.setName("希腊披萨");
            }else if (orderType.equals("cheese")){
                pizza=new CheesePizza();
                pizza.setName("起司披萨");
            }else {
                break;
            }

            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
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
