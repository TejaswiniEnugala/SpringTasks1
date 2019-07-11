package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("file:src/beans.xml");
        Movie movie =context.getBean("movie",Movie.class);
        Movie movie1 =context.getBean("movie",Movie.class);
        System.out.println(movie);
        System.out.println(movie1);
        System.out.println(movie==movie1);
        Movie movies1 =context.getBean("movie1",Movie.class);
        movies1.displayActorDetails();
        Movie movies =context.getBean("movie2",Movie.class);
        movies.displayActorDetails();


    }
}
