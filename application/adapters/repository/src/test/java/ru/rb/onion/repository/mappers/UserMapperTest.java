package ru.rb.onion.repository.mappers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import ru.rb.onion.domain.entity.Identity;
import ru.rb.onion.domain.entity.User;
import ru.rb.onion.repository.entity.Passport;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {UserMapperImpl.class,PassportMapperImpl.class})
class UserMapperTest {

    @Autowired
    UserMapper mapper;

    @Test
    void toEntity() {

        var domain = getUser();
        var expected = new ru.rb.onion.repository.entity.User();
        expected.setAge_user(domain.getAge());
        expected.setName_user(domain.getName());
        var passport = new Passport();
        passport.setId_user(domain.getId().getId());
        expected.setId(passport);
        var actual = mapper.toEntity(domain);
        Assertions.assertEquals(expected, actual);
    }

    private User getUser() {
        User result = new User();
        result.setAge(10);
        result.setName("name");
        result.setId(new Identity(123));
        return result;
    }
}