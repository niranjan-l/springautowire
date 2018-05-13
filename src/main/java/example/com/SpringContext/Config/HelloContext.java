package example.com.SpringContext.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="example.com.SpringContext.bean")
public  class HelloContext {

}