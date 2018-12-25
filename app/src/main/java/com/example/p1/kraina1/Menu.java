package com.example.p1.kraina1;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.app.Activity;
import android.view.View;

import java.util.Random;



import static com.example.p1.kraina1.GlownyWidokCzarnoksieznika.punktyCzarnoksieznika;
import static com.example.p1.kraina1.GlownyWidokCzarnoksieznika.skrzatyCzarnoksieznika;
import static com.example.p1.kraina1.GlownyWidokMaga.punktyMaga;
import static com.example.p1.kraina1.GlownyWidokMaga.r;
import static com.example.p1.kraina1.GlownyWidokMaga.skrzatyMaga;
import static com.example.p1.kraina1.PrzyciskDrzewkaBezSkrzataDlaMaga.FlashEnum2.ON2;
import static com.example.p1.kraina1.PrzyciskDrzewkaZeSkrzatemDlaMaga.FlashEnum.AUTOMATIC;
import static com.example.p1.kraina1.PrzyciskDrzewkaZeSkrzatemDlaMaga.FlashEnum.ON;
import static com.example.p1.kraina1.PrzyciskWyboruPytania.FlashEnum3.ON3;
import static com.example.p1.kraina1.PrzyciskWyboruPytania.FlashEnum3.ON3m;
import static com.example.p1.kraina1.PrzyciskWyboruPytania.FlashEnum3.ON3p;
import static com.example.p1.kraina1.PrzyciskWyboruPytania.FlashEnum3.ON3z;
import static com.example.p1.kraina1.PytanieLiterkowe.setlit;
import static com.example.p1.kraina1.PytanieObrazkowe.setpyto;
import static com.example.p1.kraina1.PytanieRebusowe.setreb;
import static com.example.p1.kraina1.PytanieTesktowe.setPytmat1;
import static com.example.p1.kraina1.PytanieTesktowe.setPytmat2;
import static com.example.p1.kraina1.PytanieTesktowe.setPytmat3;
import static com.example.p1.kraina1.PytanieTesktowe.setPytpol1;
import static com.example.p1.kraina1.PytanieTesktowe.setPytpol2;
import static com.example.p1.kraina1.PytanieTesktowe.setPytpol3;
import static com.example.p1.kraina1.PytanieTesktowe.setPytprz1;
import static com.example.p1.kraina1.PytanieTesktowe.setPytprz2;
import static com.example.p1.kraina1.PytanieTesktowe.setPytprz3;
import static com.example.p1.kraina1.PytanieTesktowe.setPytzyc1;
import static com.example.p1.kraina1.PytanieTesktowe.setPytzyc2;
import static com.example.p1.kraina1.PytanieTesktowe.setPytzyc3;
import static com.example.p1.kraina1.PytanieZabawne.setpytzab;

public class Menu extends Activity {
    public static int numerMapyMaga = 0;

    public static int numerMapyCzarnoksieznika = 0;
    public static int kon = 0;
    public static int poprawneWylaczenie; // Jezeli 1 nastapilo poprane wyjscie poprawneWylaczenieDwa aktywnosci pomaga poradzic sobie poprawneWylaczenieDwa nieoczekiwanym zamknieciem aplikacji
    public static MediaPlayer mp;
    public static int czyMoznaKontynuowac = 0;
    public static int stanPopupow = 0;
    int soundId;
    double czas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

    }
    public void onStart() {
        super.onStart();
        Menu.poprawneWylaczenie = 0;
        numerMapyMaga = (int) getzm("a", this);
        numerMapyCzarnoksieznika = (int) getzc("b", this);
        czyMoznaKontynuowac = (int) getk("czyMoznaKontynuowac", this);
        punktyMaga = (int) getpm("c", this);
        punktyCzarnoksieznika = (int) getpc("d", this);
        skrzatyMaga = (int) getsm("a", this);
        skrzatyCzarnoksieznika = (int) getsc("b", this);
    }


    public void onPause() {
        super.onPause();
        if (poprawneWylaczenie == 0) {
            Intro.poprawneWylaczenieDwa = 0;
            Intro.adp.run();
        }
    }
    public void onResume() {
        super.onResume();
    }
    public void onStop() {
        super.onStop();
        setzm("a", numerMapyMaga, this);
        setzc("b", numerMapyCzarnoksieznika, this);
        setzm("e", skrzatyMaga, this);
        setzc("f", skrzatyCzarnoksieznika, this);
        setpm("c", punktyMaga, this);
        setpc("d", punktyCzarnoksieznika, this);
        setk("czyMoznaKontynuowac", czyMoznaKontynuowac, this);
    }
    public static void setpm(String key, int value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, Integer.toString(value));
        editor.commit();
    }

    public static int getpm(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);

        String zmss = preferences.getString(key, "0");
        int zms = 0;
        try {
            zms = Integer.parseInt(zmss);
        } catch (NumberFormatException nfe) {}
        return zms;
    }
    public static void setpc(String key, int value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, Integer.toString(value));
        editor.commit();
    }

    public static int getpc(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);

        String zmss = preferences.getString(key, "0");
        int zms = 0;
        try {
            zms = Integer.parseInt(zmss);
        } catch (NumberFormatException nfe) {}
        return zms;
    }
    public static void setzm(String key, int value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, Integer.toString(value));
        editor.commit();
    }

    public static int getzm(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);

        String zmss = preferences.getString(key, "0");
        int zms = 0;
        try {
            zms = Integer.parseInt(zmss);
        } catch (NumberFormatException nfe) {}
        return zms;
    }
    public static void setzc(String key, int value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, Integer.toString(value));
        editor.commit();
    }

    public static int getzc(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zmss = preferences.getString(key, "0");
        int zcs = 0;
        try {
            zcs = Integer.parseInt(zmss);
        } catch (NumberFormatException nfe) {}
        return zcs;
    }
    public static void setsm(String key, int value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, Integer.toString(value));
        editor.commit();
    }

    public static int getsm(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);

        String zmss = preferences.getString(key, "0");
        int sms = 0;
        try {
            sms = Integer.parseInt(zmss);
        } catch (NumberFormatException nfe) {}
        return sms;
    }
    public static void setsc(String key, int value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, Integer.toString(value));
        editor.commit();
    }

    public static int getsc(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zmss = preferences.getString(key, "0");
        int scs = 0;
        try {
            scs = Integer.parseInt(zmss);
        } catch (NumberFormatException nfe) {}
        return scs;
    }
    public static void setk(String key, int value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, Integer.toString(value));
        editor.commit();
    }

    public static int getk(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zmss = preferences.getString(key, "0");
        int scs = 0;
        try {
            scs = Integer.parseInt(zmss);
        } catch (NumberFormatException nfe) {}
        return scs;
    }
    public void nowa(View view) {
        czyMoznaKontynuowac = 1;
        Random generator = new Random();
        kon = 1;
        numerMapyMaga = generator.nextInt(10) + 1;
        numerMapyCzarnoksieznika = generator.nextInt(10) + 1;
        setPytmat1();
        setPytmat2();
        setPytmat3();
        setPytpol1();
        setPytpol2();
        setPytpol3();
        setPytprz1();
        setPytprz2();
        setPytprz3();
        setPytzyc1();
        setPytzyc2();
        setPytzyc3();
        setpyto();
        setreb();
        setpytzab();
        setlit();
        GlownyWidokCzarnoksieznika.setDefaultsc2("etatTogglec2", ON, this);
        GlownyWidokCzarnoksieznika.setDefaultsc4("etatTogglec4", AUTOMATIC, this);
        GlownyWidokCzarnoksieznika.setDefaultsc6("etatTogglec6", ON, this);
        GlownyWidokCzarnoksieznika.setDefaultsc7("etatTogglec7", AUTOMATIC, this);
        GlownyWidokCzarnoksieznika.setDefaultsc8("etatTogglec8", AUTOMATIC, this);
        GlownyWidokCzarnoksieznika.setDefaultsc9("etatTogglec9", ON, this);
        //2
        GlownyWidokCzarnoksieznika.setDefaultsc22("etatTogglec22", ON, this);
        GlownyWidokCzarnoksieznika.setDefaultsc24("etatTogglec24", AUTOMATIC, this);
        GlownyWidokCzarnoksieznika.setDefaultsc26("etatTogglec26", ON, this);
        GlownyWidokCzarnoksieznika.setDefaultsc27("etatTogglec27", AUTOMATIC, this);
        GlownyWidokCzarnoksieznika.setDefaultsc28("etatTogglec28", AUTOMATIC, this);
        GlownyWidokCzarnoksieznika.setDefaultsc29("etatTogglec29", ON, this);
        //3
        GlownyWidokCzarnoksieznika.setDefaultsc32("etatTogglec32", ON, this);
        GlownyWidokCzarnoksieznika.setDefaultsc34("etatTogglec34", AUTOMATIC, this);
        GlownyWidokCzarnoksieznika.setDefaultsc36("etatTogglec36", ON, this);
        GlownyWidokCzarnoksieznika.setDefaultsc37("etatTogglec37", AUTOMATIC, this);
        GlownyWidokCzarnoksieznika.setDefaultsc38("etatTogglec38", AUTOMATIC, this);
        GlownyWidokCzarnoksieznika.setDefaultsc39("etatTogglec39", ON, this);
        //4
        GlownyWidokCzarnoksieznika.setDefaultsc42("etatTogglec42", ON, this);
        GlownyWidokCzarnoksieznika.setDefaultsc44("etatTogglec44", AUTOMATIC, this);
        GlownyWidokCzarnoksieznika.setDefaultsc46("etatTogglec46", ON, this);
        GlownyWidokCzarnoksieznika.setDefaultsc47("etatTogglec47", AUTOMATIC, this);
        GlownyWidokCzarnoksieznika.setDefaultsc48("etatTogglec48", AUTOMATIC, this);
        GlownyWidokCzarnoksieznika.setDefaultsc49("etatTogglec49", ON, this);
        //5
        GlownyWidokCzarnoksieznika.setDefaultsc52("etatTogglec52", ON, this);
        GlownyWidokCzarnoksieznika.setDefaultsc54("etatTogglec54", AUTOMATIC, this);
        GlownyWidokCzarnoksieznika.setDefaultsc56("etatTogglec56", ON, this);
        GlownyWidokCzarnoksieznika.setDefaultsc57("etatTogglec57", AUTOMATIC, this);
        GlownyWidokCzarnoksieznika.setDefaultsc58("etatTogglec58", AUTOMATIC, this);
        GlownyWidokCzarnoksieznika.setDefaultsc59("etatTogglec59", ON, this);
        //6
        GlownyWidokCzarnoksieznika.setDefaultsc62("etatTogglec62", ON, this);
        GlownyWidokCzarnoksieznika.setDefaultsc64("etatTogglec64", AUTOMATIC, this);
        GlownyWidokCzarnoksieznika.setDefaultsc66("etatTogglec66", ON, this);
        GlownyWidokCzarnoksieznika.setDefaultsc67("etatTogglec67", AUTOMATIC, this);
        GlownyWidokCzarnoksieznika.setDefaultsc68("etatTogglec68", AUTOMATIC, this);
        GlownyWidokCzarnoksieznika.setDefaultsc69("etatTogglec69", ON, this);
        punktyCzarnoksieznika = 0;
        GlownyWidokCzarnoksieznika.skrzatyCzarnoksieznika = 0;
        //czar
        GlownyWidokMaga.setDefaults2("etatToggle2", ON, this);
        GlownyWidokMaga.setDefaults4("etatToggle4", AUTOMATIC, this);
        GlownyWidokMaga.setDefaults6("etatToggle6", ON, this);
        GlownyWidokMaga.setDefaults7("etatToggle7", AUTOMATIC, this);
        GlownyWidokMaga.setDefaults8("etatToggle8", AUTOMATIC, this);
        GlownyWidokMaga.setDefaults9("etatToggle9", ON, this);
        //2
        GlownyWidokMaga.setDefaults22("etatToggle22", ON, this);
        GlownyWidokMaga.setDefaults24("etatToggle24", AUTOMATIC, this);
        GlownyWidokMaga.setDefaults26("etatToggle26", ON, this);
        GlownyWidokMaga.setDefaults27("etatToggle27", AUTOMATIC, this);
        GlownyWidokMaga.setDefaults28("etatToggle28", AUTOMATIC, this);
        GlownyWidokMaga.setDefaults29("etatToggle29", ON, this);
        //3
        GlownyWidokMaga.setDefaults32("etatToggle32", ON, this);
        GlownyWidokMaga.setDefaults34("etatToggle34", AUTOMATIC, this);
        GlownyWidokMaga.setDefaults36("etatToggle36", ON, this);
        GlownyWidokMaga.setDefaults37("etatToggle37", AUTOMATIC, this);
        GlownyWidokMaga.setDefaults38("etatToggle38", AUTOMATIC, this);
        GlownyWidokMaga.setDefaults39("etatToggle39", ON, this);
        //4
        GlownyWidokMaga.setDefaults42("etatToggle42", ON, this);
        GlownyWidokMaga.setDefaults44("etatToggle44", AUTOMATIC, this);
        GlownyWidokMaga.setDefaults46("etatToggle46", ON, this);
        GlownyWidokMaga.setDefaults47("etatToggle47", AUTOMATIC, this);
        GlownyWidokMaga.setDefaults48("etatToggle48", AUTOMATIC, this);
        GlownyWidokMaga.setDefaults49("etatToggle49", ON, this);
        //5
        GlownyWidokMaga.setDefaults52("etatToggle52", ON, this);
        GlownyWidokMaga.setDefaults54("etatToggle54", AUTOMATIC, this);
        GlownyWidokMaga.setDefaults56("etatToggle56", ON, this);
        GlownyWidokMaga.setDefaults57("etatToggle57", AUTOMATIC, this);
        GlownyWidokMaga.setDefaults58("etatToggle58", AUTOMATIC, this);
        GlownyWidokMaga.setDefaults59("etatToggle59", ON, this);
        //6
        GlownyWidokMaga.setDefaults62("etatToggle62", ON, this);
        GlownyWidokMaga.setDefaults64("etatToggle64", AUTOMATIC, this);
        GlownyWidokMaga.setDefaults66("etatToggle66", ON, this);
        GlownyWidokMaga.setDefaults67("etatToggle67", AUTOMATIC, this);
        GlownyWidokMaga.setDefaults68("etatToggle68", AUTOMATIC, this);
        GlownyWidokMaga.setDefaults69("etatToggle69", ON, this);
        punktyMaga = 0;
        GlownyWidokMaga.skrzatyMaga = 0;
        // pytania czar
        WyborPytaniaCzarnoksieznik.setDefaultsc1p("etatTogglec1p", ON3, this);
        WyborPytaniaCzarnoksieznik.setDefaultsc2p("etatTogglec2p", ON3, this);
        WyborPytaniaCzarnoksieznik.setDefaultsc3p("etatTogglec3p", ON3, this);
        WyborPytaniaCzarnoksieznik.setDefaultsc4p("etatTogglec4p", ON3, this);
        WyborPytaniaCzarnoksieznik.setDefaultsc5p("etatTogglec5p", ON3, this);
        WyborPytaniaCzarnoksieznik.setDefaultsc6p("etatTogglec6p", ON3, this);
        WyborPytaniaCzarnoksieznik.setDefaultsc7p("etatTogglec7p", ON3m, this);
        WyborPytaniaCzarnoksieznik.setDefaultsc8p("etatTogglec8p", ON3m, this);
        WyborPytaniaCzarnoksieznik.setDefaultsc9p("etatTogglec9p", ON3m, this);
        WyborPytaniaCzarnoksieznik.setDefaultsc10p("etatTogglec10p", ON3m, this);
        WyborPytaniaCzarnoksieznik.setDefaultsc11p("etatTogglec11p", ON3m, this);
        WyborPytaniaCzarnoksieznik.setDefaultsc12p("etatTogglec12p", ON3m, this);
        WyborPytaniaCzarnoksieznik.setDefaultsc13p("etatTogglec13p", ON3z, this);
        WyborPytaniaCzarnoksieznik.setDefaultsc14p("etatTogglec14p", ON3z, this);
        WyborPytaniaCzarnoksieznik.setDefaultsc15p("etatTogglec15p", ON3z, this);
        WyborPytaniaCzarnoksieznik.setDefaultsc16p("etatTogglec16p", ON3z, this);
        WyborPytaniaCzarnoksieznik.setDefaultsc17p("etatTogglec17p", ON3z, this);
        WyborPytaniaCzarnoksieznik.setDefaultsc18p("etatTogglec18p", ON3z, this);
        WyborPytaniaCzarnoksieznik.setDefaultsc19p("etatTogglec19p", ON3p, this);
        WyborPytaniaCzarnoksieznik.setDefaultsc20p("etatTogglec20p", ON3p, this);
        WyborPytaniaCzarnoksieznik.setDefaultsc21p("etatTogglec21p", ON3p, this);
        WyborPytaniaCzarnoksieznik.setDefaultsc22p("etatTogglec22p", ON3p, this);
        WyborPytaniaCzarnoksieznik.setDefaultsc23p("etatTogglec23p", ON3p, this);
        WyborPytaniaCzarnoksieznik.setDefaultsc24p("etatTogglec24p", ON3p, this);
        WyborPytaniaCzarnoksieznik.setDefaultsca1p("etatToggleac1p", ON3, this);
        WyborPytaniaCzarnoksieznik.setDefaultsca2p("etatToggleac2p", ON3, this);
        WyborPytaniaCzarnoksieznik.setDefaultsca3p("etatToggleac3p", ON3, this);
        WyborPytaniaCzarnoksieznik.setDefaultsca4p("etatToggleac4p", ON3, this);
        WyborPytaniaCzarnoksieznik.setDefaultsca5p("etatToggleac5p", ON3, this);
        WyborPytaniaCzarnoksieznik.setDefaultsca6p("etatToggleac6p", ON3, this);
        WyborPytaniaCzarnoksieznik.setDefaultsca7p("etatToggleac7p", ON3m, this);
        WyborPytaniaCzarnoksieznik.setDefaultsca8p("etatToggleac8p", ON3m, this);
        WyborPytaniaCzarnoksieznik.setDefaultsca9p("etatToggleac9p", ON3m, this);
        WyborPytaniaCzarnoksieznik.setDefaultsca10p("etatToggleac10p", ON3m, this);
        WyborPytaniaCzarnoksieznik.setDefaultsca11p("etatToggleac11p", ON3m, this);
        WyborPytaniaCzarnoksieznik.setDefaultsca12p("etatToggleac12p", ON3m, this);
        WyborPytaniaCzarnoksieznik.setDefaultsca13p("etatToggleac13p", ON3z, this);
        WyborPytaniaCzarnoksieznik.setDefaultsca14p("etatToggleac14p", ON3z, this);
        WyborPytaniaCzarnoksieznik.setDefaultsca15p("etatToggleac15p", ON3z, this);
        WyborPytaniaCzarnoksieznik.setDefaultsca16p("etatToggleac16p", ON3z, this);
        WyborPytaniaCzarnoksieznik.setDefaultsca17p("etatToggleac17p", ON3z, this);
        WyborPytaniaCzarnoksieznik.setDefaultsca18p("etatToggleac18p", ON3z, this);
        WyborPytaniaCzarnoksieznik.setDefaultsca19p("etatToggleac19p", ON3p, this);
        WyborPytaniaCzarnoksieznik.setDefaultsca20p("etatToggleac20p", ON3p, this);
        WyborPytaniaCzarnoksieznik.setDefaultsca21p("etatToggleac21p", ON3p, this);
        WyborPytaniaCzarnoksieznik.setDefaultsca22p("etatToggleac22p", ON3p, this);
        WyborPytaniaCzarnoksieznik.setDefaultsca23p("etatToggleac23p", ON3p, this);
        WyborPytaniaCzarnoksieznik.setDefaultsca24p("etatToggleac24p", ON3p, this);
        // pytania mag
        WyborPytaniaMag.setDefaults1p("etatToggle1p", ON3, this);
        WyborPytaniaMag.setDefaults2p("etatToggle2p", ON3, this);
        WyborPytaniaMag.setDefaults3p("etatToggle3p", ON3, this);
        WyborPytaniaMag.setDefaults4p("etatToggle4p", ON3, this);
        WyborPytaniaMag.setDefaults5p("etatToggle5p", ON3, this);
        WyborPytaniaMag.setDefaults6p("etatToggle6p", ON3, this);
        WyborPytaniaMag.setDefaults7p("etatToggle7p", ON3m, this);
        WyborPytaniaMag.setDefaults8p("etatToggle8p", ON3m, this);
        WyborPytaniaMag.setDefaults9p("etatToggle9p", ON3m, this);
        WyborPytaniaMag.setDefaults10p("etatToggle10p", ON3m, this);
        WyborPytaniaMag.setDefaults11p("etatToggle11p", ON3m, this);
        WyborPytaniaMag.setDefaults12p("etatToggle12p", ON3m, this);
        WyborPytaniaMag.setDefaults13p("etatToggle13p", ON3z, this);
        WyborPytaniaMag.setDefaults14p("etatToggle14p", ON3z, this);
        WyborPytaniaMag.setDefaults15p("etatToggle15p", ON3z, this);
        WyborPytaniaMag.setDefaults16p("etatToggle16p", ON3z, this);
        WyborPytaniaMag.setDefaults17p("etatToggle17p", ON3z, this);
        WyborPytaniaMag.setDefaults18p("etatToggle18p", ON3z, this);
        WyborPytaniaMag.setDefaults19p("etatToggle19p", ON3p, this);
        WyborPytaniaMag.setDefaults20p("etatToggle20p", ON3p, this);
        WyborPytaniaMag.setDefaults21p("etatToggle21p", ON3p, this);
        WyborPytaniaMag.setDefaults22p("etatToggle22p", ON3p, this);
        WyborPytaniaMag.setDefaults23p("etatToggle23p", ON3p, this);
        WyborPytaniaMag.setDefaults24p("etatToggle24p", ON3p, this);
        WyborPytaniaMag.setDefaultsa1p("etatTogglea1p", ON3, this);
        WyborPytaniaMag.setDefaultsa2p("etatTogglea2p", ON3, this);
        WyborPytaniaMag.setDefaultsa3p("etatTogglea3p", ON3, this);
        WyborPytaniaMag.setDefaultsa4p("etatTogglea4p", ON3, this);
        WyborPytaniaMag.setDefaultsa5p("etatTogglea5p", ON3, this);
        WyborPytaniaMag.setDefaultsa6p("etatTogglea6p", ON3, this);
        WyborPytaniaMag.setDefaultsa7p("etatTogglea7p", ON3m, this);
        WyborPytaniaMag.setDefaultsa8p("etatTogglea8p", ON3m, this);
        WyborPytaniaMag.setDefaultsa9p("etatTogglea9p", ON3m, this);
        WyborPytaniaMag.setDefaultsa10p("etatTogglea10p", ON3m, this);
        WyborPytaniaMag.setDefaultsa11p("etatTogglea11p", ON3m, this);
        WyborPytaniaMag.setDefaultsa12p("etatTogglea12p", ON3m, this);
        WyborPytaniaMag.setDefaultsa13p("etatTogglea13p", ON3z, this);
        WyborPytaniaMag.setDefaultsa14p("etatTogglea14p", ON3z, this);
        WyborPytaniaMag.setDefaultsa15p("etatTogglea15p", ON3z, this);
        WyborPytaniaMag.setDefaultsa16p("etatTogglea16p", ON3z, this);
        WyborPytaniaMag.setDefaultsa17p("etatTogglea17p", ON3z, this);
        WyborPytaniaMag.setDefaultsa18p("etatTogglea18p", ON3z, this);
        WyborPytaniaMag.setDefaultsa19p("etatTogglea19p", ON3p, this);
        WyborPytaniaMag.setDefaultsa20p("etatTogglea20p", ON3p, this);
        WyborPytaniaMag.setDefaultsa21p("etatTogglea21p", ON3p, this);
        WyborPytaniaMag.setDefaultsa22p("etatTogglea22p", ON3p, this);
        WyborPytaniaMag.setDefaultsa23p("etatTogglea23p", ON3p, this);
        WyborPytaniaMag.setDefaultsa24p("etatTogglea24p", ON3p, this);
        GlownyWidokMaga.setsbtn1("sbtn1", AUTOMATIC, this);
        GlownyWidokMaga.setsbtn2("sbtn2", AUTOMATIC, this);
        GlownyWidokMaga.setbtn1("btn1", ON2, this);
        GlownyWidokMaga.setbtn2("btn2", ON2, this);
        GlownyWidokMaga.setbtn7("btn7", ON2, this);
        GlownyWidokMaga.setbtn8("btn8", ON2, this);
        GlownyWidokMaga.setbtn9("btn9", ON2, this);
        GlownyWidokMaga.setbtn10("btn10", ON2, this);
        GlownyWidokMaga.setbtn11("btn11", ON2, this);
        GlownyWidokMaga.setbtn12("btn12", ON2, this);
        GlownyWidokMaga.setbtn13("btn13", ON2, this);
        GlownyWidokMaga.setbtn14("btn14", ON2, this);
        GlownyWidokMaga.setbtn15("btn15", ON2, this);
        GlownyWidokMaga.setbtn16("btn16", ON2, this);
        GlownyWidokMaga.setbtn17("btn17", ON2, this);
        GlownyWidokMaga.setbtn18("btn18", ON2, this);
        GlownyWidokMaga.setbtn19("btn19", ON2, this);
        GlownyWidokMaga.setbtn20("btn20", ON2, this);
        GlownyWidokMaga.setbtn21("btn21", ON2, this);
        GlownyWidokMaga.setbtn22("btn22", ON2, this);
        GlownyWidokMaga.setbtn23("btn23", ON2, this);
        GlownyWidokMaga.setbtn24("btn24", ON2, this);
        GlownyWidokMaga.setbtn25("btn25", ON2, this);
        GlownyWidokMaga.setbtn26("btn26", ON2, this);
        GlownyWidokMaga.setbtn27("btn27", ON2, this);
        GlownyWidokMaga.setbtn28("btn28", ON2, this);
        GlownyWidokMaga.setbtn29("btn29", ON2, this);
        GlownyWidokMaga.setbtn30("btn30", ON2, this);
        GlownyWidokCzarnoksieznika.setsbtncc1("sbtncc1", AUTOMATIC, this);
        GlownyWidokCzarnoksieznika.setsbtncc2("sbtncc2", AUTOMATIC, this);
        GlownyWidokCzarnoksieznika.setbtnc1("btnc1", ON2, this);
        GlownyWidokCzarnoksieznika.setbtnc2("btnc2", ON2, this);
        GlownyWidokCzarnoksieznika.setbtnc7("btnc7", ON2, this);
        GlownyWidokCzarnoksieznika.setbtnc8("btnc8", ON2, this);
        GlownyWidokCzarnoksieznika.setbtnc9("btnc9", ON2, this);
        GlownyWidokCzarnoksieznika.setbtnc10("btnc10", ON2, this);
        GlownyWidokCzarnoksieznika.setbtnc11("btnc11", ON2, this);
        GlownyWidokCzarnoksieznika.setbtnc12("btnc12", ON2, this);
        GlownyWidokCzarnoksieznika.setbtnc13("btnc13", ON2, this);
        GlownyWidokCzarnoksieznika.setbtnc14("btnc14", ON2, this);
        GlownyWidokCzarnoksieznika.setbtnc15("btnc15", ON2, this);
        GlownyWidokCzarnoksieznika.setbtnc16("btnc16", ON2, this);
        GlownyWidokCzarnoksieznika.setbtnc17("btnc17", ON2, this);
        GlownyWidokCzarnoksieznika.setbtnc18("btnc18", ON2, this);
        GlownyWidokCzarnoksieznika.setbtnc19("btnc19", ON2, this);
        GlownyWidokCzarnoksieznika.setbtnc20("btnc20", ON2, this);
        GlownyWidokCzarnoksieznika.setbtnc21("btnc21", ON2, this);
        GlownyWidokCzarnoksieznika.setbtnc22("btnc22", ON2, this);
        GlownyWidokCzarnoksieznika.setbtnc23("btnc23", ON2, this);
        GlownyWidokCzarnoksieznika.setbtnc24("btnc24", ON2, this);
        GlownyWidokCzarnoksieznika.setbtnc25("btnc25", ON2, this);
        GlownyWidokCzarnoksieznika.setbtnc26("btnc26", ON2, this);
        GlownyWidokCzarnoksieznika.setbtnc27("btnc27", ON2, this);
        GlownyWidokCzarnoksieznika.setbtnc28("btnc28", ON2, this);
        GlownyWidokCzarnoksieznika.setbtnc29("btnc29", ON2, this);
        GlownyWidokCzarnoksieznika.setbtnc30("btnc30", ON2, this);
        GlownyWidokCzarnoksieznika.sbc1 = 0;
        GlownyWidokCzarnoksieznika.sbc2 = 0;
        GlownyWidokMaga.sb1 = 0;
        GlownyWidokMaga.sb2 = 0;
        GlownyWidokCzarnoksieznika.gc = 1;
        GlownyWidokMaga.gm = 1;
        Intent intent = new Intent(Menu.this, GlownyWidokMaga.class);
        Menu.poprawneWylaczenie = 1;
        startActivity(intent);

    }

    public void kontynuacja(View view) {
        if (czyMoznaKontynuowac == 0) {
            this.nowa(view);
        }
        skrzatyMaga = getsm("bbbbm", this);
        skrzatyCzarnoksieznika = getsc("bbbbc", this);
        setPytmat1();
        setPytmat2();
        setPytmat3();
        setPytpol1();
        setPytpol2();
        setPytpol3();
        setPytprz1();
        setPytprz2();
        setPytprz3();
        setPytzyc1();
        setPytzyc2();
        setPytzyc3();
        setpyto();
        setreb();
        setpytzab();
        setlit();
        for (int i = 0; i < 8; i++) {
            if (PytanieTesktowe.getzaj(i + "pol1").equals("Z"))
                PytanieTesktowe.pytpol1[i][5] = PytanieTesktowe.getzaj(i + "pol1");
        }
        for (int i = 0; i < 8; i++) {
            if (PytanieTesktowe.getzaj(i + "pol2").equals("Z"))
                PytanieTesktowe.pytpol2[i][5] = PytanieTesktowe.getzaj(i + "pol2");
        }
        for (int i = 0; i < 8; i++) {
            if (PytanieTesktowe.getzaj(i + "pol3").equals("Z"))
                PytanieTesktowe.pytpol3[i][5] = PytanieTesktowe.getzaj(i + "pol3");
        }
        for (int i = 0; i < 8; i++) {
            if (PytanieTesktowe.getzaj(i + "mat1").equals("Z"))
                PytanieTesktowe.pytmat1[i][5] = PytanieTesktowe.getzaj(i + "mat1");
        }
        for (int i = 0; i < 8; i++) {
            if (PytanieTesktowe.getzaj(i + "mat2").equals("Z"))
                PytanieTesktowe.pytmat2[i][5] = PytanieTesktowe.getzaj(i + "mat2");
        }
        for (int i = 0; i < 8; i++) {
            if (PytanieTesktowe.getzaj(i + "mat3").equals("Z"))
                PytanieTesktowe.pytmat3[i][5] = PytanieTesktowe.getzaj(i + "mat3");
        }
        for (int i = 0; i < 8; i++) {
            if (PytanieTesktowe.getzaj(i + "prz1").equals("Z"))
                PytanieTesktowe.pytprz1[i][5] = PytanieTesktowe.getzaj(i + "prz1");
        }
        for (int i = 0; i < 8; i++) {
            if (PytanieTesktowe.getzaj(i + "prz2").equals("Z"))
                PytanieTesktowe.pytprz2[i][5] = PytanieTesktowe.getzaj(i + "prz2");
        }
        for (int i = 0; i < 8; i++) {
            if (PytanieTesktowe.getzaj(i + "prz3").equals("Z"))
                PytanieTesktowe.pytprz3[i][5] = PytanieTesktowe.getzaj(i + "prz3");
        }
        for (int i = 0; i < 8; i++) {
            if (PytanieTesktowe.getzaj(i + "zyc1").equals("Z"))
                PytanieTesktowe.pytzyc1[i][5] = PytanieTesktowe.getzaj(i + "zyc1");
        }
        for (int i = 0; i < 8; i++) {
            if (PytanieTesktowe.getzaj(i + "zyc2").equals("Z"))
                PytanieTesktowe.pytzyc2[i][5] = PytanieTesktowe.getzaj(i + "zyc2");
        }
        for (int i = 0; i < 8; i++) {
            if (PytanieTesktowe.getzaj(i + "zyc3").equals("Z"))
                PytanieTesktowe.pytzyc3[i][5] = PytanieTesktowe.getzaj(i + "zyc3");
        }
        for (int i = 0; i < 11; i++) {
            if (PytanieZabawne.getzaj(i + "zab").equals("Z"))
                PytanieZabawne.pytzab[i][1] = PytanieTesktowe.getzaj(i + "zab");
        }
        for (int i = 0; i < 13; i++) {
            if (PytanieRebusowe.getzaj(i + "reb").equals("Z"))
                PytanieRebusowe.poprawne[i][5] = PytanieTesktowe.getzaj(i + "reb");
        }
        for (int i = 0; i < 12; i++) {
            if (PytanieObrazkowe.getzaj(i + "zab").equals("Z"))
                PytanieObrazkowe.pytobr[i][6] = PytanieTesktowe.getzaj(i + "obr");
        }
        for (int i = 0; i < 19; i++) {
            if (PytanieTesktowe.getzaj(i + "lit").equals("Z"))
                PytanieLiterkowe.poprawne[i][5] = PytanieTesktowe.getzaj(i + "lit");
        }
        if (r == 1) {
            Intent intent = new Intent(Menu.this, GlownyWidokMaga.class);
            Menu.poprawneWylaczenie = 1;
            startActivity(intent);
        } else {
            Intent intentc = new Intent(Menu.this, GlownyWidokCzarnoksieznika.class);
            Menu.poprawneWylaczenie = 1;
            startActivity(intentc);
        }
    }
    public void wyjscie(View viev) {
        this.finish();
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        int yourId = android.os.Process.myPid();
        android.os.Process.killProcess(yourId);
        Menu.poprawneWylaczenie = 1;
        startActivity(intent);

    }
    public void instrukcja(View view) {
        Intent intent = new Intent(Menu.this, InstrukcjaPoczatek.class);
        Menu.poprawneWylaczenie = 1;
        startActivity(intent);
    }
    public void autorzy(View view) {
        Intent intent = new Intent(Menu.this, Autrorzy.class);
        Menu.poprawneWylaczenie = 1;
        startActivity(intent);
    }
    public void opcje(View view) {
        Intent intent = new Intent(Menu.this, Opcje.class);
        Menu.poprawneWylaczenie = 1;
        startActivity(intent);
    }
// MODULY TESTOWE
     public void testportal(View view) {
         Random generator = new Random();
         kon=1;
         numerMapyMaga=generator.nextInt(10)+1;
         numerMapyCzarnoksieznika=generator.nextInt(10)+1;
         setPytmat1();
         setPytmat2();
         setPytmat3();
         setPytpol1();
         setPytpol2();
         setPytpol3();
         setPytprz1();
         setPytprz2();
         setPytprz3();
         setPytzyc1();
         setPytzyc2();
         setPytzyc3();
         GlownyWidokCzarnoksieznika.setDefaultsc2("etatTogglec2", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc4("etatTogglec4", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc6("etatTogglec6", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc7("etatTogglec7", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc8("etatTogglec8", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc9("etatTogglec9", ON, this);
         //2
         GlownyWidokCzarnoksieznika.setDefaultsc22("etatTogglec22", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc24("etatTogglec24", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc26("etatTogglec26", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc27("etatTogglec27", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc28("etatTogglec28", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc29("etatTogglec29", ON, this);
         //3
         GlownyWidokCzarnoksieznika.setDefaultsc32("etatTogglec32", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc34("etatTogglec34", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc36("etatTogglec36", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc37("etatTogglec37", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc38("etatTogglec38", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc39("etatTogglec39", ON, this);
         //4
         GlownyWidokCzarnoksieznika.setDefaultsc42("etatTogglec42", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc44("etatTogglec44", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc46("etatTogglec46", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc47("etatTogglec47", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc48("etatTogglec48", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc49("etatTogglec49", ON, this);
         //5
         GlownyWidokCzarnoksieznika.setDefaultsc52("etatTogglec52", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc54("etatTogglec54", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc56("etatTogglec56", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc57("etatTogglec57", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc58("etatTogglec58", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc59("etatTogglec59", ON, this);
         //6
         GlownyWidokCzarnoksieznika.setDefaultsc62("etatTogglec62", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc64("etatTogglec64", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc66("etatTogglec66", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc67("etatTogglec67", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc68("etatTogglec68", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc69("etatTogglec69", ON, this);
         punktyCzarnoksieznika=0;
         GlownyWidokCzarnoksieznika.skrzatyCzarnoksieznika=0;
         //czar
         GlownyWidokMaga.setDefaults2("etatToggle2", ON, this);
         GlownyWidokMaga.setDefaults4("etatToggle4", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults6("etatToggle6", ON, this);
         GlownyWidokMaga.setDefaults7("etatToggle7", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults8("etatToggle8", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults9("etatToggle9", ON, this);
         //2
         GlownyWidokMaga.setDefaults22("etatToggle22", ON, this);
         GlownyWidokMaga.setDefaults24("etatToggle24", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults26("etatToggle26", ON, this);
         GlownyWidokMaga.setDefaults27("etatToggle27", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults28("etatToggle28", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults29("etatToggle29", ON, this);
         //3
         GlownyWidokMaga.setDefaults32("etatToggle32", ON, this);
         GlownyWidokMaga.setDefaults34("etatToggle34", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults36("etatToggle36", ON, this);
         GlownyWidokMaga.setDefaults37("etatToggle37", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults38("etatToggle38", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults39("etatToggle39", ON, this);
         //4
         GlownyWidokMaga.setDefaults42("etatToggle42", ON, this);
         GlownyWidokMaga.setDefaults44("etatToggle44", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults46("etatToggle46", ON, this);
         GlownyWidokMaga.setDefaults47("etatToggle47", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults48("etatToggle48", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults49("etatToggle49", ON, this);
         //5
         GlownyWidokMaga.setDefaults52("etatToggle52", ON, this);
         GlownyWidokMaga.setDefaults54("etatToggle54", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults56("etatToggle56", ON, this);
         GlownyWidokMaga.setDefaults57("etatToggle57", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults58("etatToggle58", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults59("etatToggle59", ON, this);
         //6
         GlownyWidokMaga.setDefaults62("etatToggle62", ON, this);
         GlownyWidokMaga.setDefaults64("etatToggle64", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults66("etatToggle66", ON, this);
         GlownyWidokMaga.setDefaults67("etatToggle67", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults68("etatToggle68", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults69("etatToggle69", ON, this);
         punktyMaga=0;
         GlownyWidokMaga.skrzatyMaga=0;
         // pytania czar
         WyborPytaniaCzarnoksieznik.setDefaultsc1p("etatTogglec1p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc2p("etatTogglec2p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc3p("etatTogglec3p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc4p("etatTogglec4p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc5p("etatTogglec5p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc6p("etatTogglec6p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc7p("etatTogglec7p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc8p("etatTogglec8p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc9p("etatTogglec9p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc10p("etatTogglec10p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc11p("etatTogglec11p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc12p("etatTogglec12p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc13p("etatTogglec13p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc14p("etatTogglec14p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc15p("etatTogglec15p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc16p("etatTogglec16p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc17p("etatTogglec17p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc18p("etatTogglec18p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc19p("etatTogglec19p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc20p("etatTogglec20p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc21p("etatTogglec21p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc22p("etatTogglec22p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc23p("etatTogglec23p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc24p("etatTogglec24p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca1p("etatToggleac1p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca2p("etatToggleac2p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca3p("etatToggleac3p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca4p("etatToggleac4p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca5p("etatToggleac5p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca6p("etatToggleac6p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca7p("etatToggleac7p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca8p("etatToggleac8p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca9p("etatToggleac9p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca10p("etatToggleac10p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca11p("etatToggleac11p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca12p("etatToggleac12p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca13p("etatToggleac13p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca14p("etatToggleac14p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca15p("etatToggleac15p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca16p("etatToggleac16p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca17p("etatToggleac17p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca18p("etatToggleac18p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca19p("etatToggleac19p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca20p("etatToggleac20p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca21p("etatToggleac21p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca22p("etatToggleac22p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca23p("etatToggleac23p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca24p("etatToggleac24p", ON, this);
         // pytania mag
         WyborPytaniaMag.setDefaults1p("etatToggle1p", ON, this);
         WyborPytaniaMag.setDefaults2p("etatToggle2p", ON, this);
         WyborPytaniaMag.setDefaults3p("etatToggle3p", ON, this);
         WyborPytaniaMag.setDefaults4p("etatToggle4p", ON, this);
         WyborPytaniaMag.setDefaults5p("etatToggle5p", ON, this);
         WyborPytaniaMag.setDefaults6p("etatToggle6p", ON, this);
         WyborPytaniaMag.setDefaults7p("etatToggle7p", ON, this);
         WyborPytaniaMag.setDefaults8p("etatToggle8p", ON, this);
         WyborPytaniaMag.setDefaults9p("etatToggle9p", ON, this);
         WyborPytaniaMag.setDefaults10p("etatToggle10p", ON, this);
         WyborPytaniaMag.setDefaults11p("etatToggle11p", ON, this);
         WyborPytaniaMag.setDefaults12p("etatToggle12p", ON, this);
         WyborPytaniaMag.setDefaults13p("etatToggle13p", ON, this);
         WyborPytaniaMag.setDefaults14p("etatToggle14p", ON, this);
         WyborPytaniaMag.setDefaults15p("etatToggle15p", ON, this);
         WyborPytaniaMag.setDefaults16p("etatToggle16p", ON, this);
         WyborPytaniaMag.setDefaults17p("etatToggle17p", ON, this);
         WyborPytaniaMag.setDefaults18p("etatToggle18p", ON, this);
         WyborPytaniaMag.setDefaults19p("etatToggle19p", ON, this);
         WyborPytaniaMag.setDefaults20p("etatToggle20p", ON, this);
         WyborPytaniaMag.setDefaults21p("etatToggle21p", ON, this);
         WyborPytaniaMag.setDefaults22p("etatToggle22p", ON, this);
         WyborPytaniaMag.setDefaults23p("etatToggle23p", ON, this);
         WyborPytaniaMag.setDefaults24p("etatToggle24p", ON, this);
         WyborPytaniaMag.setDefaultsa1p("etatTogglea1p", ON, this);
         WyborPytaniaMag.setDefaultsa2p("etatTogglea2p", ON, this);
         WyborPytaniaMag.setDefaultsa3p("etatTogglea3p", ON, this);
         WyborPytaniaMag.setDefaultsa4p("etatTogglea4p", ON, this);
         WyborPytaniaMag.setDefaultsa5p("etatTogglea5p", ON, this);
         WyborPytaniaMag.setDefaultsa6p("etatTogglea6p", ON, this);
         WyborPytaniaMag.setDefaultsa7p("etatTogglea7p", ON, this);
         WyborPytaniaMag.setDefaultsa8p("etatTogglea8p", ON, this);
         WyborPytaniaMag.setDefaultsa9p("etatTogglea9p", ON, this);
         WyborPytaniaMag.setDefaultsa10p("etatTogglea10p", ON, this);
         WyborPytaniaMag.setDefaultsa11p("etatTogglea11p", ON, this);
         WyborPytaniaMag.setDefaultsa12p("etatTogglea12p", ON, this);
         WyborPytaniaMag.setDefaultsa13p("etatTogglea13p", ON, this);
         WyborPytaniaMag.setDefaultsa14p("etatTogglea14p", ON, this);
         WyborPytaniaMag.setDefaultsa15p("etatTogglea15p", ON, this);
         WyborPytaniaMag.setDefaultsa16p("etatTogglea16p", ON, this);
         WyborPytaniaMag.setDefaultsa17p("etatTogglea17p", ON, this);
         WyborPytaniaMag.setDefaultsa18p("etatTogglea18p", ON, this);
         WyborPytaniaMag.setDefaultsa19p("etatTogglea19p", ON, this);
         WyborPytaniaMag.setDefaultsa20p("etatTogglea20p", ON, this);
         WyborPytaniaMag.setDefaultsa21p("etatTogglea21p", ON, this);
         WyborPytaniaMag.setDefaultsa22p("etatTogglea22p", ON, this);
         WyborPytaniaMag.setDefaultsa23p("etatTogglea23p", ON, this);
         WyborPytaniaMag.setDefaultsa24p("etatTogglea24p", ON, this);
         GlownyWidokMaga.setsbtn1("sbtn1", AUTOMATIC, this);
         GlownyWidokMaga.setsbtn2("sbtn1", AUTOMATIC, this);
         GlownyWidokMaga.setbtn1("btn1", ON2, this);
         GlownyWidokMaga.setbtn2("btn2", ON2, this);
         GlownyWidokMaga.setbtn7("btn7", ON2, this);
         GlownyWidokMaga.setbtn8("btn8", ON2, this);
         GlownyWidokMaga.setbtn9("btn9", ON2, this);
         GlownyWidokMaga.setbtn10("btn10", ON2, this);
         GlownyWidokMaga.setbtn11("btn11", ON2, this);
         GlownyWidokMaga.setbtn12("btn12", ON2, this);
         GlownyWidokMaga.setbtn13("btn13", ON2, this);
         GlownyWidokMaga.setbtn14("btn14", ON2, this);
         GlownyWidokMaga.setbtn15("btn15", ON2, this);
         GlownyWidokMaga.setbtn16("btn16", ON2, this);
         GlownyWidokMaga.setbtn17("btn17", ON2, this);
         GlownyWidokMaga.setbtn18("btn18", ON2, this);
         GlownyWidokMaga.setbtn19("btn19", ON2, this);
         GlownyWidokMaga.setbtn20("btn20", ON2, this);
         GlownyWidokMaga.setbtn21("btn21", ON2, this);
         GlownyWidokMaga.setbtn22("btn22", ON2, this);
         GlownyWidokMaga.setbtn23("btn23", ON2, this);
         GlownyWidokMaga.setbtn24("btn24", ON2, this);
         GlownyWidokMaga.setbtn25("btn25", ON2, this);
         GlownyWidokMaga.setbtn26("btn26", ON2, this);
         GlownyWidokMaga.setbtn27("btn27", ON2, this);
         GlownyWidokMaga.setbtn28("btn28", ON2, this);
         GlownyWidokMaga.setbtn29("btn29", ON2, this);
         GlownyWidokMaga.setbtn30("btn30", ON2, this);
         GlownyWidokCzarnoksieznika.setsbtncc1("sbtncc1", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setsbtncc2("sbtncc2", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setbtnc1("btnc1", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc2("btnc2", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc7("btnc7", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc8("btnc8", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc9("btnc9", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc10("btnc10", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc11("btnc11", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc12("btnc12", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc13("btnc13", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc14("btnc14", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc15("btnc15", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc16("btnc16", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc17("btnc17", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc18("btnc18", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc19("btnc19", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc20("btnc20", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc21("btnc21", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc22("btnc22", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc23("btnc23", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc24("btnc24", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc25("btnc25", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc26("btnc26", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc27("btnc27", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc28("btnc28", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc29("btnc29", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc30("btnc30", ON2, this);
         GlownyWidokCzarnoksieznika.sbc1=0;
         GlownyWidokCzarnoksieznika.sbc2=0;
         GlownyWidokMaga.sb1=0;
         GlownyWidokMaga.sb2=0;
         GlownyWidokCzarnoksieznika.gc=1;
         GlownyWidokMaga.gm=1;
         Intent intent = new Intent(Menu.this, WyborPortalu.class);
         Menu.poprawneWylaczenie=1; startActivity(intent);

     }
     public void testrebus(View view) {
         Random generator = new Random();
         kon=1;
         numerMapyMaga=generator.nextInt(10)+1;
         numerMapyCzarnoksieznika=generator.nextInt(10)+1;
         setPytmat1();
         setPytmat2();
         setPytmat3();
         setPytpol1();
         setPytpol2();
         setPytpol3();
         setPytprz1();
         setPytprz2();
         setPytprz3();
         setPytzyc1();
         setPytzyc2();
         setPytzyc3();
         GlownyWidokCzarnoksieznika.setDefaultsc2("etatTogglec2", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc4("etatTogglec4", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc6("etatTogglec6", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc7("etatTogglec7", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc8("etatTogglec8", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc9("etatTogglec9", ON, this);
         //2
         GlownyWidokCzarnoksieznika.setDefaultsc22("etatTogglec22", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc24("etatTogglec24", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc26("etatTogglec26", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc27("etatTogglec27", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc28("etatTogglec28", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc29("etatTogglec29", ON, this);
         //3
         GlownyWidokCzarnoksieznika.setDefaultsc32("etatTogglec32", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc34("etatTogglec34", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc36("etatTogglec36", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc37("etatTogglec37", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc38("etatTogglec38", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc39("etatTogglec39", ON, this);
         //4
         GlownyWidokCzarnoksieznika.setDefaultsc42("etatTogglec42", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc44("etatTogglec44", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc46("etatTogglec46", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc47("etatTogglec47", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc48("etatTogglec48", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc49("etatTogglec49", ON, this);
         //5
         GlownyWidokCzarnoksieznika.setDefaultsc52("etatTogglec52", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc54("etatTogglec54", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc56("etatTogglec56", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc57("etatTogglec57", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc58("etatTogglec58", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc59("etatTogglec59", ON, this);
         //6
         GlownyWidokCzarnoksieznika.setDefaultsc62("etatTogglec62", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc64("etatTogglec64", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc66("etatTogglec66", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc67("etatTogglec67", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc68("etatTogglec68", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc69("etatTogglec69", ON, this);
         punktyCzarnoksieznika=0;
         GlownyWidokCzarnoksieznika.skrzatyCzarnoksieznika=0;
         //czar
         GlownyWidokMaga.setDefaults2("etatToggle2", ON, this);
         GlownyWidokMaga.setDefaults4("etatToggle4", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults6("etatToggle6", ON, this);
         GlownyWidokMaga.setDefaults7("etatToggle7", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults8("etatToggle8", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults9("etatToggle9", ON, this);
         //2
         GlownyWidokMaga.setDefaults22("etatToggle22", ON, this);
         GlownyWidokMaga.setDefaults24("etatToggle24", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults26("etatToggle26", ON, this);
         GlownyWidokMaga.setDefaults27("etatToggle27", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults28("etatToggle28", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults29("etatToggle29", ON, this);
         //3
         GlownyWidokMaga.setDefaults32("etatToggle32", ON, this);
         GlownyWidokMaga.setDefaults34("etatToggle34", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults36("etatToggle36", ON, this);
         GlownyWidokMaga.setDefaults37("etatToggle37", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults38("etatToggle38", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults39("etatToggle39", ON, this);
         //4
         GlownyWidokMaga.setDefaults42("etatToggle42", ON, this);
         GlownyWidokMaga.setDefaults44("etatToggle44", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults46("etatToggle46", ON, this);
         GlownyWidokMaga.setDefaults47("etatToggle47", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults48("etatToggle48", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults49("etatToggle49", ON, this);
         //5
         GlownyWidokMaga.setDefaults52("etatToggle52", ON, this);
         GlownyWidokMaga.setDefaults54("etatToggle54", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults56("etatToggle56", ON, this);
         GlownyWidokMaga.setDefaults57("etatToggle57", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults58("etatToggle58", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults59("etatToggle59", ON, this);
         //6
         GlownyWidokMaga.setDefaults62("etatToggle62", ON, this);
         GlownyWidokMaga.setDefaults64("etatToggle64", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults66("etatToggle66", ON, this);
         GlownyWidokMaga.setDefaults67("etatToggle67", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults68("etatToggle68", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults69("etatToggle69", ON, this);
         punktyMaga=0;
         GlownyWidokMaga.skrzatyMaga=0;
         // pytania czar
         WyborPytaniaCzarnoksieznik.setDefaultsc1p("etatTogglec1p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc2p("etatTogglec2p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc3p("etatTogglec3p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc4p("etatTogglec4p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc5p("etatTogglec5p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc6p("etatTogglec6p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc7p("etatTogglec7p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc8p("etatTogglec8p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc9p("etatTogglec9p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc10p("etatTogglec10p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc11p("etatTogglec11p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc12p("etatTogglec12p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc13p("etatTogglec13p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc14p("etatTogglec14p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc15p("etatTogglec15p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc16p("etatTogglec16p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc17p("etatTogglec17p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc18p("etatTogglec18p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc19p("etatTogglec19p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc20p("etatTogglec20p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc21p("etatTogglec21p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc22p("etatTogglec22p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc23p("etatTogglec23p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc24p("etatTogglec24p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca1p("etatToggleac1p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca2p("etatToggleac2p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca3p("etatToggleac3p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca4p("etatToggleac4p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca5p("etatToggleac5p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca6p("etatToggleac6p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca7p("etatToggleac7p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca8p("etatToggleac8p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca9p("etatToggleac9p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca10p("etatToggleac10p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca11p("etatToggleac11p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca12p("etatToggleac12p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca13p("etatToggleac13p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca14p("etatToggleac14p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca15p("etatToggleac15p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca16p("etatToggleac16p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca17p("etatToggleac17p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca18p("etatToggleac18p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca19p("etatToggleac19p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca20p("etatToggleac20p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca21p("etatToggleac21p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca22p("etatToggleac22p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca23p("etatToggleac23p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca24p("etatToggleac24p", ON, this);
         // pytania mag
         WyborPytaniaMag.setDefaults1p("etatToggle1p", ON, this);
         WyborPytaniaMag.setDefaults2p("etatToggle2p", ON, this);
         WyborPytaniaMag.setDefaults3p("etatToggle3p", ON, this);
         WyborPytaniaMag.setDefaults4p("etatToggle4p", ON, this);
         WyborPytaniaMag.setDefaults5p("etatToggle5p", ON, this);
         WyborPytaniaMag.setDefaults6p("etatToggle6p", ON, this);
         WyborPytaniaMag.setDefaults7p("etatToggle7p", ON, this);
         WyborPytaniaMag.setDefaults8p("etatToggle8p", ON, this);
         WyborPytaniaMag.setDefaults9p("etatToggle9p", ON, this);
         WyborPytaniaMag.setDefaults10p("etatToggle10p", ON, this);
         WyborPytaniaMag.setDefaults11p("etatToggle11p", ON, this);
         WyborPytaniaMag.setDefaults12p("etatToggle12p", ON, this);
         WyborPytaniaMag.setDefaults13p("etatToggle13p", ON, this);
         WyborPytaniaMag.setDefaults14p("etatToggle14p", ON, this);
         WyborPytaniaMag.setDefaults15p("etatToggle15p", ON, this);
         WyborPytaniaMag.setDefaults16p("etatToggle16p", ON, this);
         WyborPytaniaMag.setDefaults17p("etatToggle17p", ON, this);
         WyborPytaniaMag.setDefaults18p("etatToggle18p", ON, this);
         WyborPytaniaMag.setDefaults19p("etatToggle19p", ON, this);
         WyborPytaniaMag.setDefaults20p("etatToggle20p", ON, this);
         WyborPytaniaMag.setDefaults21p("etatToggle21p", ON, this);
         WyborPytaniaMag.setDefaults22p("etatToggle22p", ON, this);
         WyborPytaniaMag.setDefaults23p("etatToggle23p", ON, this);
         WyborPytaniaMag.setDefaults24p("etatToggle24p", ON, this);
         WyborPytaniaMag.setDefaultsa1p("etatTogglea1p", ON, this);
         WyborPytaniaMag.setDefaultsa2p("etatTogglea2p", ON, this);
         WyborPytaniaMag.setDefaultsa3p("etatTogglea3p", ON, this);
         WyborPytaniaMag.setDefaultsa4p("etatTogglea4p", ON, this);
         WyborPytaniaMag.setDefaultsa5p("etatTogglea5p", ON, this);
         WyborPytaniaMag.setDefaultsa6p("etatTogglea6p", ON, this);
         WyborPytaniaMag.setDefaultsa7p("etatTogglea7p", ON, this);
         WyborPytaniaMag.setDefaultsa8p("etatTogglea8p", ON, this);
         WyborPytaniaMag.setDefaultsa9p("etatTogglea9p", ON, this);
         WyborPytaniaMag.setDefaultsa10p("etatTogglea10p", ON, this);
         WyborPytaniaMag.setDefaultsa11p("etatTogglea11p", ON, this);
         WyborPytaniaMag.setDefaultsa12p("etatTogglea12p", ON, this);
         WyborPytaniaMag.setDefaultsa13p("etatTogglea13p", ON, this);
         WyborPytaniaMag.setDefaultsa14p("etatTogglea14p", ON, this);
         WyborPytaniaMag.setDefaultsa15p("etatTogglea15p", ON, this);
         WyborPytaniaMag.setDefaultsa16p("etatTogglea16p", ON, this);
         WyborPytaniaMag.setDefaultsa17p("etatTogglea17p", ON, this);
         WyborPytaniaMag.setDefaultsa18p("etatTogglea18p", ON, this);
         WyborPytaniaMag.setDefaultsa19p("etatTogglea19p", ON, this);
         WyborPytaniaMag.setDefaultsa20p("etatTogglea20p", ON, this);
         WyborPytaniaMag.setDefaultsa21p("etatTogglea21p", ON, this);
         WyborPytaniaMag.setDefaultsa22p("etatTogglea22p", ON, this);
         WyborPytaniaMag.setDefaultsa23p("etatTogglea23p", ON, this);
         WyborPytaniaMag.setDefaultsa24p("etatTogglea24p", ON, this);
         GlownyWidokMaga.setsbtn1("sbtn1", AUTOMATIC, this);
         GlownyWidokMaga.setsbtn2("sbtn1", AUTOMATIC, this);
         GlownyWidokMaga.setbtn1("btn1", ON2, this);
         GlownyWidokMaga.setbtn2("btn2", ON2, this);
         GlownyWidokMaga.setbtn7("btn7", ON2, this);
         GlownyWidokMaga.setbtn8("btn8", ON2, this);
         GlownyWidokMaga.setbtn9("btn9", ON2, this);
         GlownyWidokMaga.setbtn10("btn10", ON2, this);
         GlownyWidokMaga.setbtn11("btn11", ON2, this);
         GlownyWidokMaga.setbtn12("btn12", ON2, this);
         GlownyWidokMaga.setbtn13("btn13", ON2, this);
         GlownyWidokMaga.setbtn14("btn14", ON2, this);
         GlownyWidokMaga.setbtn15("btn15", ON2, this);
         GlownyWidokMaga.setbtn16("btn16", ON2, this);
         GlownyWidokMaga.setbtn17("btn17", ON2, this);
         GlownyWidokMaga.setbtn18("btn18", ON2, this);
         GlownyWidokMaga.setbtn19("btn19", ON2, this);
         GlownyWidokMaga.setbtn20("btn20", ON2, this);
         GlownyWidokMaga.setbtn21("btn21", ON2, this);
         GlownyWidokMaga.setbtn22("btn22", ON2, this);
         GlownyWidokMaga.setbtn23("btn23", ON2, this);
         GlownyWidokMaga.setbtn24("btn24", ON2, this);
         GlownyWidokMaga.setbtn25("btn25", ON2, this);
         GlownyWidokMaga.setbtn26("btn26", ON2, this);
         GlownyWidokMaga.setbtn27("btn27", ON2, this);
         GlownyWidokMaga.setbtn28("btn28", ON2, this);
         GlownyWidokMaga.setbtn29("btn29", ON2, this);
         GlownyWidokMaga.setbtn30("btn30", ON2, this);
         GlownyWidokCzarnoksieznika.setsbtncc1("sbtnc1", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setsbtncc2("sbtnc1", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setbtnc1("btnc1", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc2("btnc2", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc7("btnc7", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc8("btnc8", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc9("btnc9", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc10("btnc10", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc11("btnc11", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc12("btnc12", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc13("btnc13", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc14("btnc14", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc15("btnc15", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc16("btnc16", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc17("btnc17", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc18("btnc18", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc19("btnc19", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc20("btnc20", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc21("btnc21", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc22("btnc22", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc23("btnc23", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc24("btnc24", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc25("btnc25", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc26("btnc26", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc27("btnc27", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc28("btnc28", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc29("btnc29", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc30("btnc30", ON2, this);
         GlownyWidokCzarnoksieznika.sbc1=0;
         GlownyWidokCzarnoksieznika.sbc2=0;
         GlownyWidokMaga.sb1=0;
         GlownyWidokMaga.sb2=0;
         GlownyWidokCzarnoksieznika.gc=1;
         GlownyWidokMaga.gm=1;
         Intent intent = new Intent(Menu.this, PytanieRebusowe.class);
         Menu.poprawneWylaczenie=1; startActivity(intent);

     }
     public void testpytobr(View view) {
         Random generator = new Random();
         kon=1;
         numerMapyMaga=generator.nextInt(10)+1;
         numerMapyCzarnoksieznika=generator.nextInt(10)+1;
         setPytmat1();
         setPytmat2();
         setPytmat3();
         setPytpol1();
         setPytpol2();
         setPytpol3();
         setPytprz1();
         setPytprz2();
         setPytprz3();
         setPytzyc1();
         setPytzyc2();
         setPytzyc3();
         GlownyWidokCzarnoksieznika.setDefaultsc2("etatTogglec2", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc4("etatTogglec4", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc6("etatTogglec6", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc7("etatTogglec7", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc8("etatTogglec8", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc9("etatTogglec9", ON, this);
         //2
         GlownyWidokCzarnoksieznika.setDefaultsc22("etatTogglec22", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc24("etatTogglec24", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc26("etatTogglec26", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc27("etatTogglec27", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc28("etatTogglec28", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc29("etatTogglec29", ON, this);
         //3
         GlownyWidokCzarnoksieznika.setDefaultsc32("etatTogglec32", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc34("etatTogglec34", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc36("etatTogglec36", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc37("etatTogglec37", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc38("etatTogglec38", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc39("etatTogglec39", ON, this);
         //4
         GlownyWidokCzarnoksieznika.setDefaultsc42("etatTogglec42", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc44("etatTogglec44", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc46("etatTogglec46", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc47("etatTogglec47", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc48("etatTogglec48", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc49("etatTogglec49", ON, this);
         //5
         GlownyWidokCzarnoksieznika.setDefaultsc52("etatTogglec52", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc54("etatTogglec54", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc56("etatTogglec56", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc57("etatTogglec57", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc58("etatTogglec58", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc59("etatTogglec59", ON, this);
         //6
         GlownyWidokCzarnoksieznika.setDefaultsc62("etatTogglec62", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc64("etatTogglec64", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc66("etatTogglec66", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc67("etatTogglec67", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc68("etatTogglec68", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc69("etatTogglec69", ON, this);
         punktyCzarnoksieznika=0;
         GlownyWidokCzarnoksieznika.skrzatyCzarnoksieznika=0;
         //czar
         GlownyWidokMaga.setDefaults2("etatToggle2", ON, this);
         GlownyWidokMaga.setDefaults4("etatToggle4", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults6("etatToggle6", ON, this);
         GlownyWidokMaga.setDefaults7("etatToggle7", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults8("etatToggle8", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults9("etatToggle9", ON, this);
         //2
         GlownyWidokMaga.setDefaults22("etatToggle22", ON, this);
         GlownyWidokMaga.setDefaults24("etatToggle24", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults26("etatToggle26", ON, this);
         GlownyWidokMaga.setDefaults27("etatToggle27", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults28("etatToggle28", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults29("etatToggle29", ON, this);
         //3
         GlownyWidokMaga.setDefaults32("etatToggle32", ON, this);
         GlownyWidokMaga.setDefaults34("etatToggle34", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults36("etatToggle36", ON, this);
         GlownyWidokMaga.setDefaults37("etatToggle37", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults38("etatToggle38", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults39("etatToggle39", ON, this);
         //4
         GlownyWidokMaga.setDefaults42("etatToggle42", ON, this);
         GlownyWidokMaga.setDefaults44("etatToggle44", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults46("etatToggle46", ON, this);
         GlownyWidokMaga.setDefaults47("etatToggle47", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults48("etatToggle48", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults49("etatToggle49", ON, this);
         //5
         GlownyWidokMaga.setDefaults52("etatToggle52", ON, this);
         GlownyWidokMaga.setDefaults54("etatToggle54", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults56("etatToggle56", ON, this);
         GlownyWidokMaga.setDefaults57("etatToggle57", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults58("etatToggle58", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults59("etatToggle59", ON, this);
         //6
         GlownyWidokMaga.setDefaults62("etatToggle62", ON, this);
         GlownyWidokMaga.setDefaults64("etatToggle64", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults66("etatToggle66", ON, this);
         GlownyWidokMaga.setDefaults67("etatToggle67", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults68("etatToggle68", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults69("etatToggle69", ON, this);
         punktyMaga=0;
         GlownyWidokMaga.skrzatyMaga=0;
         // pytania czar
         WyborPytaniaCzarnoksieznik.setDefaultsc1p("etatTogglec1p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc2p("etatTogglec2p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc3p("etatTogglec3p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc4p("etatTogglec4p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc5p("etatTogglec5p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc6p("etatTogglec6p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc7p("etatTogglec7p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc8p("etatTogglec8p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc9p("etatTogglec9p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc10p("etatTogglec10p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc11p("etatTogglec11p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc12p("etatTogglec12p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc13p("etatTogglec13p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc14p("etatTogglec14p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc15p("etatTogglec15p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc16p("etatTogglec16p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc17p("etatTogglec17p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc18p("etatTogglec18p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc19p("etatTogglec19p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc20p("etatTogglec20p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc21p("etatTogglec21p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc22p("etatTogglec22p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc23p("etatTogglec23p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc24p("etatTogglec24p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca1p("etatToggleac1p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca2p("etatToggleac2p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca3p("etatToggleac3p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca4p("etatToggleac4p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca5p("etatToggleac5p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca6p("etatToggleac6p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca7p("etatToggleac7p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca8p("etatToggleac8p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca9p("etatToggleac9p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca10p("etatToggleac10p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca11p("etatToggleac11p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca12p("etatToggleac12p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca13p("etatToggleac13p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca14p("etatToggleac14p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca15p("etatToggleac15p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca16p("etatToggleac16p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca17p("etatToggleac17p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca18p("etatToggleac18p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca19p("etatToggleac19p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca20p("etatToggleac20p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca21p("etatToggleac21p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca22p("etatToggleac22p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca23p("etatToggleac23p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca24p("etatToggleac24p", ON, this);
         // pytania mag
         WyborPytaniaMag.setDefaults1p("etatToggle1p", ON, this);
         WyborPytaniaMag.setDefaults2p("etatToggle2p", ON, this);
         WyborPytaniaMag.setDefaults3p("etatToggle3p", ON, this);
         WyborPytaniaMag.setDefaults4p("etatToggle4p", ON, this);
         WyborPytaniaMag.setDefaults5p("etatToggle5p", ON, this);
         WyborPytaniaMag.setDefaults6p("etatToggle6p", ON, this);
         WyborPytaniaMag.setDefaults7p("etatToggle7p", ON, this);
         WyborPytaniaMag.setDefaults8p("etatToggle8p", ON, this);
         WyborPytaniaMag.setDefaults9p("etatToggle9p", ON, this);
         WyborPytaniaMag.setDefaults10p("etatToggle10p", ON, this);
         WyborPytaniaMag.setDefaults11p("etatToggle11p", ON, this);
         WyborPytaniaMag.setDefaults12p("etatToggle12p", ON, this);
         WyborPytaniaMag.setDefaults13p("etatToggle13p", ON, this);
         WyborPytaniaMag.setDefaults14p("etatToggle14p", ON, this);
         WyborPytaniaMag.setDefaults15p("etatToggle15p", ON, this);
         WyborPytaniaMag.setDefaults16p("etatToggle16p", ON, this);
         WyborPytaniaMag.setDefaults17p("etatToggle17p", ON, this);
         WyborPytaniaMag.setDefaults18p("etatToggle18p", ON, this);
         WyborPytaniaMag.setDefaults19p("etatToggle19p", ON, this);
         WyborPytaniaMag.setDefaults20p("etatToggle20p", ON, this);
         WyborPytaniaMag.setDefaults21p("etatToggle21p", ON, this);
         WyborPytaniaMag.setDefaults22p("etatToggle22p", ON, this);
         WyborPytaniaMag.setDefaults23p("etatToggle23p", ON, this);
         WyborPytaniaMag.setDefaults24p("etatToggle24p", ON, this);
         WyborPytaniaMag.setDefaultsa1p("etatTogglea1p", ON, this);
         WyborPytaniaMag.setDefaultsa2p("etatTogglea2p", ON, this);
         WyborPytaniaMag.setDefaultsa3p("etatTogglea3p", ON, this);
         WyborPytaniaMag.setDefaultsa4p("etatTogglea4p", ON, this);
         WyborPytaniaMag.setDefaultsa5p("etatTogglea5p", ON, this);
         WyborPytaniaMag.setDefaultsa6p("etatTogglea6p", ON, this);
         WyborPytaniaMag.setDefaultsa7p("etatTogglea7p", ON, this);
         WyborPytaniaMag.setDefaultsa8p("etatTogglea8p", ON, this);
         WyborPytaniaMag.setDefaultsa9p("etatTogglea9p", ON, this);
         WyborPytaniaMag.setDefaultsa10p("etatTogglea10p", ON, this);
         WyborPytaniaMag.setDefaultsa11p("etatTogglea11p", ON, this);
         WyborPytaniaMag.setDefaultsa12p("etatTogglea12p", ON, this);
         WyborPytaniaMag.setDefaultsa13p("etatTogglea13p", ON, this);
         WyborPytaniaMag.setDefaultsa14p("etatTogglea14p", ON, this);
         WyborPytaniaMag.setDefaultsa15p("etatTogglea15p", ON, this);
         WyborPytaniaMag.setDefaultsa16p("etatTogglea16p", ON, this);
         WyborPytaniaMag.setDefaultsa17p("etatTogglea17p", ON, this);
         WyborPytaniaMag.setDefaultsa18p("etatTogglea18p", ON, this);
         WyborPytaniaMag.setDefaultsa19p("etatTogglea19p", ON, this);
         WyborPytaniaMag.setDefaultsa20p("etatTogglea20p", ON, this);
         WyborPytaniaMag.setDefaultsa21p("etatTogglea21p", ON, this);
         WyborPytaniaMag.setDefaultsa22p("etatTogglea22p", ON, this);
         WyborPytaniaMag.setDefaultsa23p("etatTogglea23p", ON, this);
         WyborPytaniaMag.setDefaultsa24p("etatTogglea24p", ON, this);
         GlownyWidokMaga.setsbtn1("sbtn1", AUTOMATIC, this);
         GlownyWidokMaga.setsbtn2("sbtn1", AUTOMATIC, this);
         GlownyWidokMaga.setbtn1("btn1", ON2, this);
         GlownyWidokMaga.setbtn2("btn2", ON2, this);
         GlownyWidokMaga.setbtn7("btn7", ON2, this);
         GlownyWidokMaga.setbtn8("btn8", ON2, this);
         GlownyWidokMaga.setbtn9("btn9", ON2, this);
         GlownyWidokMaga.setbtn10("btn10", ON2, this);
         GlownyWidokMaga.setbtn11("btn11", ON2, this);
         GlownyWidokMaga.setbtn12("btn12", ON2, this);
         GlownyWidokMaga.setbtn13("btn13", ON2, this);
         GlownyWidokMaga.setbtn14("btn14", ON2, this);
         GlownyWidokMaga.setbtn15("btn15", ON2, this);
         GlownyWidokMaga.setbtn16("btn16", ON2, this);
         GlownyWidokMaga.setbtn17("btn17", ON2, this);
         GlownyWidokMaga.setbtn18("btn18", ON2, this);
         GlownyWidokMaga.setbtn19("btn19", ON2, this);
         GlownyWidokMaga.setbtn20("btn20", ON2, this);
         GlownyWidokMaga.setbtn21("btn21", ON2, this);
         GlownyWidokMaga.setbtn22("btn22", ON2, this);
         GlownyWidokMaga.setbtn23("btn23", ON2, this);
         GlownyWidokMaga.setbtn24("btn24", ON2, this);
         GlownyWidokMaga.setbtn25("btn25", ON2, this);
         GlownyWidokMaga.setbtn26("btn26", ON2, this);
         GlownyWidokMaga.setbtn27("btn27", ON2, this);
         GlownyWidokMaga.setbtn28("btn28", ON2, this);
         GlownyWidokMaga.setbtn29("btn29", ON2, this);
         GlownyWidokMaga.setbtn30("btn30", ON2, this);
         GlownyWidokCzarnoksieznika.setsbtncc1("sbtnc1", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setsbtncc2("sbtnc1", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setbtnc1("btnc1", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc2("btnc2", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc7("btnc7", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc8("btnc8", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc9("btnc9", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc10("btnc10", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc11("btnc11", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc12("btnc12", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc13("btnc13", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc14("btnc14", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc15("btnc15", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc16("btnc16", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc17("btnc17", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc18("btnc18", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc19("btnc19", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc20("btnc20", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc21("btnc21", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc22("btnc22", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc23("btnc23", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc24("btnc24", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc25("btnc25", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc26("btnc26", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc27("btnc27", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc28("btnc28", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc29("btnc29", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc30("btnc30", ON2, this);
         GlownyWidokCzarnoksieznika.sbc1=0;
         GlownyWidokCzarnoksieznika.sbc2=0;
         GlownyWidokMaga.sb1=0;
         GlownyWidokMaga.sb2=0;
         GlownyWidokCzarnoksieznika.gc=1;
         GlownyWidokMaga.gm=1;
         Intent intent = new Intent(Menu.this, PytanieObrazkowe.class);
         Menu.poprawneWylaczenie=1; startActivity(intent);

     }
     public void testzab(View view) {
         Random generator = new Random();
         kon=1;
         numerMapyMaga=generator.nextInt(10)+1;
         numerMapyCzarnoksieznika=generator.nextInt(10)+1;
         setPytmat1();
         setPytmat2();
         setPytmat3();
         setPytpol1();
         setPytpol2();
         setPytpol3();
         setPytprz1();
         setPytprz2();
         setPytprz3();
         setPytzyc1();
         setPytzyc2();
         setPytzyc3();
         GlownyWidokCzarnoksieznika.setDefaultsc2("etatTogglec2", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc4("etatTogglec4", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc6("etatTogglec6", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc7("etatTogglec7", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc8("etatTogglec8", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc9("etatTogglec9", ON, this);
         //2
         GlownyWidokCzarnoksieznika.setDefaultsc22("etatTogglec22", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc24("etatTogglec24", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc26("etatTogglec26", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc27("etatTogglec27", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc28("etatTogglec28", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc29("etatTogglec29", ON, this);
         //3
         GlownyWidokCzarnoksieznika.setDefaultsc32("etatTogglec32", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc34("etatTogglec34", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc36("etatTogglec36", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc37("etatTogglec37", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc38("etatTogglec38", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc39("etatTogglec39", ON, this);
         //4
         GlownyWidokCzarnoksieznika.setDefaultsc42("etatTogglec42", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc44("etatTogglec44", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc46("etatTogglec46", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc47("etatTogglec47", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc48("etatTogglec48", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc49("etatTogglec49", ON, this);
         //5
         GlownyWidokCzarnoksieznika.setDefaultsc52("etatTogglec52", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc54("etatTogglec54", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc56("etatTogglec56", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc57("etatTogglec57", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc58("etatTogglec58", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc59("etatTogglec59", ON, this);
         //6
         GlownyWidokCzarnoksieznika.setDefaultsc62("etatTogglec62", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc64("etatTogglec64", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc66("etatTogglec66", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc67("etatTogglec67", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc68("etatTogglec68", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc69("etatTogglec69", ON, this);
         punktyCzarnoksieznika=0;
         GlownyWidokCzarnoksieznika.skrzatyCzarnoksieznika=0;
         //czar
         GlownyWidokMaga.setDefaults2("etatToggle2", ON, this);
         GlownyWidokMaga.setDefaults4("etatToggle4", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults6("etatToggle6", ON, this);
         GlownyWidokMaga.setDefaults7("etatToggle7", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults8("etatToggle8", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults9("etatToggle9", ON, this);
         //2
         GlownyWidokMaga.setDefaults22("etatToggle22", ON, this);
         GlownyWidokMaga.setDefaults24("etatToggle24", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults26("etatToggle26", ON, this);
         GlownyWidokMaga.setDefaults27("etatToggle27", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults28("etatToggle28", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults29("etatToggle29", ON, this);
         //3
         GlownyWidokMaga.setDefaults32("etatToggle32", ON, this);
         GlownyWidokMaga.setDefaults34("etatToggle34", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults36("etatToggle36", ON, this);
         GlownyWidokMaga.setDefaults37("etatToggle37", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults38("etatToggle38", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults39("etatToggle39", ON, this);
         //4
         GlownyWidokMaga.setDefaults42("etatToggle42", ON, this);
         GlownyWidokMaga.setDefaults44("etatToggle44", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults46("etatToggle46", ON, this);
         GlownyWidokMaga.setDefaults47("etatToggle47", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults48("etatToggle48", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults49("etatToggle49", ON, this);
         //5
         GlownyWidokMaga.setDefaults52("etatToggle52", ON, this);
         GlownyWidokMaga.setDefaults54("etatToggle54", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults56("etatToggle56", ON, this);
         GlownyWidokMaga.setDefaults57("etatToggle57", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults58("etatToggle58", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults59("etatToggle59", ON, this);
         //6
         GlownyWidokMaga.setDefaults62("etatToggle62", ON, this);
         GlownyWidokMaga.setDefaults64("etatToggle64", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults66("etatToggle66", ON, this);
         GlownyWidokMaga.setDefaults67("etatToggle67", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults68("etatToggle68", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults69("etatToggle69", ON, this);
         punktyMaga=0;
         GlownyWidokMaga.skrzatyMaga=0;
         // pytania czar
         WyborPytaniaCzarnoksieznik.setDefaultsc1p("etatTogglec1p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc2p("etatTogglec2p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc3p("etatTogglec3p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc4p("etatTogglec4p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc5p("etatTogglec5p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc6p("etatTogglec6p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc7p("etatTogglec7p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc8p("etatTogglec8p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc9p("etatTogglec9p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc10p("etatTogglec10p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc11p("etatTogglec11p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc12p("etatTogglec12p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc13p("etatTogglec13p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc14p("etatTogglec14p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc15p("etatTogglec15p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc16p("etatTogglec16p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc17p("etatTogglec17p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc18p("etatTogglec18p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc19p("etatTogglec19p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc20p("etatTogglec20p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc21p("etatTogglec21p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc22p("etatTogglec22p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc23p("etatTogglec23p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc24p("etatTogglec24p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca1p("etatToggleac1p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca2p("etatToggleac2p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca3p("etatToggleac3p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca4p("etatToggleac4p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca5p("etatToggleac5p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca6p("etatToggleac6p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca7p("etatToggleac7p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca8p("etatToggleac8p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca9p("etatToggleac9p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca10p("etatToggleac10p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca11p("etatToggleac11p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca12p("etatToggleac12p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca13p("etatToggleac13p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca14p("etatToggleac14p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca15p("etatToggleac15p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca16p("etatToggleac16p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca17p("etatToggleac17p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca18p("etatToggleac18p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca19p("etatToggleac19p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca20p("etatToggleac20p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca21p("etatToggleac21p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca22p("etatToggleac22p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca23p("etatToggleac23p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca24p("etatToggleac24p", ON, this);
         // pytania mag
         WyborPytaniaMag.setDefaults1p("etatToggle1p", ON, this);
         WyborPytaniaMag.setDefaults2p("etatToggle2p", ON, this);
         WyborPytaniaMag.setDefaults3p("etatToggle3p", ON, this);
         WyborPytaniaMag.setDefaults4p("etatToggle4p", ON, this);
         WyborPytaniaMag.setDefaults5p("etatToggle5p", ON, this);
         WyborPytaniaMag.setDefaults6p("etatToggle6p", ON, this);
         WyborPytaniaMag.setDefaults7p("etatToggle7p", ON, this);
         WyborPytaniaMag.setDefaults8p("etatToggle8p", ON, this);
         WyborPytaniaMag.setDefaults9p("etatToggle9p", ON, this);
         WyborPytaniaMag.setDefaults10p("etatToggle10p", ON, this);
         WyborPytaniaMag.setDefaults11p("etatToggle11p", ON, this);
         WyborPytaniaMag.setDefaults12p("etatToggle12p", ON, this);
         WyborPytaniaMag.setDefaults13p("etatToggle13p", ON, this);
         WyborPytaniaMag.setDefaults14p("etatToggle14p", ON, this);
         WyborPytaniaMag.setDefaults15p("etatToggle15p", ON, this);
         WyborPytaniaMag.setDefaults16p("etatToggle16p", ON, this);
         WyborPytaniaMag.setDefaults17p("etatToggle17p", ON, this);
         WyborPytaniaMag.setDefaults18p("etatToggle18p", ON, this);
         WyborPytaniaMag.setDefaults19p("etatToggle19p", ON, this);
         WyborPytaniaMag.setDefaults20p("etatToggle20p", ON, this);
         WyborPytaniaMag.setDefaults21p("etatToggle21p", ON, this);
         WyborPytaniaMag.setDefaults22p("etatToggle22p", ON, this);
         WyborPytaniaMag.setDefaults23p("etatToggle23p", ON, this);
         WyborPytaniaMag.setDefaults24p("etatToggle24p", ON, this);
         WyborPytaniaMag.setDefaultsa1p("etatTogglea1p", ON, this);
         WyborPytaniaMag.setDefaultsa2p("etatTogglea2p", ON, this);
         WyborPytaniaMag.setDefaultsa3p("etatTogglea3p", ON, this);
         WyborPytaniaMag.setDefaultsa4p("etatTogglea4p", ON, this);
         WyborPytaniaMag.setDefaultsa5p("etatTogglea5p", ON, this);
         WyborPytaniaMag.setDefaultsa6p("etatTogglea6p", ON, this);
         WyborPytaniaMag.setDefaultsa7p("etatTogglea7p", ON, this);
         WyborPytaniaMag.setDefaultsa8p("etatTogglea8p", ON, this);
         WyborPytaniaMag.setDefaultsa9p("etatTogglea9p", ON, this);
         WyborPytaniaMag.setDefaultsa10p("etatTogglea10p", ON, this);
         WyborPytaniaMag.setDefaultsa11p("etatTogglea11p", ON, this);
         WyborPytaniaMag.setDefaultsa12p("etatTogglea12p", ON, this);
         WyborPytaniaMag.setDefaultsa13p("etatTogglea13p", ON, this);
         WyborPytaniaMag.setDefaultsa14p("etatTogglea14p", ON, this);
         WyborPytaniaMag.setDefaultsa15p("etatTogglea15p", ON, this);
         WyborPytaniaMag.setDefaultsa16p("etatTogglea16p", ON, this);
         WyborPytaniaMag.setDefaultsa17p("etatTogglea17p", ON, this);
         WyborPytaniaMag.setDefaultsa18p("etatTogglea18p", ON, this);
         WyborPytaniaMag.setDefaultsa19p("etatTogglea19p", ON, this);
         WyborPytaniaMag.setDefaultsa20p("etatTogglea20p", ON, this);
         WyborPytaniaMag.setDefaultsa21p("etatTogglea21p", ON, this);
         WyborPytaniaMag.setDefaultsa22p("etatTogglea22p", ON, this);
         WyborPytaniaMag.setDefaultsa23p("etatTogglea23p", ON, this);
         WyborPytaniaMag.setDefaultsa24p("etatTogglea24p", ON, this);
         GlownyWidokMaga.setsbtn1("sbtn1", AUTOMATIC, this);
         GlownyWidokMaga.setsbtn2("sbtn1", AUTOMATIC, this);
         GlownyWidokMaga.setbtn1("btn1", ON2, this);
         GlownyWidokMaga.setbtn2("btn2", ON2, this);
         GlownyWidokMaga.setbtn7("btn7", ON2, this);
         GlownyWidokMaga.setbtn8("btn8", ON2, this);
         GlownyWidokMaga.setbtn9("btn9", ON2, this);
         GlownyWidokMaga.setbtn10("btn10", ON2, this);
         GlownyWidokMaga.setbtn11("btn11", ON2, this);
         GlownyWidokMaga.setbtn12("btn12", ON2, this);
         GlownyWidokMaga.setbtn13("btn13", ON2, this);
         GlownyWidokMaga.setbtn14("btn14", ON2, this);
         GlownyWidokMaga.setbtn15("btn15", ON2, this);
         GlownyWidokMaga.setbtn16("btn16", ON2, this);
         GlownyWidokMaga.setbtn17("btn17", ON2, this);
         GlownyWidokMaga.setbtn18("btn18", ON2, this);
         GlownyWidokMaga.setbtn19("btn19", ON2, this);
         GlownyWidokMaga.setbtn20("btn20", ON2, this);
         GlownyWidokMaga.setbtn21("btn21", ON2, this);
         GlownyWidokMaga.setbtn22("btn22", ON2, this);
         GlownyWidokMaga.setbtn23("btn23", ON2, this);
         GlownyWidokMaga.setbtn24("btn24", ON2, this);
         GlownyWidokMaga.setbtn25("btn25", ON2, this);
         GlownyWidokMaga.setbtn26("btn26", ON2, this);
         GlownyWidokMaga.setbtn27("btn27", ON2, this);
         GlownyWidokMaga.setbtn28("btn28", ON2, this);
         GlownyWidokMaga.setbtn29("btn29", ON2, this);
         GlownyWidokMaga.setbtn30("btn30", ON2, this);
         GlownyWidokCzarnoksieznika.setsbtncc1("sbtncc1", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setsbtncc2("sbtncc2", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setbtnc1("btnc1", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc2("btnc2", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc7("btnc7", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc8("btnc8", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc9("btnc9", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc10("btnc10", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc11("btnc11", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc12("btnc12", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc13("btnc13", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc14("btnc14", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc15("btnc15", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc16("btnc16", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc17("btnc17", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc18("btnc18", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc19("btnc19", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc20("btnc20", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc21("btnc21", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc22("btnc22", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc23("btnc23", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc24("btnc24", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc25("btnc25", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc26("btnc26", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc27("btnc27", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc28("btnc28", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc29("btnc29", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc30("btnc30", ON2, this);
         GlownyWidokCzarnoksieznika.sbc1=0;
         GlownyWidokCzarnoksieznika.sbc2=0;
         GlownyWidokMaga.sb1=0;
         GlownyWidokMaga.sb2=0;
         GlownyWidokCzarnoksieznika.gc=1;
         GlownyWidokMaga.gm=1;
         Intent intent = new Intent(Menu.this, PytanieZabawne.class);
         Menu.poprawneWylaczenie=1; startActivity(intent);

     }
     public void testlit(View view) {
         Random generator = new Random();
         kon=1;
         numerMapyMaga=generator.nextInt(10)+1;
         numerMapyCzarnoksieznika=generator.nextInt(10)+1;
         setPytmat1();
         setPytmat2();
         setPytmat3();
         setPytpol1();
         setPytpol2();
         setPytpol3();
         setPytprz1();
         setPytprz2();
         setPytprz3();
         setPytzyc1();
         setPytzyc2();
         setPytzyc3();
         GlownyWidokCzarnoksieznika.setDefaultsc2("etatTogglec2", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc4("etatTogglec4", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc6("etatTogglec6", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc7("etatTogglec7", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc8("etatTogglec8", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc9("etatTogglec9", ON, this);
         //2
         GlownyWidokCzarnoksieznika.setDefaultsc22("etatTogglec22", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc24("etatTogglec24", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc26("etatTogglec26", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc27("etatTogglec27", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc28("etatTogglec28", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc29("etatTogglec29", ON, this);
         //3
         GlownyWidokCzarnoksieznika.setDefaultsc32("etatTogglec32", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc34("etatTogglec34", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc36("etatTogglec36", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc37("etatTogglec37", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc38("etatTogglec38", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc39("etatTogglec39", ON, this);
         //4
         GlownyWidokCzarnoksieznika.setDefaultsc42("etatTogglec42", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc44("etatTogglec44", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc46("etatTogglec46", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc47("etatTogglec47", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc48("etatTogglec48", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc49("etatTogglec49", ON, this);
         //5
         GlownyWidokCzarnoksieznika.setDefaultsc52("etatTogglec52", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc54("etatTogglec54", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc56("etatTogglec56", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc57("etatTogglec57", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc58("etatTogglec58", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc59("etatTogglec59", ON, this);
         //6
         GlownyWidokCzarnoksieznika.setDefaultsc62("etatTogglec62", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc64("etatTogglec64", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc66("etatTogglec66", ON, this);
         GlownyWidokCzarnoksieznika.setDefaultsc67("etatTogglec67", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc68("etatTogglec68", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setDefaultsc69("etatTogglec69", ON, this);
         punktyCzarnoksieznika=0;
         GlownyWidokCzarnoksieznika.skrzatyCzarnoksieznika=0;
         //czar
         GlownyWidokMaga.setDefaults2("etatToggle2", ON, this);
         GlownyWidokMaga.setDefaults4("etatToggle4", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults6("etatToggle6", ON, this);
         GlownyWidokMaga.setDefaults7("etatToggle7", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults8("etatToggle8", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults9("etatToggle9", ON, this);
         //2
         GlownyWidokMaga.setDefaults22("etatToggle22", ON, this);
         GlownyWidokMaga.setDefaults24("etatToggle24", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults26("etatToggle26", ON, this);
         GlownyWidokMaga.setDefaults27("etatToggle27", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults28("etatToggle28", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults29("etatToggle29", ON, this);
         //3
         GlownyWidokMaga.setDefaults32("etatToggle32", ON, this);
         GlownyWidokMaga.setDefaults34("etatToggle34", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults36("etatToggle36", ON, this);
         GlownyWidokMaga.setDefaults37("etatToggle37", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults38("etatToggle38", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults39("etatToggle39", ON, this);
         //4
         GlownyWidokMaga.setDefaults42("etatToggle42", ON, this);
         GlownyWidokMaga.setDefaults44("etatToggle44", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults46("etatToggle46", ON, this);
         GlownyWidokMaga.setDefaults47("etatToggle47", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults48("etatToggle48", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults49("etatToggle49", ON, this);
         //5
         GlownyWidokMaga.setDefaults52("etatToggle52", ON, this);
         GlownyWidokMaga.setDefaults54("etatToggle54", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults56("etatToggle56", ON, this);
         GlownyWidokMaga.setDefaults57("etatToggle57", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults58("etatToggle58", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults59("etatToggle59", ON, this);
         //6
         GlownyWidokMaga.setDefaults62("etatToggle62", ON, this);
         GlownyWidokMaga.setDefaults64("etatToggle64", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults66("etatToggle66", ON, this);
         GlownyWidokMaga.setDefaults67("etatToggle67", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults68("etatToggle68", AUTOMATIC, this);
         GlownyWidokMaga.setDefaults69("etatToggle69", ON, this);
         punktyMaga=0;
         GlownyWidokMaga.skrzatyMaga=0;
         // pytania czar
         WyborPytaniaCzarnoksieznik.setDefaultsc1p("etatTogglec1p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc2p("etatTogglec2p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc3p("etatTogglec3p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc4p("etatTogglec4p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc5p("etatTogglec5p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc6p("etatTogglec6p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc7p("etatTogglec7p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc8p("etatTogglec8p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc9p("etatTogglec9p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc10p("etatTogglec10p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc11p("etatTogglec11p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc12p("etatTogglec12p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc13p("etatTogglec13p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc14p("etatTogglec14p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc15p("etatTogglec15p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc16p("etatTogglec16p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc17p("etatTogglec17p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc18p("etatTogglec18p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc19p("etatTogglec19p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc20p("etatTogglec20p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc21p("etatTogglec21p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc22p("etatTogglec22p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc23p("etatTogglec23p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsc24p("etatTogglec24p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca1p("etatToggleac1p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca2p("etatToggleac2p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca3p("etatToggleac3p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca4p("etatToggleac4p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca5p("etatToggleac5p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca6p("etatToggleac6p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca7p("etatToggleac7p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca8p("etatToggleac8p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca9p("etatToggleac9p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca10p("etatToggleac10p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca11p("etatToggleac11p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca12p("etatToggleac12p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca13p("etatToggleac13p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca14p("etatToggleac14p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca15p("etatToggleac15p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca16p("etatToggleac16p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca17p("etatToggleac17p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca18p("etatToggleac18p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca19p("etatToggleac19p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca20p("etatToggleac20p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca21p("etatToggleac21p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca22p("etatToggleac22p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca23p("etatToggleac23p", ON, this);
         WyborPytaniaCzarnoksieznik.setDefaultsca24p("etatToggleac24p", ON, this);
         // pytania mag
         WyborPytaniaMag.setDefaults1p("etatToggle1p", ON, this);
         WyborPytaniaMag.setDefaults2p("etatToggle2p", ON, this);
         WyborPytaniaMag.setDefaults3p("etatToggle3p", ON, this);
         WyborPytaniaMag.setDefaults4p("etatToggle4p", ON, this);
         WyborPytaniaMag.setDefaults5p("etatToggle5p", ON, this);
         WyborPytaniaMag.setDefaults6p("etatToggle6p", ON, this);
         WyborPytaniaMag.setDefaults7p("etatToggle7p", ON, this);
         WyborPytaniaMag.setDefaults8p("etatToggle8p", ON, this);
         WyborPytaniaMag.setDefaults9p("etatToggle9p", ON, this);
         WyborPytaniaMag.setDefaults10p("etatToggle10p", ON, this);
         WyborPytaniaMag.setDefaults11p("etatToggle11p", ON, this);
         WyborPytaniaMag.setDefaults12p("etatToggle12p", ON, this);
         WyborPytaniaMag.setDefaults13p("etatToggle13p", ON, this);
         WyborPytaniaMag.setDefaults14p("etatToggle14p", ON, this);
         WyborPytaniaMag.setDefaults15p("etatToggle15p", ON, this);
         WyborPytaniaMag.setDefaults16p("etatToggle16p", ON, this);
         WyborPytaniaMag.setDefaults17p("etatToggle17p", ON, this);
         WyborPytaniaMag.setDefaults18p("etatToggle18p", ON, this);
         WyborPytaniaMag.setDefaults19p("etatToggle19p", ON, this);
         WyborPytaniaMag.setDefaults20p("etatToggle20p", ON, this);
         WyborPytaniaMag.setDefaults21p("etatToggle21p", ON, this);
         WyborPytaniaMag.setDefaults22p("etatToggle22p", ON, this);
         WyborPytaniaMag.setDefaults23p("etatToggle23p", ON, this);
         WyborPytaniaMag.setDefaults24p("etatToggle24p", ON, this);
         WyborPytaniaMag.setDefaultsa1p("etatTogglea1p", ON, this);
         WyborPytaniaMag.setDefaultsa2p("etatTogglea2p", ON, this);
         WyborPytaniaMag.setDefaultsa3p("etatTogglea3p", ON, this);
         WyborPytaniaMag.setDefaultsa4p("etatTogglea4p", ON, this);
         WyborPytaniaMag.setDefaultsa5p("etatTogglea5p", ON, this);
         WyborPytaniaMag.setDefaultsa6p("etatTogglea6p", ON, this);
         WyborPytaniaMag.setDefaultsa7p("etatTogglea7p", ON, this);
         WyborPytaniaMag.setDefaultsa8p("etatTogglea8p", ON, this);
         WyborPytaniaMag.setDefaultsa9p("etatTogglea9p", ON, this);
         WyborPytaniaMag.setDefaultsa10p("etatTogglea10p", ON, this);
         WyborPytaniaMag.setDefaultsa11p("etatTogglea11p", ON, this);
         WyborPytaniaMag.setDefaultsa12p("etatTogglea12p", ON, this);
         WyborPytaniaMag.setDefaultsa13p("etatTogglea13p", ON, this);
         WyborPytaniaMag.setDefaultsa14p("etatTogglea14p", ON, this);
         WyborPytaniaMag.setDefaultsa15p("etatTogglea15p", ON, this);
         WyborPytaniaMag.setDefaultsa16p("etatTogglea16p", ON, this);
         WyborPytaniaMag.setDefaultsa17p("etatTogglea17p", ON, this);
         WyborPytaniaMag.setDefaultsa18p("etatTogglea18p", ON, this);
         WyborPytaniaMag.setDefaultsa19p("etatTogglea19p", ON, this);
         WyborPytaniaMag.setDefaultsa20p("etatTogglea20p", ON, this);
         WyborPytaniaMag.setDefaultsa21p("etatTogglea21p", ON, this);
         WyborPytaniaMag.setDefaultsa22p("etatTogglea22p", ON, this);
         WyborPytaniaMag.setDefaultsa23p("etatTogglea23p", ON, this);
         WyborPytaniaMag.setDefaultsa24p("etatTogglea24p", ON, this);
         GlownyWidokMaga.setsbtn1("sbtn1", AUTOMATIC, this);
         GlownyWidokMaga.setsbtn2("sbtn1", AUTOMATIC, this);
         GlownyWidokMaga.setbtn1("btn1", ON2, this);
         GlownyWidokMaga.setbtn2("btn2", ON2, this);
         GlownyWidokMaga.setbtn7("btn7", ON2, this);
         GlownyWidokMaga.setbtn8("btn8", ON2, this);
         GlownyWidokMaga.setbtn9("btn9", ON2, this);
         GlownyWidokMaga.setbtn10("btn10", ON2, this);
         GlownyWidokMaga.setbtn11("btn11", ON2, this);
         GlownyWidokMaga.setbtn12("btn12", ON2, this);
         GlownyWidokMaga.setbtn13("btn13", ON2, this);
         GlownyWidokMaga.setbtn14("btn14", ON2, this);
         GlownyWidokMaga.setbtn15("btn15", ON2, this);
         GlownyWidokMaga.setbtn16("btn16", ON2, this);
         GlownyWidokMaga.setbtn17("btn17", ON2, this);
         GlownyWidokMaga.setbtn18("btn18", ON2, this);
         GlownyWidokMaga.setbtn19("btn19", ON2, this);
         GlownyWidokMaga.setbtn20("btn20", ON2, this);
         GlownyWidokMaga.setbtn21("btn21", ON2, this);
         GlownyWidokMaga.setbtn22("btn22", ON2, this);
         GlownyWidokMaga.setbtn23("btn23", ON2, this);
         GlownyWidokMaga.setbtn24("btn24", ON2, this);
         GlownyWidokMaga.setbtn25("btn25", ON2, this);
         GlownyWidokMaga.setbtn26("btn26", ON2, this);
         GlownyWidokMaga.setbtn27("btn27", ON2, this);
         GlownyWidokMaga.setbtn28("btn28", ON2, this);
         GlownyWidokMaga.setbtn29("btn29", ON2, this);
         GlownyWidokMaga.setbtn30("btn30", ON2, this);
         GlownyWidokCzarnoksieznika.setsbtncc1("sbtncc1", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setsbtncc2("sbtncc2", AUTOMATIC, this);
         GlownyWidokCzarnoksieznika.setbtnc1("btnc1", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc2("btnc2", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc7("btnc7", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc8("btnc8", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc9("btnc9", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc10("btnc10", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc11("btnc11", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc12("btnc12", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc13("btnc13", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc14("btnc14", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc15("btnc15", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc16("btnc16", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc17("btnc17", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc18("btnc18", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc19("btnc19", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc20("btnc20", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc21("btnc21", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc22("btnc22", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc23("btnc23", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc24("btnc24", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc25("btnc25", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc26("btnc26", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc27("btnc27", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc28("btnc28", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc29("btnc29", ON2, this);
         GlownyWidokCzarnoksieznika.setbtnc30("btnc30", ON2, this);
         GlownyWidokCzarnoksieznika.sbc1=0;
         GlownyWidokCzarnoksieznika.sbc2=0;
         GlownyWidokMaga.sb1=0;
         GlownyWidokMaga.sb2=0;
         GlownyWidokCzarnoksieznika.gc=1;
         GlownyWidokMaga.gm=1;
         Intent intent = new Intent(Menu.this, PytanieLiterkowe.class);
         Menu.poprawneWylaczenie=1; startActivity(intent);

     }





}