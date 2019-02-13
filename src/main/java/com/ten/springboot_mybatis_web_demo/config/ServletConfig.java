package com.ten.springboot_mybatis_web_demo.config;

import com.ten.springboot_mybatis_web_demo.servlet.TestServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServletConfig  {

    @Bean
    public TestServlet instance(){
        return new TestServlet();
    }

    @Bean
    public ServletRegistrationBean testServletRegistrationBean(TestServlet helloWorldServlet){
        ServletRegistrationBean registration = new ServletRegistrationBean(helloWorldServlet);

        registration.setEnabled(true);
        registration.addUrlMappings("/test/*");
        return registration;
    }





}


