package com.hiwijaya.ioc.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Happy Indra Wijaya
 */
@Component      // Registers as a class as being managed by Spring.
public class Car {

    @Autowired      // field injection
    @Qualifier("electric")
    private Engine engine;


    public Car(){ }

    @Autowired      // constructor injection
    public Car(@Qualifier("electric") Engine engine) {
        this.engine = engine;
    }

    @Autowired      // setter injection
    public void setEngine(@Qualifier("electric") Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.turnOn();
    }

}
