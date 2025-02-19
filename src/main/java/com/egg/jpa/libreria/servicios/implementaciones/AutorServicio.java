package com.egg.jpa.libreria.servicios.implementaciones;

import com.egg.jpa.libreria.DAOs.abstracciones.CRUD_DAO;
import com.egg.jpa.libreria.DAOs.implementaciones.AutorDAO;
import com.egg.jpa.libreria.entidades.Autor;
import com.egg.jpa.libreria.servicios.abstracciones.CRUD_Servicio;
import jakarta.persistence.EntityManager;

import java.util.List;
import java.util.Optional;

public class AutorServicio implements CRUD_Servicio<Autor> {
        //Atributos de AutorServicio
    private EntityManager em;
    private final CRUD_DAO<Autor> repoAutor;

        //Constructores de AutorServicio
    public AutorServicio(EntityManager entityManager) {
        this.em = entityManager;
        this.repoAutor = new AutorDAO(this.em);
    }

    //Asignadores de atributos de AutorServicio (setters)
    //Lectores de atributos de AutorServicio (getters)
        //Métodos de AutorServicio

    @Override
    public List<Autor> listarTodos() {
        return this.repoAutor.listarTodos();
    }

    @Override
    public Optional<Autor> buscarPorID(Long id) {
        return this.repoAutor.buscarPorID(id);
    }

    @Override
    public void guardar(Autor autor) {
        try {
           this.em.getTransaction().begin();
           this.repoAutor.guardar(autor);
           this.em.getTransaction().commit();
        } catch (Exception e) {
            this.em.getTransaction().rollback();
            throw new RuntimeException(e);
        }
    }

    @Override
    public void eliminar(Long id) {
        try {
            this.em.getTransaction().begin();
            this.repoAutor.eliminar(id);
            this.em.getTransaction().commit();
        } catch (Exception e) {
            this.em.getTransaction().rollback();
            throw new RuntimeException(e);
        }
    }
}
