package config;


import bean.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean("A")
    public MyBean myBean() {
        MyBean myBean = new MyBean();
        myBean.setText("Text from bean 0");
        return myBean;
    }

    @Primary
    @Bean("B")
    public MyBean myBean1() {
        MyBean b = new MyBean();
        b.setText("Text from bean 1");
        return b;
    }

    @Bean("C")
    public MyBean myBean2() {
        MyBean b = new MyBean();
        b.setText("Text from bean 2");
        return b;
    }

}
