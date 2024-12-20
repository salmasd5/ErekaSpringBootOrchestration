package com.example.Client.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Client {
    // Getters et Setters
    @Id
    @GeneratedValue
    private Long id;
    private String nom;
    private Float age;

    // Constructeur sans arguments
    public Client() {
    }

    // Constructeur avec tous les arguments
    public Client(Long id, String nom, Float age) {
        this.id = id;
        this.nom = nom;
        this.age = age;
    }

}
