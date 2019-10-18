package com.xulin.factorypattern.absfactory.pizza;

/**
 * @ClassName BJGreekPizza
 * @Description 北京的希腊披萨
 * @Author xulin
 * @Date 2019/10/16 上午11:59
 **/
public class BJGreekPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京的希腊披萨");
        System.out.println("给北京的希腊披萨制作准备原材料");
    }
}
