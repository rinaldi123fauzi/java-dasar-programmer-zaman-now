package rinaldifauzi.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import rinaldifauzi.spring.core.data.Bar;
import rinaldifauzi.spring.core.data.Foo;
import rinaldifauzi.spring.core.data.FooBar;

@Configuration
public class DependencyInjectionConfiguration {

    @Bean
    public Foo foo(){
        return new Foo();
    }

    @Bean
    public Bar bar(){
        return new Bar();
    }

    @Bean
    public FooBar fooBar(Foo foo, Bar bar){
        return new FooBar(foo, bar);
    }
}
