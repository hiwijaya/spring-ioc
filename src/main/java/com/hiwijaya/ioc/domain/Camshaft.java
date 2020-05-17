package com.hiwijaya.ioc.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Happy Indra Wijaya
 */
@Component
public class Camshaft {

    private String type;

    public Camshaft(@Value("single")String type){   // single/double
        this.type = type;
    }

    public void camshaftType(){
        if(type.equals("double")){
            System.out.println("Double OverHead Camshaft");
        }
        else{
            System.out.println("Single OverHead Camshaft");
        }
    }

}
