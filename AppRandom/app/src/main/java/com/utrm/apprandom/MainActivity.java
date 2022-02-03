package com.utrm.apprandom;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText edit;
    TextView texto;
    Button btBoton;
    Random tramdom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Conectando las variables con los id.

        edit = (EditText) findViewById(R.id.edit);
        texto = (TextView) findViewById(R.id.texto);
        btBoton = (Button) findViewById(R.id.btBoton);
        btBoton.setOnClickListener(this);
        

        tramdom = new Random();

    }
    public void onClick(View v){
        Toast.makeText(getApplicationContext(), "Soy un Toast we :3", Toast.LENGTH_SHORT).show();
        switch (v.getId()) {
            case R.id.btBoton:
                

                String cambiar = edit.getText().toString();
                texto.setText(cambiar);
                texto.setTextSize(tramdom.nextInt(100));
                texto.setTextColor(Color.rgb(tramdom.nextInt(250),tramdom.nextInt(250),tramdom.nextInt(250) ));
                texto.setBackgroundColor(Color.rgb(tramdom.nextInt(250),tramdom.nextInt(250),tramdom.nextInt(250)));
                



        }
    }
}