package com.egg.jpa.libreria.entidades;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "autores")
@Data   //Genera automáticamente, entre otros, los getters, setters, toString e equals
public class Autor {
        //Atributos de Autor
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Para denotar que es un atributo autoincremental
    private Long id;
    private String nombre;
    private boolean alta;

    //Constructores de Autor
    //Asignadores de atributos de Autor (setters)
    //Lectores de atributos de Autor (getters)
    //Métodos de Autor
    
}
