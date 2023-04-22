package com.example.arearapplication.user.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import lombok.Setter;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Getter
@Setter
@AllArgsConstructor
@Document(collection = "Users")
public class User {
    @MongoId
    @Indexed(unique = true)
    private Long id;
    @Indexed(unique = true)
    private String userName;
    private String password;
    public User(){}
    public User(Long id, String userName)
    {
        this.id = id;
        this.userName = userName;
    }

    public User(String userName)
    {
        this.userName = userName;
    }

    public void setPassword(String password) {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        this.password = passwordEncoder.encode(password);
    }
}
