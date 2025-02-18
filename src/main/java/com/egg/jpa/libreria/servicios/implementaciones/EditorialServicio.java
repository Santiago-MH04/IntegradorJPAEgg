package com.egg.jpa.libreria.servicios.implementaciones;

import com.egg.jpa.libreria.DAOs.implementaciones.EditorialDAO;
import com.egg.jpa.libreria.entidades.Editorial;
import com.egg.jpa.libreria.servicios.abstracciones.CRUD_Servicio;

import java.util.List;
import java.util.Optional;

public class EditorialServicio implements CRUD_Servicio<Editorial> {
        //Atributos de EditorialServicio
    private final EditorialDAO repoEditorial;

        //Constructores de EditorialServicio
    public EditorialServicio(EditorialDAO repoEditorial) {
        this.repoEditorial = repoEditorial;
    }

    //Asignadores de atributos de EditorialServicio (setters)
    //Lectores de atributos de EditorialServicio (getters)
        //Métodos de EditorialServicio
    @Override
    public List<Editorial> listarTodos() {
        return List.of();
    }

    @Override
    public Optional<Editorial> buscarPorID(Long id) {
        return Optional.empty();
    }

    @Override
    public Editorial guardar(Editorial editorial) {
        return null;
    }

    @Override
    public void eliminar(Long id) {

    }
}
