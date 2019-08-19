package com.lyan.pattern.factory.abstractfactory;

/**
 * @Discription:
 * @Author: Created by lyan on 2019/8/8 17:21
 */
public class AmaricalPeopleFactory implements IPeopleFactory {
    public IEat createEat() {
        return new AmaricalPeopleEat();
    }

    public IDress createDress() {
        return new AmaricalPeopleDress();
    }
}
