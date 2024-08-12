package com.example.a0;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import java.io.File;

public class MainActivity<button, findViweById> extends AppCompatActivity implements MainActivity1 {


    private View view;

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.actAbout) {
            Intent intent = new Intent(MainActivity.this, About.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.actShare) {
            ApplicationInfo api = getApplicationContext().getApplicationInfo();
            String apkpath = api.sourceDir;
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("Application/vnd.android.package-archive");
            intent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(new File(apkpath)));
            startActivity(Intent.createChooser(intent,"ShareVia"));
            return true;
        }
        return super.onOptionsItemSelected(item);
}
    public void share(MenuItem item) {
        ApplicationInfo api = getApplicationContext().getApplicationInfo();
        String apkpath = api.sourceDir;
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("Application/vnd.android.package-archive");
        intent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(new File(apkpath)));
        startActivity(Intent.createChooser(intent,"ShareVia"));
    }

    public void about(MenuItem item) {
        Intent intent = new Intent(MainActivity.this, About.class);
        startActivity(intent);
    }


    public void bmi(View view) {
        Intent intent = new Intent(MainActivity.this, BmiCalculator.class);
        startActivity(intent);
    }

    public void exit(MenuItem item) {
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }

    public void agec(View view) {
        Intent intent = new Intent(MainActivity.this,AgeCalculator.class);
        startActivity(intent);
    }

    public void bmical(View view) {
        Intent intent = new Intent(MainActivity.this,BmiCalculator.class);
        startActivity(intent);
    }

    public void sheCal(View view) {
        Intent intent = new Intent(MainActivity.this,Shapes.class);
        startActivity(intent);
    }

    public void solidC(View view) {
        Intent intent = new Intent(MainActivity.this,Solid.class);
        startActivity(intent);
    }
}

