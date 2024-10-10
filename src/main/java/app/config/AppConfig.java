package app.config;

import app.model.Dog;
import app.model.Timer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.sql.Time;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {
    @Bean(name = "dog")
    @Scope("prototype")
    public Dog createDog() {
        return new Dog();
    }
    @Bean(name="timer")
    @Scope("prototype")
    public Timer createTime() {
        return new Timer();
    }
}
