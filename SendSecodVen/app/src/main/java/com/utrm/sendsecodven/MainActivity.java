package com.utrm.sendsecodven;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText entradaTxt;
    Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnEnviar = (Button)  findViewById(R.id.button);

        EditText editText = (EditText)findViewById(R.id.entrada);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent segundaVen = new Intent (MainActivity.this, ventana2.class);

                segundaVen.putExtra("datos",editText.getText().toString());

                startActivity(segundaVen);

            }
        });

    }
}