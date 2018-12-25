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
import static com.example.p1.kraina1.PrzyciskDrzewkaZeSkrzatemDlaMaga.FlashEnum.OFF;
import static com.example.p1.kraina1.PrzyciskDrzewkaZeSkrzatemDlaMaga.FlashEnum.ON;
import static com.example.p1.kraina1.GlownyWidokMaga.idskrzat;
import static com.example.p1.kraina1.GlownyWidokMaga.punktyMaga;
import static com.example.p1.kraina1.GlownyWidokMaga.setDefaults24;
import static com.example.p1.kraina1.GlownyWidokMaga.setDefaults27;
import static com.example.p1.kraina1.GlownyWidokMaga.setDefaults28;
import static com.example.p1.kraina1.GlownyWidokMaga.setDefaults34;
import static com.example.p1.kraina1.GlownyWidokMaga.setDefaults37;
import static com.example.p1.kraina1.GlownyWidokMaga.setDefaults38;
import static com.example.p1.kraina1.GlownyWidokMaga.setDefaults4;
import static com.example.p1.kraina1.GlownyWidokMaga.setDefaults44;
import static com.example.p1.kraina1.GlownyWidokMaga.setDefaults47;
import static com.example.p1.kraina1.GlownyWidokMaga.setDefaults48;
import static com.example.p1.kraina1.GlownyWidokMaga.setDefaults54;
import static com.example.p1.kraina1.GlownyWidokMaga.setDefaults57;
import static com.example.p1.kraina1.GlownyWidokMaga.setDefaults58;
import static com.example.p1.kraina1.GlownyWidokMaga.setDefaults64;
import static com.example.p1.kraina1.GlownyWidokMaga.setDefaults67;
import static com.example.p1.kraina1.GlownyWidokMaga.setDefaults68;
import static com.example.p1.kraina1.GlownyWidokMaga.setDefaults7;
import static com.example.p1.kraina1.GlownyWidokMaga.setDefaults8;
import static com.example.p1.kraina1.GlownyWidokMaga.setsbtn1;
import static com.example.p1.kraina1.GlownyWidokMaga.setsbtn2;
import static com.example.p1.kraina1.GlownyWidokCzarnoksieznika.idskrzatc;
import static com.example.p1.kraina1.GlownyWidokMaga.s;

public class DobrzeMagTrzyPunkty extends Activity {
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
        setContentView(R.layout.activity_dobrze);
        Random generator = new Random();
        int i = generator.nextInt(2);
        MediaPlayer mpb = MediaPlayer.create(this, R.raw.brawa);
        if (Intro.poprawneWylaczenieDwa == 1) mpb.start();
        TextView textviev;
        textviev = (TextView) findViewById(R.id.textView3);
        if (idskrzat == "skrzatbtn1" || idskrzat == "skrzatbtn2" || idskrzatc == "skrzatcbtnc1" || idskrzatc == "skrzatcbtnc2")
            s = 0;
        if (s == 1) {
            punktyMaga = punktyMaga + 3;
            textviev.setText("");
            GifSkrzatBezZmianyMag gifSkrzatBezZmianyMag = (GifSkrzatBezZmianyMag) findViewById(R.id.gif);
            gifSkrzatBezZmianyMag.setVisibility(View.INVISIBLE);
            switch (idskrzat) {
                case ("skrzat4"):
                    setDefaults4("etatToggle4", OFF, this);
                    idskrzat = "";
                    break;
                case ("skrzat7"):
                    setDefaults7("etatToggle7", OFF, this);
                    idskrzat = "";
                    break;
                case ("skrzat8"):
                    setDefaults8("etatToggle8", OFF, this);
                    idskrzat = "";
                    break;
                case ("skrzat24"):
                    setDefaults24("etatToggle24", OFF, this);
                    idskrzat = "";
                    break;
                case ("skrzat27"):
                    setDefaults27("etatToggle27", OFF, this);
                    idskrzat = "";
                    break;
                case ("skrzat28"):
                    setDefaults28("etatToggle28", OFF, this);
                    idskrzat = "";
                    break;
                case ("skrzat34"):
                    setDefaults34("etatToggle34", OFF, this);
                    idskrzat = "";
                    break;
                case ("skrzat37"):
                    setDefaults37("etatToggle37", OFF, this);
                    idskrzat = "";
                    break;
                case ("skrzat38"):
                    setDefaults38("etatToggle38", OFF, this);
                    idskrzat = "";
                    break;
                case ("skrzat44"):
                    setDefaults44("etatToggle44", OFF, this);
                    idskrzat = "";
                    break;
                case ("skrzat47"):
                    setDefaults47("etatToggle47", OFF, this);
                    idskrzat = "";
                    break;
                case ("skrzat48"):
                    setDefaults48("etatToggle48", OFF, this);
                    idskrzat = "";
                    break;
                case ("skrzat54"):
                    setDefaults54("etatToggle54", OFF, this);
                    idskrzat = "";
                    break;
                case ("skrzat57"):
                    setDefaults57("etatToggle57", OFF, this);
                    idskrzat = "";
                    break;
                case ("skrzat58"):
                    setDefaults58("etatToggle58", OFF, this);
                    idskrzat = "";
                    break;
                case ("skrzat64"):
                    setDefaults64("etatToggle64", OFF, this);
                    idskrzat = "";
                    break;
                case ("skrzat67"):
                    setDefaults67("etatToggle67", OFF, this);
                    idskrzat = "";
                    break;
                case ("skrzat68"):
                    setDefaults68("etatToggle68", OFF, this);
                    idskrzat = "";
                    break;
                case ("skrzatbtn1"):
                    setsbtn1("sbtn1", OFF, this);
                    idskrzat = "";
                    break;
                case ("skrzatbtn2"):
                    setsbtn2("sbtn2", OFF, this);
                    idskrzat = "";
                    break;
            }
        } else {
            textviev.setText("");
            GifSkrzatZeZmianaMag gifView = (GifSkrzatZeZmianaMag) findViewById(R.id.gifz);
            gifView.setVisibility(View.INVISIBLE);
            switch (idskrzat) {
                case ("skrzat4"):
                    setDefaults4("etatToggle4", ON, this);
                    idskrzat = "";
                    break;
                case ("skrzat7"):
                    setDefaults7("etatToggle7", ON, this);
                    idskrzat = "";
                    break;
                case ("skrzat8"):
                    setDefaults8("etatToggle8", ON, this);
                    idskrzat = "";
                    break;
                case ("skrzat24"):
                    setDefaults24("etatToggle24", ON, this);
                    idskrzat = "";
                    break;
                case ("skrzat27"):
                    setDefaults27("etatToggle27", ON, this);
                    idskrzat = "";
                    break;
                case ("skrzat28"):
                    setDefaults28("etatToggle28", ON, this);
                    idskrzat = "";
                    break;
                case ("skrzat34"):
                    setDefaults34("etatToggle34", ON, this);
                    idskrzat = "";
                    break;
                case ("skrzat37"):
                    setDefaults37("etatToggle37", ON, this);
                    idskrzat = "";
                    break;
                case ("skrzat38"):
                    setDefaults38("etatToggle38", ON, this);
                    idskrzat = "";
                    break;
                case ("skrzat44"):
                    setDefaults44("etatToggle44", ON, this);
                    idskrzat = "";
                    break;
                case ("skrzat47"):
                    setDefaults47("etatToggle47", ON, this);
                    idskrzat = "";
                    break;
                case ("skrzat48"):
                    setDefaults48("etatToggle48", ON, this);
                    idskrzat = "";
                    break;
                case ("skrzat54"):
                    setDefaults54("etatToggle54", ON, this);
                    idskrzat = "";
                    break;
                case ("skrzat57"):
                    setDefaults57("etatToggle57", ON, this);
                    idskrzat = "";
                    break;
                case ("skrzat58"):
                    setDefaults58("etatToggle58", ON, this);
                    idskrzat = "";
                    break;
                case ("skrzat64"):
                    setDefaults64("etatToggle64", ON, this);
                    idskrzat = "";
                    break;
                case ("skrzat67"):
                    setDefaults67("etatToggle67", ON, this);
                    idskrzat = "";
                    break;
                case ("skrzat68"):
                    setDefaults68("etatToggle68", ON, this);
                    idskrzat = "";
                    break;
                case ("skrzatbtn1"):
                    setsbtn1("sbtn1", ON, this);
                    idskrzat = "";
                    break;
                case ("skrzatbtn2"):
                    setsbtn2("sbtn2", ON, this);
                    idskrzat = "";
                    break;
            }
        }
    }

    public static int getDefaultsp(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        return preferences.getInt(key, punktyMaga);
    }

    public static void setDefaultsp(String key, int value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        value = value + 3;
        editor.putInt(key, value);
        editor.commit();
    }

    void kill_activity() {
        finish();
    }

    public void powrot(View view) {
        punktyMaga = punktyMaga + 3;
        setDefaultsp("etatTogglep", punktyMaga, this);
        Intent intent = new Intent(DobrzeMagTrzyPunkty.this, GlownyWidokCzarnoksieznika.class);
        Menu.poprawneWylaczenie = 1;
        startActivity(intent);
    }

}