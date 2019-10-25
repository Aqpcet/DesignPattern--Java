package com.xulin.adapterpattern.objectadapter;

/**
 * @ClassName VoltageAdapter
 * @Description
 * @Author xulin
 * @Date 2019/10/20 上午10:33
 **/
public class VoltageAdapter implements IValtage5V{
    private Voltage220V voltage220V; //体现聚合关系

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dstV=0;

        //获取220V的电压
        if (null!=voltage220V){
            int srcV=voltage220V.output220V();

            //转换成5V的电压
            dstV=srcV/44;
        }

        return dstV;
    }
}