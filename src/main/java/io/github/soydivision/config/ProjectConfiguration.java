package io.github.soydivision.config;

import io.github.soydivision.beans.BeanExample;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfiguration {

    @Bean
    public BeanExample beanExample() {
        BeanExample beanExample = new BeanExample();
        beanExample.setText("text from bean 1");
        return beanExample;
    }

    @Bean
    public BeanExample beanExample2() {
        BeanExample beanExample = new BeanExample();
        beanExample.setText("text from bean 2");
        return beanExample;
    }
}
