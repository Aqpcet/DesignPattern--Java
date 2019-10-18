package com.xulin.prototypepattern.shallowclone;

/**
 * @ClassName Sheep
 * @Description 羊实现克隆方法
 * @Author xulin
 * @Date 2019/10/18 下午4:41
 **/
public class Sheep implements Cloneable{
    private String name;
    private int age;
    private String color;

    /**
     * 对象在克隆时如何处理？复制还是引用指向
     */
    public Sheep friend;

    public Sheep() {
    }

    public Sheep(String name, int age, String color) {
        super();
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    /**
     *@MethodName clone
     *@Description 克隆该实例，使用默认的clone方法来完成
     *@Param []
     *@Return java.lang.Object
     *@Author xulin
     *@Date 2019/10/18 下午5:05
     **/
    @Override
    protected Object clone(){
        Sheep sheep=null;

        try{
            sheep=(Sheep)super.clone();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        return sheep;
    }

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
}
