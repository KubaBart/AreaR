package com.example.arearapplication.user;


import com.example.arearapplication.user.model.User;
import com.example.arearapplication.user.model.UserDto;
import com.example.arearapplication.user.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public ResponseEntity<List<UserDto>> getUsersList()
    {
        return ResponseEntity.status(HttpStatus.OK)
                .body(userService.getUsers());
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> createUser(@ModelAttribute User user)
    {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(userService.create(user));
    }

}
