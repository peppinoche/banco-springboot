package com.ejemplo.banco.controller;

import com.ejemplo.banco.model.CuentaBancaria;
import com.ejemplo.banco.service.CuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cuentas")
public class CuentaController {

    @Autowired
    private CuentaService cuentaService;

    @PostMapping
    public CuentaBancaria crearCuenta(@RequestBody CuentaBancaria cuenta) {
        return cuentaService.crearCuenta(cuenta);
    }
    //Se agrego en el paso 2
    @GetMapping("/{id}")
    public CuentaBancaria obtenerCuentaPorId(@PathVariable Long id) {
        return cuentaService.obtenerCuentaPorId(id);
    }


    @GetMapping
    public List<CuentaBancaria> listarCuentas() {
        return cuentaService.listarCuentas();
    }

    @PutMapping("/{id}")
    public CuentaBancaria actualizarTitular(@PathVariable Long id, @RequestBody String nuevoTitular) {
        return cuentaService.actualizarTitular(id, nuevoTitular);
    }

    @DeleteMapping("/{id}")
    public void eliminarCuenta(@PathVariable Long id) {
        cuentaService.eliminarCuenta(id);
    }
}
