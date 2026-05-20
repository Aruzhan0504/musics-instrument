package org.example.musicsinstrument.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UserResponse {
    @JsonProperty("id")
    private Long id;

    @JsonProperty("full_name")
    private String fullName;

    @JsonProperty("birthdate")
    private String birthdate;

    @JsonProperty("email")
    private String email;

    @JsonProperty("phone_number")
    private Long phoneNumber;

    @JsonProperty("address")
    private String address;

    @JsonProperty("create_at")
    private String createAt;
}
