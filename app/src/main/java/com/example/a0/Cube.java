package com.example.a0;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Cube extends AppCompatActivity {
    Button calcuP;
    EditText cuL;
    TextView cua,cup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube);

        calcuP=findViewById(R.id.cuP);
        cuL=findViewById(R.id.cuL);
        cua=findViewById(R.id.curA);
        cup=findViewById(R.id.curP);
    }

    public void cucalp(View view) {
        if (cuL.getText().toString().trim().length() <= 0) {
            Toast.makeText(this, "Please Enter the length", Toast.LENGTH_SHORT).show();
        }
        else {
        String cul=cuL.getText().toString();
        float culc=Float.parseFloat(cul);

        float cupr= 3*(culc*culc*culc);
        float cuorRound = Math.round(cupr*100);
        cup.setText(String.valueOf(cuorRound/100)+" cm³");

        float cuar= 6*(culc*culc);
        float cuarRound = Math.round(cuar*100);
        cua.setText(String.valueOf(cuarRound/100)+" cm²");
    }
}}