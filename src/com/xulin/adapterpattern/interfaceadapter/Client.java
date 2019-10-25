package com.xulin.adapterpattern.interfaceadapter;

/**
 * @ClassName Client
 * @Description
 * @Author xulin
 * @Date 2019/10/20 上午11:55
 **/
public class Client {
    public static void main(String[] args) {
        AbsAdapter absAdapter = new AbsAdapter(){
            @Override
            public void i1() {
                System.out.println("'匿名内部类'实现i1方法");
            }
        };

        absAdapter.i1();
    }
}
