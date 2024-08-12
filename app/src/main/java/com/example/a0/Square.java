package com.example.a0;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Square extends AppCompatActivity {
    Button calSA;
    EditText sqL;
    TextView sqa,sqp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);

        calSA=findViewById(R.id.sqA);
        sqL=findViewById(R.id.sL);
        sqa=findViewById(R.id.SA);
        sqp=findViewById(R.id.SP);
    }

    public void sqcalp(View view) {
        if (sqL.getText().toString().trim().length() <= 0 ) {
            Toast.makeText(this, "Please Enter the length", Toast.LENGTH_SHORT).show();
        } else {
        String sl=sqL.getText().toString();
        float slc=Float.parseFloat(sl);

        float sqpr= 4*slc;
        float sqprRound = Math.round(sqpr*100);
        sqp.setText(String.valueOf(sqprRound/100)+" cm");

        float sqar= slc*slc;
        float sqarRound = Math.round(sqar*100);
        sqa.setText(String.valueOf(sqarRound/100)+" cm²");
    }
}}