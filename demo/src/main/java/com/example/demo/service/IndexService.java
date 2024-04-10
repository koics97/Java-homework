package com.example.demo.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@AllArgsConstructor
public class IndexService {
    public LocalDate getDate() {
        return LocalDate.now();
    }
}
