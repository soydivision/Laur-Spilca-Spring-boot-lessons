package demo;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("jp")
public class HelloServiceJp implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Ohayo " + name;
    }
}
