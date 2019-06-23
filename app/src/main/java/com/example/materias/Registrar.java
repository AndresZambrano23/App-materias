package com.example.materias;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.materias.utilidades.Utilidades;

public class Registrar extends AppCompatActivity {

    EditText campoNombre, campoApellido, campoCorreo, campoPass, campoIdUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);
        campoIdUsuario = (EditText) findViewById(R.id.id_usuario);
        campoNombre = (EditText) findViewById(R.id.nombre);
        campoApellido = (EditText) findViewById(R.id.apellido);
        campoCorreo = (EditText) findViewById(R.id.correo);
        campoPass = (EditText) findViewById(R.id.pass);
    }


    public void Atras(View view) {
        Intent atras = new Intent(view.getContext(), MainActivity.class);
        startActivityForResult(atras, 0);
    }

    public void Registro(View view) {

        RegistrarUsuarios();
        //RegistrarUsuariosSQL();

    }

    /*private void RegistrarUsuariosSQL() {
        ConexionSQLiteHelper conn = new ConexionSQLiteHelper(this,"materias",null,1);
        SQLiteDatabase db = conn.getWritableDatabase();
        String insert=" INSERT INTO "+Utilidades.TABLA_USUARIO+
                " ( "
                +Utilidades.CAMPO_ID_USUARIO+","+Utilidades.CAMPO_NOMBRE+" , "+Utilidades.CAMPO_APELLIDO+" , "+Utilidades.CAMPO_CORREO+ ", "+Utilidades.CAMPO_PASS+
                ") values ("+campoIdUsuario.getText().toString()+",'"+ campoNombre.getText().toString()+"' , '"+campoApellido.getText().toString()+"','"+campoCorreo.getText().toString()+"','"+campoPass.getText().toString()+"')";
        db.execSQL(insert);
        db.close();
    }*/

    private void RegistrarUsuarios() {
        ConexionSQLiteHelper conn = new ConexionSQLiteHelper(this, "materias", null, 1);
        SQLiteDatabase db = conn.getReadableDatabase();
        ContentValues values = new ContentValues();

        try {
            values.put(Utilidades.CAMPO_ID_USUARIO, campoIdUsuario.getText().toString());
            values.put(Utilidades.CAMPO_NOMBRE, campoNombre.getText().toString());
            values.put(Utilidades.CAMPO_APELLIDO, campoApellido.getText().toString());
            values.put(Utilidades.CAMPO_CORREO, campoCorreo.getText().toString());
            values.put(Utilidades.CAMPO_PASS, campoIdUsuario.getText().toString());


            Long resultado = db.insert(Utilidades.TABLA_USUARIO, Utilidades.CAMPO_ID_USUARIO, values);

            Toast.makeText(getApplicationContext(), "Registro Exitoso:" + resultado, Toast.LENGTH_LONG).show();
            Intent volver = new Intent(this, MainActivity.class);
            startActivityForResult(volver,0);
            db.close();
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), "No se registro el usuario", Toast.LENGTH_LONG).show();

        }
    }
}
