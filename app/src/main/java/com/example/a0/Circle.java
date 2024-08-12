package com.example.a0;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Circle extends AppCompatActivity {

    Button calCA;
    EditText cR;
    TextView Ca,Cp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);

        calCA=findViewById(R.id.circleA);
        cR=findViewById(R.id.cR);
        Ca=findViewById(R.id.CA);
        Cp=findViewById(R.id.CP);
    }

    public void cacal(View view) {
        if (cR.getText().toString().trim().length() <= 0) {
            Toast.makeText(this, "Please Enter the radius", Toast.LENGTH_SHORT).show();
        }
        else {
        String cr = cR.getText().toString();
        float cRr=Float.parseFloat(cr);
        float cp= (float) (3.14159*2*cRr);
        float cpRound = Math.round(cp*100);
        float ca= (float) (3.14159*(cRr*cRr));
        float caRound = Math.round(ca*100);

        Ca.setText(String.valueOf(caRound/100)+" cm²");
        Cp.setText(String.valueOf(cpRound/100)+" cm");
}}}