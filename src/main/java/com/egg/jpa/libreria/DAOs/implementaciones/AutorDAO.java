package com.egg.jpa.libreria.DAOs.implementaciones;

import com.egg.jpa.libreria.DAOs.abstracciones.CRUD_DAO;
import com.egg.jpa.libreria.entidades.Autor;
import jakarta.persistence.EntityManager;

import java.util.List;
import java.util.Optional;

public class AutorDAO implements CRUD_DAO<Autor> {
        //Atributos de AutorDAO
    private EntityManager em;

        //Constructores de AutorDAO
    public AutorDAO(EntityManager entityManager) {
        this.em = entityManager;
    }

    //Asignadores de atributos de AutorDAO (setters)
    //Lectores de atributos de AutorDAO (getters)
        //Métodos de AutorDAO
    @Override
    public List<Autor> listarTodos() {
        return List.of();
    }

    @Override
    public Optional<Autor> buscarPorID(Long id) {
        return Optional.empty();
    }

    @Override
    public Autor guardar(Autor autor) {
        return null;
    }

    @Override
    public void eliminar(Long id) {

    }
}
