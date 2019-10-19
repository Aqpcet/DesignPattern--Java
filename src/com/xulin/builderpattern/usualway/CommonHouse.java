package com.xulin.builderpattern.usualway;

/**
 * @ClassName CommonHouse
 * @Description
 * @Author xulin
 * @Date 2019/10/18 下午10:10
 **/
public class CommonHouse extends AbsHouse {
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基");
    }

    @Override
    public void buildwalls() {
        System.out.println("普通房子砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子封顶");
    }
}
