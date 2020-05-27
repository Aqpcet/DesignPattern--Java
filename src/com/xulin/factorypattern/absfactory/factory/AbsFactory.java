package com.xulin.factorypattern.absfactory.factory;

import com.xulin.factorypattern.absfactory.pizza.Pizza;

/**
 * @InterfaceName AbsFactory
 * @Description 抽象工厂模式的抽象层（接口）
 * @Author xulin
 * @Date 2019/10/18 上午10:59
 **/
public interface AbsFactory {
    public Pizza createPizza(String orderType);
}
