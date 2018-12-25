package com.example.p1.kraina1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.app.Activity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import static com.example.p1.kraina1.GlownyWidokMaga.punktyMaga;
import static com.example.p1.kraina1.GlownyWidokMaga.czyTuraMaga;
import static com.example.p1.kraina1.GlownyWidokCzarnoksieznika.punktyCzarnoksieznika;

public class PortalPlusJedenPunktDrugi extends Activity {    public void onStart(){         super.onStart(); Menu.poprawneWylaczenie =0;}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portal4);

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

        if (czyTuraMaga == 1) {
            punktyMaga = punktyMaga +1;
            Intent intent = new Intent(PortalPlusJedenPunktDrugi.this, GlownyWidokCzarnoksieznika.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);
        } else {
            punktyCzarnoksieznika = punktyCzarnoksieznika +1;
            Intent intent = new Intent(PortalPlusJedenPunktDrugi.this, GlownyWidokMaga.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);
        }
    }
}
