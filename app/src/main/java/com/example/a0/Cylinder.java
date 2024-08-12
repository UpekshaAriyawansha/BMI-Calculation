package com.example.a0;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Cylinder extends AppCompatActivity {
    Button calcyP;
    EditText cyR,cyH;
    TextView Cya,Cyp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder);

        calcyP=findViewById(R.id.cyP);
        cyR=findViewById(R.id.cyR);
        cyH=findViewById(R.id.cyh);
        Cya=findViewById(R.id.CyA);
        Cyp=findViewById(R.id.CyP);

    }

    public void cypr(View view) {
        if (cyR.getText().toString().trim().length() <= 0 || cyH.getText().toString().trim().length() <= 0) {
            Toast.makeText(this, "Please Enter values", Toast.LENGTH_SHORT).show();
        } else {
        String cyr = cyR.getText().toString();
        float cyRr=Float.parseFloat(cyr);

        String cyh = cyH.getText().toString();
        float cyHr=Float.parseFloat(cyh);

        float cyp= (float) (3.14159*(cyRr*cyRr)*cyHr);
        float cypRound = Math.round(cyp*100);
        Cyp.setText(String.valueOf(cypRound/100)+" cm³");

        float cya= (float) (3.14159*(cyRr*cyRr)+(3.14159*cyHr*cyRr*2));
        float cyaRound = Math.round(cya*100);
        Cya.setText(String.valueOf(cyaRound/100)+" cm²");
    }
}}