package com.xulin.prototypepattern.deepclone;

/**
 * @ClassName Client
 * @Description
 * @Author xulin
 * @Date 2019/10/18 下午4:42
 **/
public class Client {
    public static void main(String[] args) throws Exception{
        DeepProtoType deepProtoType = new DeepProtoType();
        deepProtoType.name="one";
        deepProtoType.deepCloneableTarget=new DeepCloneableTarget("one-one","one-oneClass");

        System.out.println("deepProtoType.name:"+deepProtoType.name+
                "|deepProtoType.hashCode():"+deepProtoType.hashCode());

        //方式1完成深拷贝
        DeepProtoType clone = (DeepProtoType) deepProtoType.clone();

        System.out.println("clone()完成深拷贝");
        System.out.println("clone.name:"+clone.name+"|clone.hashCode():"+clone.hashCode());

        //方式2完成深拷贝
        DeepProtoType clone1 = (DeepProtoType) deepProtoType.deepClone();

        System.out.println("序列化完成深拷贝");
        System.out.println("clone1.name:"+clone1.name+"|clone1.hashCode():"+clone1.hashCode());
    }
}
