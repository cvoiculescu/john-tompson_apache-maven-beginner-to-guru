package org.voiculescu.controllers;

import org.voiculescu.domain.UserCommand;
import org.voiculescu.entities.User;
import org.voiculescu.mapper.UserMapper;
import org.voiculescu.mapper.UserMapperImpl;

public class UserController {

    private final UserMapper userMapper = new UserMapperImpl();

    User saveUser(UserCommand command) {
        return UserMapper.INSTANCE.userCommandToUser(command);
    }

}
