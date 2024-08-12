package com.example.a0;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Round extends AppCompatActivity {
    Button calRoP;
    EditText roR;
    TextView Roa,Rop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_round);

        calRoP=findViewById(R.id.robP);
        roR=findViewById(R.id.roR);
        Roa=findViewById(R.id.roA);
        Rop=findViewById(R.id.roP);
    }

    public void rocalp(View view) {
        if (roR.getText().toString().trim().length() <= 0) {
            Toast.makeText(this, "Please Enter the radius", Toast.LENGTH_SHORT).show();
        }
        else {
        String ror = roR.getText().toString();
        float rorr=Float.parseFloat(ror);

        float rorp= (float) (3.14159*(rorr*rorr*rorr)*1.333);
        float rorpRound = Math.round(rorp*100);
        Rop.setText(String.valueOf(rorpRound/100)+" cm³");

        float rora= (float) (3.14159*(rorr*rorr)*4);
        float roraRound = Math.round(rora*100);
        Roa.setText(String.valueOf(roraRound/100)+" cm²");
    }
}}