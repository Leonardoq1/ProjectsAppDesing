package com.utrm.sendsecodven;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ventana2 extends AppCompatActivity {

    Button regresar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana2);

        TextView textView = (TextView)findViewById(R.id.textView);
        Intent intent = getIntent();

        textView.setText(intent.getStringExtra("datos"));

        regresar = (Button)findViewById(R.id.button2);
        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regresar = new Intent(ventana2.this, MainActivity.class);
                startActivity(regresar);
            }
        });


    }
}