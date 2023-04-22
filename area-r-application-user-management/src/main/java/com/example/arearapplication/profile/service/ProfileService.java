package com.example.arearapplication.profile.service;

import com.example.arearapplication.profile.model.Profile;
import com.example.arearapplication.profile.repository.ProfileRepository;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {

    private final ProfileRepository profileRepository;
    public ProfileService(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    public Profile createProfile(Profile profile)
    {
        return profileRepository.save(profile);
    }
}
