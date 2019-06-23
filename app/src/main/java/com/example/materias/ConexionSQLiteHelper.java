package com.example.materias;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.materias.utilidades.Utilidades;


public class ConexionSQLiteHelper extends SQLiteOpenHelper {



    public ConexionSQLiteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }
    //genera las tablas
    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(Utilidades.CREAR_TABLA_USUARIO);
        /*db.execSQL(Utilidades.CREAR_TABLA_NOTAS);
        db.execSQL(Utilidades.CREAR_TABLA_TIPO_MATERIA);
        db.execSQL(Utilidades.CREAR_TABLA_MATERIAS);*/

    }
    //verifica la version antigua
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS usuario");
        /*db.execSQL("DROP TABLE IF EXISTS notas");
        db.execSQL("DROP TABLE IF EXISTS tipo_materia");
        db.execSQL("DROP TABLE IF EXISTS materia");*/
        onCreate(db);
    }
}
