package com.lyan.pattern.factory.factorymethod;

import com.lyan.pattern.factory.AmaricalPeople;
import com.lyan.pattern.factory.IPeople;
import com.sun.org.apache.bcel.internal.generic.RETURN;

/**
 * @Discription:
 * @Author: Created by lyan on 2019/8/8 16:36
 */
public class AmaricalPeopleFactory implements IPeopleFactory {

    public IPeople create() {
        return new AmaricalPeople();
    }
}
