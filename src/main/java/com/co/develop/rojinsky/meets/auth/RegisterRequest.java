package com.co.develop.rojinsky.meets.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    private String user;
    private String pass;
    private String name;
    private String lastname;
    private String country;
}
