package com.example.a0;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class BmiCalculator extends AppCompatActivity {

   Button BMICal;
   EditText BmiW,BmiH;
   TextView BmiR,BmiRt;

   float h,w,r;
   String rt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_calculator);

        BmiW=findViewById(R.id.BmiWeight);
        BmiH=findViewById(R.id.BmiHeight);
        BmiR=findViewById(R.id.BmiResults);
        BmiRt=findViewById(R.id.BmiResultsText);
        BMICal=findViewById(R.id.btnBMICal);
    };

    public void bmicalc(View view) {
        String h=BmiH.getText().toString();
        String w=BmiW.getText().toString();

        if (h != null && !"".equals(h)&& w != null && !"".equals(w)) {
            float BmiHeight=Float.parseFloat(h)/100;
            float BmiWeight=Float.parseFloat(w);

            float r=BmiWeight/(BmiHeight*BmiHeight);

            r = (float) (Math.round(r*100)/100.0);

            displayResults(r);

        }
    }

    public void displayResults(float r) {
        String Results="";

        if (Float.compare(r,18.4f)<=0) {
            Results = getString(R.string.underWeight);
            BmiR.setTextColor(Color.rgb(200,0,0));
        }else if (Float.compare(r,18.4f) >0 && Float.compare(r,24.9f)<=0){
            Results=getString(R.string.normalWeight);
            BmiR.setTextColor(Color.rgb(0,200,0));
        }else if (Float.compare(r,24.9f) >0 && Float.compare(r,29.9f)<=0){
            Results=getString(R.string.overWeight);
            BmiR.setTextColor(Color.rgb(0,250,0));
        }else if (Float.compare(r,29.9f) >0 && Float.compare(r,34.9f)<=0){
            Results=getString(R.string.obesityI);
            BmiR.setTextColor(Color.rgb(250,0,0));
        }else if (Float.compare(r,34.9f) >0 && Float.compare(r,39.9f)<=0){
            Results=getString(R.string.obesityII);
            BmiR.setTextColor(Color.rgb(250,0,0));
        }else if (Float.compare(r,40f) >=0){
            Results=getString(R.string.extreme);
            BmiR.setTextColor(Color.rgb(250,0,0));
        }
        //Results=r+" - "+Results;
        BmiR.setText(String.valueOf(r));
        BmiRt.setText(Results);
    }
   }


