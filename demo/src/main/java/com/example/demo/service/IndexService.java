package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class IndexService {
    public LocalDate getDate() {
        return LocalDate.now();
    }
}
