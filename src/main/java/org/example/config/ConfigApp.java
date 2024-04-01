package org.example.config;

import org.example.Desktop;
import org.example.Programmer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigApp {
    @Bean
    //@Scope("prototype")
    public Desktop desktop(){
        return new Desktop();
    }
    @Bean
    public Programmer programmer(){
        Programmer obj = new Programmer();
        obj.setAge(34);
        return obj;
    }
}
