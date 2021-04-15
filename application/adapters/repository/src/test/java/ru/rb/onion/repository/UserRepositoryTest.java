package ru.rb.onion.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.rb.onion.repository.entity.User;

class UserRepositoryTest {

    @Test
    void save() {
        UserRepository repository = new UserRepository();
        User user = new User();
        repository.save(user);
        Assertions.assertTrue(repository.getUsers().containsValue(user));
    }
}