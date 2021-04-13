package ru.rb.onion.infrastructure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.rb.onion.UserRusCase;
import ru.rb.onion.domain.api.IdentityAdapter;
import ru.rb.onion.domain.api.UserRepositoryAdapter;

@Configuration
@ComponentScan("ru.rb.onion")
public class Config {

    @Bean("user_rus")
    public UserRusCase getUserRusCase(
            UserRepositoryAdapter adapter,
            IdentityAdapter identityAdapter) {
        return new UserRusCase(adapter, identityAdapter);
    }

    @Bean("user_eng")
    public UserRusCase getUserEngCase(
            UserRepositoryAdapter adapter,
            IdentityAdapter identityAdapter) {
        return new UserRusCase(adapter, identityAdapter);
    }

}
