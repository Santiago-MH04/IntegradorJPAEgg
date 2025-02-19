package com.egg.jpa.libreria.DAOs.implementaciones;

import com.egg.jpa.libreria.DAOs.abstracciones.CRUD_DAO;
import com.egg.jpa.libreria.entidades.Autor;
import com.egg.jpa.libreria.entidades.Editorial;
import jakarta.persistence.EntityManager;

import java.util.List;
import java.util.Optional;

public class EditorialDAO implements CRUD_DAO<Editorial> {
        //Atributos de EditorialDAO
    private EntityManager em;

        //Constructores de EditorialDAO
    public EditorialDAO(EntityManager entityManager) {
        this.em = entityManager;
    }

    //Asignadores de atributos de EditorialDAO (setters)
    //Lectores de atributos de EditorialDAO (getters)
        //Métodos de EditorialDAO
    @Override
    public List<Editorial> listarTodos() {
        return this.em.createQuery("select e from Editorial e", Editorial.class).getResultList();
    }

    @Override
    public Optional<Editorial> buscarPorID(Long id) {
        return Optional.of(this.em.find(Editorial.class, id));
    }

    @Override
    public Editorial guardar(Editorial editorial) {
            //Ver que Editorial tenga un id no nulo, o mayor que 0
        if(editorial.getId() == null || editorial.getId().equals(0)){
            this.em.persist(editorial);
        } else {
            this.em.merge(editorial);
        }
        return editorial;
    }

    @Override
    public void eliminar(Long id) {
        this.buscarPorID(id).ifPresent(a -> this.em.remove(a));
    }
}
