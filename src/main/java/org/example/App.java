package org.example;

import org.example.config.ConfigApp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigApp.class);
        Programmer obj = context.getBean(Programmer.class);
        //Programmer obj = (Programmer) context.getBean("programmer");
//        obj.setAge(22);
        System.out.println(obj.getAge());


//        Desktop dskt = context.getBean(Desktop.class);
//        dskt.s







//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//
//        Programmer obj = (Programmer) context.getBean("programmer");
//        System.out.println(obj.getAge());
//        obj.comp();

        
    }
}
