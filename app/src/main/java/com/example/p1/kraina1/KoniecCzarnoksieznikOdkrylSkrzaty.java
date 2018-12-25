package com.example.p1.kraina1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.p1.kraina1.GlownyWidokCzarnoksieznika.punktyCzarnoksieznika;
import static com.example.p1.kraina1.GlownyWidokMaga.punktyMaga;

public class KoniecCzarnoksieznikOdkrylSkrzaty extends Activity {
    public void onStart() {
        super.onStart();
        Menu.poprawneWylaczenie = 0;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_koniecc);
        TextView textviev = (TextView) findViewById(R.id.textView9);
        String wynik = String.valueOf(String.valueOf(punktyMaga) + " : " + String.valueOf(punktyCzarnoksieznika));
        textviev.setText(wynik);
        TextView textviev2 = (TextView) findViewById(R.id.textView11);
        if (punktyMaga > punktyCzarnoksieznika)
            textviev2.setText("Maga");
        if (punktyMaga < punktyCzarnoksieznika)
            textviev2.setText("Czarnoksiężnika");
        if (punktyMaga == punktyCzarnoksieznika)
            textviev2.setText("REMIS");
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

    public void dalej(View view) {
        Intent intent = new Intent(KoniecCzarnoksieznikOdkrylSkrzaty.this, Menu.class);
        Menu.poprawneWylaczenie = 1;
        startActivity(intent);
    }
}