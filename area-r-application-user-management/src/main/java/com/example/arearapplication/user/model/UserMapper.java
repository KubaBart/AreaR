package com.example.arearapplication.user.model;

public final class UserMapper {
    public static UserDto mapToDto(User user)
    {
        return new UserDto(user.getId(), user.getUserName());
    }

    public static User mapToUser(UserDto userDto)
    {
        return new User(userDto.id(),userDto.userName());
    }
}
