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
        return this.em.createQuery("select a from Autor a", Autor.class).getResultList();
    }

    @Override
    public Optional<Autor> buscarPorID(Long id) {
        return Optional.of(this.em.find(Autor.class, id));
    }

    @Override
    public Autor guardar(Autor autor) {
            //Ver que Autor tenga un id no nulo, o mayor que 0
        if(autor.getId() == null || autor.getId().equals(0)){
            this.em.persist(autor);
        } else {
            this.em.merge(autor);
        }
        return autor;
    }

    @Override
    public void eliminar(Long id) {
        Autor autor = this.buscarPorID(id).orElseThrow();
        this.em.remove(autor);
    }
}
