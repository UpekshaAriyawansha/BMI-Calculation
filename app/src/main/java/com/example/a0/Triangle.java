package com.example.a0;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Triangle extends AppCompatActivity {
    Button caltP;
    EditText Th,Tw,Tl;
    TextView ta,tp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);

        caltP=findViewById(R.id.TbP);
        Th=findViewById(R.id.Th);
        Tl=findViewById(R.id.Tl);
        Tw=findViewById(R.id.Tw);
        ta=findViewById(R.id.TA);
        tp=findViewById(R.id.TP);
    }

    public void tcalp(View view) {
        if (Th.getText().toString().trim().length() <= 0 || Tl.getText().toString().trim().length() <= 0 || Tw.getText().toString().trim().length() <= 0) {
            Toast.makeText(this, "Please Enter values", Toast.LENGTH_SHORT).show();
        } else {
        String th=Th.getText().toString();
        float thc=Float.parseFloat(th);

        String tl=Tl.getText().toString();
        float tlc=Float.parseFloat(tl);

        String tw=Tw.getText().toString();
        float twc=Float.parseFloat(tw);

        float tpr= twc+thc+tlc;
        float tprRound = Math.round(tpr*100);
        tp.setText(String.valueOf(tprRound/100)+" cm");

        float tar= (float)(0.5*twc*thc);
        float tarRound = Math.round(tar*100);
        ta.setText(String.valueOf(tarRound/100)+" cm²");
    }
}}