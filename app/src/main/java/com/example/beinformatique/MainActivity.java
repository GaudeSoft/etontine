package com.example.beinformatique;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
    Button connect;
    Button sinscri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        this.connect = (Button) findViewById(R.id.btnConnexion);
        this.sinscri = (Button) findViewById(R.id.btnInscrit);
        connect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent autreActivite = new Intent(getApplicationContext(), Connexion.class);
                startActivity(autreActivite);
                finish();
            }
        });

        sinscri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent autreActivite = new Intent(getApplicationContext(), VerificationNumero.class);
                startActivity(autreActivite);
                finish();
            }
        });
    }
}