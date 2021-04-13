package ru.rb.onion.repository.adapter;

import org.springframework.stereotype.Component;
import ru.rb.onion.domain.api.UserRepositoryAdapter;
import ru.rb.onion.domain.entity.User;
import ru.rb.onion.repository.UserRepository;
import ru.rb.onion.repository.mappers.UserMapper;

@Component
public class UserRepositoryAdapterImpl implements UserRepositoryAdapter {

    private final UserRepository repository;
    private final UserMapper mapper;

    public UserRepositoryAdapterImpl(UserRepository repository, UserMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public int save(User user) {
        return repository.save(mapper.toEntity(user));
    }

    @Override
    public User get(String name) {
        return repository.get(name).map(mapper::toDomain).orElse(null);
    }
}
