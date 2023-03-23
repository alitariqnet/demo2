package com.example2.demo2.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Keyboard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String model;
    String manufacturer;
    double price;
}
