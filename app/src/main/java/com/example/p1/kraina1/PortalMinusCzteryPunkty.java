package com.example.p1.kraina1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import static com.example.p1.kraina1.GlownyWidokCzarnoksieznika.punktyCzarnoksieznika;
import static com.example.p1.kraina1.GlownyWidokMaga.czyTuraMaga;
import static com.example.p1.kraina1.GlownyWidokMaga.punktyMaga;

public class PortalMinusCzteryPunkty extends Activity {
    public void onStart() {
        super.onStart();
        Menu.poprawneWylaczenie = 0;
    }

    GifyPortalowe po;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portal9);
        po = (GifyPortalowe) findViewById(R.id.gif);
        po.setGif(this, R.raw.image16);

    }

    public void onPause() {
        super.onPause();
        if (Menu.poprawneWylaczenie == 0) {
            Intro.poprawneWylaczenieDwa = 0;
            Intro.adp.run();
        }
    }

    public void onResume() {
        super.onResume();
    }

    public void powrot(View view) {

        if (czyTuraMaga == 1) {
            punktyMaga = punktyMaga - 4;
            Intent intent = new Intent(PortalMinusCzteryPunkty.this, GlownyWidokCzarnoksieznika.class);
            Menu.poprawneWylaczenie = 1;
            startActivity(intent);
        } else {
            punktyCzarnoksieznika = punktyCzarnoksieznika - 4;
            Intent intent = new Intent(PortalMinusCzteryPunkty.this, GlownyWidokMaga.class);
            Menu.poprawneWylaczenie = 1;
            startActivity(intent);
        }
    }
}
