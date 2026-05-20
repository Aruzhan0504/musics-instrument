package org.example.musicsinstrument.service;

import lombok.RequiredArgsConstructor;
import org.example.musicsinstrument.entity.Role;
import org.example.musicsinstrument.repository.RoleRespository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoleService {
    private final RoleRespository roleRespository;

    public Role getUserRole(){
        return roleRespository.findByName("USER")
                .orElseThrow(()->new RuntimeException("USER not found"));
    }
}
