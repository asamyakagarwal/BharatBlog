package com.writeit.exceptions;

import java.time.LocalDateTime;
import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ApiResponse {

    private String message;
    private LocalDateTime timestamp;
    private HttpStatus status;
    private int statusCode;

    // Constructor with all fields
    public ApiResponse(String message, LocalDateTime timestamp, HttpStatus status, int statusCode) {
        this.message = message;
        this.timestamp = timestamp;
        this.status = status;
        this.statusCode = statusCode;
    }
}

