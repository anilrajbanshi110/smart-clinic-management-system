package com.example.smartclinic.service;

import org.springframework.stereotype.Service;

@Service
public class AppointmentService {

    public String bookAppointment() {
        return "Appointment Booked Successfully";
    }
}