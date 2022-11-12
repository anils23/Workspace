package com.te.spring.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "com.te.spring.annotations")
@Configuration
public class Config {
	
    @Bean
	public Camera getCamera(){
     return new Camera(2, "vivo", 54);
	} 

}
