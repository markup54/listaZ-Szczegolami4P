package com.example.listaelementow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public ListView listViewTeksty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Miejsca teksty [] =Miejsca.miejscaWyswietlane;
        listViewTeksty = findViewById(R.id.listViewTeksty);
        TekstyArrayAdapter adapter = new TekstyArrayAdapter(
                this,
                R.layout.widok_szczegoly,
                teksty
        );

        listViewTeksty.setAdapter(adapter);
    }
}