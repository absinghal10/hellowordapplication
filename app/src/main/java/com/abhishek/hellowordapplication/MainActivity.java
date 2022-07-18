package com.abhishek.hellowordapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Hello bhai1", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Hello bhai2", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Hello bhai3", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Hello bhai4", Toast.LENGTH_SHORT).show();

    }
}