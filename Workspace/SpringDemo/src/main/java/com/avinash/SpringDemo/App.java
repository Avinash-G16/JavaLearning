package com.avinash.SpringDemo;

//import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
//import org.springframework.core.io.FileSystemResource;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
//    	BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
    	Alien obj = (Alien)factory.getBean(Alien.class);
    	obj.code();
    	System.out.println(obj.getAge());
    	obj.getLaptop().compile();
//    	obj.age = 15;
//    	System.out.println(obj.age);
        //System.out.println( "Hello World!" );
//    	Alien obj2 = (Alien)factory.getBean(Alien.class);
//    	obj2.code();
//    	System.out.println(obj2.age);
    }
}
