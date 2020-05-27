package com.xulin.adapterpattern.objectadapter;

/**
 * @ClassName Voltage220V
 * @Description 被适配的类
 * @Author xulin
 * @Date 2019/10/20 上午10:31
 **/
public class Voltage220V {
    /**
     * 输出220V的电压
     * @return int
     */
    public int output220V(){
        int src=220;
        System.out.println("电压："+src+"V");
        return src;
    }
}
