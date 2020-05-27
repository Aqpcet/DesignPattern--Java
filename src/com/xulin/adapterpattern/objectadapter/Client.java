package com.xulin.adapterpattern.objectadapter;

import com.xulin.adapterpattern.objectadapter.Phone;

/**
 * @ClassName Client
 * @Description
 * @Author xulin
 * @Date 2019/10/20 上午10:40
 **/
public class Client {

    public static void main(String[] args) {
        System.out.println("对象适配器模式");

        Phone phone=new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}