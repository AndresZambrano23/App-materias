package com.example.materias.entidades;

public class Tipo_Materia {

    private Integer id_tipo_materia ;
    private String descripcion ;

    public Tipo_Materia(Integer id_tipo_materia, String descripcion) {
        this.id_tipo_materia = id_tipo_materia;
        this.descripcion = descripcion;
    }

    public Integer getId_tipo_materia() {
        return id_tipo_materia;
    }

    public void setId_tipo_materia(Integer id_tipo_materia) {
        this.id_tipo_materia = id_tipo_materia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
