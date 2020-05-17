package com.hiwijaya.ioc.domain;

import org.springframework.stereotype.Component;

/**
 * @author Happy Indra Wijaya
 */
@Component("electric")
public class ElectricEngine implements Engine {

    public void turnOn() {
        System.out.println("Started electric engine.");
    }

}
