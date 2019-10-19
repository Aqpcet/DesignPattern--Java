package com.xulin.builderpattern.builder;

/**
 * @ClassName CommonHouse
 * @Description
 * @Author xulin
 * @Date 2019/10/18 下午10:32
 **/
public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基");
    }

    @Override
    public void buildWall() {
        System.out.println("普通房子砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子封顶");
    }
}
