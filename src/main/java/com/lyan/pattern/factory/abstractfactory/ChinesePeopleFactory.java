package com.lyan.pattern.factory.abstractfactory;

/**
 * @Discription:
 * @Author: Created by lyan on 2019/8/8 17:22
 */
public class ChinesePeopleFactory implements IPeopleFactory {
    public IEat createEat() {
        return new ChinesePeopleEat();
    }

    public IDress createDress() {
        return new ChinesePeopleDress();
    }
}
