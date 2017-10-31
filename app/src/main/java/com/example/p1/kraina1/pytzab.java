package com.example.p1.kraina1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

import static com.example.p1.kraina1.MainActivity.r;

public class pytzab extends AppCompatActivity {    public void onStart(){         super.onStart(); Menu.wyl=0;}
TextView pyt;
    public static int g=0;

    int i=0;
    Random generator= new Random();
    static String[][] pytzab = new String[10][2];
    public void onPause(){
        super.onPause();
        if(Menu.wyl==0){
                        Intro.z=0;             Intro.adp.run();
        }
    }
    public void onResume(){
        super.onResume();
        }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pytzab);
        setpytzab();
        pyt = (TextView)findViewById(R.id.pytanie);
        i =generator.nextInt(7);
        pyt.setText(pytzab[i][0]);
    }

    public static void setpytzab() {
        pytzab[0][0]="Skocz 10 razy";
        pytzab[1][0]="Zrób 10 przysiadów";
        pytzab[2][0]="Stój na nodze 10 sekund";
        pytzab[3][0]="Zrób 10 pompek ";
        pytzab[4][0]="Opowiedz dowcip";
        pytzab[5][0]="Zaśpiewaj jakąś piosenkę";
        pytzab[6][0]="Opowiedz jakąś historię";
    }
    void kill_activity()
    {
        finish();
    }
    public void dobrze(View view) {
        if (r == 1) {
            Intent intent = new Intent(pytzab.this, dobrze2.class);
            Menu.wyl=1; startActivity(intent);}
        if (r == 0) {        Intent intent = new Intent(pytzab.this, dobrze2c.class);
            Menu.wyl=1; startActivity(intent);}
    }
    public void zle(View view) {
        g=1;
        if (r == 1) {
            Intent intent = new Intent(pytzab.this, zle.class);
            Menu.wyl=1; startActivity(intent);
        }
        if (r == 0) {
            Intent intent = new Intent(pytzab.this, zlec.class);
            Menu.wyl=1; startActivity(intent);
        }

    }
}
