package com.cs4.springboot.controller.dto;

import lombok.Data;

/**
 * Receive the front-end login request params
 */

@Data
public class UserDTO {
    private String loginEmail;
    private String password;
    private String token;
}
