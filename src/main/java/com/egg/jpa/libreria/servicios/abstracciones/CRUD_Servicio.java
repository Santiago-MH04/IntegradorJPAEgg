package com.egg.jpa.libreria.servicios.abstracciones;

import java.util.List;
import java.util.Optional;

public interface CRUD_Servicio<T> {
    //Atributos de CRUD_Servicio
    //Constructores de CRUD_Servicio
    //Asignadores de atributos de CRUD_Servicio (setters)
    //Lectores de atributos de CRUD_Servicio (getters)
        //Métodos de CRUD_Servicio
    List<T> listarTodos();
    Optional<T> buscarPorID(Long id);
    T guardar(T t); //Este método debe guardar uno nuevo, o modificar una instancia existente
    void eliminar(Long id);
}
