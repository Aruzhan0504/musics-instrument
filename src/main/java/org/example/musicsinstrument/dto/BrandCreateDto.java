package org.example.musicsinstrument.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class BrandCreateDto {
    @JsonAlias("name")
    @NotNull(message = "Name can't be null")
    private String name;

    @JsonAlias("description")
    @NotNull(message = "Write description")
    private String description;
}
