package com.lyan.pattern.factory.abstractfactory;

/**
 * @Discription:
 * @Author: Created by lyan on 2019/8/8 17:23
 */
public class AbstractFactoryTest {


    public static void main(String[] args) {
        AmaricalPeopleFactory aFactory = new AmaricalPeopleFactory();
        aFactory.createEat();
        aFactory.createDress();
        //或者下面
        ChinesePeopleFactory cFactory = new ChinesePeopleFactory();
        cFactory.createEat();
        cFactory.createDress();
        //或者下面
        IPeopleFactory factory = new AmaricalPeopleFactory();
        factory.createEat();
        factory.createDress();
        factory = new ChinesePeopleFactory();
        factory.createEat();
        factory.createDress();

        //创建好之后，就可以使用方法eat()和dress
        
    }
}
