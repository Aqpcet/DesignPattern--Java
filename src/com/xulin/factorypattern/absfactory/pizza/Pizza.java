package com.xulin.factorypattern.absfactory.pizza;

/**
 * @ClassName pizza
 * @Description 披萨
 * @Author xulin
 * @Date 2019/10/16 上午10:59
 **/
//抽象类
public abstract class Pizza {
    protected String name; //名字

    //准备原材料, 不同的披萨不一样，因此，做成抽象方法
    public abstract void prepare();

    //烘烤
    public void bake() {
        System.out.println(name + " baking;");
    }

    //切割
    public void cut() {
        System.out.println(name + " cutting;");
    }

    //打包
    public void box() {
        System.out.println(name + " boxing;");
    }

    public void setName(String name) {
        this.name = name;
    }
}
