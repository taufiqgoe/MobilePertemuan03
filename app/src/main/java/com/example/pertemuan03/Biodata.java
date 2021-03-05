package com.example.pertemuan03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Biodata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
    }

    public void beranda(View view) {
        Intent a = new Intent(Biodata.this, MainActivity.class);
        startActivity(a);
    }

    public void artikel(View view) {
        Intent a = new Intent(Biodata.this, Artikel.class);
        startActivity(a);
    }
}