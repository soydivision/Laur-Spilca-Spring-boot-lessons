package config;


import bean.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public MyBean myBean() {
        MyBean myBean = new MyBean();
        myBean.setText("some text");
        return myBean;
    }


}
