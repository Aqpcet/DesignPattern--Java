package com.xulin.prototypepattern.deepclone;

import java.io.Serializable;

/**
 * @ClassName DeepCloneableTarget
 * @Description 实现序列化和克隆接口
 * @Author xulin
 * @Date 2019/10/18 下午5:44
 **/
public class DeepCloneableTarget implements Serializable,Cloneable {

    private static final long serialVersionUID = 1L;

    private String cloneName;
    private String cloneClass;

    //构造器
    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    //因为该类的属性都是String，这里使用默认的clone完成
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
