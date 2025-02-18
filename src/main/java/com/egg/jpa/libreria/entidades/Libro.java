package com.egg.jpa.libreria.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "libros")
@Data
public class Libro {
        //Atributos de Libro
    @Column(name = "isbn")
    private Long id;
    private String titulo;
    private Integer anno;
    private Integer ejemplares;
    private boolean alta;
    @OneToOne
    private Autor autor;
    @OneToOne
    private Editorial editorial;


    //Constructores de Libro
    //Asignadores de atributos de Libro (setters)
    //Lectores de atributos de Libro (getters)
    //Métodos de Libro
    
}
