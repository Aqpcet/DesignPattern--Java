package com.xulin.factorypattern.factorymethod.pizza;

/**
 * @ClassName LDGreekPizza
 * @Description 伦敦的希腊披萨
 * @Author xulin
 * @Date 2019/10/16 上午11:59
 **/
public class LDGreekPizza extends Pizza{
    @Override
    public void prepare() {
        setName("伦敦的希腊披萨");
        System.out.println("给伦敦的希腊披萨制作准备原材料");
    }
}
