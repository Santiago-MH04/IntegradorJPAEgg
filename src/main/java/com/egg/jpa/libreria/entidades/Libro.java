package com.egg.jpa.libreria.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "libros")
@Data
public class Libro {
        //Atributos de Libro
    @Id
    @Column(name = "isbn")
    private Long id;
    private String titulo;
    private Integer anno;
    private Integer ejemplares;
    private boolean alta;
    @ManyToOne
    private Autor autor;
    @ManyToOne
    private Editorial editorial;


    //Constructores de Libro
    //Asignadores de atributos de Libro (setters)
    //Lectores de atributos de Libro (getters)
    //Métodos de Libro
    
}
