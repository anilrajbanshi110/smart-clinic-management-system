package com.example.smartclinic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrescriptionController {

    @GetMapping("/prescriptions")
    public String getPrescriptions() {
        return "Prescription Details";
    }
}