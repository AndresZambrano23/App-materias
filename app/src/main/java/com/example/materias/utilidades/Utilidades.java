package com.example.materias.utilidades;

public class Utilidades {

    public static final String TABLA_USUARIO="usuario";
    public static final String CAMPO_ID_USUARIO="id_usuario";
    public static final String CAMPO_NOMBRE="nombre";
    public static final String CAMPO_APELLIDO="apellido";
    public static final String CAMPO_CORREO="correo";
    public static final String CAMPO_PASS="pass";

    /*public static final String TABLA_NOTAS="notas";
    public static final String CAMPO_ID_NOTAS="id_notas";
    public static final String CAMPO_NOTA1="nota1";
    public static final String CAMPO_NOTA2="nota2";
    public static final String CAMPO_NOTA3="nota3";
    public static final String CAMPO_NOTA_FINAL="nota_final";

    public static final String TABLA_TIPO_MATERIA="tipo_amteria";
    public static final String CAMPO_ID_TIPO_MATERIA="id_tipo_amteria";
    public static final String CAMPO_DESCRIPCION="descripcion";

    public static final String TABLA_MATERIA="materia";
    public static final String CAMPO_ID_MATERIA="id_materia";
    public static final String CAMPO_NOMBRE_MATERIA="nombre_materia";
    public static final String CAMPO_USUARIO_ID="usuario_id";
    public static final String CAMPO_TIPO_MATERIA_ID="tipo_materia_id";
    public static final String CAMPO_NOTAS_ID="notas_id";*/

   public static final String CREAR_TABLA_USUARIO="CREATE TABLE "+TABLA_USUARIO+"("+CAMPO_ID_USUARIO+" INTEGER PRIMARY KEY,"+CAMPO_NOMBRE+" TEXT, "+CAMPO_APELLIDO+" TEXT, "+CAMPO_CORREO+" TEXT, "+CAMPO_PASS+" TEXT )";
   /*public static final String CREAR_TABLA_NOTAS="CREATE TABLE "+TABLA_NOTAS+"("+CAMPO_ID_NOTAS+" INTEGER PRIMARY KEY AUTO_INCREMENT, "+CAMPO_NOTA1+" FLOAT, "+CAMPO_NOTA2+" FLOAT, "+CAMPO_NOTA3+" FLOAT, "+CAMPO_NOTA_FINAL+" FLOAT)";
   public static final String CREAR_TABLA_TIPO_MATERIA="CREATE TABLE "+TABLA_TIPO_MATERIA+"("+CAMPO_ID_TIPO_MATERIA+" INTEGER PRIMARY KEY AUTO_INCREMENT, "+CAMPO_DESCRIPCION+" TEXT)";
   public static final String CREAR_TABLA_MATERIAS="CREATE TABLE "+TABLA_MATERIA+"("+CAMPO_ID_MATERIA+" INTEGER PRIMARY KEY AUTO_INCREMENT,"+CAMPO_NOMBRE_MATERIA+" TEXT, "+CAMPO_USUARIO_ID+" INTEGER, "+CAMPO_TIPO_MATERIA_ID+" INTEGER, "+CAMPO_NOTAS_ID+" INTEGER)";*/
}
