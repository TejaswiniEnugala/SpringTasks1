package com.stackroute;

import com.stackroute.domain.BeanLifeCycleDemoBean;
import com.stackroute.domain.BeanPostProcessorDemoBean;
import com.stackroute.domain.Movie;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws Exception {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("file:src/beans.xml");
        BeanLifeCycleDemoBean beanLifeCycleDemoBean = context.getBean("beanLifeCycle",BeanLifeCycleDemoBean.class);
        Movie movies =context.getBean("movie",Movie.class);
        movies.displayActorDetails();
        BeanPostProcessorDemoBean beanPostProcessorDemoBean=context.getBean("beanPostProcessorDemoBean",BeanPostProcessorDemoBean.class);
        context.close();
    }
}
