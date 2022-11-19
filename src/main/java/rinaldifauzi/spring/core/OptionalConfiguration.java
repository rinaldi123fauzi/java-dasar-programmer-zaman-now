package rinaldifauzi.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import rinaldifauzi.spring.core.data.Bar;
import rinaldifauzi.spring.core.data.Foo;
import rinaldifauzi.spring.core.data.FooBar;

import java.util.Optional;

@Configuration
public class OptionalConfiguration {

    @Bean
    public Foo foo(){
        return new Foo();
    }

    @Bean
    public FooBar fooBar(Optional<Foo> foo, Optional<Bar> bar){ //parameter tidak wajib atau tidak mandatory
        return new FooBar(foo.orElse(null), bar.orElse(null));
    }
}
