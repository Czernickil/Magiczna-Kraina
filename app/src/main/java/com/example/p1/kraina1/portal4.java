package com.example.p1.kraina1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import static com.example.p1.kraina1.MainActivity.punkty;
import static com.example.p1.kraina1.MainActivity.r;
import static com.example.p1.kraina1.MainActivityc.punktyc;
import static com.example.p1.kraina1.Menu.kon; public class portal4 extends AppCompatActivity {    public void onStart(){         super.onStart(); Menu.wyl=0;}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portal4);

    }
    public void onPause(){
        super.onPause();
        if(Menu.wyl==0){
                        Intro.z=0;             Intro.adp.run();
        }
    }
    public void onResume(){
        super.onResume();
        }
    public void powrot(View view) {

        if (r == 1) {
            punkty=punkty+1;
            Intent intent = new Intent(portal4.this, MainActivityc.class);
            Menu.wyl=1; startActivity(intent);
        } else {
            punktyc=punktyc+1;
            Intent intent = new Intent(portal4.this, MainActivity.class);
            Menu.wyl=1; startActivity(intent);
        }
    }
}
