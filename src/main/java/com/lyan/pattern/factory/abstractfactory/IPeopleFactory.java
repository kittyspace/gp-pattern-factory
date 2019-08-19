package com.lyan.pattern.factory.abstractfactory;

/**
 * @Discription:
 * @Author: Created by lyan on 2019/8/8 17:19
 */
public interface IPeopleFactory {
    IEat createEat();
    IDress createDress();
}
