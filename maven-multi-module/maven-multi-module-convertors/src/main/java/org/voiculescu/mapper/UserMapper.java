package org.voiculescu.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.voiculescu.domain.UserCommand;
import org.voiculescu.entities.User;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(target = "email", ignore = true)
    UserCommand userToUserCommand(User user);

    @Mapping(target = "id", ignore = true)
    User userCommandToUser(UserCommand userCommand);

}
