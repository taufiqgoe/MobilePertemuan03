package com.example.pertemuan03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Artikel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artikel);
    }


    public void beranda(View view) {
        Intent a = new Intent(Artikel.this, MainActivity.class);
        startActivity(a);
    }

    public void biodata(View view) {
        Intent a = new Intent(Artikel.this, Biodata.class);
        startActivity(a);
    }
}