package io.github.soydivision.config;

import io.github.soydivision.beans.BeanExample;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfiguration {

    @Bean
    public BeanExample beanExample() {
        BeanExample beanExample = new BeanExample();
        beanExample.setText("sexy");
        return beanExample;
    }

}
