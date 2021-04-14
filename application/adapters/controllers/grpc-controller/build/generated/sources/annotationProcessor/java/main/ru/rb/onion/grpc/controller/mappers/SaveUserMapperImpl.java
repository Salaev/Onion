package ru.rb.onion.grpc.controller.mappers;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ru.rb.onion.domain.entity.User;
import ru.rb.onion.grpc.controller.proto.SaveUserRequest;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-04-14T23:05:25+0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-6.8.jar, environment: Java 11.0.10 (Amazon.com Inc.)"
)
@Component
public class SaveUserMapperImpl implements SaveUserMapper {

    @Override
    public User toDomain(SaveUserRequest grpc) {
        if ( grpc == null ) {
            return null;
        }

        User user = new User();

        if ( grpc.getName() != null ) {
            user.setName( grpc.getName() );
        }
        user.setAge( grpc.getAge() );

        return user;
    }
}
