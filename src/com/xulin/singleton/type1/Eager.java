package com.xulin.singleton.type1;

/**
 * @ClassName Eager1
 * @Description 饿汉式（静态变量）
 * @Author xulin
 * @Date 2019/10/15 上午10:26
 **/
public class Eager {
    public static void main(String[] args) {
        //测试
        System.out.println("饿汉式（静态变量）");

        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();

        System.out.println("singleton==singleton1:"+(singleton==singleton1));
        System.out.println("singleton.hashCode():"+singleton.hashCode());
        System.out.println("singleton1.hashCode():"+singleton1.hashCode());
    }
}

//结论：这种单例模式可用，可能造成内存浪费
class Singleton{
    //1.构造器私有化，外部不能new
    private Singleton(){
    }

    //2.本类内部创建对象实例
    private final static Singleton instance=new Singleton();

    //3.提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance(){
        return instance;
    }
}