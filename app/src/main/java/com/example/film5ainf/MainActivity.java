package com.example.film5ainf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView textView;
Button btnEsci;
String film[] = {"Spiderman","Batman","Titanic"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assegno l'oggetto lv alla ListView


        btnEsci = (Button) findViewById(R.id.btnEsci);
        btnEsci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Vuoi Uscire",Toast.LENGTH_LONG).show();
            }

        });

    }
}