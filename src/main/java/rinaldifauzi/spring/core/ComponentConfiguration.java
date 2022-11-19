package rinaldifauzi.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import rinaldifauzi.spring.core.data.MultiFoo;

@Configuration
@ComponentScan(basePackages = {
        "rinaldifauzi.spring.core.repository",
        "rinaldifauzi.spring.core.service",
        "rinaldifauzi.spring.core.configuration"
})

@Import(MultiFoo.class)
public class ComponentConfiguration {
}
