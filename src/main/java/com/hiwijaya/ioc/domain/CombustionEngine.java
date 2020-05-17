package com.hiwijaya.ioc.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author Happy Indra Wijaya
 */
@Component("combustion")
//@Primary    // when there is two object similar
public class CombustionEngine implements Engine {

    private Camshaft camshaft;
    private Crankshaft crankshaft;

    @Autowired
    public CombustionEngine(Camshaft camshaft, Crankshaft crankshaft) {
        this.camshaft = camshaft;
        this.crankshaft = crankshaft;

        camshaft.camshaftType();
    }

    public void turnOn() {
        System.out.println("Started combustion engine.");
    }

}
