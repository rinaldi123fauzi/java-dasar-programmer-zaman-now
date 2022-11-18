package rinaldifauzi.spring.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import rinaldifauzi.spring.core.configuration.BarConfiguration;
import rinaldifauzi.spring.core.configuration.FooConfiguration;

@Configuration
@Import({
        FooConfiguration.class,
        BarConfiguration.class
})
public class MainConfiguration {
}
