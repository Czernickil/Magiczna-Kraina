package com.example.p1.kraina1;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

import static com.example.Kraina1.context;
import static com.example.p1.kraina1.GlownyWidokMaga.czyTuraMaga;

public class PytanieObrazkowe extends Activity {
    static SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
    static SharedPreferences.Editor editor = prefs.edit();

    public void onStart() {
        super.onStart();
        Menu.poprawneWylaczenie = 0;
    }

    static String[][] pytobr = new String[12][7];
    TextView pyt;
    int i = 0;
    Random generator = new Random();
    ImageButton odp1, odp2, odp3;

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
        setContentView(R.layout.activity_pytobr);
        pyt = (TextView) findViewById(R.id.pytanie);
        odp1 = (ImageButton) findViewById(R.id.obra);
        odp2 = (ImageButton) findViewById(R.id.obrb);
        odp3 = (ImageButton) findViewById(R.id.rebuss);
        i = generator.nextInt(12);
        while (pytobr[i][6].equals("Z")) {
            i = generator.nextInt(12);
        }
        setobr(i);
        pyt.setText(pytobr[i][0]);

        if (i == 0) {
            odp1.setImageResource(R.drawable.obrpyt1a);
            odp2.setImageResource(R.drawable.obrpyt1b);
            odp3.setImageResource(R.drawable.obrpyt1c);
        }
        if (i == 1) {
            odp1.setImageResource(R.drawable.obrpyt2a);
            odp2.setImageResource(R.drawable.obrpyt2b);
            odp3.setImageResource(R.drawable.obrpyt2c);
        }
        if (i == 2) {
            odp1.setImageResource(R.drawable.obrpyt2a);
            odp2.setImageResource(R.drawable.obrpyt2b);
            odp3.setImageResource(R.drawable.obrpyt2c);
        }
        if (i == 3) {
            odp1.setImageResource(R.drawable.obrpyt3a);
            odp2.setImageResource(R.drawable.obrpyt3b);
            odp3.setImageResource(R.drawable.obrpyt2c);
        }
        if (i == 4) {
            odp1.setImageResource(R.drawable.szczoteczka);
            odp2.setImageResource(R.drawable.flet);
            odp3.setImageResource(R.drawable.smoczek);
        }
        if (i == 5) {
            odp1.setImageResource(R.drawable.bebenki);
            odp2.setImageResource(R.drawable.flet);
            odp3.setImageResource(R.drawable.konik);
        }
        if (i == 6) {
            odp1.setImageResource(R.drawable.konik);
            odp2.setImageResource(R.drawable.flet);
            odp3.setImageResource(R.drawable.bebenki);
        }
        if (i == 7) {
            odp1.setImageResource(R.drawable.parasol);
            odp2.setImageResource(R.drawable.plecak);
            odp3.setImageResource(R.drawable.konik);
        }
        if (i == 8) {
            odp1.setImageResource(R.drawable.parasol);
            odp2.setImageResource(R.drawable.konik);
            odp3.setImageResource(R.drawable.plecak);
        }
        if (i == 9) {
            odp1.setImageResource(R.drawable.smoczek);
            odp2.setImageResource(R.drawable.bebenki);
            odp3.setImageResource(R.drawable.plecak);
        }
        if (i == 10) {
            odp1.setImageResource(R.drawable.szczoteczka);
            odp2.setImageResource(R.drawable.cyrkiel);
            odp3.setImageResource(R.drawable.parasol);
        }
        if (i == 11) {
            odp1.setImageResource(R.drawable.plecak);
            odp2.setImageResource(R.drawable.parasol);
            odp3.setImageResource(R.drawable.obrpyt2c);
        }
    }

    static void setpyto() {
        for (int i = 0; i < 12; i++) {
            pytobr[i][6] = "W";
        }
        pytobr[0][0] = "Co kosimy kosiarką gdy urośnie?";
        pytobr[0][1] = "obrpyt1a";
        pytobr[0][2] = "obrpyt1b";
        pytobr[0][3] = "obrpyt1c";
        pytobr[0][4] = "obrpyt1a";
        pytobr[1][0] = "W czym gotujemy wodę na herbatę?";
        pytobr[1][1] = "obrpyt2a";
        pytobr[1][2] = "obrpyt2b";
        pytobr[1][3] = "obrpyt2c";
        pytobr[1][4] = "obrpyt2a";
        pytobr[2][0] = "W czym gotujemy wodę na makaron?";
        pytobr[2][1] = "obrpyt2a";
        pytobr[2][2] = "obrpyt2b";
        pytobr[2][3] = "obrpyt2c";
        pytobr[2][4] = "obrpyt2c";
        pytobr[3][0] = "Co nas chroni przed słońcem?";
        pytobr[3][1] = "obrpyt3a";
        pytobr[3][2] = "obrpyt3b";
        pytobr[3][3] = "obrpyt2c";
        pytobr[3][4] = "obrpyt3b";
        pytobr[4][0] = "Czym myjemy zęby?";
        pytobr[4][1] = "ok";
        pytobr[4][2] = "";
        pytobr[4][3] = "";
        pytobr[4][4] = "ok";
        pytobr[5][0] = "Który obrazek przedstawia flet?";
        pytobr[5][1] = "";
        pytobr[5][2] = "ok";
        pytobr[5][3] = "";
        pytobr[5][4] = "ok";
        pytobr[6][0] = "Który obrazek przedstawia bębenek?";
        pytobr[6][1] = "";
        pytobr[6][2] = "";
        pytobr[6][3] = "ok";
        pytobr[6][4] = "ok";
        pytobr[7][0] = "Co nas chroni przed deszczem?";
        pytobr[7][1] = "ok";
        pytobr[7][2] = "";
        pytobr[7][3] = "";
        pytobr[7][4] = "ok";
        pytobr[8][0] = "Na czym można usiąść?";
        pytobr[8][1] = "";
        pytobr[8][2] = "ok";
        pytobr[8][3] = "";
        pytobr[8][4] = "ok";
        pytobr[9][0] = "Co mogą mieć w buzi małe dzieci?";
        pytobr[9][1] = "ok";
        pytobr[9][2] = "";
        pytobr[9][3] = "";
        pytobr[9][4] = "ok";
        pytobr[10][0] = "Co pomaga rysowac koło w zeszycie?";
        pytobr[10][1] = "";
        pytobr[10][2] = "ok";
        pytobr[10][3] = "";
        pytobr[10][4] = "ok";
        pytobr[11][0] = "W czym nosimy zeszyty i książki do szkoły??";
        pytobr[11][1] = "ok";
        pytobr[11][2] = "";
        pytobr[11][3] = "";
        pytobr[11][4] = "ok";

    }

    public void odpa(View view) {

        if (pytobr[i][4].equals(pytobr[i][1]))
            dobra2(view);
        else
            zla(view);
    }

    public void odpb(View view) {
        if (pytobr[i][4].equals(pytobr[i][2]))
            dobra2(view);
        else
            zla(view);
    }

    public void odpc(View view) {
        if (pytobr[i][4].equals(pytobr[i][3]))
            dobra2(view);
        else
            zla(view);
    }

    void kill_activity() {
        finish();
    }

    public void dobra2(View view) {
        if (czyTuraMaga == 1) {
            Intent intent = new Intent(PytanieObrazkowe.this, DobrzeMagDwaPunkty.class);
            Menu.poprawneWylaczenie = 1;
            startActivity(intent);
        }
        if (czyTuraMaga == 0) {
            Intent intent = new Intent(PytanieObrazkowe.this, DobrzeCzernoksieznikDwaPunkty.class);
            Menu.poprawneWylaczenie = 1;
            startActivity(intent);
        }
    }

    public void zla(View view) {
        if (czyTuraMaga == 1) {
            Intent intent = new Intent(PytanieObrazkowe.this, ZlaOdpowiedzMaga.class);
            Menu.poprawneWylaczenie = 1;
            startActivity(intent);
        }
        if (czyTuraMaga == 0) {
            Intent intent = new Intent(PytanieObrazkowe.this, ZlaOdpowiedzCzarnoksieznika.class);
            Menu.poprawneWylaczenie = 1;
            startActivity(intent);
        }

    }

    static void setobr(int a) {
        pytobr[a][6] = "Z";
        editor.putString(a + "obr", "Z");
        editor.commit();
    }

    static String getzaj(String s) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        return preferences.getString(s, "");
    }
}
