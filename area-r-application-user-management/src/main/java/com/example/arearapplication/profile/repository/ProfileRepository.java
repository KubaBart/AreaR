package com.example.arearapplication.profile.repository;

import com.example.arearapplication.profile.model.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface ProfileRepository extends MongoRepository<Profile,Long> {

    Optional<Profile> findProfileByUserName(String userName);
}
