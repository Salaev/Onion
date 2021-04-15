package ru.rb.onion.repository;

import org.springframework.stereotype.Component;
import ru.rb.onion.repository.entity.User;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Component
public class UserRepository {
    private int count = 0;

    private final Map<Integer, User> users = new HashMap<>();

    public int save(final User user) {
        count++;
        users.put(count, user);
        return count;
    }

    public Optional<User> get(final String name) {
        return users.values().stream().filter(s -> s.getName_user().equals(name)).findFirst();
    }

    public Map<Integer, User> getUsers() {
        return users;
    }
}
