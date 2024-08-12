package com.example.a0;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Rectangle extends AppCompatActivity {
        Button calrP;
        EditText Rl,Rw;
        TextView ra,rp;

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle);

        calrP=findViewById(R.id.rP);
        Rl=findViewById(R.id.rL);
        Rw=findViewById(R.id.rW);
        ra=findViewById(R.id.RA);
        rp=findViewById(R.id.RP);
        }

        public void rcalp(View view) {
                if (Rl.getText().toString().trim().length() <= 0 || Rw.getText().toString().trim().length() <= 0) {
                        Toast.makeText(this, "Please Enter values", Toast.LENGTH_SHORT).show();
                } else {

                String rl=Rl.getText().toString();
                float rlc=Float.parseFloat(rl);

                String rw=Rw.getText().toString();
                float rwc=Float.parseFloat(rw);

                float rpr= 2*(rwc*rlc);
                float rprRound = Math.round(rpr*100);
                rp.setText(String.valueOf(rprRound/100)+" cm");

                float rar= rwc*rlc;
                float rarRound = Math.round(rar*100);
                ra.setText(String.valueOf(rarRound/100)+" cm²");
        }
}}