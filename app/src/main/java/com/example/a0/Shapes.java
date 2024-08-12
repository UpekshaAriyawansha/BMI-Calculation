package com.example.a0;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Shapes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shapes);
    }

    public void cir(View view) {
        Intent intent = new Intent(Shapes.this,Circle.class);
        startActivity(intent);
    }

    public void sq(View view) {
        Intent intent = new Intent(Shapes.this,Square.class);
        startActivity(intent);

    }

    public void rec(View view) {
        Intent intent = new Intent(Shapes.this,Rectangle.class);
        startActivity(intent);
    }

    public void tria(View view) {
        Intent intent = new Intent(Shapes.this,Triangle.class);
        startActivity(intent);
    }
}
