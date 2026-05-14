package org.example.musicsinstrument.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import org.example.musicsinstrument.entity.base.BaseEntity;

import java.time.LocalDate;

@Entity
@Table(name = "USERS")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Builder
public class User extends BaseEntity {

    @Column(name = "FULL_NAME", length = 100,nullable = false)
    private String fullName;

    @Column(name = "BIRTHDATE",nullable = false)
    private LocalDate birthdate;

    @Column(name = "EMAIL",nullable = false,unique = true,length = 50)
    private String email;

    @Column(name = "PASSWORD",nullable = false,length = 14)
    private String paasword;

    @Column(name = "PHONE_NUMBER",nullable = false,unique = true,length = 20)
    private String phoneNumber;

    @Column(name = "ADDRESS")
    private String address;
}
