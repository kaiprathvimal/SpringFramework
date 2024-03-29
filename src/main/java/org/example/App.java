package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Programmer obj = (Programmer) context.getBean("programmer");
        obj.comp();
        Programmer obj1 = (Programmer) context.getBean("programmer");
        obj1.comp();
        
    }
}
