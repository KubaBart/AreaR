package com.example.arearapplication.profile.repository;

import com.example.arearapplication.profile.model.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProfileRepository extends MongoRepository<Profile,Long> {
}
