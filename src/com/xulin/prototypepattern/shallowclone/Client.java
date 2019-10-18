package com.xulin.prototypepattern.shallowclone;

/**
 * @ClassName Client
 * @Description
 * @Author xulin
 * @Date 2019/10/18 下午4:42
 **/
public class Client {
    public static void main(String[] args) {
        Sheep sheep=new Sheep("tom",1,"white");

        sheep.friend=new Sheep("jack",2,"black");

        System.out.println(sheep);

        Sheep sheep1 = (Sheep) sheep.clone();
        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();
        Sheep sheep4 = (Sheep) sheep.clone();

        /**
         * 克隆的属性是对象时是引用指向（浅拷贝）
         */
        System.out.println(sheep1+"sheep2.friend:"+sheep1.friend.hashCode());
        System.out.println(sheep2+"sheep2.friend:"+sheep1.friend.hashCode());
        System.out.println(sheep3+"sheep2.friend:"+sheep1.friend.hashCode());
        System.out.println(sheep4+"sheep2.friend:"+sheep1.friend.hashCode());
    }
}
