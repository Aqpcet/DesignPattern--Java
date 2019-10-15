package com.xulin.singleton.type8;

/**
 * @ClassName Enum
 * @Description 枚举
 * @Author xulin
 * @Date 2019/10/15 下午12:04
 **/
public class Enum {
    public static void main(String[] args) {
        System.out.println("枚举");

        Singleton singleton=Singleton.INSTANCE;
        Singleton singleton1 = Singleton.INSTANCE;

        System.out.println("singleton==singleton1:"+(singleton==singleton1));
        System.out.println("singleton.hashCode():"+singleton.hashCode());
        System.out.println("singleton1.hashCode():"+singleton1.hashCode());
    }
}

//避免多线程同步问题，能防止反序列化重新创建新的对象
//结论：实际开发中，推荐使用
enum Singleton{
    /*
     * 属性
     */
    INSTANCE;
}
