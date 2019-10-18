package com.xulin.singletonpattern.type6;

/**
 * @ClassName doubleCheck
 * @Description 双重检查
 * @Author xulin
 * @Date 2019/10/15 上午11:29
 **/
public class DoubleCheck {
    public static void main(String[] args) {
        //测试
        System.out.println("双重检查");

        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();

        System.out.println("singleton==singleton1:"+(singleton==singleton1));
        System.out.println("singleton.hashCode():"+singleton.hashCode());
        System.out.println("singleton1.hashCode():"+singleton1.hashCode());
    }
}

//volatile:1.变量的可见性 2.防止指令重排
//结论：实际开发中，推荐使用
class Singleton{
    private static volatile Singleton instance;

    private Singleton(){}

    //加入双重检查代码，解决线程安全问题同时解决懒加载问题
    public static Singleton getInstance(){
        if (instance==null){
            synchronized (Singleton.class){
                if (instance==null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }
}
