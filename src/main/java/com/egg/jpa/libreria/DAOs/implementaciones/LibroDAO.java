package com.egg.jpa.libreria.DAOs.implementaciones;

import com.egg.jpa.libreria.DAOs.abstracciones.CRUD_DAO;
import com.egg.jpa.libreria.entidades.Libro;
import jakarta.persistence.EntityManager;

import java.util.List;
import java.util.Optional;

public class LibroDAO implements CRUD_DAO<Libro> {
        //Atributos de LibroDAO
    private EntityManager em;

        //Constructores de LibroDAO
    public LibroDAO(EntityManager entityManager) {
        this.em = entityManager;
    }

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
