package com.example.arearapplication.user.model;



import lombok.AllArgsConstructor;
import lombok.Getter;

import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@Document(collection = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String userName;
    private String password;
    public User(){}
    public User(Long id, String userName)
    {
        this.id = id;
        this.userName = userName;
    }
}
