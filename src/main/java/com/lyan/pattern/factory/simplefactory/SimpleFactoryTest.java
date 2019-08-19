package com.lyan.pattern.factory.simplefactory;

import com.lyan.pattern.factory.AmaricalPeople;
import com.lyan.pattern.factory.ChinesePeople;
import com.lyan.pattern.factory.IPeople;

/**
 * @Discription:
 * @Author: Created by lyan on 2019/8/8 15:17
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        PeopleFactory factory = new PeopleFactory();
        IPeople iPeople = factory.create(AmaricalPeople.class);
        iPeople.eat();
        IPeople iPeople11 = factory.create(ChinesePeople.class);
        iPeople11.eat();
    }
}
