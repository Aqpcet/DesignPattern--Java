package com.xulin.singletonpattern.type4;

/**
 * @ClassName lazy
 * @Description 懒汉式（线程安全，同步方法）
 * @Author xulin
 * @Date 2019/10/15 上午11:09
 **/
public class Lazy {
    public static void main(String[] args) {
        //测试
        System.out.println("懒汉式（线程安全，同步方法）");

        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();

        System.out.println("singleton==singleton1:"+(singleton==singleton1));
        System.out.println("singleton.hashCode():"+singleton.hashCode());
        System.out.println("singleton1.hashCode():"+singleton1.hashCode());
    }
}

//效率太低，只执行一次实例化却每次都要进行同步
//结论：实际开发，不推荐使用
class Singleton{
    private static Singleton instance;

    private Singleton(){}

    //加入同步代码，解决线程不安全问题
    public static synchronized Singleton getInstance(){
        if (instance==null){
            instance=new Singleton();
        }

        return instance;
    }
}
