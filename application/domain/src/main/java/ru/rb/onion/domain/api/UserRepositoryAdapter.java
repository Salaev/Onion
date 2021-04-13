package ru.rb.onion.domain.api;

import ru.rb.onion.domain.entity.User;


public interface UserRepositoryAdapter {

    int save(User user);

    User get(String name);
}
