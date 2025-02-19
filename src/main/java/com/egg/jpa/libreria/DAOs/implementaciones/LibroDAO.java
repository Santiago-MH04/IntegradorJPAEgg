package com.egg.jpa.libreria.DAOs.implementaciones;

import com.egg.jpa.libreria.DAOs.abstracciones.CRUD_DAO;
import com.egg.jpa.libreria.entidades.Editorial;
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
        return this.em.createQuery("select l from Libro l", Libro.class).getResultList();
    }

    @Override
    public Optional<Libro> buscarPorID(Long id) {
        return Optional.of(this.em.find(Libro.class, id));
    }

    @Override
    public Libro guardar(Libro libro) {
            //Ver que Libro tenga un id no nulo, o mayor que 0
        if(libro.getId() == null || libro.getId().equals(0)){
            this.em.persist(libro);
        } else {
            this.em.merge(libro);
        }
        return libro;
    }

    @Override
    public void eliminar(Long id) {
        this.buscarPorID(id).ifPresent(a -> this.em.remove(a));
    }
}
