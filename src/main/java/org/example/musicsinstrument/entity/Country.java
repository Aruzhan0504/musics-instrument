package org.example.musicsinstrument.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "COUNTRIES")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "CITY")
    private String city;
}
