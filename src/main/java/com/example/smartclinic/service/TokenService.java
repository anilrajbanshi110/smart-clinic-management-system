package com.example.smartclinic.service;

import org.springframework.stereotype.Service;

@Service
public class TokenService {

    public String generateToken() {
        return "Token Generated";
    }
}