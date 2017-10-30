package com.example.p1.kraina1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

import static com.example.p1.kraina1.MainActivity.r;

public class pytobr extends AppCompatActivity {
    static String[][] pytobr = new String[10][7];
TextView pyt;
    int i=0;
    Random generator= new Random();
    ImageButton odp1, odp2, odp3;
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
        setContentView(R.layout.activity_pytobr);
        setpyto();
        pyt = (TextView)findViewById(R.id.pytanie);
        odp1 = (ImageButton) findViewById(R.id.obra);
        odp2 = (ImageButton) findViewById(R.id.obrb);
        odp3 = (ImageButton) findViewById(R.id.rebuss);
        i =generator.nextInt(4);
        pyt.setText(pytobr[i][0]);
        if(i==0){
        odp1.setImageResource(R.drawable.obrpyt1a);
        odp2.setImageResource(R.drawable.obrpyt1b);
        odp3.setImageResource(R.drawable.obrpyt1c);}
        if(i==1){
            odp1.setImageResource(R.drawable.obrpyt2a);
        odp2.setImageResource(R.drawable.obrpyt2b);
        odp3.setImageResource(R.drawable.obrpyt2c);}
        if(i==2){
            odp1.setImageResource(R.drawable.obrpyt2a);
        odp2.setImageResource(R.drawable.obrpyt2b);
        odp3.setImageResource(R.drawable.obrpyt2c);}
        if(i==3){
            odp1.setImageResource(R.drawable.obrpyt3a);
        odp2.setImageResource(R.drawable.obrpyt3b);
        odp3.setImageResource(R.drawable.obrpyt2c);}
    }
 void setpyto(){
        pytobr[0][0]="Co kosimy kosiarką gdy urośnie?";
     pytobr[0][1]="obrpyt1a";
     pytobr[0][2]="obrpyt1b";
     pytobr[0][3]="obrpyt1c";
     pytobr[0][4]="obrpyt1a";
     pytobr[1][0]="W czym gotujemy wodę na herbatę?";
     pytobr[1][1]="obrpyt2a";
     pytobr[1][2]="obrpyt2b";
     pytobr[1][3]="obrpyt2c";
     pytobr[1][4]="obrpyt2a";
     pytobr[2][0]="W czym gotujemy wodę na makaron?";
     pytobr[2][1]="obrpyt2a";
     pytobr[2][2]="obrpyt2b";
     pytobr[2][3]="obrpyt2c";
     pytobr[2][4]="obrpyt2c";
     pytobr[3][0]="Co nas chroni przed słońcem?";
     pytobr[3][1]="obrpyt3a";
     pytobr[3][2]="obrpyt3b";
     pytobr[3][3]="obrpyt2c";
     pytobr[3][4]="obrpyt3b";
    }

    public void odpa(View view){

        if(pytobr[i][4].equals(pytobr[i][1]))
            dobra2(view);
        else
            zla(view);
    }
    public void odpb(View view){
        if(pytobr[i][4].equals(pytobr[i][2]))
            dobra2(view);
        else
            zla(view);
    }
    public void odpc(View view){
        if(pytobr[i][4].equals(pytobr[i][3]))
            dobra2(view);
        else
            zla(view);
    }
    void kill_activity()
    {
        finish();
    }
    public void dobra2(View view) {
        if (r == 1) {
        Intent intent = new Intent(pytobr.this, dobrze2.class);
        Menu.wyl=1; startActivity(intent);}
        if (r == 0) {        Intent intent = new Intent(pytobr.this, dobrze2c.class);
            Menu.wyl=1; startActivity(intent);}
    }
    public void zla(View view) {
        if (r == 1) {
            Intent intent = new Intent(pytobr.this, zle.class);
            Menu.wyl=1; startActivity(intent);
        }
        if (r == 0) {
            Intent intent = new Intent(pytobr.this, zlec.class);
            Menu.wyl=1; startActivity(intent);
        }

    }
}
