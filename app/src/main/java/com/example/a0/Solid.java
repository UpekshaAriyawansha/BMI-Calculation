package com.example.a0;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Solid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solid);
    }

    public void ro(View view) {
        Intent intent = new Intent(Solid.this, Round.class);
        startActivity(intent);
    }

    public void cone(View view) {
        Intent intent = new Intent(Solid.this, Cone.class);
        startActivity(intent);
    }

    public void pa(View view) {
        Intent intent = new Intent(Solid.this, Parallelepiped.class);
        startActivity(intent);
    }

    public void cu(View view) {
        Intent intent = new Intent(Solid.this, Cube.class);
        startActivity(intent);
    }

    public void cy(View view) {
        Intent intent = new Intent(Solid.this, Cylinder.class);
        startActivity(intent);
    }
}