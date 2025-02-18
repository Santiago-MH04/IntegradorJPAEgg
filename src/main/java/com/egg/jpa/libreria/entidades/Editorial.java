package com.egg.jpa.libreria.entidades;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "editoriales")
@Data   //Genera automáticamente, entre otros, los getters, setters, toString e equals
public class Editorial {
        //Atributos de Editorial
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Para denotar que es un atributo autoincremental
    private Long id;
    private String nombre;
    private boolean alta;

    //Constructores de Editorial
    //Asignadores de atributos de Editorial (setters)
    //Lectores de atributos de Editorial (getters)
    //Métodos de Editorial
    
}
