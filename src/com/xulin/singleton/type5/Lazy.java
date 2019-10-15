package com.xulin.singleton.type5;

/**
 * @ClassName lazy
 * @Description 懒汉式（线程安全？同步代码块）
 * @Author xulin
 * @Date 2019/10/15 上午11:17
 **/
public class Lazy {
    public static void main(String[] args) {
        //测试
        System.out.println("懒汉式（线程安全？同步方法块）");

        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();

        System.out.println("singleton==singleton1:"+(singleton==singleton1));
        System.out.println("singleton.hashCode():"+singleton.hashCode());
        System.out.println("singleton1.hashCode():"+singleton1.hashCode());
    }
}

//结论：跟type3实现方式一样，不能实现线程安全，不能使用
class Singleton{
    private static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance(){
        if (instance==null){
            synchronized (Singleton.class){
                instance=new Singleton();
            }
        }

        return instance;
    }
}
