package com.example.a0;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Cone extends AppCompatActivity {
    Button calcoP;
    EditText coR, coH;
    TextView Coa, Cop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cone);

        calcoP = findViewById(R.id.coP);
        coR = findViewById(R.id.coR);
        coH = findViewById(R.id.coh);
        Coa = findViewById(R.id.CoA);
        Cop = findViewById(R.id.CoP);

    }


    public void copr(View view) {
        if (coR.getText().toString().trim().length() <= 0 || coH.getText().toString().trim().length() <= 0) {
            Toast.makeText(this, "Please Enter values", Toast.LENGTH_SHORT).show();
        } else {
            String cor = coR.getText().toString();
            float coRr = Float.parseFloat(cor);

            String coh = coH.getText().toString();
            float coHr = Float.parseFloat(coh);

            float cop = (float) (3.14159 * 0.333 * (coRr * coRr) * coHr);
            float copRound = Math.round(cop*100);
            Cop.setText(String.valueOf(copRound/100)+" cm³");

            float coa = (float) (3.14159 * (coRr * coRr) + (3.14159 * coHr * coRr));
            float coaRound = Math.round(coa*100);
            Coa.setText(String.valueOf(coaRound/100)+" cm²");
        }
    }
}