package com.xulin.adapterpattern.classadapter;

/**
 * @ClassName Phone
 * @Description 手机类
 * @Author xulin
 * @Date 2019/10/20 上午10:37
 **/
public class Phone {
    //充电
    public void charging(IValtage5V iValtage5V){
            if(5==iValtage5V.output5V()){
                System.out.println("电压：5V，可以充电");
            }else if (5<iValtage5V.output5V()){
                System.out.println("电压：>5V，无法充电");
            }
    }
}
