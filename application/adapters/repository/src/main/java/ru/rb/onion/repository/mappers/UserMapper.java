package ru.rb.onion.repository.mappers;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.rb.onion.domain.entity.User;

@Mapper(config = MapperConfiguration.class,
        uses = {PassportMapper.class})
public interface UserMapper {

    @Mapping(target = "name_user", source = "name")
    @Mapping(target = "age_user", source = "age")
    ru.rb.onion.repository.entity.User toEntity(final User domain);

    @InheritInverseConfiguration
    User toDomain(final ru.rb.onion.repository.entity.User entity);
}
