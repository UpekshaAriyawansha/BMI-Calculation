package com.example.a0;

import androidx.annotation.ColorInt;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import org.joda.time.Period;
import org.joda.time.PeriodType;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AgeCalculator extends AppCompatActivity {
    Button ToDay,birth,AgeCal;
    TextView Aresult;
    DatePickerDialog.OnDateSetListener dateSetListener1,dateSetListener2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age_calculator);

        birth = findViewById(R.id.bt_birth);
        ToDay = findViewById(R.id.bt_today);
        AgeCal = findViewById(R.id.btnAgeCal);
        Aresult = findViewById(R.id.ageResult);

        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String date = simpleDateFormat.format(Calendar.getInstance().getTime());
        ToDay.setText(date);

        birth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viwe) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(AgeCalculator.this, android.R.style.Theme_Holo_Light_Dialog_MinWidth, dateSetListener1, year, month, day);

                datePickerDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                datePickerDialog.show();
            }
        });

        dateSetListener1 = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int day) {
                month = month + 1;
                String date= year + "/" + month + "/" + day;
                birth.setText(date);
            }
        };

        ToDay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                DatePickerDialog datePickerDialog=new DatePickerDialog(AgeCalculator.this, android.R.style.Theme_Holo_Light_Dialog_MinWidth,dateSetListener2,year,month,day);

                datePickerDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                datePickerDialog.show();
            }
        });
        dateSetListener2 = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                month=month+1;
                String date= year + "/" + month + "/" + day;
                ToDay.setText(date);
            }
        };

        AgeCal.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) {
                String sDate = birth.getText().toString();
                String eDate = ToDay.getText().toString();
                SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy/MM/dd");
                try {
                    Date date1 = simpleDateFormat1.parse(sDate);
                    Date date2 = simpleDateFormat1.parse(eDate);

                    long startDate = date1.getTime();
                    long endDate = date2.getTime();

                    if (startDate <= endDate) {
                        Period period = new Period(startDate,endDate,PeriodType.yearMonthDay());
                        int years = period.getYears();
                        int months = period.getMonths();
                        int days = period.getDays();

                        Aresult.setText(years + " Years | " + months + " Months | " + days + " Days ");
                        Aresult.setTextColor(Color.DKGRAY);
                    } else {
                        Toast.makeText(getApplicationContext(), "Birthday should not be larger than today's date.", Toast.LENGTH_LONG).show();
                    }

                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });
    }

}