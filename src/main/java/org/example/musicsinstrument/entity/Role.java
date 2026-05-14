package org.example.musicsinstrument.entity;

import jakarta.persistence.*;
import lombok.*;
import org.example.musicsinstrument.entity.base.BaseEntity;

@Entity
@Table(name = "ROLES")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Builder
public class Role extends BaseEntity {

    @Column(name = "NAME", nullable = false, unique = true)
    private String name;

    @Column(name = "DESCRIPTION",columnDefinition = "TEXT")
    private String description;
}
