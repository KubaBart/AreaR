package com.example.arearapplication.profile.model;

import com.example.arearapplication.user.model.UserDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document
@Getter
@Setter
@AllArgsConstructor
public class Profile {
    @MongoId
    private Long id;
    private String userName;
    private String firstName;
    private String lastName;

    public Profile(String userName)
    {
        this.userName = userName;
    }
}
