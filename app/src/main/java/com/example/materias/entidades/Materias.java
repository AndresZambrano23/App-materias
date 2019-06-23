package com.example.materias.entidades;

public class Materias {

    private Integer id_materia;
    private String nombre_materia;
    private Integer usuario_id;
    private Integer tipo_materia_id;
    private Integer notas_id;

    public Materias(Integer id_materia, String nombre_materia, Integer usuario_id, Integer tipo_materia_id, Integer notas_id) {
        this.id_materia = id_materia;
        this.nombre_materia = nombre_materia;
        this.usuario_id = usuario_id;
        this.tipo_materia_id = tipo_materia_id;
        this.notas_id = notas_id;
    }

    public Integer getId_materia() {
        return id_materia;
    }

    public void setId_materia(Integer id_materia) {
        this.id_materia = id_materia;
    }

    public String getNombre_materia() {
        return nombre_materia;
    }

    public void setNombre_materia(String nombre_materia) {
        this.nombre_materia = nombre_materia;
    }

    public Integer getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(Integer usuario_id) {
        this.usuario_id = usuario_id;
    }

    public Integer getTipo_materia_id() {
        return tipo_materia_id;
    }

    public void setTipo_materia_id(Integer tipo_materia_id) {
        this.tipo_materia_id = tipo_materia_id;
    }

    public Integer getNotas_id() {
        return notas_id;
    }

    public void setNotas_id(Integer notas_id) {
        this.notas_id = notas_id;
    }
}
