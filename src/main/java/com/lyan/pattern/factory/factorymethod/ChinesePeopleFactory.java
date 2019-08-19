package com.lyan.pattern.factory.factorymethod;

import com.lyan.pattern.factory.ChinesePeople;
import com.lyan.pattern.factory.IPeople;

/**
 * @Discription:
 * @Author: Created by lyan on 2019/8/8 16:36
 */
public class ChinesePeopleFactory implements IPeopleFactory {
    public IPeople create() {
        return new ChinesePeople();
    }
}
