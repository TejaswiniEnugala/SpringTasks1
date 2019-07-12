package com.stackroute.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycleDemoBean implements InitializingBean, DisposableBean {

       public void afterPropertiesSet() throws Exception {
        System.out.println("properties");

    }
    public void customInit()
    {
        System.out.println("custom init done");
    }
    public void customDestroy()
    {
        System.out.println("custom destroyed");
    }

    public void destroy() throws Exception {
        System.out.println("destroyed");

    }
}
