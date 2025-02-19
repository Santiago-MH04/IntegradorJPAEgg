package com.egg.jpa.libreria.servicios.implementaciones;

import com.egg.jpa.libreria.DAOs.abstracciones.CRUD_DAO;
import com.egg.jpa.libreria.DAOs.implementaciones.LibroDAO;
import com.egg.jpa.libreria.entidades.Libro;
import com.egg.jpa.libreria.servicios.abstracciones.CRUD_Servicio;
import jakarta.persistence.EntityManager;

import java.util.List;
import java.util.Optional;

public class LibroServicio implements CRUD_Servicio<Libro> {
        //Atributos de LibroServicio
    private EntityManager em;
    private final CRUD_DAO<Libro> repoLibro;

        //Constructores de LibroServicio
    public LibroServicio(EntityManager entityManager) {
        this.em = entityManager;
        this.repoLibro = new LibroDAO(this.em);
    }


    //Asignadores de atributos de LibroServicio (setters)
    //Lectores de atributos de LibroServicio (getters)
        //Métodos de LibroServicio

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
