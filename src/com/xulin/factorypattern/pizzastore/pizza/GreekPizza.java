package com.xulin.factorypattern.pizzastore.pizza;

/**
 * @ClassName GreekPizza
 * @Description 希腊披萨
 * @Author xulin
 * @Date 2019/10/16 上午11:59
 **/
public class GreekPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("给希腊披萨制作准备原材料");
    }
}
