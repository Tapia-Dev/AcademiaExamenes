package com.project.api.services;

import com.project.api.model.Vehiculo;

import java.util.List;
import java.util.Optional;

public interface VehiculoService {

    // Obtener todas
    public List<Vehiculo> mostrarTodos();


    // Buscar Por Id
    public Optional<Vehiculo> buscarPorId(Long id);

    // Guardar
    public Vehiculo guardar(Vehiculo vehiculo);

    // Modificar
    public Vehiculo actualizar(Vehiculo vehiculo);


    // Eliminar
    public void eliminar (Long id);
}
