package com.example.beinformatique;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Connexion extends AppCompatActivity {
    Button inscri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connexion);



        this.inscri = (Button) findViewById(R.id.btnInscription);


        inscri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent autreActivite = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(autreActivite);
                finish();
            }
        });

    }

}