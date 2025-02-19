package com.egg.jpa.libreria.servicios.implementaciones;

import com.egg.jpa.libreria.DAOs.implementaciones.AutorDAO;
import com.egg.jpa.libreria.entidades.Autor;
import com.egg.jpa.libreria.servicios.abstracciones.CRUD_Servicio;
import jakarta.persistence.EntityManager;

import java.util.List;
import java.util.Optional;

public class AutorServicio implements CRUD_Servicio<Autor> {
        //Atributos de AutorServicio
    private EntityManager em;
    private final AutorDAO repoAutor;

        //Constructores de AutorServicio
    public AutorServicio(AutorDAO repoAutor, EntityManager entityManager) {
        this.em = entityManager;
        this.repoAutor = repoAutor;
    }

    //Asignadores de atributos de AutorServicio (setters)
    //Lectores de atributos de AutorServicio (getters)
        //Métodos de AutorServicio

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
