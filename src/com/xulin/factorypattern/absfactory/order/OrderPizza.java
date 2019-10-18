package com.xulin.factorypattern.absfactory.order;

import com.xulin.factorypattern.absfactory.factory.AbsFactory;
import com.xulin.factorypattern.absfactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName OrderPizza
 * @Description 订购披萨
 * @Author xulin
 * @Date 2019/10/18 上午11:27
 **/
public class OrderPizza {
    AbsFactory factory;

    public OrderPizza(AbsFactory factory){
        setAbsFactory(factory);
    }

    private void setAbsFactory(AbsFactory factory) {
        this.factory = factory;

        Pizza pizza=null;
        String orderType="";

        do{
            orderType=getType();
            pizza=factory.createPizza(orderType);

            if (pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("订购失败");
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
