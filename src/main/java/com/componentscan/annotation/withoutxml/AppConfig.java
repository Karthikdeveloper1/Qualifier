package com.componentscan.annotation.withoutxml;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Configuration
@ComponentScan(basePackages = "com.componentscan.annotation.withoutxml")
public class AppConfig {


}
