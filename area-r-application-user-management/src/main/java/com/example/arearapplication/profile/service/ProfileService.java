package com.example.arearapplication.profile.service;

import com.example.arearapplication.profile.model.Profile;
import com.example.arearapplication.profile.repository.ProfileRepository;
import com.example.arearapplication.user.model.UserDto;
import com.example.arearapplication.user.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {

    private final ProfileRepository profileRepository;
    private final UserService userService;
    public ProfileService(ProfileRepository profileRepository,UserService userService) {
        this.profileRepository = profileRepository;
        this.userService = userService;
    }

    public Profile createProfile(Profile profile)
    {
        return profileRepository.save(profile);
    }

    public Profile findProfileByUserName(String userName)
    {
       return profileRepository.findProfileByUserName(userName)
               .orElseThrow(() -> new IllegalArgumentException("Profile with this username doesnt exist"));
    }
}
