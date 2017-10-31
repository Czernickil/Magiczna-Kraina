package com.example.p1.kraina1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.Random;


import static com.example.p1.kraina1.Menu.kon; public class wybport extends AppCompatActivity {    public void onStart(){         super.onStart(); Menu.wyl=0;}
    Random generator = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_wybport);
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
    public void portall(View view) {

        int i=generator.nextInt(4)+1;
        Intent intent;
        switch(i){
            case 1:
                intent = new Intent(wybport.this, portal1.class);
                Menu.wyl=1; startActivity(intent);
                break;
            case 2:
                intent = new Intent(wybport.this, portal2.class);
                Menu.wyl=1; startActivity(intent);                break;
            case 3:
                intent = new Intent(wybport.this, portal7.class);
                Menu.wyl=1; startActivity(intent);                break;
            case 4:
                intent = new Intent(wybport.this, portal8.class);
                Menu.wyl=1; startActivity(intent);                break;
            case 5:
                intent = new Intent(wybport.this, portal9.class);
                Menu.wyl=1; startActivity(intent);                break;}


}
    public void portalp(View view) {

        int i=generator.nextInt(3)+1;
        Intent intent;
        switch(i){
            case 1:
                intent = new Intent(wybport.this, portal3.class);
                Menu.wyl=1; startActivity(intent);
                break;
            case 2:
                intent = new Intent(wybport.this, portal4.class);
                Menu.wyl=1; startActivity(intent);                break;
            case 3:
                intent = new Intent(wybport.this, portal5.class);
                Menu.wyl=1; startActivity(intent);                break;
            case 4:
                intent = new Intent(wybport.this, portal6.class);
                Menu.wyl=1; startActivity(intent);                break;


        }

    }
    public void portals(View view) {

        Intent intent;

                intent = new Intent(wybport.this, pytzab.class);
                Menu.wyl=1; startActivity(intent);
             }

    void kill_activity()
    {
        finish();
    }
}
