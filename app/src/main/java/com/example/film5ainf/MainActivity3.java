package com.example.film5ainf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity3 extends AppCompatActivity {
    ImageView imgcasa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        imgcasa = findViewById(R.id.imgcasa);
        imgcasa.setImageResource(R.drawable.casa);
    }
}