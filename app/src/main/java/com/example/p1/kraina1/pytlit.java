package com.example.p1.kraina1;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.ImageView;

import java.io.IOException;
import java.util.Random;

import static com.example.p1.kraina1.MainActivity.r;

public class pytlit extends AppCompatActivity {
    EditText odp;

    String tekst;
    String [][] poprawne = new String[6][4];
    int i=0;
    Random generator= new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        i =generator.nextInt(6);
        switch(i){
            case(0):
                setContentView(R.layout.activity_pytlit);
                break;
            case(1):
                setContentView(R.layout.activity_pytlit1);
                break;
            case(2):
                setContentView(R.layout.activity_pytlit2);

                break;
            case(3):
                setContentView(R.layout.activity_pytlit3);
                break;
            case(4):
                setContentView(R.layout.activity_pytlit4);

                break;
            case(5):
                setContentView(R.layout.activity_pytlit5);

                break;

        }




        odp = (EditText)findViewById(R.id.odpp);
        poprawne[0][0]="ziemia";
        poprawne[1][0]="burak";
        poprawne[2][0]="kosz";
        poprawne[3][0]="cytryna";
        poprawne[0][1]="Ziemia";
        poprawne[1][1]="Burak";
        poprawne[2][1]="Kosz";
        poprawne[3][1]="Cytryna";
        poprawne[0][2]="Ziemia ";
        poprawne[1][2]="burak ";
        poprawne[2][2]="Szok";
        poprawne[3][2]="cytryna ";
        poprawne[0][3]="ziemia ";
        poprawne[1][3]="Burak ";
        poprawne[2][3]="szok";
        poprawne[3][3]="Cytryna ";
        poprawne[4][0]="Jurek";
        poprawne[5][0]="Sosna";
        poprawne[4][1]="jurek";
        poprawne[5][1]="sosna";
        poprawne[4][2]="Jurek ";
        poprawne[5][2]="Sosna ";
        poprawne[4][3]="jurek ";
        poprawne[5][3]="sosna ";

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
    void kill_activity()
    {
        finish();
    }
    public void sprawdz(View view) {
        tekst =odp.getText().toString();
        if (r == 1) {
        if(tekst.equals(poprawne[i][0]) || tekst.equals(poprawne[i][1])){
            Intent intent = new Intent(pytlit.this, dobrze2.class);
            Menu.wyl=1; startActivity(intent);}
        else
        {
            Intent intent = new Intent(pytlit.this, zle.class);
            Menu.wyl=1; startActivity(intent);}
    }
    else if(r==0){
        if(tekst.equals(poprawne[i][0]) || tekst.equals(poprawne[i][1])){
            Intent intent = new Intent(pytlit.this, dobrze2c.class);
            Menu.wyl=1; startActivity(intent);}
        else
        {
            Intent intent = new Intent(pytlit.this, zlec.class);
            Menu.wyl=1; startActivity(intent);}
    }
    }}
