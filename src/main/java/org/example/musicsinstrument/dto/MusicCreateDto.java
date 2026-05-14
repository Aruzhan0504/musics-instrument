package org.example.musicsinstrument.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.example.musicsinstrument.entity.Brand;
import org.example.musicsinstrument.entity.Category;
import org.example.musicsinstrument.entity.Country;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class MusicCreateDto {
    @JsonAlias("name")
    @NotNull(message = "Name doesn't be null")
    @NotBlank(message = "Name doesn't be blank")
    private String name;

    @JsonAlias("brand")
    @NotNull(message = "Brand doesn't be null")
    private Long brandId;

    @JsonAlias("model")
    @NotNull(message = "model not be null")
    private String model;

    @JsonAlias("category_id")
    @NotNull(message = "Category not be null")
    private Long categoryId;

    @JsonAlias("country_id")
    @NotNull(message = "Country not be null")
    private Long countryId;

    @JsonAlias("material")
    @NotNull(message = "Material not be null")
    private String material;

    @JsonAlias("price")
    private Double price;

    @JsonAlias("description")
    private String description;

}
