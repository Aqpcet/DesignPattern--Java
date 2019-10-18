package com.xulin.prototypepattern.deepclone;

import java.io.*;

/**
 * @ClassName DeepProtoType
 * @Description
 * @Author xulin
 * @Date 2019/10/18 下午5:47
 **/
public class DeepProtoType implements Serializable,Cloneable {
    public String name; //String属性
    public DeepCloneableTarget deepCloneableTarget; //应用类型

    public DeepProtoType() {
        super();
    }

    /**
     * 深拷贝-方式1：使用clone方法
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep=null;

        //完成对基本数据类型和String的克隆
        deep=super.clone();

        //对引用类型进行单独处理
        DeepProtoType deepProtoType=(DeepProtoType)deep;
        deepProtoType.deepCloneableTarget=(DeepCloneableTarget) deepCloneableTarget.clone();

        return deep;
    }

    /**
     * 深拷贝-方式2：通过对象的序列化（推荐使用）
     */
    public Object deepClone(){
        //创建流对象
        ByteArrayOutputStream bos=null;
        ObjectOutputStream oos=null;

        ByteArrayInputStream bis=null;
        ObjectInputStream ois=null;

        try {
            //序列化
            bos=new ByteArrayOutputStream();
            oos=new ObjectOutputStream(bos);

            //当前这个对象以对象流的方式输出
            oos.writeObject(this);

            //反序列化
            bis=new ByteArrayInputStream(bos.toByteArray());
            ois=new ObjectInputStream(bis);

            DeepProtoType copyObj=(DeepProtoType) ois.readObject();

            return copyObj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }finally {
            try{
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            }catch (Exception e1){
                e1.printStackTrace();
            }
        }
    }
}
