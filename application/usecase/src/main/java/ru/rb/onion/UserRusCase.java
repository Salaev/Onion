package ru.rb.onion;

import ru.rb.onion.domain.api.IdentityAdapter;
import ru.rb.onion.domain.api.UserRepositoryAdapter;
import ru.rb.onion.domain.entity.User;

public class UserRusCase {

    private final UserRepositoryAdapter adapter;
    private final IdentityAdapter identityAdapter;

    public UserRusCase(UserRepositoryAdapter adapter, IdentityAdapter identityAdapter) {
        this.adapter = adapter;
        this.identityAdapter = identityAdapter;
    }

    public User getUser(final String name) {
        final User result = adapter.get(name);
        if (result == null) {
            throw new IllegalArgumentException("User not found");
        }
        return result;
    }

    public int saveUser(final User user) {
        user.setId(identityAdapter.getId(user.getName()));
        return adapter.save(user);
    }

}
