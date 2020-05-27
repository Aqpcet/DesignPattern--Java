package com.xulin.singletonpattern.type3;

/**
 * @ClassName lazy
 * @Description 懒汉式（线程不安全）
 * @Author xulin
 * @Date 2019/10/15 上午10:58
 **/
public class Lazy {
    public static void main(String[] args) {
        //测试
        System.out.println("懒汉式（线程不安全）");

        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();

        System.out.println("singleton==singleton1:"+(singleton==singleton1));
        System.out.println("singleton.hashCode():"+singleton.hashCode());
        System.out.println("singleton1.hashCode():"+singleton1.hashCode());
    }
}

//可以懒加载，只能在单线程下使用
//结论：在实际开发中，不能使用
class Singleton{
    private static Singleton instance;

    private Singleton(){
    }

    //提供一个静态的公有方法，当使用到该方法时，采取创建instance
    public static Singleton getInstance(){
        if (instance==null){
            instance=new Singleton();
        }

        return instance;
    }
}

