package com.hiwijaya.ioc.app;

import com.hiwijaya.ioc.domain.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Happy Indra Wijaya
 */
public class XmlApp {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("basic-config.xml");
        Car car = context.getBean("car", Car.class);
        car.start();

    }

}
