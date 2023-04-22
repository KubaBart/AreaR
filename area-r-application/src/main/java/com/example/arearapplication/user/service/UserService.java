package com.example.arearapplication.user.service;


import com.example.arearapplication.user.model.User;
import com.example.arearapplication.user.model.UserDto;
import com.example.arearapplication.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {


    private final UserRepository userRepository;
    public UserService(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }
    public List<UserDto> getUsers()
    {
        return userRepository.findAll()
                .stream().map(user -> new UserDto(user.getId(),user.getUserName()))
                .collect(Collectors.toList());
    }
    public User create(User user)
    {
        return userRepository.save(user);
    }
}
