package org.example.musicsinstrument.controller;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.musicsinstrument.dto.ChangePasswordDto;
import org.example.musicsinstrument.dto.LoginDto;
import org.example.musicsinstrument.dto.UserCreateDto;
import org.example.musicsinstrument.dto.UserResponse;
import org.example.musicsinstrument.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<UserResponse> register (@Valid @RequestBody UserCreateDto dto){
    return ResponseEntity.status(201).body(userService.register(dto));
    }

    @PostMapping("/change-password")
    public ResponseEntity<Void> login(@Valid @RequestBody ChangePasswordDto dto){
        userService.changePassword(dto);
        return ResponseEntity.status(201).build();
    }

}
