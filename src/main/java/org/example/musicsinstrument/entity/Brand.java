package org.example.musicsinstrument.entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "BRAND")
@NoArgsConstructor
@Setter
@AllArgsConstructor
@Getter
@ToString
@Builder
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME",nullable = false,length = 100)
    private String name;

    @Column(name = "DESCRIPTION",nullable = false)
    private String description;
}
