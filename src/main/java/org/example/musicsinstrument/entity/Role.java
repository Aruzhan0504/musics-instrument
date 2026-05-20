package org.example.musicsinstrument.entity;

import jakarta.persistence.*;
import lombok.*;
import org.example.musicsinstrument.entity.base.BaseEntity;
import org.jspecify.annotations.Nullable;
import org.springframework.security.core.GrantedAuthority;

@Entity
@Table(name = "ROLES")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Builder
public class Role extends BaseEntity implements GrantedAuthority  {

    @Column(name = "NAME", nullable = false, unique = true)
    private String name;

    @Column(name = "DESCRIPTION",columnDefinition = "TEXT")
    private String description;

    @Override
    public @Nullable String getAuthority() {
        return name;
    }
}
