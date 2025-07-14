package com.ejemplo.banco.model;

import jakarta.persistence.*;

@Entity
public class CuentaBancaria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titular;
    private Double saldo;

    // Constructor vacío (requerido por JPA)
    public CuentaBancaria() {
    }

    // Constructor completo
    public CuentaBancaria(Long id, String titular, Double saldo) {
        this.id = id;
        this.titular = titular;
        this.saldo = saldo;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getTitular() {
        return titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
