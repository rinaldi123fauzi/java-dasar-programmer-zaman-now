package rinaldifauzi.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "rinaldifauzi.spring.core.repository",
        "rinaldifauzi.spring.core.service"
})
public class ComponentConfiguration {
}
