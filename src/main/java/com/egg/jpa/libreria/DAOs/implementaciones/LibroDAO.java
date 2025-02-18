package com.egg.jpa.libreria.DAOs.implementaciones;

import com.egg.jpa.libreria.DAOs.abstracciones.CRUD_DAO;
import com.egg.jpa.libreria.entidades.Libro;

import java.util.List;
import java.util.Optional;

public class LibroDAO implements CRUD_DAO<Libro> {
    //Atributos de LibroDAO
    //Constructores de LibroDAO
    //Asignadores de atributos de LibroDAO (setters)
    //Lectores de atributos de LibroDAO (getters)
        //Métodos de LibroDAO
    @Override
    public List<Libro> listarTodos() {
        return List.of();
    }

    @Override
    public Optional<Libro> buscarPorID(Long id) {
        return Optional.empty();
    }

    @Override
    public Libro guardar(Libro libro) {
        return null;
    }

    @Override
    public void eliminar(Long id) {

    }
}
