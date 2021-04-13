package ru.rb.onion.repository.mappers;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.rb.onion.domain.entity.Identity;
import ru.rb.onion.repository.entity.Passport;

@Mapper(config = MapperConfiguration.class)
public interface PassportMapper {

    @Mapping(target = "id_user",source = "id")
    Passport toEntity(final Identity domain);

    @InheritInverseConfiguration
    Identity toDomain(final Passport entity);
}
