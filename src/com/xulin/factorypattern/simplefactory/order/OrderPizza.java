package com.xulin.factorypattern.simplefactory.order;

import com.xulin.factorypattern.simplefactory.factory.SimpleFactory;
import com.xulin.factorypattern.simplefactory.pizza.Pizza;

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


    //定义一个简单工厂对象
    SimpleFactory simpleFactory;

    Pizza pizza=null;

    public OrderPizza(SimpleFactory simpleFactory){
        setSimpleFactory(simpleFactory);
    }

    public void setSimpleFactory(SimpleFactory simpleFactory){
        String orderType="";

        this.simpleFactory=simpleFactory; //设置简单工厂对象

        do {
            orderType=getType();
            pizza=this.simpleFactory.createPizza(orderType);

            if (pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                System.out.println("订购披萨失败！");
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
