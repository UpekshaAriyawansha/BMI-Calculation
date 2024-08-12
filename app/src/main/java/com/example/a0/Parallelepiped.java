package com.example.a0;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Parallelepiped extends AppCompatActivity {
    Button calpP;
    EditText pL,pH,pW;
    TextView pa,pp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parallelepiped);

        calpP=findViewById(R.id.pP);
        pL=findViewById(R.id.pL);
        pH=findViewById(R.id.pH);
        pW=findViewById(R.id.pw);
        pa=findViewById(R.id.prA);
        pp=findViewById(R.id.prP);
    }

    public void pcalp(View view) {
        if (pL.getText().toString().trim().length() <= 0 || pH.getText().toString().trim().length() <= 0 || pW.getText().toString().trim().length() <= 0) {
            Toast.makeText(this, "Please Enter values", Toast.LENGTH_SHORT).show();
        } else {
        String pl=pL.getText().toString();
        float plc=Float.parseFloat(pl);

        String ph=pH.getText().toString();
        float phc=Float.parseFloat(ph);

        String pw=pW.getText().toString();
        float pwc=Float.parseFloat(pw);

        float ppr=plc*phc*pwc;
        float pprRound = Math.round(ppr*100);
        pp.setText(String.valueOf(pprRound/100)+" cm³");

        float par=(2*plc*phc)+(2*pwc*plc)+(2*pwc*phc);
        float parRound = Math.round(par*100);
        pa.setText(String.valueOf(parRound/100)+" cm²");
    }
}}