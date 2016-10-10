package com.oz.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button movieButton = (Button) findViewById(R.id.popularMoviesButton);
        movieButton.setOnClickListener(this);
        Button stockHawkButton = (Button) findViewById(R.id.stockHawkButton);
        stockHawkButton.setOnClickListener(this);
        Button buildButton = (Button) findViewById(R.id.buildItButton);
        buildButton.setOnClickListener(this);
        Button materialButton = (Button) findViewById(R.id.materialAppButton);
        materialButton.setOnClickListener(this); // calling onClick() method
        Button ubiquitousButton = (Button) findViewById(R.id.goUbiquitousButton);
        ubiquitousButton.setOnClickListener(this);
        Button capstoneButton = (Button) findViewById(R.id.capstoneButton);
        capstoneButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.popularMoviesButton:
                Toast.makeText(getApplicationContext(), "This button will launch my Popular Movies app", Toast.LENGTH_LONG).show();
                break;

            case R.id.stockHawkButton:
                Toast.makeText(getApplicationContext(), "This button will launch my Stock Hawk app", Toast.LENGTH_LONG).show();
                break;

            case R.id.buildItButton:
                Toast.makeText(getApplicationContext(), "This button will launch my Build It Bigger app", Toast.LENGTH_LONG).show();
                break;

            case R.id.materialAppButton:
                Toast.makeText(getApplicationContext(), "This button will launch my Make Your App Material app", Toast.LENGTH_LONG).show();
                break;

            case R.id.goUbiquitousButton:
                Toast.makeText(getApplicationContext(), "This button will launch my Go Ubiquitous app", Toast.LENGTH_LONG).show();
                break;

            case R.id.capstoneButton:
                Toast.makeText(getApplicationContext(), "This button will launch my Capstone app", Toast.LENGTH_LONG).show();
                break;

            default:
                break;
        }
    }
}
