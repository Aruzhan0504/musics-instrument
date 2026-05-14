package org.example.musicsinstrument.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class CategoryCreateDto {
    @JsonAlias("name")
    @NotNull(message = "Name can't be null")
    private String name;

    @JsonAlias("code")
    @NotNull(message = "Code can't be null")
    private String code;
}
