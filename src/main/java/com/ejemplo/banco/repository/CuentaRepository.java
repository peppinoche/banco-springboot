package com.ejemplo.banco.repository;

import com.ejemplo.banco.model.CuentaBancaria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CuentaRepository extends JpaRepository<CuentaBancaria, Long>{
}
