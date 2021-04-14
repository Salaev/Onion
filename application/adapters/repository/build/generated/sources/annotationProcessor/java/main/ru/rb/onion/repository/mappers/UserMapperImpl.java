package ru.rb.onion.repository.mappers;

import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.rb.onion.domain.entity.User;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-04-13T23:23:27+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-6.8.jar, environment: Java 11.0.10 (Amazon.com Inc.)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Autowired
    private PassportMapper passportMapper;

    @Override
    public ru.rb.onion.repository.entity.User toEntity(User domain) {
        if ( domain == null ) {
            return null;
        }

        ru.rb.onion.repository.entity.User user = new ru.rb.onion.repository.entity.User();

        if ( domain.getName() != null ) {
            user.setName_user( domain.getName() );
        }
        user.setAge_user( domain.getAge() );
        if ( domain.getId() != null ) {
            user.setId( passportMapper.toEntity( domain.getId() ) );
        }

        return user;
    }

    @Override
    public User toDomain(ru.rb.onion.repository.entity.User entity) {
        if ( entity == null ) {
            return null;
        }

        User user = new User();

        if ( entity.getName_user() != null ) {
            user.setName( entity.getName_user() );
        }
        user.setAge( entity.getAge_user() );
        if ( entity.getId() != null ) {
            user.setId( passportMapper.toDomain( entity.getId() ) );
        }

        return user;
    }
}
