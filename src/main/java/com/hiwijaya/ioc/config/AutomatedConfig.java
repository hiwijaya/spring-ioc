package com.hiwijaya.ioc.config;

import com.hiwijaya.ioc.domain.Car;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Happy Indra Wijaya
 */
@Configuration
@ComponentScan(basePackages = "com.hiwijaya.ioc.domain")    // you can remove 'basePackages' declaration
//@ComponentScan(basePackageClasses = Car.class)
public class AutomatedConfig {

}
