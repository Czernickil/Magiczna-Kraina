package com.example.p1.kraina1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class WyborPortalu extends Activity {
    public void onStart() {
        super.onStart();
        Menu.poprawneWylaczenie = 0;
    }

    Random generator = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_wybport);
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

    public void portall(View view) {

        int i = generator.nextInt(4) + 1;
        Intent intent;
        switch (i) {
            case 1:
                intent = new Intent(WyborPortalu.this, PortalPlusTrzyPunkty.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
                break;
            case 2:
                intent = new Intent(WyborPortalu.this, PortalPlusDwaPunkty.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
                break;
            case 3:
                intent = new Intent(WyborPortalu.this, PortalMinusDwaPunkty.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
                break;
            case 4:
                intent = new Intent(WyborPortalu.this, PortalMinusTrzyPunkty.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
                break;
            case 5:
                intent = new Intent(WyborPortalu.this, PortalMinusCzteryPunkty.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
                break;
        }


    }

    public void portalp(View view) {

        int i = generator.nextInt(3) + 1;
        Intent intent;
        switch (i) {
            case 1:
                intent = new Intent(WyborPortalu.this, PortalPlusJedenPunktPierwszy.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
                break;
            case 2:
                intent = new Intent(WyborPortalu.this, PortalPlusJedenPunktDrugi.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
                break;
            case 3:
                intent = new Intent(WyborPortalu.this, PortalMinusJedenPunktPierwszy.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
                break;
            case 4:
                intent = new Intent(WyborPortalu.this, PortalMinusJedenPunktDrugi.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
                break;


        }

    }

    public void portals(View view) {

        Intent intent;

        intent = new Intent(WyborPortalu.this, PytanieZabawne.class);
        Menu.poprawneWylaczenie = 1;
        startActivity(intent);
    }

    void kill_activity() {
        finish();
    }
}
