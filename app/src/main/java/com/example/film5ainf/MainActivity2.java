package com.example.film5ainf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    ListView lvfilm;

    String film[] = {"Spiderman","Batman","Titanic"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        lvfilm = (ListView) findViewById(R.id.lvfilm);
        //Creo l'array adapter associando l'array
        ArrayAdapter<String> aaFilm = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,film);
        //Popolo la ListView con l'arrayadapter
        lvfilm.setAdapter(aaFilm);



    }
    public void onItemClick(AdapterView<?> adapterView, View v, int i, long l){
        Log.d()
        Toast.makeText(getApplicationContext(),"Vuoi Uscire",Toast.LENGTH_LONG).show();
    }
}