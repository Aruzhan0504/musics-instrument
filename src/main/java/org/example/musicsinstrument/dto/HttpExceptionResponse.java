package org.example.musicsinstrument.dto;


import lombok.*;

import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class HttpExceptionResponse {
    private String message;
    private int status;
    private String exception;
    private final Instant timestmap = Instant.now();
}
