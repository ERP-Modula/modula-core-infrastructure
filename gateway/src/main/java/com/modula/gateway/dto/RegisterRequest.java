package com.modula.gateway.dto;

import com.modula.gateway.model.Role;
import lombok.Data;

@Data
public class RegisterRequest {
    private String username;
    private String password;
    private Role role;
}
