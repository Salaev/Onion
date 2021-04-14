package ru.rb.onion.infrastructure;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.rb.onion.UserEngCase;
import ru.rb.onion.UserRusCase;
import ru.rb.onion.domain.api.IdentityAdapter;
import ru.rb.onion.domain.api.UserRepositoryAdapter;

@Configuration
@ComponentScan("ru.rb.onion")
public class Config {

    @Bean("user-rus-case")
    public UserRusCase getUserRusCase(
            UserRepositoryAdapter adapter,
            @Qualifier("identity_rus") IdentityAdapter identityAdapter) {
        return new UserRusCase(adapter, identityAdapter);
    }

    @Bean("user-eng-case")
    public UserEngCase getUserEngCase(
            UserRepositoryAdapter adapter,
            @Qualifier("identity_eng") IdentityAdapter identityAdapter) {
        return new UserEngCase(adapter, identityAdapter);
    }

}
