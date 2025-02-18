package com.egg.jpa.libreria.DAOs.abstracciones;

import java.util.List;
import java.util.Optional;

public interface CRUD_DAO<T> {
    //Atributos de CRUD_DAO
    //Constructores de CRUD_DAO
    //Asignadores de atributos de CRUD_DAO (setters)
    //Lectores de atributos de CRUD_DAO (getters)
        //Métodos de CRUD_DAO
    List<T> listarTodos();
    Optional<T> buscarPorID(Long id);
    T guardar(T t); //Este método debe guardar uno nuevo, o modificar una instancia existente
    void eliminar(Long id);
}
