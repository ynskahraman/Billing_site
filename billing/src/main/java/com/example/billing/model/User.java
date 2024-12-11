package com.example.billing.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    private String username;
    private String password;
    private String role;  // Role for authorization, example: "USER", "ADMIN"

    // Getters and Setters
}

