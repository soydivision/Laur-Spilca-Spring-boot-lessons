package config;


import bean.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean
    public MyBean myBean() {
        MyBean myBean = new MyBean();
        myBean.setText("some text");
        return myBean;
    }

    @Primary
    @Bean
    public MyBean myBean1() {
        MyBean b = new MyBean();
        b.setText("Text from bean 1");
        return b;
    }

    @Bean
    public MyBean myBean2() {
        MyBean b = new MyBean();
        b.setText("Text from bean 2");
        return b;
    }

}
