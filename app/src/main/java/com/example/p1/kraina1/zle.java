package com.example.p1.kraina1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;

import android.view.View;

import static com.example.p1.kraina1.Menu.kon;
import static com.example.p1.kraina1.pytzab.g;


public class zle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(g==0)
        setContentView(R.layout.activity_zle);
        if(g==1){
            g=0;
            setContentView(R.layout.activity_zlezab);
        }
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
    public void powrot(View view) {

        Intent intent = new Intent(zle.this, MainActivityc.class);
        Menu.wyl=1; startActivity(intent);
    }
}
