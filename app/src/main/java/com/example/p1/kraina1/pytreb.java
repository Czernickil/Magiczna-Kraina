package com.example.p1.kraina1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.Random;

import static com.example.p1.kraina1.MainActivity.r;

public class pytreb extends AppCompatActivity {    public void onStart(){         super.onStart(); Menu.wyl=0;}
    EditText odp;
    ImageView rebus;

    String tekst;
    String [][] poprawne = new String[4][4];
    int i=0;
    Random generator= new Random();
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
        setContentView(R.layout.activity_pytreb);
         odp = (EditText)findViewById(R.id.odpp);
        rebus = (ImageView)findViewById(R.id.rebuss);
        poprawne[0][0]="pietruszka";
        poprawne[1][0]="burak";
        poprawne[2][0]="karkonosze";
        poprawne[3][0]="makaron";
        poprawne[0][1]="Pietruszka";
        poprawne[1][1]="Burak";
        poprawne[2][1]="Karkonosze";
        poprawne[3][1]="Makaron";
        poprawne[0][2]="pietruszka ";
        poprawne[1][2]="burak ";
        poprawne[2][2]="karkonosze ";
        poprawne[3][2]="makaron ";
        poprawne[0][3]="Pietruszka ";
        poprawne[1][3]="Burak ";
        poprawne[2][3]="Karkonosze ";
        poprawne[3][3]="Makaron ";
        i =generator.nextInt(8);
        switch(i){
            case(0):
                rebus.setImageResource(R.drawable.rebus1);
                break;
            case(1):
                rebus.setImageResource(R.drawable.rebus2);
                break;
            case(2):
                rebus.setImageResource(R.drawable.rebus3);
                break;
            case(3):
                rebus.setImageResource(R.drawable.rebus4);
                break;
        }

}
    void kill_activity()
    {
        finish();
    }

    public void sprawdz(View view) {
        tekst =odp.getText().toString();

        if (r == 1) {
        if(tekst.equals(poprawne[i][0]) || tekst.equals(poprawne[i][1]) || tekst.equals(poprawne[i][2])
                || tekst.equals(poprawne[i][3]) ){
        Intent intent = new Intent(pytreb.this, dobrze2.class);

        Menu.wyl=1; startActivity(intent);}
        else
        {
            Intent intent = new Intent(pytreb.this, zle.class);
            Menu.wyl=1; startActivity(intent);}}
        if (r == 0) {
            if(tekst.equals(poprawne[i][0]) || tekst.equals(poprawne[i][1]) || tekst.equals(poprawne[i][2])
                    || tekst.equals(poprawne[i][3]) ){
                Intent intent = new Intent(pytreb.this, dobrze2c.class);
                Menu.wyl=1; startActivity(intent);}
            else
            {
                Intent intent = new Intent(pytreb.this, zlec.class);
                Menu.wyl=1; startActivity(intent);}}
    }}
