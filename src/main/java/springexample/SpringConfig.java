package springexample;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(
        "springexample"
)
@PropertySource("classpath:default.properties")
public class SpringConfig {
}