package com.project.api.controller;


import com.project.api.model.Vehiculo;
import com.project.api.services.VehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class VehiculoController {

    @Autowired
    private VehiculoService vehiculoService;


    // http://localhost:8080/vehiculos
    @GetMapping("/vehiculos")
    public ResponseEntity<List<Vehiculo>>obtenerTodos(){
        return ResponseEntity.status(HttpStatus.OK)
                .body(vehiculoService.mostrarTodos());
    }

    // BUSCAR POR ID
    // http://localhost:8080/vehiculo/{id}
    @GetMapping("/vehiculo/{id}")
    public ResponseEntity<?>obtenerPorId(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(vehiculoService.buscarPorId(id));

    }

    // AGREGAR
    @PostMapping("/vehiculo")
    public ResponseEntity<?> guardar(@RequestBody Vehiculo vehiculo){

    return ResponseEntity.status(HttpStatus.OK).body(vehiculoService.guardar(vehiculo));

    }

    // ACTUALIZAR
    @PutMapping("")
    public Vehiculo actualizar(@RequestBody Vehiculo vehiculo){
        return vehiculoService.actualizar(vehiculo);

    }

    @DeleteMapping("/vehiculo/{idPersona}")
    public void eliminar(@PathVariable("idPersona") Long id){
        vehiculoService.eliminar(id);

    }
}

