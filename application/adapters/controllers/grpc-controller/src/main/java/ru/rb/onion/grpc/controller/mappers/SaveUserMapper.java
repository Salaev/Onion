package ru.rb.onion.grpc.controller.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.rb.onion.domain.entity.User;
import ru.rb.onion.grpc.controller.proto.SaveUserRequest;

@Mapper(config = MapperConfiguration.class)
public interface SaveUserMapper {

    @Mapping(target = "id", ignore = true)
    User toDomain(final SaveUserRequest grpc);

}
