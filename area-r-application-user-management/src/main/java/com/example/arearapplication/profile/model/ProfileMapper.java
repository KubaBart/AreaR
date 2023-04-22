package com.example.arearapplication.profile.model;

import com.example.arearapplication.user.model.UserDto;

public final class ProfileMapper {

    ProfileDto mapToDto(UserDto userDto)
    {
        return new ProfileDto(userDto.userName());
    }

    Profile mapToProfile(ProfileDto profileDto)
    {
        return new Profile(profileDto.username());
    }
}
