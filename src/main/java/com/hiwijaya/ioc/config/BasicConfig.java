package com.hiwijaya.ioc.config;

import com.hiwijaya.ioc.domain.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Happy Indra Wijaya
 */
@Configuration
public class BasicConfig {

    @Bean
    public Car car(@Qualifier("electric") Engine engine) {
        return new Car(engine);
    }

    @Bean
    public Engine cumbustion(Camshaft camshaft, Crankshaft crankshaft){
        return new CombustionEngine(camshaft, crankshaft);
    }

    @Bean("electric")
    public Engine electric(){
        return new ElectricEngine();
    }

    @Bean
    public Camshaft camshaft(){
        return new Camshaft("single");
    }

    @Bean
    public Crankshaft crankshaft(){
        return new Crankshaft();
    }

}
