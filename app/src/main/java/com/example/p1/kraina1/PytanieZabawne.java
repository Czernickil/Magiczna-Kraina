package com.example.p1.kraina1;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

import static com.example.Kraina1.context;
import static com.example.p1.kraina1.GlownyWidokMaga.czyTuraMaga;

public class PytanieZabawne extends Activity {
    static SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
    static SharedPreferences.Editor editor = prefs.edit();

    public void onStart() {
        super.onStart();
        Menu.poprawneWylaczenie = 0;
    }

    TextView pyt;
    public static int czyPytanieZabawne = 0;

    int i = 0;
    Random generator = new Random();
    static String[][] pytzab = new String[11][2];

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pytzab);
        setpytzab();
        pyt = (TextView) findViewById(R.id.pytanie);
        i = generator.nextInt(11);
        while (pytzab[i][1].equals("Z")) {
            i = generator.nextInt(11);
        }
        setzeb(i);
        pyt.setText(pytzab[i][0]);
    }

    public static void setpytzab() {
        for (int i = 0; i < 11; i++) {
            pytzab[i][1] = "W";
        }
        pytzab[0][0] = "Skocz w  miejscu 10 razy";
        pytzab[1][0] = "Zrób 10 przysiadów";
        pytzab[2][0] = "Stój na nodze 15 sekund";
        pytzab[3][0] = "Zrób 12 pompek ";
        pytzab[4][0] = "Opowiedz dowcip";
        pytzab[5][0] = "Zaśpiewaj jakąś piosenkę";
        pytzab[6][0] = "Opowiedz jakąś śmieszną historię";
        pytzab[7][0] = "Zrób 20 brzuszków";
        pytzab[8][0] = "Powiedz 3 miłe rzeczy osobie obok";
        pytzab[9][0] = "Odpowiedz na pytanie które zada Ci osoba obok";
        pytzab[10][0] = "Przytul się do osoby obok (jeśli się zgodzi) ";

    }

    void kill_activity() {
        finish();
    }

    public void dobrze(View view) {
        if (czyTuraMaga == 1) {
            Intent intent = new Intent(PytanieZabawne.this, DobrzeMagDwaPunkty.class);
            Menu.poprawneWylaczenie = 1;
            startActivity(intent);
        }
        if (czyTuraMaga == 0) {
            Intent intent = new Intent(PytanieZabawne.this, DobrzeCzernoksieznikDwaPunkty.class);
            Menu.poprawneWylaczenie = 1;
            startActivity(intent);
        }
    }

    public void zle(View view) {
        czyPytanieZabawne = 1;
        if (czyTuraMaga == 1) {
            Intent intent = new Intent(PytanieZabawne.this, com.example.p1.kraina1.ZlaOdpowiedzMaga.class);
            Menu.poprawneWylaczenie = 1;
            startActivity(intent);
        }
        if (czyTuraMaga == 0) {
            Intent intent = new Intent(PytanieZabawne.this, com.example.p1.kraina1.ZlaOdpowiedzCzarnoksieznika.class);
            Menu.poprawneWylaczenie = 1;
            startActivity(intent);
        }

    }

    static void setzeb(int a) {
        pytzab[a][1] = "Z";
        editor.putString(a + "zab", "Z");
        editor.commit();
    }

    static String getzaj(String s) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        return preferences.getString(s, "");
    }
}
