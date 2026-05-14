package org.example.musicsinstrument.entity;

import jakarta.persistence.*;
import lombok.*;
import org.example.musicsinstrument.entity.base.BaseEntity;

@Entity
@Table(name = "CATEGORY")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Builder
public class Category  extends BaseEntity {

    @Column(name = "NAME")
    private String name;

    @Column(name = "CODE")
    private String code;
}
