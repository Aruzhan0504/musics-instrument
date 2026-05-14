package org.example.musicsinstrument.entity;

import jakarta.persistence.*;
import lombok.*;
import org.example.musicsinstrument.entity.base.BaseEntity;

import java.util.List;

@Entity
@Table(name = "MUSICS")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Builder
public class Music extends BaseEntity {

    @Column(name = "NAME", nullable = false)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BRAND_ID")
    private Brand brand;

    @Column(name = "MODEL")
    private String model;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CATEGORY_ID")
    private Category category;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COUNTRY_ID")
    private Country country;

    @Column(name = "MATERIAL",nullable = false,length = 100)
    private String material;

    @Column(name = "PRICE",nullable = false)
    private Double price;

    @Column(name = "DESCRIPTION",nullable = false)
    private String description;

//    @ManyToMany
//    List<Country> collectingCountry;
}
