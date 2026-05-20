package org.example.musicsinstrument.service;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.musicsinstrument.dto.ChangePasswordDto;
import org.example.musicsinstrument.dto.LoginDto;
import org.example.musicsinstrument.dto.UserCreateDto;
import org.example.musicsinstrument.dto.UserResponse;
import org.example.musicsinstrument.entity.User;
import org.example.musicsinstrument.exception.EmailUniqueException;
import org.example.musicsinstrument.mapper.UserMapper;
import org.example.musicsinstrument.repository.UserRepository;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final RoleService roleService;
    private final PasswordEncoder passwordEncoder;

    public UserResponse register(@Valid UserCreateDto dto) {
        if (userRepository.existsByEmail(dto.getEmail())){
            throw new EmailUniqueException("Email already exsit");
        }
        User user = userMapper.toEntity(dto);
        user.setRoles(List.of(roleService.getUserRole()));
        user.setPassword(passwordEncoder.encode(dto.getPassword()));

        User savedUser = userRepository.save(user);
        UserResponse userResponse = userMapper.toDto(savedUser);
        return userResponse;
    }
    public User currentUser(){
       try {
           return (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
       }
       catch (Exception e){
           throw new RuntimeException("Current user is not authenticated");
       }

    }


    public void changePassword(@Valid ChangePasswordDto dto) {

        User user = currentUser();
        if (!passwordEncoder.matches(dto.getCurrentPassword(), user.getPassword())){
            throw  new RuntimeException("Incorrect password");
        }
        if (!dto.getNewPassword().equals(dto.getReNewPassword())){
            throw new RuntimeException("Incorrect password");
        }

        user.setPassword(passwordEncoder.encode(dto.getReNewPassword()));
        userRepository.save(user);
    }

//    public UserResponse login(@Valid LoginDto dto) {
//        if (!userRepository.existsByEmail(dto.getEmail())){
//            throw new RuntimeException("Incorrect email or password");
//        }
//        if (!dto.getPassword().equals(dto.getRePassword())){
//            throw new RuntimeException("Incorrect email or password");
//        }
//
//        User user = userRepository.findByEmail(dto.getEmail()).get();
//
//        if (!passwordEncoder.matches(dto.getPassword(), user.getPassword())){
//
//        }
//    }
}
