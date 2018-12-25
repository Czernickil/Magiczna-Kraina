package com.example.p1.kraina1;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

import static com.example.p1.kraina1.GlownyWidokMaga.punktyMaga;
import static com.example.p1.kraina1.GlownyWidokMaga.r;
import static com.example.p1.kraina1.GlownyWidokCzarnoksieznika.punktyCzarnoksieznika;

public class PortalMinusDwaPunkty extends Activity {    public void onStart(){         super.onStart(); Menu.poprawneWylaczenie =0;}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portal7);
    }
    public void onPause(){
        super.onPause();
        if(Menu.poprawneWylaczenie ==0){
                        Intro.poprawneWylaczenieDwa =0;             Intro.adp.run();
        }
    }
    public void onResume(){
        super.onResume();
        }
    public void powrot(View view) {

        if (r == 1) {
            punktyMaga = punktyMaga -2;
            Intent intent = new Intent(PortalMinusDwaPunkty.this, GlownyWidokCzarnoksieznika.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);
        } else {
            punktyCzarnoksieznika = punktyCzarnoksieznika -2;
            Intent intent = new Intent(PortalMinusDwaPunkty.this, GlownyWidokMaga.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);
        }
    }
}