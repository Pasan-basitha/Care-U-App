package com.example.careu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class homePageDuplicate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page_duplicate);
    }


    public void Police_Emergency_Service(View view) {
        Intent i = new Intent(this,policeEcomplain.class);
        startActivity(i);
    }
}