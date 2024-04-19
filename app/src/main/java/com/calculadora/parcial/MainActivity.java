package com.calculadora.parcial;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTexto = findViewById(R.id.edit_texto);
        Button botonMayusculas = findViewById(R.id.boton_mayusculas);
        Button botonMinusculas = findViewById(R.id.boton_minusculas);

        botonMayusculas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String texto = editTexto.getText().toString().trim();
                if (texto.isEmpty()) {
                    editTexto.setError(getString(R.string.error_vacio));
                } else {
                    editTexto.setText(texto.toUpperCase());
                    Toast.makeText(MainActivity.this, R.string.toast_mayusculas, Toast.LENGTH_SHORT).show();
                }
            }
        });

        botonMinusculas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String texto = editTexto.getText().toString().trim();
                if (texto.isEmpty()) {
                    editTexto.setError(getString(R.string.error_vacio));
                } else {
                    editTexto.setText(texto.toLowerCase());
                    Toast.makeText(MainActivity.this, R.string.toast_minusculas, Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
