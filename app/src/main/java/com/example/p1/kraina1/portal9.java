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
import static com.example.p1.kraina1.Menu.kon; public class portal9 extends AppCompatActivity {
    GifViewportal po;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portal9);
        po =(GifViewportal)findViewById(R.id.gif);
        po.setGif(this, R.raw.image16);

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
            punkty=punkty-4;
            Intent intent = new Intent(portal9.this, MainActivityc.class);
            Menu.wyl=1; startActivity(intent);
        } else {
            punktyc=punktyc-4;
            Intent intent = new Intent(portal9.this, MainActivity.class);
            Menu.wyl=1; startActivity(intent);
        }
    }
}
