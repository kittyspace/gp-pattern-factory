package com.lyan.pattern.factory.factorymethod;

import com.lyan.pattern.factory.IPeople;

/**
 * @Discription:
 * @Author: Created by lyan on 2019/8/8 16:41
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        IPeopleFactory factory = new AmaricalPeopleFactory();
        IPeople iPeople = factory.create();
        iPeople.eat();
        factory = new ChinesePeopleFactory();
        iPeople = factory.create();
        iPeople.eat();
    }

}
