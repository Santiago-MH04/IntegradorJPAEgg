package com.egg.jpa.libreria.DAOs.implementaciones;

import com.egg.jpa.libreria.DAOs.abstracciones.CRUD_DAO;
import com.egg.jpa.libreria.entidades.Editorial;

import java.util.List;
import java.util.Optional;

public class EditorialDAO implements CRUD_DAO<Editorial> {
    //Atributos de EditorialDAO
    //Constructores de EditorialDAO
    //Asignadores de atributos de EditorialDAO (setters)
    //Lectores de atributos de EditorialDAO (getters)
        //Métodos de EditorialDAO
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
