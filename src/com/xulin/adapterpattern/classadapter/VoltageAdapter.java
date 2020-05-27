package com.xulin.adapterpattern.classadapter;

/**
 * @ClassName VoltageAdapter
 * @Description
 * @Author xulin
 * @Date 2019/10/20 上午10:33
 **/
public class VoltageAdapter extends Voltage220V implements IValtage5V{
    @Override
    public int output5V() {
        //获取220V的电压
        int srcV=output220V();

        //转换成5V的电压
        int dstV=srcV/44;

        return dstV;
    }
}
