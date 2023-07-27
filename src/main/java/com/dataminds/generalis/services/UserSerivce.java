package com.dataminds.generalis.services;

import com.dataminds.generalis.dto.UserDto;
import com.dataminds.generalis.model.User;

import java.util.List;
import java.util.Optional;

public interface UserSerivce {
    void save(UserDto userDto);
    User findUserByEmail(String email);
    List<UserDto> findAllUsers();
}
