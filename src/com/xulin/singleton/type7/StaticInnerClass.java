package com.xulin.singleton.type7;

/**
 * @ClassName StaticInnerClass
 * @Description 静态内部类
 * @Author xulin
 * @Date 2019/10/15 上午11:49
 **/
public class StaticInnerClass {
    public static void main(String[] args) {
        //测试
        System.out.println("静态内部类");

        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();

        System.out.println("singleton==singleton1:"+(singleton==singleton1));
        System.out.println("singleton.hashCode():"+singleton.hashCode());
        System.out.println("singleton1.hashCode():"+singleton1.hashCode());
    }
}

//结论:实际开发中，推荐使用
class Singleton{
    private Singleton(){}

    /**静态内部类，该类中有一个静态属性
     *jvm加载Singleton不会加载SingletonInstance静态内部类（懒加载）
     *jvm加载类的时候是线程安全（效率高）
     **/
    private static class SingletonInstance{
        private static final Singleton instance=new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonInstance.instance;
    }
}
