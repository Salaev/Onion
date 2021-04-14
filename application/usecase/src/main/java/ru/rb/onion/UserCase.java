package ru.rb.onion;

import ru.rb.onion.domain.entity.User;

public interface UserCase {
     User getUser(final String name);

     int saveUser(final User user);

}
