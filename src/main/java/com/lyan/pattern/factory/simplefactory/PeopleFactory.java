package com.lyan.pattern.factory.simplefactory;

import com.lyan.pattern.factory.IPeople;

/**
 * @Discription:
 * @Author: Created by lyan on 2019/8/8 14:47
 */
public class PeopleFactory {

    public IPeople create(Class<? extends IPeople> clazz){

       if(clazz != null){
           try {
               return clazz.newInstance();
           } catch (Exception e) {
               e.printStackTrace();
           }
       }
       return null;
    }

    public IPeople create(String className){
        try {
            if(className != null && !"".equals(className)){

                return (IPeople) Class.forName(className).newInstance();
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
