package com.example.p1.kraina1;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;

import java.util.Random;



import static com.example.p1.kraina1.GlownyWidokCzarnoksieznika.idskrzatc;
import static com.example.p1.kraina1.GlownyWidokCzarnoksieznika.punktyCzarnoksieznika;
import static com.example.p1.kraina1.GlownyWidokCzarnoksieznika.czyTuraCzarnoksieznika;
import static com.example.p1.kraina1.GlownyWidokCzarnoksieznika.setDefaultsc24;
import static com.example.p1.kraina1.GlownyWidokCzarnoksieznika.setDefaultsc27;
import static com.example.p1.kraina1.GlownyWidokCzarnoksieznika.setDefaultsc28;
import static com.example.p1.kraina1.GlownyWidokCzarnoksieznika.setDefaultsc34;
import static com.example.p1.kraina1.GlownyWidokCzarnoksieznika.setDefaultsc37;
import static com.example.p1.kraina1.GlownyWidokCzarnoksieznika.setDefaultsc38;
import static com.example.p1.kraina1.GlownyWidokCzarnoksieznika.setDefaultsc4;
import static com.example.p1.kraina1.GlownyWidokCzarnoksieznika.setDefaultsc44;
import static com.example.p1.kraina1.GlownyWidokCzarnoksieznika.setDefaultsc47;
import static com.example.p1.kraina1.GlownyWidokCzarnoksieznika.setDefaultsc48;
import static com.example.p1.kraina1.GlownyWidokCzarnoksieznika.setDefaultsc54;
import static com.example.p1.kraina1.GlownyWidokCzarnoksieznika.setDefaultsc57;
import static com.example.p1.kraina1.GlownyWidokCzarnoksieznika.setDefaultsc58;
import static com.example.p1.kraina1.GlownyWidokCzarnoksieznika.setDefaultsc64;
import static com.example.p1.kraina1.GlownyWidokCzarnoksieznika.setDefaultsc67;
import static com.example.p1.kraina1.GlownyWidokCzarnoksieznika.setDefaultsc68;
import static com.example.p1.kraina1.GlownyWidokCzarnoksieznika.setDefaultsc7;
import static com.example.p1.kraina1.GlownyWidokCzarnoksieznika.setDefaultsc8;
import static com.example.p1.kraina1.GlownyWidokCzarnoksieznika.setsbtncc1;
import static com.example.p1.kraina1.GlownyWidokCzarnoksieznika.setsbtncc2;
import static com.example.p1.kraina1.GlownyWidokMaga.idskrzat;
import static com.example.p1.kraina1.PrzyciskDrzewkaZeSkrzatemDlaMaga.FlashEnum.OFF;
import static com.example.p1.kraina1.PrzyciskDrzewkaZeSkrzatemDlaMaga.FlashEnum.ON;

public class DobrzeCzernoksieznikJedenPunkt extends Activity {
    public void onStart() {
        super.onStart();
        Menu.poprawneWylaczenie = 0;
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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dobrzec);
        Random generator = new Random();
        int i = generator.nextInt(2);
        TextView textviev;
        MediaPlayer mpb = MediaPlayer.create(this, R.raw.brawa);
        if (Intro.poprawneWylaczenieDwa == 1) mpb.start();
        textviev = (TextView) findViewById(R.id.textView3);
        if (idskrzat == "skrzatbtn1" || idskrzat == "skrzatbtn2" || idskrzatc == "skrzatcbtnc1" || idskrzatc == "skrzatcbtnc2")
            czyTuraCzarnoksieznika = 0;
        if (czyTuraCzarnoksieznika == 1) {
            textviev.setText("");
            punktyCzarnoksieznika = punktyCzarnoksieznika + 3;
            GifSkrzatBezZmianyCzarnoksieznik gifView = (GifSkrzatBezZmianyCzarnoksieznik) findViewById(R.id.gifz);
            gifView.setVisibility(View.INVISIBLE);
            switch (idskrzatc) {
                case ("skrzatc4"):
                    setDefaultsc4("etatTogglec4", ON, this);
                    idskrzatc = "";
                    break;
                case ("skrzatc7"):
                    setDefaultsc7("etatTogglec7", ON, this);
                    idskrzatc = "";
                    break;
                case ("skrzatc8"):
                    setDefaultsc8("etatTogglec8", ON, this);
                    idskrzatc = "";
                    break;
                case ("skrzatc24"):
                    setDefaultsc24("etatTogglec24", ON, this);
                    idskrzatc = "";
                    break;
                case ("skrzatc27"):
                    setDefaultsc27("etatTogglec27", ON, this);
                    idskrzatc = "";
                    break;
                case ("skrzatc28"):
                    setDefaultsc28("etatTogglec28", ON, this);
                    idskrzatc = "";
                    break;
                case ("skrzatc34"):
                    setDefaultsc34("etatTogglec34", ON, this);
                    idskrzatc = "";
                    break;
                case ("skrzatc37"):
                    setDefaultsc37("etatTogglec37", ON, this);
                    idskrzatc = "";
                    break;
                case ("skrzatc38"):
                    setDefaultsc38("etatTogglec38", ON, this);
                    idskrzatc = "";
                    break;
                case ("skrzatc44"):
                    setDefaultsc44("etatTogglec44", ON, this);
                    idskrzatc = "";
                    break;
                case ("skrzatc47"):
                    setDefaultsc47("etatTogglec47", ON, this);
                    idskrzatc = "";
                    break;
                case ("skrzatc48"):
                    setDefaultsc48("etatTogglec48", ON, this);
                    idskrzatc = "";
                    break;
                case ("skrzatc54"):
                    setDefaultsc54("etatTogglec54", ON, this);
                    idskrzatc = "";
                    break;
                case ("skrzatc57"):
                    setDefaultsc57("etatTogglec57", ON, this);
                    idskrzatc = "";
                    break;
                case ("skrzatc58"):
                    setDefaultsc58("etatTogglec58", ON, this);
                    idskrzatc = "";
                    break;
                case ("skrzatc64"):
                    setDefaultsc64("etatTogglec64", ON, this);
                    idskrzatc = "";
                    break;
                case ("skrzatc67"):
                    setDefaultsc67("etatTogglec67", ON, this);
                    idskrzatc = "";
                    break;
                case ("skrzatc68"):
                    setDefaultsc68("etatTogglec68", ON, this);
                    idskrzatc = "";
                    break;
                case ("skrzatcbtn1"):
                    setsbtncc1("sbtncc1", ON, this);
                    idskrzatc = "";
                    break;
                case ("skrzatcbtn2"):
                    setsbtncc2("sbtncc2", ON, this);
                    idskrzatc = "";
                    break;
            }
        } else {
            textviev.setText("");
            GifSkrzatZeZmianaCzarnoksieznik gifView = (GifSkrzatZeZmianaCzarnoksieznik) findViewById(R.id.gif);
            gifView.setVisibility(View.INVISIBLE);
            switch (idskrzatc) {
                case ("skrzatc4"):
                    setDefaultsc4("etatTogglec4", OFF, this);
                    idskrzatc = "";
                    break;
                case ("skrzatc7"):
                    setDefaultsc7("etatTogglec7", OFF, this);
                    idskrzatc = "";
                    break;
                case ("skrzatc8"):
                    setDefaultsc8("etatTogglec8", OFF, this);
                    idskrzatc = "";
                    break;
                case ("skrzatc24"):
                    setDefaultsc24("etatTogglec24", OFF, this);
                    idskrzatc = "";
                    break;
                case ("skrzatc27"):
                    setDefaultsc27("etatTogglec27", OFF, this);
                    idskrzatc = "";
                    break;
                case ("skrzatc28"):
                    setDefaultsc28("etatTogglec28", OFF, this);
                    idskrzatc = "";
                    break;
                case ("skrzatc34"):
                    setDefaultsc34("etatTogglec34", OFF, this);
                    idskrzatc = "";
                    break;
                case ("skrzatc37"):
                    setDefaultsc37("etatTogglec37", OFF, this);
                    idskrzatc = "";
                    break;
                case ("skrzatc38"):
                    setDefaultsc38("etatTogglec38", OFF, this);
                    idskrzatc = "";
                    break;
                case ("skrzatc44"):
                    setDefaultsc44("etatTogglec44", OFF, this);
                    idskrzatc = "";
                    break;
                case ("skrzatc47"):
                    setDefaultsc47("etatTogglec47", OFF, this);
                    idskrzatc = "";
                    break;
                case ("skrzatc48"):
                    setDefaultsc48("etatTogglec48", OFF, this);
                    idskrzatc = "";
                    break;
                case ("skrzatc54"):
                    setDefaultsc54("etatTogglec54", OFF, this);
                    idskrzatc = "";
                    break;
                case ("skrzatc57"):
                    setDefaultsc57("etatTogglec57", OFF, this);
                    idskrzatc = "";
                    break;
                case ("skrzatc58"):
                    setDefaultsc58("etatTogglec58", OFF, this);
                    idskrzatc = "";
                    break;
                case ("skrzatc64"):
                    setDefaultsc64("etatTogglec64", OFF, this);
                    idskrzatc = "";
                    break;
                case ("skrzatc67"):
                    setDefaultsc67("etatTogglec67", OFF, this);
                    idskrzatc = "";
                    break;
                case ("skrzatc68"):
                    setDefaultsc68("etatTogglec68", OFF, this);
                    idskrzatc = "";
                    break;
                case ("skrzatcbtn1"):
                    setsbtncc1("sbtncc1", OFF, this);
                    idskrzatc = "";
                    break;
                case ("skrzatcbtn2"):
                    setsbtncc2("sbtncc2", OFF, this);
                    idskrzatc = "";
                    break;
            }
        }

    }
    public static int getDefaultsp(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        return preferences.getInt(key, punktyCzarnoksieznika);
    }

    public static void setDefaultspc(String key, int value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putInt(key, value++);
        editor.commit();
    }

    void kill_activity() {
        finish();
    }

    public void powrot(View view) {
        Intent intent = new Intent(DobrzeCzernoksieznikJedenPunkt.this, GlownyWidokMaga.class);
        Menu.poprawneWylaczenie = 1;
        startActivity(intent);
        setDefaultspc("etatTogglep", punktyCzarnoksieznika++, this);
    }

}