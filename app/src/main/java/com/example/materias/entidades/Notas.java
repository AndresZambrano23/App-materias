package com.example.materias.entidades;

public class Notas {

    private Integer id_notas;
    private Float Nota1;
    private Float Nota2;
    private Float Nota3;
    private Float Nota1_Final;

    public Notas(Integer id_notas, Float nota1, Float nota2, Float nota3, Float nota1_Final) {
        this.id_notas = id_notas;
        Nota1 = nota1;
        Nota2 = nota2;
        Nota3 = nota3;
        Nota1_Final = nota1_Final;
    }

    public Integer getId_notas() {
        return id_notas;
    }

    public void setId_notas(Integer id_notas) {
        this.id_notas = id_notas;
    }

    public Float getNota1() {
        return Nota1;
    }

    public void setNota1(Float nota1) {
        Nota1 = nota1;
    }

    public Float getNota2() {
        return Nota2;
    }

    public void setNota2(Float nota2) {
        Nota2 = nota2;
    }

    public Float getNota3() {
        return Nota3;
    }

    public void setNota3(Float nota3) {
        Nota3 = nota3;
    }

    public Float getNota1_Final() {
        return Nota1_Final;
    }

    public void setNota1_Final(Float nota1_Final) {
        Nota1_Final = nota1_Final;
    }
}
