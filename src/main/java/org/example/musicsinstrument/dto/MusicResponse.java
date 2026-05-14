package org.example.musicsinstrument.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.example.musicsinstrument.entity.Brand;
import org.example.musicsinstrument.entity.Category;
import org.example.musicsinstrument.entity.Country;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder

public class MusicResponse {
    @JsonProperty("id")
    private Long id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("brand")
    private Long brandId;

    @JsonProperty("model")
    private String model;

    @JsonProperty("category_id")
    private Long categoryId;

    @JsonProperty("country_id")
    private Long countryId;

    @JsonProperty("material")
    private String material;

    @JsonProperty("price")
    private Double price;

    @JsonProperty("description")
    private String description;

}
