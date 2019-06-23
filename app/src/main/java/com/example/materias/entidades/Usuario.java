package com.example.materias.entidades;

public class Usuario {

    private Integer id_usuario;
    private String nombre;
    private String apellido;
    private String coreo;
    private String pass;

    public Usuario(Integer id_usuario, String nombre, String apellido, String coreo, String pass) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.coreo = coreo;
        this.pass = pass;
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCoreo() {
        return coreo;
    }

    public void setCoreo(String coreo) {
        this.coreo = coreo;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}