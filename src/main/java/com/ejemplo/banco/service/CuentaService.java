package com.ejemplo.banco.service;

import com.ejemplo.banco.model.CuentaBancaria;
import com.ejemplo.banco.repository.CuentaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CuentaService {



    private final CuentaRepository repository;

    //se puso en el paso dos para consultar cuenta ID
    public CuentaBancaria obtenerCuentaPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public CuentaService(CuentaRepository repository) {
        this.repository = repository;
    }

    public List<CuentaBancaria> listarCuentas() {
        return repository.findAll();
    }

    public Optional<CuentaBancaria> obtenerPorId(Long id) {
        return repository.findById(id);
    }

    public CuentaBancaria crearCuenta(CuentaBancaria cuenta) {
        return repository.save(cuenta);
    }

    public CuentaBancaria actualizarTitular(Long id, String nuevoTitular) {
        CuentaBancaria cuenta = repository.findById(id).orElseThrow();
        cuenta.setTitular(nuevoTitular);
        return repository.save(cuenta);
    }

    public void eliminarCuenta(Long id) {
        repository.deleteById(id);
    }

}