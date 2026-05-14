package org.example.musicsinstrument.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CountryCreateDto {
    @JsonAlias("name")
    @NotNull(message = "Name not be null")
    private String name;

    @JsonAlias("city")
    @NotNull(message = "City not be null")
    private String city;
}
