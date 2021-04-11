package com.spring.prueba.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/*
* todas las clases con @entity indica que es una tabla en la base de datos, bien sea mariadb o
*  mysql, esta es una clase con los estandares que pide jpa de creacion de*/
@Entity

public class Videojuego {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nombre;
    private String descripcion;
    private String imagenUrl;

    @Column(name="NOMBRE")
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Column(name="DESCRIPCION")
    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Column(name="IMAGEN_URL")
    public String getImagenUrl() {
        return this.imagenUrl;
    }

    public void setImagenUrl(String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }

    @Column(name="ID")
    public Integer getId() { return this.id; }

    public void setId(Integer id) { this.id = id; }

}
