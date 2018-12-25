package com.example.p1.kraina1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import static com.example.p1.kraina1.GlownyWidokCzarnoksieznika.punktyCzarnoksieznika;
import static com.example.p1.kraina1.GlownyWidokMaga.punktyMaga;
import static com.example.p1.kraina1.GlownyWidokMaga.czyTuraMaga;

public class PortalPlusJedenPunktPierwszy extends Activity {    public void onStart(){         super.onStart(); Menu.poprawneWylaczenie =0;}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portal3);



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
            Intent intent = new Intent(PortalPlusJedenPunktPierwszy.this, GlownyWidokCzarnoksieznika.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);
        } else {
            punktyCzarnoksieznika = punktyCzarnoksieznika +1;
            Intent intent = new Intent(PortalPlusJedenPunktPierwszy.this, GlownyWidokMaga.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);
        }
    }
}
