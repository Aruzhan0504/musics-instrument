package org.example.musicsinstrument.repository;

import org.example.musicsinstrument.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface RoleRespository extends JpaRepository<Role,Long> {

    Optional<Role> findByName(String name);
}
