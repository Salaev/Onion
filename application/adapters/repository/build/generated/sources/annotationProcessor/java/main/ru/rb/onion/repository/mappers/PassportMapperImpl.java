package ru.rb.onion.repository.mappers;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ru.rb.onion.domain.entity.Identity;
import ru.rb.onion.repository.entity.Passport;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-04-13T23:23:27+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-6.8.jar, environment: Java 11.0.10 (Amazon.com Inc.)"
)
@Component
public class PassportMapperImpl implements PassportMapper {

    @Override
    public Passport toEntity(Identity domain) {
        if ( domain == null ) {
            return null;
        }

        Passport passport = new Passport();

        passport.setId_user( domain.getId() );

        return passport;
    }

    @Override
    public Identity toDomain(Passport entity) {
        if ( entity == null ) {
            return null;
        }

        long id = 0L;

        id = entity.getId_user();

        Identity identity = new Identity( id );

        return identity;
    }
}
