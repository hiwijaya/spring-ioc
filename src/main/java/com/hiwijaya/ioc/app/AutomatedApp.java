package com.hiwijaya.ioc.app;

import com.hiwijaya.ioc.config.AutomatedConfig;
import com.hiwijaya.ioc.domain.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Happy Indra Wijaya
 */
public class AutomatedApp {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AutomatedConfig.class);
        Car car = context.getBean(Car.class);
        car.start();

    }

}
