package com.example.materias;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuMateria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_materia);
    }

    public void btnmateria(View view) {
        Intent materia = new Intent(view.getContext(), AgregarMateria.class);
        startActivityForResult(materia, 0);

    }
}
