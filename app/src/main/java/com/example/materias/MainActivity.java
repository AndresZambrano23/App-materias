package com.example.materias;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.materias.utilidades.Utilidades;

public class MainActivity extends AppCompatActivity {
    EditText email, password;
    private Cursor cursor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConexionSQLiteHelper conn = new ConexionSQLiteHelper(this,"materias",null,1);

        email = (EditText) findViewById(R.id.email);
        password= (EditText) findViewById(R.id.password);
    }

    public void btn_ingresar(View view) {
        IngresarSistema();
    }

    private void IngresarSistema() {
        ConexionSQLiteHelper conn = new ConexionSQLiteHelper(getApplicationContext(),"materias",null,1);
        SQLiteDatabase db = conn.getReadableDatabase();

        try{
            String correo = email.getText().toString();
            String pass = password.getText().toString();
            //Toast.makeText(getApplicationContext(), pass, Toast.LENGTH_LONG).show();

            cursor = db.rawQuery(" SELECT " + Utilidades.CAMPO_CORREO + "," + Utilidades.CAMPO_PASS + " FROM " + Utilidades.TABLA_USUARIO, null);
            //cursor = db.rawQuery(" SELECT " + Utilidades.CAMPO_CORREO +","+ Utilidades.CAMPO_PASS + " FROM " + Utilidades.TABLA_USUARIO +" WHERE "+ Utilidades.CAMPO_CORREO + "='" + correo + "' AND " + Utilidades.CAMPO_PASS + "='"+ pass + "'",null);

            if(cursor.moveToFirst()== true){
                String usua = cursor.getString(0);
                String pas = cursor.getString(1);
                //Toast.makeText(getApplicationContext(), usua, Toast.LENGTH_LONG).show();
                if(usua.equals(correo)){
                    Intent menu = new Intent(this,MenuMateria.class);
                    startActivityForResult(menu,0);
                    limpiar();
                }
            }else{
                Toast.makeText(getApplicationContext(), "No existe el usuario", Toast.LENGTH_LONG).show();
            }
        }catch(Exception e){
            Toast.makeText(getApplicationContext(), "Usuario no encontrado" , Toast.LENGTH_LONG).show();
            limpiar();
        }


    }

    private void limpiar() {

        email.setText("");
        password.setText("");
    }

    public void Registrar(View view) {
        Intent registrar = new Intent(view.getContext(), Registrar.class);
        startActivityForResult(registrar, 0);
    }
}
