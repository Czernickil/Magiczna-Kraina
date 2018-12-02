package lukasz.p1.kraina1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;

import android.view.View;

import java.io.IOException;
import java.util.Random;

import static lukasz.p1.kraina1.FlashButton.FlashEnum.AUTOMATIC;
import static lukasz.p1.kraina1.FlashButton.FlashEnum.ON;
import static lukasz.p1.kraina1.FlashButton2.FlashEnum2.ON2;
import static lukasz.p1.kraina1.FlashButton3.FlashEnum3.ON3;
import static lukasz.p1.kraina1.FlashButton3.FlashEnum3.ON3m;
import static lukasz.p1.kraina1.FlashButton3.FlashEnum3.ON3p;
import static lukasz.p1.kraina1.FlashButton3.FlashEnum3.ON3z;
import static lukasz.p1.kraina1.MainActivity.punkty;
import static lukasz.p1.kraina1.MainActivity.r;
import static lukasz.p1.kraina1.MainActivity.skrzaty;
import static lukasz.p1.kraina1.MainActivityc.skrzatyc;
import static lukasz.p1.kraina1.MainActivityc.punktyc;
import static lukasz.p1.kraina1.pytlit.setlit;
import static lukasz.p1.kraina1.pytobr.setpyto;
import static lukasz.p1.kraina1.pytreb.setreb;
import static lukasz.p1.kraina1.pytzab.setpytzab;
import static lukasz.p1.kraina1.pytztxt.*;
import android.media.MediaPlayer;
import android.widget.ToggleButton;
import static lukasz.p1.kraina1.FlashButton6.*;
public class Menu extends AppCompatActivity {
    public static int zm = 0;

    public static int zc = 0;
    public static int kon = 0;
    public static int wyl;
    public static MediaPlayer mp;
    public static int k = 0;
    public static int pp = 0;
    int soundId;
    double czas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

    }
    public void onStart() {
        super.onStart();
        Menu.wyl = 0;
        zm = (int) getzm("a", this);
        zc = (int) getzc("b", this);
        k = (int) getk("k", this);
        punkty = (int) getpm("c", this);
        punktyc = (int) getpc("d", this);
        skrzaty = (int) getsm("a", this);
        skrzatyc = (int) getsc("b", this);
    }


    public void onPause() {
        super.onPause();
        if (wyl == 0) {
            Intro.z = 0;
            Intro.adp.run();
        }
    }
    public void onResume() {
        super.onResume();
    }
    public void onStop() {
        super.onStop();
        setzm("a", zm, this);
        setzc("b", zc, this);
        setzm("e", skrzaty, this);
        setzc("f", skrzatyc, this);
        setpm("c", punkty, this);
        setpc("d", punktyc, this);
        setk("k", k, this);
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
        k = 1;
        Random generator = new Random();
        kon = 1;
        zm = generator.nextInt(10) + 1;
        zc = generator.nextInt(10) + 1;
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
        MainActivityc.setDefaultsc2("etatTogglec2", ON, this);
        MainActivityc.setDefaultsc4("etatTogglec4", AUTOMATIC, this);
        MainActivityc.setDefaultsc6("etatTogglec6", ON, this);
        MainActivityc.setDefaultsc7("etatTogglec7", AUTOMATIC, this);
        MainActivityc.setDefaultsc8("etatTogglec8", AUTOMATIC, this);
        MainActivityc.setDefaultsc9("etatTogglec9", ON, this);
        //2
        MainActivityc.setDefaultsc22("etatTogglec22", ON, this);
        MainActivityc.setDefaultsc24("etatTogglec24", AUTOMATIC, this);
        MainActivityc.setDefaultsc26("etatTogglec26", ON, this);
        MainActivityc.setDefaultsc27("etatTogglec27", AUTOMATIC, this);
        MainActivityc.setDefaultsc28("etatTogglec28", AUTOMATIC, this);
        MainActivityc.setDefaultsc29("etatTogglec29", ON, this);
        //3
        MainActivityc.setDefaultsc32("etatTogglec32", ON, this);
        MainActivityc.setDefaultsc34("etatTogglec34", AUTOMATIC, this);
        MainActivityc.setDefaultsc36("etatTogglec36", ON, this);
        MainActivityc.setDefaultsc37("etatTogglec37", AUTOMATIC, this);
        MainActivityc.setDefaultsc38("etatTogglec38", AUTOMATIC, this);
        MainActivityc.setDefaultsc39("etatTogglec39", ON, this);
        //4
        MainActivityc.setDefaultsc42("etatTogglec42", ON, this);
        MainActivityc.setDefaultsc44("etatTogglec44", AUTOMATIC, this);
        MainActivityc.setDefaultsc46("etatTogglec46", ON, this);
        MainActivityc.setDefaultsc47("etatTogglec47", AUTOMATIC, this);
        MainActivityc.setDefaultsc48("etatTogglec48", AUTOMATIC, this);
        MainActivityc.setDefaultsc49("etatTogglec49", ON, this);
        //5
        MainActivityc.setDefaultsc52("etatTogglec52", ON, this);
        MainActivityc.setDefaultsc54("etatTogglec54", AUTOMATIC, this);
        MainActivityc.setDefaultsc56("etatTogglec56", ON, this);
        MainActivityc.setDefaultsc57("etatTogglec57", AUTOMATIC, this);
        MainActivityc.setDefaultsc58("etatTogglec58", AUTOMATIC, this);
        MainActivityc.setDefaultsc59("etatTogglec59", ON, this);
        //6
        MainActivityc.setDefaultsc62("etatTogglec62", ON, this);
        MainActivityc.setDefaultsc64("etatTogglec64", AUTOMATIC, this);
        MainActivityc.setDefaultsc66("etatTogglec66", ON, this);
        MainActivityc.setDefaultsc67("etatTogglec67", AUTOMATIC, this);
        MainActivityc.setDefaultsc68("etatTogglec68", AUTOMATIC, this);
        MainActivityc.setDefaultsc69("etatTogglec69", ON, this);
        punktyc = 0;
        MainActivityc.skrzatyc = 0;
        //czar
        MainActivity.setDefaults2("etatToggle2", ON, this);
        MainActivity.setDefaults4("etatToggle4", AUTOMATIC, this);
        MainActivity.setDefaults6("etatToggle6", ON, this);
        MainActivity.setDefaults7("etatToggle7", AUTOMATIC, this);
        MainActivity.setDefaults8("etatToggle8", AUTOMATIC, this);
        MainActivity.setDefaults9("etatToggle9", ON, this);
        //2
        MainActivity.setDefaults22("etatToggle22", ON, this);
        MainActivity.setDefaults24("etatToggle24", AUTOMATIC, this);
        MainActivity.setDefaults26("etatToggle26", ON, this);
        MainActivity.setDefaults27("etatToggle27", AUTOMATIC, this);
        MainActivity.setDefaults28("etatToggle28", AUTOMATIC, this);
        MainActivity.setDefaults29("etatToggle29", ON, this);
        //3
        MainActivity.setDefaults32("etatToggle32", ON, this);
        MainActivity.setDefaults34("etatToggle34", AUTOMATIC, this);
        MainActivity.setDefaults36("etatToggle36", ON, this);
        MainActivity.setDefaults37("etatToggle37", AUTOMATIC, this);
        MainActivity.setDefaults38("etatToggle38", AUTOMATIC, this);
        MainActivity.setDefaults39("etatToggle39", ON, this);
        //4
        MainActivity.setDefaults42("etatToggle42", ON, this);
        MainActivity.setDefaults44("etatToggle44", AUTOMATIC, this);
        MainActivity.setDefaults46("etatToggle46", ON, this);
        MainActivity.setDefaults47("etatToggle47", AUTOMATIC, this);
        MainActivity.setDefaults48("etatToggle48", AUTOMATIC, this);
        MainActivity.setDefaults49("etatToggle49", ON, this);
        //5
        MainActivity.setDefaults52("etatToggle52", ON, this);
        MainActivity.setDefaults54("etatToggle54", AUTOMATIC, this);
        MainActivity.setDefaults56("etatToggle56", ON, this);
        MainActivity.setDefaults57("etatToggle57", AUTOMATIC, this);
        MainActivity.setDefaults58("etatToggle58", AUTOMATIC, this);
        MainActivity.setDefaults59("etatToggle59", ON, this);
        //6
        MainActivity.setDefaults62("etatToggle62", ON, this);
        MainActivity.setDefaults64("etatToggle64", AUTOMATIC, this);
        MainActivity.setDefaults66("etatToggle66", ON, this);
        MainActivity.setDefaults67("etatToggle67", AUTOMATIC, this);
        MainActivity.setDefaults68("etatToggle68", AUTOMATIC, this);
        MainActivity.setDefaults69("etatToggle69", ON, this);
        punkty = 0;
        MainActivity.skrzaty = 0;
        // pytania czar
        pytania2c.setDefaultsc1p("etatTogglec1p", ON3, this);
        pytania2c.setDefaultsc2p("etatTogglec2p", ON3, this);
        pytania2c.setDefaultsc3p("etatTogglec3p", ON3, this);
        pytania2c.setDefaultsc4p("etatTogglec4p", ON3, this);
        pytania2c.setDefaultsc5p("etatTogglec5p", ON3, this);
        pytania2c.setDefaultsc6p("etatTogglec6p", ON3, this);
        pytania2c.setDefaultsc7p("etatTogglec7p", ON3m, this);
        pytania2c.setDefaultsc8p("etatTogglec8p", ON3m, this);
        pytania2c.setDefaultsc9p("etatTogglec9p", ON3m, this);
        pytania2c.setDefaultsc10p("etatTogglec10p", ON3m, this);
        pytania2c.setDefaultsc11p("etatTogglec11p", ON3m, this);
        pytania2c.setDefaultsc12p("etatTogglec12p", ON3m, this);
        pytania2c.setDefaultsc13p("etatTogglec13p", ON3z, this);
        pytania2c.setDefaultsc14p("etatTogglec14p", ON3z, this);
        pytania2c.setDefaultsc15p("etatTogglec15p", ON3z, this);
        pytania2c.setDefaultsc16p("etatTogglec16p", ON3z, this);
        pytania2c.setDefaultsc17p("etatTogglec17p", ON3z, this);
        pytania2c.setDefaultsc18p("etatTogglec18p", ON3z, this);
        pytania2c.setDefaultsc19p("etatTogglec19p", ON3p, this);
        pytania2c.setDefaultsc20p("etatTogglec20p", ON3p, this);
        pytania2c.setDefaultsc21p("etatTogglec21p", ON3p, this);
        pytania2c.setDefaultsc22p("etatTogglec22p", ON3p, this);
        pytania2c.setDefaultsc23p("etatTogglec23p", ON3p, this);
        pytania2c.setDefaultsc24p("etatTogglec24p", ON3p, this);
        pytania2c.setDefaultsca1p("etatToggleac1p", ON3, this);
        pytania2c.setDefaultsca2p("etatToggleac2p", ON3, this);
        pytania2c.setDefaultsca3p("etatToggleac3p", ON3, this);
        pytania2c.setDefaultsca4p("etatToggleac4p", ON3, this);
        pytania2c.setDefaultsca5p("etatToggleac5p", ON3, this);
        pytania2c.setDefaultsca6p("etatToggleac6p", ON3, this);
        pytania2c.setDefaultsca7p("etatToggleac7p", ON3m, this);
        pytania2c.setDefaultsca8p("etatToggleac8p", ON3m, this);
        pytania2c.setDefaultsca9p("etatToggleac9p", ON3m, this);
        pytania2c.setDefaultsca10p("etatToggleac10p", ON3m, this);
        pytania2c.setDefaultsca11p("etatToggleac11p", ON3m, this);
        pytania2c.setDefaultsca12p("etatToggleac12p", ON3m, this);
        pytania2c.setDefaultsca13p("etatToggleac13p", ON3z, this);
        pytania2c.setDefaultsca14p("etatToggleac14p", ON3z, this);
        pytania2c.setDefaultsca15p("etatToggleac15p", ON3z, this);
        pytania2c.setDefaultsca16p("etatToggleac16p", ON3z, this);
        pytania2c.setDefaultsca17p("etatToggleac17p", ON3z, this);
        pytania2c.setDefaultsca18p("etatToggleac18p", ON3z, this);
        pytania2c.setDefaultsca19p("etatToggleac19p", ON3p, this);
        pytania2c.setDefaultsca20p("etatToggleac20p", ON3p, this);
        pytania2c.setDefaultsca21p("etatToggleac21p", ON3p, this);
        pytania2c.setDefaultsca22p("etatToggleac22p", ON3p, this);
        pytania2c.setDefaultsca23p("etatToggleac23p", ON3p, this);
        pytania2c.setDefaultsca24p("etatToggleac24p", ON3p, this);
        // pytania mag
        pytania2.setDefaults1p("etatToggle1p", ON3, this);
        pytania2.setDefaults2p("etatToggle2p", ON3, this);
        pytania2.setDefaults3p("etatToggle3p", ON3, this);
        pytania2.setDefaults4p("etatToggle4p", ON3, this);
        pytania2.setDefaults5p("etatToggle5p", ON3, this);
        pytania2.setDefaults6p("etatToggle6p", ON3, this);
        pytania2.setDefaults7p("etatToggle7p", ON3m, this);
        pytania2.setDefaults8p("etatToggle8p", ON3m, this);
        pytania2.setDefaults9p("etatToggle9p", ON3m, this);
        pytania2.setDefaults10p("etatToggle10p", ON3m, this);
        pytania2.setDefaults11p("etatToggle11p", ON3m, this);
        pytania2.setDefaults12p("etatToggle12p", ON3m, this);
        pytania2.setDefaults13p("etatToggle13p", ON3z, this);
        pytania2.setDefaults14p("etatToggle14p", ON3z, this);
        pytania2.setDefaults15p("etatToggle15p", ON3z, this);
        pytania2.setDefaults16p("etatToggle16p", ON3z, this);
        pytania2.setDefaults17p("etatToggle17p", ON3z, this);
        pytania2.setDefaults18p("etatToggle18p", ON3z, this);
        pytania2.setDefaults19p("etatToggle19p", ON3p, this);
        pytania2.setDefaults20p("etatToggle20p", ON3p, this);
        pytania2.setDefaults21p("etatToggle21p", ON3p, this);
        pytania2.setDefaults22p("etatToggle22p", ON3p, this);
        pytania2.setDefaults23p("etatToggle23p", ON3p, this);
        pytania2.setDefaults24p("etatToggle24p", ON3p, this);
        pytania2.setDefaultsa1p("etatTogglea1p", ON3, this);
        pytania2.setDefaultsa2p("etatTogglea2p", ON3, this);
        pytania2.setDefaultsa3p("etatTogglea3p", ON3, this);
        pytania2.setDefaultsa4p("etatTogglea4p", ON3, this);
        pytania2.setDefaultsa5p("etatTogglea5p", ON3, this);
        pytania2.setDefaultsa6p("etatTogglea6p", ON3, this);
        pytania2.setDefaultsa7p("etatTogglea7p", ON3m, this);
        pytania2.setDefaultsa8p("etatTogglea8p", ON3m, this);
        pytania2.setDefaultsa9p("etatTogglea9p", ON3m, this);
        pytania2.setDefaultsa10p("etatTogglea10p", ON3m, this);
        pytania2.setDefaultsa11p("etatTogglea11p", ON3m, this);
        pytania2.setDefaultsa12p("etatTogglea12p", ON3m, this);
        pytania2.setDefaultsa13p("etatTogglea13p", ON3z, this);
        pytania2.setDefaultsa14p("etatTogglea14p", ON3z, this);
        pytania2.setDefaultsa15p("etatTogglea15p", ON3z, this);
        pytania2.setDefaultsa16p("etatTogglea16p", ON3z, this);
        pytania2.setDefaultsa17p("etatTogglea17p", ON3z, this);
        pytania2.setDefaultsa18p("etatTogglea18p", ON3z, this);
        pytania2.setDefaultsa19p("etatTogglea19p", ON3p, this);
        pytania2.setDefaultsa20p("etatTogglea20p", ON3p, this);
        pytania2.setDefaultsa21p("etatTogglea21p", ON3p, this);
        pytania2.setDefaultsa22p("etatTogglea22p", ON3p, this);
        pytania2.setDefaultsa23p("etatTogglea23p", ON3p, this);
        pytania2.setDefaultsa24p("etatTogglea24p", ON3p, this);
        MainActivity.setsbtn1("sbtn1", AUTOMATIC, this);
        MainActivity.setsbtn2("sbtn2", AUTOMATIC, this);
        MainActivity.setbtn1("btn1", ON2, this);
        MainActivity.setbtn2("btn2", ON2, this);
        MainActivity.setbtn7("btn7", ON2, this);
        MainActivity.setbtn8("btn8", ON2, this);
        MainActivity.setbtn9("btn9", ON2, this);
        MainActivity.setbtn10("btn10", ON2, this);
        MainActivity.setbtn11("btn11", ON2, this);
        MainActivity.setbtn12("btn12", ON2, this);
        MainActivity.setbtn13("btn13", ON2, this);
        MainActivity.setbtn14("btn14", ON2, this);
        MainActivity.setbtn15("btn15", ON2, this);
        MainActivity.setbtn16("btn16", ON2, this);
        MainActivity.setbtn17("btn17", ON2, this);
        MainActivity.setbtn18("btn18", ON2, this);
        MainActivity.setbtn19("btn19", ON2, this);
        MainActivity.setbtn20("btn20", ON2, this);
        MainActivity.setbtn21("btn21", ON2, this);
        MainActivity.setbtn22("btn22", ON2, this);
        MainActivity.setbtn23("btn23", ON2, this);
        MainActivity.setbtn24("btn24", ON2, this);
        MainActivity.setbtn25("btn25", ON2, this);
        MainActivity.setbtn26("btn26", ON2, this);
        MainActivity.setbtn27("btn27", ON2, this);
        MainActivity.setbtn28("btn28", ON2, this);
        MainActivity.setbtn29("btn29", ON2, this);
        MainActivity.setbtn30("btn30", ON2, this);
        MainActivityc.setsbtncc1("sbtncc1", AUTOMATIC, this);
        MainActivityc.setsbtncc2("sbtncc2", AUTOMATIC, this);
        MainActivityc.setbtnc1("btnc1", ON2, this);
        MainActivityc.setbtnc2("btnc2", ON2, this);
        MainActivityc.setbtnc7("btnc7", ON2, this);
        MainActivityc.setbtnc8("btnc8", ON2, this);
        MainActivityc.setbtnc9("btnc9", ON2, this);
        MainActivityc.setbtnc10("btnc10", ON2, this);
        MainActivityc.setbtnc11("btnc11", ON2, this);
        MainActivityc.setbtnc12("btnc12", ON2, this);
        MainActivityc.setbtnc13("btnc13", ON2, this);
        MainActivityc.setbtnc14("btnc14", ON2, this);
        MainActivityc.setbtnc15("btnc15", ON2, this);
        MainActivityc.setbtnc16("btnc16", ON2, this);
        MainActivityc.setbtnc17("btnc17", ON2, this);
        MainActivityc.setbtnc18("btnc18", ON2, this);
        MainActivityc.setbtnc19("btnc19", ON2, this);
        MainActivityc.setbtnc20("btnc20", ON2, this);
        MainActivityc.setbtnc21("btnc21", ON2, this);
        MainActivityc.setbtnc22("btnc22", ON2, this);
        MainActivityc.setbtnc23("btnc23", ON2, this);
        MainActivityc.setbtnc24("btnc24", ON2, this);
        MainActivityc.setbtnc25("btnc25", ON2, this);
        MainActivityc.setbtnc26("btnc26", ON2, this);
        MainActivityc.setbtnc27("btnc27", ON2, this);
        MainActivityc.setbtnc28("btnc28", ON2, this);
        MainActivityc.setbtnc29("btnc29", ON2, this);
        MainActivityc.setbtnc30("btnc30", ON2, this);
        MainActivityc.sbc1 = 0;
        MainActivityc.sbc2 = 0;
        MainActivity.sb1 = 0;
        MainActivity.sb2 = 0;
        MainActivityc.gc = 1;
        MainActivity.gm = 1;
        Intent intent = new Intent(Menu.this, MainActivity.class);
        Menu.wyl = 1;
        startActivity(intent);

    }

    public void kontynuacja(View view) {
        if (k == 0) {
            this.nowa(view);
        }
        skrzaty = getsm("bbbbm", this);
        skrzatyc = getsc("bbbbc", this);
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
            if (pytztxt.getzaj(i + "pol1").equals("Z"))
                pytztxt.pytpol1[i][5] = pytztxt.getzaj(i + "pol1");
        }
        for (int i = 0; i < 8; i++) {
            if (pytztxt.getzaj(i + "pol2").equals("Z"))
                pytztxt.pytpol2[i][5] = pytztxt.getzaj(i + "pol2");
        }
        for (int i = 0; i < 8; i++) {
            if (pytztxt.getzaj(i + "pol3").equals("Z"))
                pytztxt.pytpol3[i][5] = pytztxt.getzaj(i + "pol3");
        }
        for (int i = 0; i < 8; i++) {
            if (pytztxt.getzaj(i + "mat1").equals("Z"))
                pytztxt.pytmat1[i][5] = pytztxt.getzaj(i + "mat1");
        }
        for (int i = 0; i < 8; i++) {
            if (pytztxt.getzaj(i + "mat2").equals("Z"))
                pytztxt.pytmat2[i][5] = pytztxt.getzaj(i + "mat2");
        }
        for (int i = 0; i < 8; i++) {
            if (pytztxt.getzaj(i + "mat3").equals("Z"))
                pytztxt.pytmat3[i][5] = pytztxt.getzaj(i + "mat3");
        }
        for (int i = 0; i < 8; i++) {
            if (pytztxt.getzaj(i + "prz1").equals("Z"))
                pytztxt.pytprz1[i][5] = pytztxt.getzaj(i + "prz1");
        }
        for (int i = 0; i < 8; i++) {
            if (pytztxt.getzaj(i + "prz2").equals("Z"))
                pytztxt.pytprz2[i][5] = pytztxt.getzaj(i + "prz2");
        }
        for (int i = 0; i < 8; i++) {
            if (pytztxt.getzaj(i + "prz3").equals("Z"))
                pytztxt.pytprz3[i][5] = pytztxt.getzaj(i + "prz3");
        }
        for (int i = 0; i < 8; i++) {
            if (pytztxt.getzaj(i + "zyc1").equals("Z"))
                pytztxt.pytzyc1[i][5] = pytztxt.getzaj(i + "zyc1");
        }
        for (int i = 0; i < 8; i++) {
            if (pytztxt.getzaj(i + "zyc2").equals("Z"))
                pytztxt.pytzyc2[i][5] = pytztxt.getzaj(i + "zyc2");
        }
        for (int i = 0; i < 8; i++) {
            if (pytztxt.getzaj(i + "zyc3").equals("Z"))
                pytztxt.pytzyc3[i][5] = pytztxt.getzaj(i + "zyc3");
        }
        for (int i = 0; i < 11; i++) {
            if (pytzab.getzaj(i + "zab").equals("Z"))
                pytzab.pytzab[i][1] = pytztxt.getzaj(i + "zab");
        }
        for (int i = 0; i < 13; i++) {
            if (pytreb.getzaj(i + "reb").equals("Z"))
                pytreb.poprawne[i][5] = pytztxt.getzaj(i + "reb");
        }
        for (int i = 0; i < 12; i++) {
            if (pytobr.getzaj(i + "zab").equals("Z"))
                pytobr.pytobr[i][6] = pytztxt.getzaj(i + "obr");
        }
        for (int i = 0; i < 19; i++) {
            if (pytztxt.getzaj(i + "lit").equals("Z"))
                pytlit.poprawne[i][5] = pytztxt.getzaj(i + "lit");
        }
        if (r == 1) {
            Intent intent = new Intent(Menu.this, MainActivity.class);
            Menu.wyl = 1;
            startActivity(intent);
        } else {
            Intent intentc = new Intent(Menu.this, MainActivityc.class);
            Menu.wyl = 1;
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
        Menu.wyl = 1;
        startActivity(intent);

    }
    public void instrukcja(View view) {
        Intent intent = new Intent(Menu.this, instrukcja.class);
        Menu.wyl = 1;
        startActivity(intent);
    }
    public void autorzy(View view) {
        Intent intent = new Intent(Menu.this, autorzy.class);
        Menu.wyl = 1;
        startActivity(intent);
    }
    public void opcje(View view) {
        Intent intent = new Intent(Menu.this, opcje.class);
        Menu.wyl = 1;
        startActivity(intent);
    }
    /*
     public void testportal(View view) {
         Random generator = new Random();
         kon=1;
         zm=generator.nextInt(10)+1;
         zc=generator.nextInt(10)+1;
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
         MainActivityc.setDefaultsc2("etatTogglec2", ON, this);
         MainActivityc.setDefaultsc4("etatTogglec4", AUTOMATIC, this);
         MainActivityc.setDefaultsc6("etatTogglec6", ON, this);
         MainActivityc.setDefaultsc7("etatTogglec7", AUTOMATIC, this);
         MainActivityc.setDefaultsc8("etatTogglec8", AUTOMATIC, this);
         MainActivityc.setDefaultsc9("etatTogglec9", ON, this);
         //2
         MainActivityc.setDefaultsc22("etatTogglec22", ON, this);
         MainActivityc.setDefaultsc24("etatTogglec24", AUTOMATIC, this);
         MainActivityc.setDefaultsc26("etatTogglec26", ON, this);
         MainActivityc.setDefaultsc27("etatTogglec27", AUTOMATIC, this);
         MainActivityc.setDefaultsc28("etatTogglec28", AUTOMATIC, this);
         MainActivityc.setDefaultsc29("etatTogglec29", ON, this);
         //3
         MainActivityc.setDefaultsc32("etatTogglec32", ON, this);
         MainActivityc.setDefaultsc34("etatTogglec34", AUTOMATIC, this);
         MainActivityc.setDefaultsc36("etatTogglec36", ON, this);
         MainActivityc.setDefaultsc37("etatTogglec37", AUTOMATIC, this);
         MainActivityc.setDefaultsc38("etatTogglec38", AUTOMATIC, this);
         MainActivityc.setDefaultsc39("etatTogglec39", ON, this);
         //4
         MainActivityc.setDefaultsc42("etatTogglec42", ON, this);
         MainActivityc.setDefaultsc44("etatTogglec44", AUTOMATIC, this);
         MainActivityc.setDefaultsc46("etatTogglec46", ON, this);
         MainActivityc.setDefaultsc47("etatTogglec47", AUTOMATIC, this);
         MainActivityc.setDefaultsc48("etatTogglec48", AUTOMATIC, this);
         MainActivityc.setDefaultsc49("etatTogglec49", ON, this);
         //5
         MainActivityc.setDefaultsc52("etatTogglec52", ON, this);
         MainActivityc.setDefaultsc54("etatTogglec54", AUTOMATIC, this);
         MainActivityc.setDefaultsc56("etatTogglec56", ON, this);
         MainActivityc.setDefaultsc57("etatTogglec57", AUTOMATIC, this);
         MainActivityc.setDefaultsc58("etatTogglec58", AUTOMATIC, this);
         MainActivityc.setDefaultsc59("etatTogglec59", ON, this);
         //6
         MainActivityc.setDefaultsc62("etatTogglec62", ON, this);
         MainActivityc.setDefaultsc64("etatTogglec64", AUTOMATIC, this);
         MainActivityc.setDefaultsc66("etatTogglec66", ON, this);
         MainActivityc.setDefaultsc67("etatTogglec67", AUTOMATIC, this);
         MainActivityc.setDefaultsc68("etatTogglec68", AUTOMATIC, this);
         MainActivityc.setDefaultsc69("etatTogglec69", ON, this);
         punktyc=0;
         MainActivityc.skrzatyc=0;
         //czar
         MainActivity.setDefaults2("etatToggle2", ON, this);
         MainActivity.setDefaults4("etatToggle4", AUTOMATIC, this);
         MainActivity.setDefaults6("etatToggle6", ON, this);
         MainActivity.setDefaults7("etatToggle7", AUTOMATIC, this);
         MainActivity.setDefaults8("etatToggle8", AUTOMATIC, this);
         MainActivity.setDefaults9("etatToggle9", ON, this);
         //2
         MainActivity.setDefaults22("etatToggle22", ON, this);
         MainActivity.setDefaults24("etatToggle24", AUTOMATIC, this);
         MainActivity.setDefaults26("etatToggle26", ON, this);
         MainActivity.setDefaults27("etatToggle27", AUTOMATIC, this);
         MainActivity.setDefaults28("etatToggle28", AUTOMATIC, this);
         MainActivity.setDefaults29("etatToggle29", ON, this);
         //3
         MainActivity.setDefaults32("etatToggle32", ON, this);
         MainActivity.setDefaults34("etatToggle34", AUTOMATIC, this);
         MainActivity.setDefaults36("etatToggle36", ON, this);
         MainActivity.setDefaults37("etatToggle37", AUTOMATIC, this);
         MainActivity.setDefaults38("etatToggle38", AUTOMATIC, this);
         MainActivity.setDefaults39("etatToggle39", ON, this);
         //4
         MainActivity.setDefaults42("etatToggle42", ON, this);
         MainActivity.setDefaults44("etatToggle44", AUTOMATIC, this);
         MainActivity.setDefaults46("etatToggle46", ON, this);
         MainActivity.setDefaults47("etatToggle47", AUTOMATIC, this);
         MainActivity.setDefaults48("etatToggle48", AUTOMATIC, this);
         MainActivity.setDefaults49("etatToggle49", ON, this);
         //5
         MainActivity.setDefaults52("etatToggle52", ON, this);
         MainActivity.setDefaults54("etatToggle54", AUTOMATIC, this);
         MainActivity.setDefaults56("etatToggle56", ON, this);
         MainActivity.setDefaults57("etatToggle57", AUTOMATIC, this);
         MainActivity.setDefaults58("etatToggle58", AUTOMATIC, this);
         MainActivity.setDefaults59("etatToggle59", ON, this);
         //6
         MainActivity.setDefaults62("etatToggle62", ON, this);
         MainActivity.setDefaults64("etatToggle64", AUTOMATIC, this);
         MainActivity.setDefaults66("etatToggle66", ON, this);
         MainActivity.setDefaults67("etatToggle67", AUTOMATIC, this);
         MainActivity.setDefaults68("etatToggle68", AUTOMATIC, this);
         MainActivity.setDefaults69("etatToggle69", ON, this);
         punkty=0;
         MainActivity.skrzaty=0;
         // pytania czar
         pytania2c.setDefaultsc1p("etatTogglec1p", ON, this);
         pytania2c.setDefaultsc2p("etatTogglec2p", ON, this);
         pytania2c.setDefaultsc3p("etatTogglec3p", ON, this);
         pytania2c.setDefaultsc4p("etatTogglec4p", ON, this);
         pytania2c.setDefaultsc5p("etatTogglec5p", ON, this);
         pytania2c.setDefaultsc6p("etatTogglec6p", ON, this);
         pytania2c.setDefaultsc7p("etatTogglec7p", ON, this);
         pytania2c.setDefaultsc8p("etatTogglec8p", ON, this);
         pytania2c.setDefaultsc9p("etatTogglec9p", ON, this);
         pytania2c.setDefaultsc10p("etatTogglec10p", ON, this);
         pytania2c.setDefaultsc11p("etatTogglec11p", ON, this);
         pytania2c.setDefaultsc12p("etatTogglec12p", ON, this);
         pytania2c.setDefaultsc13p("etatTogglec13p", ON, this);
         pytania2c.setDefaultsc14p("etatTogglec14p", ON, this);
         pytania2c.setDefaultsc15p("etatTogglec15p", ON, this);
         pytania2c.setDefaultsc16p("etatTogglec16p", ON, this);
         pytania2c.setDefaultsc17p("etatTogglec17p", ON, this);
         pytania2c.setDefaultsc18p("etatTogglec18p", ON, this);
         pytania2c.setDefaultsc19p("etatTogglec19p", ON, this);
         pytania2c.setDefaultsc20p("etatTogglec20p", ON, this);
         pytania2c.setDefaultsc21p("etatTogglec21p", ON, this);
         pytania2c.setDefaultsc22p("etatTogglec22p", ON, this);
         pytania2c.setDefaultsc23p("etatTogglec23p", ON, this);
         pytania2c.setDefaultsc24p("etatTogglec24p", ON, this);
         pytania2c.setDefaultsca1p("etatToggleac1p", ON, this);
         pytania2c.setDefaultsca2p("etatToggleac2p", ON, this);
         pytania2c.setDefaultsca3p("etatToggleac3p", ON, this);
         pytania2c.setDefaultsca4p("etatToggleac4p", ON, this);
         pytania2c.setDefaultsca5p("etatToggleac5p", ON, this);
         pytania2c.setDefaultsca6p("etatToggleac6p", ON, this);
         pytania2c.setDefaultsca7p("etatToggleac7p", ON, this);
         pytania2c.setDefaultsca8p("etatToggleac8p", ON, this);
         pytania2c.setDefaultsca9p("etatToggleac9p", ON, this);
         pytania2c.setDefaultsca10p("etatToggleac10p", ON, this);
         pytania2c.setDefaultsca11p("etatToggleac11p", ON, this);
         pytania2c.setDefaultsca12p("etatToggleac12p", ON, this);
         pytania2c.setDefaultsca13p("etatToggleac13p", ON, this);
         pytania2c.setDefaultsca14p("etatToggleac14p", ON, this);
         pytania2c.setDefaultsca15p("etatToggleac15p", ON, this);
         pytania2c.setDefaultsca16p("etatToggleac16p", ON, this);
         pytania2c.setDefaultsca17p("etatToggleac17p", ON, this);
         pytania2c.setDefaultsca18p("etatToggleac18p", ON, this);
         pytania2c.setDefaultsca19p("etatToggleac19p", ON, this);
         pytania2c.setDefaultsca20p("etatToggleac20p", ON, this);
         pytania2c.setDefaultsca21p("etatToggleac21p", ON, this);
         pytania2c.setDefaultsca22p("etatToggleac22p", ON, this);
         pytania2c.setDefaultsca23p("etatToggleac23p", ON, this);
         pytania2c.setDefaultsca24p("etatToggleac24p", ON, this);
         // pytania mag
         pytania2.setDefaults1p("etatToggle1p", ON, this);
         pytania2.setDefaults2p("etatToggle2p", ON, this);
         pytania2.setDefaults3p("etatToggle3p", ON, this);
         pytania2.setDefaults4p("etatToggle4p", ON, this);
         pytania2.setDefaults5p("etatToggle5p", ON, this);
         pytania2.setDefaults6p("etatToggle6p", ON, this);
         pytania2.setDefaults7p("etatToggle7p", ON, this);
         pytania2.setDefaults8p("etatToggle8p", ON, this);
         pytania2.setDefaults9p("etatToggle9p", ON, this);
         pytania2.setDefaults10p("etatToggle10p", ON, this);
         pytania2.setDefaults11p("etatToggle11p", ON, this);
         pytania2.setDefaults12p("etatToggle12p", ON, this);
         pytania2.setDefaults13p("etatToggle13p", ON, this);
         pytania2.setDefaults14p("etatToggle14p", ON, this);
         pytania2.setDefaults15p("etatToggle15p", ON, this);
         pytania2.setDefaults16p("etatToggle16p", ON, this);
         pytania2.setDefaults17p("etatToggle17p", ON, this);
         pytania2.setDefaults18p("etatToggle18p", ON, this);
         pytania2.setDefaults19p("etatToggle19p", ON, this);
         pytania2.setDefaults20p("etatToggle20p", ON, this);
         pytania2.setDefaults21p("etatToggle21p", ON, this);
         pytania2.setDefaults22p("etatToggle22p", ON, this);
         pytania2.setDefaults23p("etatToggle23p", ON, this);
         pytania2.setDefaults24p("etatToggle24p", ON, this);
         pytania2.setDefaultsa1p("etatTogglea1p", ON, this);
         pytania2.setDefaultsa2p("etatTogglea2p", ON, this);
         pytania2.setDefaultsa3p("etatTogglea3p", ON, this);
         pytania2.setDefaultsa4p("etatTogglea4p", ON, this);
         pytania2.setDefaultsa5p("etatTogglea5p", ON, this);
         pytania2.setDefaultsa6p("etatTogglea6p", ON, this);
         pytania2.setDefaultsa7p("etatTogglea7p", ON, this);
         pytania2.setDefaultsa8p("etatTogglea8p", ON, this);
         pytania2.setDefaultsa9p("etatTogglea9p", ON, this);
         pytania2.setDefaultsa10p("etatTogglea10p", ON, this);
         pytania2.setDefaultsa11p("etatTogglea11p", ON, this);
         pytania2.setDefaultsa12p("etatTogglea12p", ON, this);
         pytania2.setDefaultsa13p("etatTogglea13p", ON, this);
         pytania2.setDefaultsa14p("etatTogglea14p", ON, this);
         pytania2.setDefaultsa15p("etatTogglea15p", ON, this);
         pytania2.setDefaultsa16p("etatTogglea16p", ON, this);
         pytania2.setDefaultsa17p("etatTogglea17p", ON, this);
         pytania2.setDefaultsa18p("etatTogglea18p", ON, this);
         pytania2.setDefaultsa19p("etatTogglea19p", ON, this);
         pytania2.setDefaultsa20p("etatTogglea20p", ON, this);
         pytania2.setDefaultsa21p("etatTogglea21p", ON, this);
         pytania2.setDefaultsa22p("etatTogglea22p", ON, this);
         pytania2.setDefaultsa23p("etatTogglea23p", ON, this);
         pytania2.setDefaultsa24p("etatTogglea24p", ON, this);
         MainActivity.setsbtn1("sbtn1", AUTOMATIC, this);
         MainActivity.setsbtn2("sbtn1", AUTOMATIC, this);
         MainActivity.setbtn1("btn1", ON2, this);
         MainActivity.setbtn2("btn2", ON2, this);
         MainActivity.setbtn7("btn7", ON2, this);
         MainActivity.setbtn8("btn8", ON2, this);
         MainActivity.setbtn9("btn9", ON2, this);
         MainActivity.setbtn10("btn10", ON2, this);
         MainActivity.setbtn11("btn11", ON2, this);
         MainActivity.setbtn12("btn12", ON2, this);
         MainActivity.setbtn13("btn13", ON2, this);
         MainActivity.setbtn14("btn14", ON2, this);
         MainActivity.setbtn15("btn15", ON2, this);
         MainActivity.setbtn16("btn16", ON2, this);
         MainActivity.setbtn17("btn17", ON2, this);
         MainActivity.setbtn18("btn18", ON2, this);
         MainActivity.setbtn19("btn19", ON2, this);
         MainActivity.setbtn20("btn20", ON2, this);
         MainActivity.setbtn21("btn21", ON2, this);
         MainActivity.setbtn22("btn22", ON2, this);
         MainActivity.setbtn23("btn23", ON2, this);
         MainActivity.setbtn24("btn24", ON2, this);
         MainActivity.setbtn25("btn25", ON2, this);
         MainActivity.setbtn26("btn26", ON2, this);
         MainActivity.setbtn27("btn27", ON2, this);
         MainActivity.setbtn28("btn28", ON2, this);
         MainActivity.setbtn29("btn29", ON2, this);
         MainActivity.setbtn30("btn30", ON2, this);
         MainActivityc.setsbtncc1("sbtncc1", AUTOMATIC, this);
         MainActivityc.setsbtncc2("sbtncc2", AUTOMATIC, this);
         MainActivityc.setbtnc1("btnc1", ON2, this);
         MainActivityc.setbtnc2("btnc2", ON2, this);
         MainActivityc.setbtnc7("btnc7", ON2, this);
         MainActivityc.setbtnc8("btnc8", ON2, this);
         MainActivityc.setbtnc9("btnc9", ON2, this);
         MainActivityc.setbtnc10("btnc10", ON2, this);
         MainActivityc.setbtnc11("btnc11", ON2, this);
         MainActivityc.setbtnc12("btnc12", ON2, this);
         MainActivityc.setbtnc13("btnc13", ON2, this);
         MainActivityc.setbtnc14("btnc14", ON2, this);
         MainActivityc.setbtnc15("btnc15", ON2, this);
         MainActivityc.setbtnc16("btnc16", ON2, this);
         MainActivityc.setbtnc17("btnc17", ON2, this);
         MainActivityc.setbtnc18("btnc18", ON2, this);
         MainActivityc.setbtnc19("btnc19", ON2, this);
         MainActivityc.setbtnc20("btnc20", ON2, this);
         MainActivityc.setbtnc21("btnc21", ON2, this);
         MainActivityc.setbtnc22("btnc22", ON2, this);
         MainActivityc.setbtnc23("btnc23", ON2, this);
         MainActivityc.setbtnc24("btnc24", ON2, this);
         MainActivityc.setbtnc25("btnc25", ON2, this);
         MainActivityc.setbtnc26("btnc26", ON2, this);
         MainActivityc.setbtnc27("btnc27", ON2, this);
         MainActivityc.setbtnc28("btnc28", ON2, this);
         MainActivityc.setbtnc29("btnc29", ON2, this);
         MainActivityc.setbtnc30("btnc30", ON2, this);
         MainActivityc.sbc1=0;
         MainActivityc.sbc2=0;
         MainActivity.sb1=0;
         MainActivity.sb2=0;
         MainActivityc.gc=1;
         MainActivity.gm=1;
         Intent intent = new Intent(Menu.this, wybport.class);
         Menu.wyl=1; startActivity(intent);

     }
     public void testrebus(View view) {
         Random generator = new Random();
         kon=1;
         zm=generator.nextInt(10)+1;
         zc=generator.nextInt(10)+1;
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
         MainActivityc.setDefaultsc2("etatTogglec2", ON, this);
         MainActivityc.setDefaultsc4("etatTogglec4", AUTOMATIC, this);
         MainActivityc.setDefaultsc6("etatTogglec6", ON, this);
         MainActivityc.setDefaultsc7("etatTogglec7", AUTOMATIC, this);
         MainActivityc.setDefaultsc8("etatTogglec8", AUTOMATIC, this);
         MainActivityc.setDefaultsc9("etatTogglec9", ON, this);
         //2
         MainActivityc.setDefaultsc22("etatTogglec22", ON, this);
         MainActivityc.setDefaultsc24("etatTogglec24", AUTOMATIC, this);
         MainActivityc.setDefaultsc26("etatTogglec26", ON, this);
         MainActivityc.setDefaultsc27("etatTogglec27", AUTOMATIC, this);
         MainActivityc.setDefaultsc28("etatTogglec28", AUTOMATIC, this);
         MainActivityc.setDefaultsc29("etatTogglec29", ON, this);
         //3
         MainActivityc.setDefaultsc32("etatTogglec32", ON, this);
         MainActivityc.setDefaultsc34("etatTogglec34", AUTOMATIC, this);
         MainActivityc.setDefaultsc36("etatTogglec36", ON, this);
         MainActivityc.setDefaultsc37("etatTogglec37", AUTOMATIC, this);
         MainActivityc.setDefaultsc38("etatTogglec38", AUTOMATIC, this);
         MainActivityc.setDefaultsc39("etatTogglec39", ON, this);
         //4
         MainActivityc.setDefaultsc42("etatTogglec42", ON, this);
         MainActivityc.setDefaultsc44("etatTogglec44", AUTOMATIC, this);
         MainActivityc.setDefaultsc46("etatTogglec46", ON, this);
         MainActivityc.setDefaultsc47("etatTogglec47", AUTOMATIC, this);
         MainActivityc.setDefaultsc48("etatTogglec48", AUTOMATIC, this);
         MainActivityc.setDefaultsc49("etatTogglec49", ON, this);
         //5
         MainActivityc.setDefaultsc52("etatTogglec52", ON, this);
         MainActivityc.setDefaultsc54("etatTogglec54", AUTOMATIC, this);
         MainActivityc.setDefaultsc56("etatTogglec56", ON, this);
         MainActivityc.setDefaultsc57("etatTogglec57", AUTOMATIC, this);
         MainActivityc.setDefaultsc58("etatTogglec58", AUTOMATIC, this);
         MainActivityc.setDefaultsc59("etatTogglec59", ON, this);
         //6
         MainActivityc.setDefaultsc62("etatTogglec62", ON, this);
         MainActivityc.setDefaultsc64("etatTogglec64", AUTOMATIC, this);
         MainActivityc.setDefaultsc66("etatTogglec66", ON, this);
         MainActivityc.setDefaultsc67("etatTogglec67", AUTOMATIC, this);
         MainActivityc.setDefaultsc68("etatTogglec68", AUTOMATIC, this);
         MainActivityc.setDefaultsc69("etatTogglec69", ON, this);
         punktyc=0;
         MainActivityc.skrzatyc=0;
         //czar
         MainActivity.setDefaults2("etatToggle2", ON, this);
         MainActivity.setDefaults4("etatToggle4", AUTOMATIC, this);
         MainActivity.setDefaults6("etatToggle6", ON, this);
         MainActivity.setDefaults7("etatToggle7", AUTOMATIC, this);
         MainActivity.setDefaults8("etatToggle8", AUTOMATIC, this);
         MainActivity.setDefaults9("etatToggle9", ON, this);
         //2
         MainActivity.setDefaults22("etatToggle22", ON, this);
         MainActivity.setDefaults24("etatToggle24", AUTOMATIC, this);
         MainActivity.setDefaults26("etatToggle26", ON, this);
         MainActivity.setDefaults27("etatToggle27", AUTOMATIC, this);
         MainActivity.setDefaults28("etatToggle28", AUTOMATIC, this);
         MainActivity.setDefaults29("etatToggle29", ON, this);
         //3
         MainActivity.setDefaults32("etatToggle32", ON, this);
         MainActivity.setDefaults34("etatToggle34", AUTOMATIC, this);
         MainActivity.setDefaults36("etatToggle36", ON, this);
         MainActivity.setDefaults37("etatToggle37", AUTOMATIC, this);
         MainActivity.setDefaults38("etatToggle38", AUTOMATIC, this);
         MainActivity.setDefaults39("etatToggle39", ON, this);
         //4
         MainActivity.setDefaults42("etatToggle42", ON, this);
         MainActivity.setDefaults44("etatToggle44", AUTOMATIC, this);
         MainActivity.setDefaults46("etatToggle46", ON, this);
         MainActivity.setDefaults47("etatToggle47", AUTOMATIC, this);
         MainActivity.setDefaults48("etatToggle48", AUTOMATIC, this);
         MainActivity.setDefaults49("etatToggle49", ON, this);
         //5
         MainActivity.setDefaults52("etatToggle52", ON, this);
         MainActivity.setDefaults54("etatToggle54", AUTOMATIC, this);
         MainActivity.setDefaults56("etatToggle56", ON, this);
         MainActivity.setDefaults57("etatToggle57", AUTOMATIC, this);
         MainActivity.setDefaults58("etatToggle58", AUTOMATIC, this);
         MainActivity.setDefaults59("etatToggle59", ON, this);
         //6
         MainActivity.setDefaults62("etatToggle62", ON, this);
         MainActivity.setDefaults64("etatToggle64", AUTOMATIC, this);
         MainActivity.setDefaults66("etatToggle66", ON, this);
         MainActivity.setDefaults67("etatToggle67", AUTOMATIC, this);
         MainActivity.setDefaults68("etatToggle68", AUTOMATIC, this);
         MainActivity.setDefaults69("etatToggle69", ON, this);
         punkty=0;
         MainActivity.skrzaty=0;
         // pytania czar
         pytania2c.setDefaultsc1p("etatTogglec1p", ON, this);
         pytania2c.setDefaultsc2p("etatTogglec2p", ON, this);
         pytania2c.setDefaultsc3p("etatTogglec3p", ON, this);
         pytania2c.setDefaultsc4p("etatTogglec4p", ON, this);
         pytania2c.setDefaultsc5p("etatTogglec5p", ON, this);
         pytania2c.setDefaultsc6p("etatTogglec6p", ON, this);
         pytania2c.setDefaultsc7p("etatTogglec7p", ON, this);
         pytania2c.setDefaultsc8p("etatTogglec8p", ON, this);
         pytania2c.setDefaultsc9p("etatTogglec9p", ON, this);
         pytania2c.setDefaultsc10p("etatTogglec10p", ON, this);
         pytania2c.setDefaultsc11p("etatTogglec11p", ON, this);
         pytania2c.setDefaultsc12p("etatTogglec12p", ON, this);
         pytania2c.setDefaultsc13p("etatTogglec13p", ON, this);
         pytania2c.setDefaultsc14p("etatTogglec14p", ON, this);
         pytania2c.setDefaultsc15p("etatTogglec15p", ON, this);
         pytania2c.setDefaultsc16p("etatTogglec16p", ON, this);
         pytania2c.setDefaultsc17p("etatTogglec17p", ON, this);
         pytania2c.setDefaultsc18p("etatTogglec18p", ON, this);
         pytania2c.setDefaultsc19p("etatTogglec19p", ON, this);
         pytania2c.setDefaultsc20p("etatTogglec20p", ON, this);
         pytania2c.setDefaultsc21p("etatTogglec21p", ON, this);
         pytania2c.setDefaultsc22p("etatTogglec22p", ON, this);
         pytania2c.setDefaultsc23p("etatTogglec23p", ON, this);
         pytania2c.setDefaultsc24p("etatTogglec24p", ON, this);
         pytania2c.setDefaultsca1p("etatToggleac1p", ON, this);
         pytania2c.setDefaultsca2p("etatToggleac2p", ON, this);
         pytania2c.setDefaultsca3p("etatToggleac3p", ON, this);
         pytania2c.setDefaultsca4p("etatToggleac4p", ON, this);
         pytania2c.setDefaultsca5p("etatToggleac5p", ON, this);
         pytania2c.setDefaultsca6p("etatToggleac6p", ON, this);
         pytania2c.setDefaultsca7p("etatToggleac7p", ON, this);
         pytania2c.setDefaultsca8p("etatToggleac8p", ON, this);
         pytania2c.setDefaultsca9p("etatToggleac9p", ON, this);
         pytania2c.setDefaultsca10p("etatToggleac10p", ON, this);
         pytania2c.setDefaultsca11p("etatToggleac11p", ON, this);
         pytania2c.setDefaultsca12p("etatToggleac12p", ON, this);
         pytania2c.setDefaultsca13p("etatToggleac13p", ON, this);
         pytania2c.setDefaultsca14p("etatToggleac14p", ON, this);
         pytania2c.setDefaultsca15p("etatToggleac15p", ON, this);
         pytania2c.setDefaultsca16p("etatToggleac16p", ON, this);
         pytania2c.setDefaultsca17p("etatToggleac17p", ON, this);
         pytania2c.setDefaultsca18p("etatToggleac18p", ON, this);
         pytania2c.setDefaultsca19p("etatToggleac19p", ON, this);
         pytania2c.setDefaultsca20p("etatToggleac20p", ON, this);
         pytania2c.setDefaultsca21p("etatToggleac21p", ON, this);
         pytania2c.setDefaultsca22p("etatToggleac22p", ON, this);
         pytania2c.setDefaultsca23p("etatToggleac23p", ON, this);
         pytania2c.setDefaultsca24p("etatToggleac24p", ON, this);
         // pytania mag
         pytania2.setDefaults1p("etatToggle1p", ON, this);
         pytania2.setDefaults2p("etatToggle2p", ON, this);
         pytania2.setDefaults3p("etatToggle3p", ON, this);
         pytania2.setDefaults4p("etatToggle4p", ON, this);
         pytania2.setDefaults5p("etatToggle5p", ON, this);
         pytania2.setDefaults6p("etatToggle6p", ON, this);
         pytania2.setDefaults7p("etatToggle7p", ON, this);
         pytania2.setDefaults8p("etatToggle8p", ON, this);
         pytania2.setDefaults9p("etatToggle9p", ON, this);
         pytania2.setDefaults10p("etatToggle10p", ON, this);
         pytania2.setDefaults11p("etatToggle11p", ON, this);
         pytania2.setDefaults12p("etatToggle12p", ON, this);
         pytania2.setDefaults13p("etatToggle13p", ON, this);
         pytania2.setDefaults14p("etatToggle14p", ON, this);
         pytania2.setDefaults15p("etatToggle15p", ON, this);
         pytania2.setDefaults16p("etatToggle16p", ON, this);
         pytania2.setDefaults17p("etatToggle17p", ON, this);
         pytania2.setDefaults18p("etatToggle18p", ON, this);
         pytania2.setDefaults19p("etatToggle19p", ON, this);
         pytania2.setDefaults20p("etatToggle20p", ON, this);
         pytania2.setDefaults21p("etatToggle21p", ON, this);
         pytania2.setDefaults22p("etatToggle22p", ON, this);
         pytania2.setDefaults23p("etatToggle23p", ON, this);
         pytania2.setDefaults24p("etatToggle24p", ON, this);
         pytania2.setDefaultsa1p("etatTogglea1p", ON, this);
         pytania2.setDefaultsa2p("etatTogglea2p", ON, this);
         pytania2.setDefaultsa3p("etatTogglea3p", ON, this);
         pytania2.setDefaultsa4p("etatTogglea4p", ON, this);
         pytania2.setDefaultsa5p("etatTogglea5p", ON, this);
         pytania2.setDefaultsa6p("etatTogglea6p", ON, this);
         pytania2.setDefaultsa7p("etatTogglea7p", ON, this);
         pytania2.setDefaultsa8p("etatTogglea8p", ON, this);
         pytania2.setDefaultsa9p("etatTogglea9p", ON, this);
         pytania2.setDefaultsa10p("etatTogglea10p", ON, this);
         pytania2.setDefaultsa11p("etatTogglea11p", ON, this);
         pytania2.setDefaultsa12p("etatTogglea12p", ON, this);
         pytania2.setDefaultsa13p("etatTogglea13p", ON, this);
         pytania2.setDefaultsa14p("etatTogglea14p", ON, this);
         pytania2.setDefaultsa15p("etatTogglea15p", ON, this);
         pytania2.setDefaultsa16p("etatTogglea16p", ON, this);
         pytania2.setDefaultsa17p("etatTogglea17p", ON, this);
         pytania2.setDefaultsa18p("etatTogglea18p", ON, this);
         pytania2.setDefaultsa19p("etatTogglea19p", ON, this);
         pytania2.setDefaultsa20p("etatTogglea20p", ON, this);
         pytania2.setDefaultsa21p("etatTogglea21p", ON, this);
         pytania2.setDefaultsa22p("etatTogglea22p", ON, this);
         pytania2.setDefaultsa23p("etatTogglea23p", ON, this);
         pytania2.setDefaultsa24p("etatTogglea24p", ON, this);
         MainActivity.setsbtn1("sbtn1", AUTOMATIC, this);
         MainActivity.setsbtn2("sbtn1", AUTOMATIC, this);
         MainActivity.setbtn1("btn1", ON2, this);
         MainActivity.setbtn2("btn2", ON2, this);
         MainActivity.setbtn7("btn7", ON2, this);
         MainActivity.setbtn8("btn8", ON2, this);
         MainActivity.setbtn9("btn9", ON2, this);
         MainActivity.setbtn10("btn10", ON2, this);
         MainActivity.setbtn11("btn11", ON2, this);
         MainActivity.setbtn12("btn12", ON2, this);
         MainActivity.setbtn13("btn13", ON2, this);
         MainActivity.setbtn14("btn14", ON2, this);
         MainActivity.setbtn15("btn15", ON2, this);
         MainActivity.setbtn16("btn16", ON2, this);
         MainActivity.setbtn17("btn17", ON2, this);
         MainActivity.setbtn18("btn18", ON2, this);
         MainActivity.setbtn19("btn19", ON2, this);
         MainActivity.setbtn20("btn20", ON2, this);
         MainActivity.setbtn21("btn21", ON2, this);
         MainActivity.setbtn22("btn22", ON2, this);
         MainActivity.setbtn23("btn23", ON2, this);
         MainActivity.setbtn24("btn24", ON2, this);
         MainActivity.setbtn25("btn25", ON2, this);
         MainActivity.setbtn26("btn26", ON2, this);
         MainActivity.setbtn27("btn27", ON2, this);
         MainActivity.setbtn28("btn28", ON2, this);
         MainActivity.setbtn29("btn29", ON2, this);
         MainActivity.setbtn30("btn30", ON2, this);
         MainActivityc.setsbtncc1("sbtnc1", AUTOMATIC, this);
         MainActivityc.setsbtncc2("sbtnc1", AUTOMATIC, this);
         MainActivityc.setbtnc1("btnc1", ON2, this);
         MainActivityc.setbtnc2("btnc2", ON2, this);
         MainActivityc.setbtnc7("btnc7", ON2, this);
         MainActivityc.setbtnc8("btnc8", ON2, this);
         MainActivityc.setbtnc9("btnc9", ON2, this);
         MainActivityc.setbtnc10("btnc10", ON2, this);
         MainActivityc.setbtnc11("btnc11", ON2, this);
         MainActivityc.setbtnc12("btnc12", ON2, this);
         MainActivityc.setbtnc13("btnc13", ON2, this);
         MainActivityc.setbtnc14("btnc14", ON2, this);
         MainActivityc.setbtnc15("btnc15", ON2, this);
         MainActivityc.setbtnc16("btnc16", ON2, this);
         MainActivityc.setbtnc17("btnc17", ON2, this);
         MainActivityc.setbtnc18("btnc18", ON2, this);
         MainActivityc.setbtnc19("btnc19", ON2, this);
         MainActivityc.setbtnc20("btnc20", ON2, this);
         MainActivityc.setbtnc21("btnc21", ON2, this);
         MainActivityc.setbtnc22("btnc22", ON2, this);
         MainActivityc.setbtnc23("btnc23", ON2, this);
         MainActivityc.setbtnc24("btnc24", ON2, this);
         MainActivityc.setbtnc25("btnc25", ON2, this);
         MainActivityc.setbtnc26("btnc26", ON2, this);
         MainActivityc.setbtnc27("btnc27", ON2, this);
         MainActivityc.setbtnc28("btnc28", ON2, this);
         MainActivityc.setbtnc29("btnc29", ON2, this);
         MainActivityc.setbtnc30("btnc30", ON2, this);
         MainActivityc.sbc1=0;
         MainActivityc.sbc2=0;
         MainActivity.sb1=0;
         MainActivity.sb2=0;
         MainActivityc.gc=1;
         MainActivity.gm=1;
         Intent intent = new Intent(Menu.this, pytreb.class);
         Menu.wyl=1; startActivity(intent);

     }
     public void testpytobr(View view) {
         Random generator = new Random();
         kon=1;
         zm=generator.nextInt(10)+1;
         zc=generator.nextInt(10)+1;
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
         MainActivityc.setDefaultsc2("etatTogglec2", ON, this);
         MainActivityc.setDefaultsc4("etatTogglec4", AUTOMATIC, this);
         MainActivityc.setDefaultsc6("etatTogglec6", ON, this);
         MainActivityc.setDefaultsc7("etatTogglec7", AUTOMATIC, this);
         MainActivityc.setDefaultsc8("etatTogglec8", AUTOMATIC, this);
         MainActivityc.setDefaultsc9("etatTogglec9", ON, this);
         //2
         MainActivityc.setDefaultsc22("etatTogglec22", ON, this);
         MainActivityc.setDefaultsc24("etatTogglec24", AUTOMATIC, this);
         MainActivityc.setDefaultsc26("etatTogglec26", ON, this);
         MainActivityc.setDefaultsc27("etatTogglec27", AUTOMATIC, this);
         MainActivityc.setDefaultsc28("etatTogglec28", AUTOMATIC, this);
         MainActivityc.setDefaultsc29("etatTogglec29", ON, this);
         //3
         MainActivityc.setDefaultsc32("etatTogglec32", ON, this);
         MainActivityc.setDefaultsc34("etatTogglec34", AUTOMATIC, this);
         MainActivityc.setDefaultsc36("etatTogglec36", ON, this);
         MainActivityc.setDefaultsc37("etatTogglec37", AUTOMATIC, this);
         MainActivityc.setDefaultsc38("etatTogglec38", AUTOMATIC, this);
         MainActivityc.setDefaultsc39("etatTogglec39", ON, this);
         //4
         MainActivityc.setDefaultsc42("etatTogglec42", ON, this);
         MainActivityc.setDefaultsc44("etatTogglec44", AUTOMATIC, this);
         MainActivityc.setDefaultsc46("etatTogglec46", ON, this);
         MainActivityc.setDefaultsc47("etatTogglec47", AUTOMATIC, this);
         MainActivityc.setDefaultsc48("etatTogglec48", AUTOMATIC, this);
         MainActivityc.setDefaultsc49("etatTogglec49", ON, this);
         //5
         MainActivityc.setDefaultsc52("etatTogglec52", ON, this);
         MainActivityc.setDefaultsc54("etatTogglec54", AUTOMATIC, this);
         MainActivityc.setDefaultsc56("etatTogglec56", ON, this);
         MainActivityc.setDefaultsc57("etatTogglec57", AUTOMATIC, this);
         MainActivityc.setDefaultsc58("etatTogglec58", AUTOMATIC, this);
         MainActivityc.setDefaultsc59("etatTogglec59", ON, this);
         //6
         MainActivityc.setDefaultsc62("etatTogglec62", ON, this);
         MainActivityc.setDefaultsc64("etatTogglec64", AUTOMATIC, this);
         MainActivityc.setDefaultsc66("etatTogglec66", ON, this);
         MainActivityc.setDefaultsc67("etatTogglec67", AUTOMATIC, this);
         MainActivityc.setDefaultsc68("etatTogglec68", AUTOMATIC, this);
         MainActivityc.setDefaultsc69("etatTogglec69", ON, this);
         punktyc=0;
         MainActivityc.skrzatyc=0;
         //czar
         MainActivity.setDefaults2("etatToggle2", ON, this);
         MainActivity.setDefaults4("etatToggle4", AUTOMATIC, this);
         MainActivity.setDefaults6("etatToggle6", ON, this);
         MainActivity.setDefaults7("etatToggle7", AUTOMATIC, this);
         MainActivity.setDefaults8("etatToggle8", AUTOMATIC, this);
         MainActivity.setDefaults9("etatToggle9", ON, this);
         //2
         MainActivity.setDefaults22("etatToggle22", ON, this);
         MainActivity.setDefaults24("etatToggle24", AUTOMATIC, this);
         MainActivity.setDefaults26("etatToggle26", ON, this);
         MainActivity.setDefaults27("etatToggle27", AUTOMATIC, this);
         MainActivity.setDefaults28("etatToggle28", AUTOMATIC, this);
         MainActivity.setDefaults29("etatToggle29", ON, this);
         //3
         MainActivity.setDefaults32("etatToggle32", ON, this);
         MainActivity.setDefaults34("etatToggle34", AUTOMATIC, this);
         MainActivity.setDefaults36("etatToggle36", ON, this);
         MainActivity.setDefaults37("etatToggle37", AUTOMATIC, this);
         MainActivity.setDefaults38("etatToggle38", AUTOMATIC, this);
         MainActivity.setDefaults39("etatToggle39", ON, this);
         //4
         MainActivity.setDefaults42("etatToggle42", ON, this);
         MainActivity.setDefaults44("etatToggle44", AUTOMATIC, this);
         MainActivity.setDefaults46("etatToggle46", ON, this);
         MainActivity.setDefaults47("etatToggle47", AUTOMATIC, this);
         MainActivity.setDefaults48("etatToggle48", AUTOMATIC, this);
         MainActivity.setDefaults49("etatToggle49", ON, this);
         //5
         MainActivity.setDefaults52("etatToggle52", ON, this);
         MainActivity.setDefaults54("etatToggle54", AUTOMATIC, this);
         MainActivity.setDefaults56("etatToggle56", ON, this);
         MainActivity.setDefaults57("etatToggle57", AUTOMATIC, this);
         MainActivity.setDefaults58("etatToggle58", AUTOMATIC, this);
         MainActivity.setDefaults59("etatToggle59", ON, this);
         //6
         MainActivity.setDefaults62("etatToggle62", ON, this);
         MainActivity.setDefaults64("etatToggle64", AUTOMATIC, this);
         MainActivity.setDefaults66("etatToggle66", ON, this);
         MainActivity.setDefaults67("etatToggle67", AUTOMATIC, this);
         MainActivity.setDefaults68("etatToggle68", AUTOMATIC, this);
         MainActivity.setDefaults69("etatToggle69", ON, this);
         punkty=0;
         MainActivity.skrzaty=0;
         // pytania czar
         pytania2c.setDefaultsc1p("etatTogglec1p", ON, this);
         pytania2c.setDefaultsc2p("etatTogglec2p", ON, this);
         pytania2c.setDefaultsc3p("etatTogglec3p", ON, this);
         pytania2c.setDefaultsc4p("etatTogglec4p", ON, this);
         pytania2c.setDefaultsc5p("etatTogglec5p", ON, this);
         pytania2c.setDefaultsc6p("etatTogglec6p", ON, this);
         pytania2c.setDefaultsc7p("etatTogglec7p", ON, this);
         pytania2c.setDefaultsc8p("etatTogglec8p", ON, this);
         pytania2c.setDefaultsc9p("etatTogglec9p", ON, this);
         pytania2c.setDefaultsc10p("etatTogglec10p", ON, this);
         pytania2c.setDefaultsc11p("etatTogglec11p", ON, this);
         pytania2c.setDefaultsc12p("etatTogglec12p", ON, this);
         pytania2c.setDefaultsc13p("etatTogglec13p", ON, this);
         pytania2c.setDefaultsc14p("etatTogglec14p", ON, this);
         pytania2c.setDefaultsc15p("etatTogglec15p", ON, this);
         pytania2c.setDefaultsc16p("etatTogglec16p", ON, this);
         pytania2c.setDefaultsc17p("etatTogglec17p", ON, this);
         pytania2c.setDefaultsc18p("etatTogglec18p", ON, this);
         pytania2c.setDefaultsc19p("etatTogglec19p", ON, this);
         pytania2c.setDefaultsc20p("etatTogglec20p", ON, this);
         pytania2c.setDefaultsc21p("etatTogglec21p", ON, this);
         pytania2c.setDefaultsc22p("etatTogglec22p", ON, this);
         pytania2c.setDefaultsc23p("etatTogglec23p", ON, this);
         pytania2c.setDefaultsc24p("etatTogglec24p", ON, this);
         pytania2c.setDefaultsca1p("etatToggleac1p", ON, this);
         pytania2c.setDefaultsca2p("etatToggleac2p", ON, this);
         pytania2c.setDefaultsca3p("etatToggleac3p", ON, this);
         pytania2c.setDefaultsca4p("etatToggleac4p", ON, this);
         pytania2c.setDefaultsca5p("etatToggleac5p", ON, this);
         pytania2c.setDefaultsca6p("etatToggleac6p", ON, this);
         pytania2c.setDefaultsca7p("etatToggleac7p", ON, this);
         pytania2c.setDefaultsca8p("etatToggleac8p", ON, this);
         pytania2c.setDefaultsca9p("etatToggleac9p", ON, this);
         pytania2c.setDefaultsca10p("etatToggleac10p", ON, this);
         pytania2c.setDefaultsca11p("etatToggleac11p", ON, this);
         pytania2c.setDefaultsca12p("etatToggleac12p", ON, this);
         pytania2c.setDefaultsca13p("etatToggleac13p", ON, this);
         pytania2c.setDefaultsca14p("etatToggleac14p", ON, this);
         pytania2c.setDefaultsca15p("etatToggleac15p", ON, this);
         pytania2c.setDefaultsca16p("etatToggleac16p", ON, this);
         pytania2c.setDefaultsca17p("etatToggleac17p", ON, this);
         pytania2c.setDefaultsca18p("etatToggleac18p", ON, this);
         pytania2c.setDefaultsca19p("etatToggleac19p", ON, this);
         pytania2c.setDefaultsca20p("etatToggleac20p", ON, this);
         pytania2c.setDefaultsca21p("etatToggleac21p", ON, this);
         pytania2c.setDefaultsca22p("etatToggleac22p", ON, this);
         pytania2c.setDefaultsca23p("etatToggleac23p", ON, this);
         pytania2c.setDefaultsca24p("etatToggleac24p", ON, this);
         // pytania mag
         pytania2.setDefaults1p("etatToggle1p", ON, this);
         pytania2.setDefaults2p("etatToggle2p", ON, this);
         pytania2.setDefaults3p("etatToggle3p", ON, this);
         pytania2.setDefaults4p("etatToggle4p", ON, this);
         pytania2.setDefaults5p("etatToggle5p", ON, this);
         pytania2.setDefaults6p("etatToggle6p", ON, this);
         pytania2.setDefaults7p("etatToggle7p", ON, this);
         pytania2.setDefaults8p("etatToggle8p", ON, this);
         pytania2.setDefaults9p("etatToggle9p", ON, this);
         pytania2.setDefaults10p("etatToggle10p", ON, this);
         pytania2.setDefaults11p("etatToggle11p", ON, this);
         pytania2.setDefaults12p("etatToggle12p", ON, this);
         pytania2.setDefaults13p("etatToggle13p", ON, this);
         pytania2.setDefaults14p("etatToggle14p", ON, this);
         pytania2.setDefaults15p("etatToggle15p", ON, this);
         pytania2.setDefaults16p("etatToggle16p", ON, this);
         pytania2.setDefaults17p("etatToggle17p", ON, this);
         pytania2.setDefaults18p("etatToggle18p", ON, this);
         pytania2.setDefaults19p("etatToggle19p", ON, this);
         pytania2.setDefaults20p("etatToggle20p", ON, this);
         pytania2.setDefaults21p("etatToggle21p", ON, this);
         pytania2.setDefaults22p("etatToggle22p", ON, this);
         pytania2.setDefaults23p("etatToggle23p", ON, this);
         pytania2.setDefaults24p("etatToggle24p", ON, this);
         pytania2.setDefaultsa1p("etatTogglea1p", ON, this);
         pytania2.setDefaultsa2p("etatTogglea2p", ON, this);
         pytania2.setDefaultsa3p("etatTogglea3p", ON, this);
         pytania2.setDefaultsa4p("etatTogglea4p", ON, this);
         pytania2.setDefaultsa5p("etatTogglea5p", ON, this);
         pytania2.setDefaultsa6p("etatTogglea6p", ON, this);
         pytania2.setDefaultsa7p("etatTogglea7p", ON, this);
         pytania2.setDefaultsa8p("etatTogglea8p", ON, this);
         pytania2.setDefaultsa9p("etatTogglea9p", ON, this);
         pytania2.setDefaultsa10p("etatTogglea10p", ON, this);
         pytania2.setDefaultsa11p("etatTogglea11p", ON, this);
         pytania2.setDefaultsa12p("etatTogglea12p", ON, this);
         pytania2.setDefaultsa13p("etatTogglea13p", ON, this);
         pytania2.setDefaultsa14p("etatTogglea14p", ON, this);
         pytania2.setDefaultsa15p("etatTogglea15p", ON, this);
         pytania2.setDefaultsa16p("etatTogglea16p", ON, this);
         pytania2.setDefaultsa17p("etatTogglea17p", ON, this);
         pytania2.setDefaultsa18p("etatTogglea18p", ON, this);
         pytania2.setDefaultsa19p("etatTogglea19p", ON, this);
         pytania2.setDefaultsa20p("etatTogglea20p", ON, this);
         pytania2.setDefaultsa21p("etatTogglea21p", ON, this);
         pytania2.setDefaultsa22p("etatTogglea22p", ON, this);
         pytania2.setDefaultsa23p("etatTogglea23p", ON, this);
         pytania2.setDefaultsa24p("etatTogglea24p", ON, this);
         MainActivity.setsbtn1("sbtn1", AUTOMATIC, this);
         MainActivity.setsbtn2("sbtn1", AUTOMATIC, this);
         MainActivity.setbtn1("btn1", ON2, this);
         MainActivity.setbtn2("btn2", ON2, this);
         MainActivity.setbtn7("btn7", ON2, this);
         MainActivity.setbtn8("btn8", ON2, this);
         MainActivity.setbtn9("btn9", ON2, this);
         MainActivity.setbtn10("btn10", ON2, this);
         MainActivity.setbtn11("btn11", ON2, this);
         MainActivity.setbtn12("btn12", ON2, this);
         MainActivity.setbtn13("btn13", ON2, this);
         MainActivity.setbtn14("btn14", ON2, this);
         MainActivity.setbtn15("btn15", ON2, this);
         MainActivity.setbtn16("btn16", ON2, this);
         MainActivity.setbtn17("btn17", ON2, this);
         MainActivity.setbtn18("btn18", ON2, this);
         MainActivity.setbtn19("btn19", ON2, this);
         MainActivity.setbtn20("btn20", ON2, this);
         MainActivity.setbtn21("btn21", ON2, this);
         MainActivity.setbtn22("btn22", ON2, this);
         MainActivity.setbtn23("btn23", ON2, this);
         MainActivity.setbtn24("btn24", ON2, this);
         MainActivity.setbtn25("btn25", ON2, this);
         MainActivity.setbtn26("btn26", ON2, this);
         MainActivity.setbtn27("btn27", ON2, this);
         MainActivity.setbtn28("btn28", ON2, this);
         MainActivity.setbtn29("btn29", ON2, this);
         MainActivity.setbtn30("btn30", ON2, this);
         MainActivityc.setsbtncc1("sbtnc1", AUTOMATIC, this);
         MainActivityc.setsbtncc2("sbtnc1", AUTOMATIC, this);
         MainActivityc.setbtnc1("btnc1", ON2, this);
         MainActivityc.setbtnc2("btnc2", ON2, this);
         MainActivityc.setbtnc7("btnc7", ON2, this);
         MainActivityc.setbtnc8("btnc8", ON2, this);
         MainActivityc.setbtnc9("btnc9", ON2, this);
         MainActivityc.setbtnc10("btnc10", ON2, this);
         MainActivityc.setbtnc11("btnc11", ON2, this);
         MainActivityc.setbtnc12("btnc12", ON2, this);
         MainActivityc.setbtnc13("btnc13", ON2, this);
         MainActivityc.setbtnc14("btnc14", ON2, this);
         MainActivityc.setbtnc15("btnc15", ON2, this);
         MainActivityc.setbtnc16("btnc16", ON2, this);
         MainActivityc.setbtnc17("btnc17", ON2, this);
         MainActivityc.setbtnc18("btnc18", ON2, this);
         MainActivityc.setbtnc19("btnc19", ON2, this);
         MainActivityc.setbtnc20("btnc20", ON2, this);
         MainActivityc.setbtnc21("btnc21", ON2, this);
         MainActivityc.setbtnc22("btnc22", ON2, this);
         MainActivityc.setbtnc23("btnc23", ON2, this);
         MainActivityc.setbtnc24("btnc24", ON2, this);
         MainActivityc.setbtnc25("btnc25", ON2, this);
         MainActivityc.setbtnc26("btnc26", ON2, this);
         MainActivityc.setbtnc27("btnc27", ON2, this);
         MainActivityc.setbtnc28("btnc28", ON2, this);
         MainActivityc.setbtnc29("btnc29", ON2, this);
         MainActivityc.setbtnc30("btnc30", ON2, this);
         MainActivityc.sbc1=0;
         MainActivityc.sbc2=0;
         MainActivity.sb1=0;
         MainActivity.sb2=0;
         MainActivityc.gc=1;
         MainActivity.gm=1;
         Intent intent = new Intent(Menu.this, pytobr.class);
         Menu.wyl=1; startActivity(intent);

     }
     public void testzab(View view) {
         Random generator = new Random();
         kon=1;
         zm=generator.nextInt(10)+1;
         zc=generator.nextInt(10)+1;
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
         MainActivityc.setDefaultsc2("etatTogglec2", ON, this);
         MainActivityc.setDefaultsc4("etatTogglec4", AUTOMATIC, this);
         MainActivityc.setDefaultsc6("etatTogglec6", ON, this);
         MainActivityc.setDefaultsc7("etatTogglec7", AUTOMATIC, this);
         MainActivityc.setDefaultsc8("etatTogglec8", AUTOMATIC, this);
         MainActivityc.setDefaultsc9("etatTogglec9", ON, this);
         //2
         MainActivityc.setDefaultsc22("etatTogglec22", ON, this);
         MainActivityc.setDefaultsc24("etatTogglec24", AUTOMATIC, this);
         MainActivityc.setDefaultsc26("etatTogglec26", ON, this);
         MainActivityc.setDefaultsc27("etatTogglec27", AUTOMATIC, this);
         MainActivityc.setDefaultsc28("etatTogglec28", AUTOMATIC, this);
         MainActivityc.setDefaultsc29("etatTogglec29", ON, this);
         //3
         MainActivityc.setDefaultsc32("etatTogglec32", ON, this);
         MainActivityc.setDefaultsc34("etatTogglec34", AUTOMATIC, this);
         MainActivityc.setDefaultsc36("etatTogglec36", ON, this);
         MainActivityc.setDefaultsc37("etatTogglec37", AUTOMATIC, this);
         MainActivityc.setDefaultsc38("etatTogglec38", AUTOMATIC, this);
         MainActivityc.setDefaultsc39("etatTogglec39", ON, this);
         //4
         MainActivityc.setDefaultsc42("etatTogglec42", ON, this);
         MainActivityc.setDefaultsc44("etatTogglec44", AUTOMATIC, this);
         MainActivityc.setDefaultsc46("etatTogglec46", ON, this);
         MainActivityc.setDefaultsc47("etatTogglec47", AUTOMATIC, this);
         MainActivityc.setDefaultsc48("etatTogglec48", AUTOMATIC, this);
         MainActivityc.setDefaultsc49("etatTogglec49", ON, this);
         //5
         MainActivityc.setDefaultsc52("etatTogglec52", ON, this);
         MainActivityc.setDefaultsc54("etatTogglec54", AUTOMATIC, this);
         MainActivityc.setDefaultsc56("etatTogglec56", ON, this);
         MainActivityc.setDefaultsc57("etatTogglec57", AUTOMATIC, this);
         MainActivityc.setDefaultsc58("etatTogglec58", AUTOMATIC, this);
         MainActivityc.setDefaultsc59("etatTogglec59", ON, this);
         //6
         MainActivityc.setDefaultsc62("etatTogglec62", ON, this);
         MainActivityc.setDefaultsc64("etatTogglec64", AUTOMATIC, this);
         MainActivityc.setDefaultsc66("etatTogglec66", ON, this);
         MainActivityc.setDefaultsc67("etatTogglec67", AUTOMATIC, this);
         MainActivityc.setDefaultsc68("etatTogglec68", AUTOMATIC, this);
         MainActivityc.setDefaultsc69("etatTogglec69", ON, this);
         punktyc=0;
         MainActivityc.skrzatyc=0;
         //czar
         MainActivity.setDefaults2("etatToggle2", ON, this);
         MainActivity.setDefaults4("etatToggle4", AUTOMATIC, this);
         MainActivity.setDefaults6("etatToggle6", ON, this);
         MainActivity.setDefaults7("etatToggle7", AUTOMATIC, this);
         MainActivity.setDefaults8("etatToggle8", AUTOMATIC, this);
         MainActivity.setDefaults9("etatToggle9", ON, this);
         //2
         MainActivity.setDefaults22("etatToggle22", ON, this);
         MainActivity.setDefaults24("etatToggle24", AUTOMATIC, this);
         MainActivity.setDefaults26("etatToggle26", ON, this);
         MainActivity.setDefaults27("etatToggle27", AUTOMATIC, this);
         MainActivity.setDefaults28("etatToggle28", AUTOMATIC, this);
         MainActivity.setDefaults29("etatToggle29", ON, this);
         //3
         MainActivity.setDefaults32("etatToggle32", ON, this);
         MainActivity.setDefaults34("etatToggle34", AUTOMATIC, this);
         MainActivity.setDefaults36("etatToggle36", ON, this);
         MainActivity.setDefaults37("etatToggle37", AUTOMATIC, this);
         MainActivity.setDefaults38("etatToggle38", AUTOMATIC, this);
         MainActivity.setDefaults39("etatToggle39", ON, this);
         //4
         MainActivity.setDefaults42("etatToggle42", ON, this);
         MainActivity.setDefaults44("etatToggle44", AUTOMATIC, this);
         MainActivity.setDefaults46("etatToggle46", ON, this);
         MainActivity.setDefaults47("etatToggle47", AUTOMATIC, this);
         MainActivity.setDefaults48("etatToggle48", AUTOMATIC, this);
         MainActivity.setDefaults49("etatToggle49", ON, this);
         //5
         MainActivity.setDefaults52("etatToggle52", ON, this);
         MainActivity.setDefaults54("etatToggle54", AUTOMATIC, this);
         MainActivity.setDefaults56("etatToggle56", ON, this);
         MainActivity.setDefaults57("etatToggle57", AUTOMATIC, this);
         MainActivity.setDefaults58("etatToggle58", AUTOMATIC, this);
         MainActivity.setDefaults59("etatToggle59", ON, this);
         //6
         MainActivity.setDefaults62("etatToggle62", ON, this);
         MainActivity.setDefaults64("etatToggle64", AUTOMATIC, this);
         MainActivity.setDefaults66("etatToggle66", ON, this);
         MainActivity.setDefaults67("etatToggle67", AUTOMATIC, this);
         MainActivity.setDefaults68("etatToggle68", AUTOMATIC, this);
         MainActivity.setDefaults69("etatToggle69", ON, this);
         punkty=0;
         MainActivity.skrzaty=0;
         // pytania czar
         pytania2c.setDefaultsc1p("etatTogglec1p", ON, this);
         pytania2c.setDefaultsc2p("etatTogglec2p", ON, this);
         pytania2c.setDefaultsc3p("etatTogglec3p", ON, this);
         pytania2c.setDefaultsc4p("etatTogglec4p", ON, this);
         pytania2c.setDefaultsc5p("etatTogglec5p", ON, this);
         pytania2c.setDefaultsc6p("etatTogglec6p", ON, this);
         pytania2c.setDefaultsc7p("etatTogglec7p", ON, this);
         pytania2c.setDefaultsc8p("etatTogglec8p", ON, this);
         pytania2c.setDefaultsc9p("etatTogglec9p", ON, this);
         pytania2c.setDefaultsc10p("etatTogglec10p", ON, this);
         pytania2c.setDefaultsc11p("etatTogglec11p", ON, this);
         pytania2c.setDefaultsc12p("etatTogglec12p", ON, this);
         pytania2c.setDefaultsc13p("etatTogglec13p", ON, this);
         pytania2c.setDefaultsc14p("etatTogglec14p", ON, this);
         pytania2c.setDefaultsc15p("etatTogglec15p", ON, this);
         pytania2c.setDefaultsc16p("etatTogglec16p", ON, this);
         pytania2c.setDefaultsc17p("etatTogglec17p", ON, this);
         pytania2c.setDefaultsc18p("etatTogglec18p", ON, this);
         pytania2c.setDefaultsc19p("etatTogglec19p", ON, this);
         pytania2c.setDefaultsc20p("etatTogglec20p", ON, this);
         pytania2c.setDefaultsc21p("etatTogglec21p", ON, this);
         pytania2c.setDefaultsc22p("etatTogglec22p", ON, this);
         pytania2c.setDefaultsc23p("etatTogglec23p", ON, this);
         pytania2c.setDefaultsc24p("etatTogglec24p", ON, this);
         pytania2c.setDefaultsca1p("etatToggleac1p", ON, this);
         pytania2c.setDefaultsca2p("etatToggleac2p", ON, this);
         pytania2c.setDefaultsca3p("etatToggleac3p", ON, this);
         pytania2c.setDefaultsca4p("etatToggleac4p", ON, this);
         pytania2c.setDefaultsca5p("etatToggleac5p", ON, this);
         pytania2c.setDefaultsca6p("etatToggleac6p", ON, this);
         pytania2c.setDefaultsca7p("etatToggleac7p", ON, this);
         pytania2c.setDefaultsca8p("etatToggleac8p", ON, this);
         pytania2c.setDefaultsca9p("etatToggleac9p", ON, this);
         pytania2c.setDefaultsca10p("etatToggleac10p", ON, this);
         pytania2c.setDefaultsca11p("etatToggleac11p", ON, this);
         pytania2c.setDefaultsca12p("etatToggleac12p", ON, this);
         pytania2c.setDefaultsca13p("etatToggleac13p", ON, this);
         pytania2c.setDefaultsca14p("etatToggleac14p", ON, this);
         pytania2c.setDefaultsca15p("etatToggleac15p", ON, this);
         pytania2c.setDefaultsca16p("etatToggleac16p", ON, this);
         pytania2c.setDefaultsca17p("etatToggleac17p", ON, this);
         pytania2c.setDefaultsca18p("etatToggleac18p", ON, this);
         pytania2c.setDefaultsca19p("etatToggleac19p", ON, this);
         pytania2c.setDefaultsca20p("etatToggleac20p", ON, this);
         pytania2c.setDefaultsca21p("etatToggleac21p", ON, this);
         pytania2c.setDefaultsca22p("etatToggleac22p", ON, this);
         pytania2c.setDefaultsca23p("etatToggleac23p", ON, this);
         pytania2c.setDefaultsca24p("etatToggleac24p", ON, this);
         // pytania mag
         pytania2.setDefaults1p("etatToggle1p", ON, this);
         pytania2.setDefaults2p("etatToggle2p", ON, this);
         pytania2.setDefaults3p("etatToggle3p", ON, this);
         pytania2.setDefaults4p("etatToggle4p", ON, this);
         pytania2.setDefaults5p("etatToggle5p", ON, this);
         pytania2.setDefaults6p("etatToggle6p", ON, this);
         pytania2.setDefaults7p("etatToggle7p", ON, this);
         pytania2.setDefaults8p("etatToggle8p", ON, this);
         pytania2.setDefaults9p("etatToggle9p", ON, this);
         pytania2.setDefaults10p("etatToggle10p", ON, this);
         pytania2.setDefaults11p("etatToggle11p", ON, this);
         pytania2.setDefaults12p("etatToggle12p", ON, this);
         pytania2.setDefaults13p("etatToggle13p", ON, this);
         pytania2.setDefaults14p("etatToggle14p", ON, this);
         pytania2.setDefaults15p("etatToggle15p", ON, this);
         pytania2.setDefaults16p("etatToggle16p", ON, this);
         pytania2.setDefaults17p("etatToggle17p", ON, this);
         pytania2.setDefaults18p("etatToggle18p", ON, this);
         pytania2.setDefaults19p("etatToggle19p", ON, this);
         pytania2.setDefaults20p("etatToggle20p", ON, this);
         pytania2.setDefaults21p("etatToggle21p", ON, this);
         pytania2.setDefaults22p("etatToggle22p", ON, this);
         pytania2.setDefaults23p("etatToggle23p", ON, this);
         pytania2.setDefaults24p("etatToggle24p", ON, this);
         pytania2.setDefaultsa1p("etatTogglea1p", ON, this);
         pytania2.setDefaultsa2p("etatTogglea2p", ON, this);
         pytania2.setDefaultsa3p("etatTogglea3p", ON, this);
         pytania2.setDefaultsa4p("etatTogglea4p", ON, this);
         pytania2.setDefaultsa5p("etatTogglea5p", ON, this);
         pytania2.setDefaultsa6p("etatTogglea6p", ON, this);
         pytania2.setDefaultsa7p("etatTogglea7p", ON, this);
         pytania2.setDefaultsa8p("etatTogglea8p", ON, this);
         pytania2.setDefaultsa9p("etatTogglea9p", ON, this);
         pytania2.setDefaultsa10p("etatTogglea10p", ON, this);
         pytania2.setDefaultsa11p("etatTogglea11p", ON, this);
         pytania2.setDefaultsa12p("etatTogglea12p", ON, this);
         pytania2.setDefaultsa13p("etatTogglea13p", ON, this);
         pytania2.setDefaultsa14p("etatTogglea14p", ON, this);
         pytania2.setDefaultsa15p("etatTogglea15p", ON, this);
         pytania2.setDefaultsa16p("etatTogglea16p", ON, this);
         pytania2.setDefaultsa17p("etatTogglea17p", ON, this);
         pytania2.setDefaultsa18p("etatTogglea18p", ON, this);
         pytania2.setDefaultsa19p("etatTogglea19p", ON, this);
         pytania2.setDefaultsa20p("etatTogglea20p", ON, this);
         pytania2.setDefaultsa21p("etatTogglea21p", ON, this);
         pytania2.setDefaultsa22p("etatTogglea22p", ON, this);
         pytania2.setDefaultsa23p("etatTogglea23p", ON, this);
         pytania2.setDefaultsa24p("etatTogglea24p", ON, this);
         MainActivity.setsbtn1("sbtn1", AUTOMATIC, this);
         MainActivity.setsbtn2("sbtn1", AUTOMATIC, this);
         MainActivity.setbtn1("btn1", ON2, this);
         MainActivity.setbtn2("btn2", ON2, this);
         MainActivity.setbtn7("btn7", ON2, this);
         MainActivity.setbtn8("btn8", ON2, this);
         MainActivity.setbtn9("btn9", ON2, this);
         MainActivity.setbtn10("btn10", ON2, this);
         MainActivity.setbtn11("btn11", ON2, this);
         MainActivity.setbtn12("btn12", ON2, this);
         MainActivity.setbtn13("btn13", ON2, this);
         MainActivity.setbtn14("btn14", ON2, this);
         MainActivity.setbtn15("btn15", ON2, this);
         MainActivity.setbtn16("btn16", ON2, this);
         MainActivity.setbtn17("btn17", ON2, this);
         MainActivity.setbtn18("btn18", ON2, this);
         MainActivity.setbtn19("btn19", ON2, this);
         MainActivity.setbtn20("btn20", ON2, this);
         MainActivity.setbtn21("btn21", ON2, this);
         MainActivity.setbtn22("btn22", ON2, this);
         MainActivity.setbtn23("btn23", ON2, this);
         MainActivity.setbtn24("btn24", ON2, this);
         MainActivity.setbtn25("btn25", ON2, this);
         MainActivity.setbtn26("btn26", ON2, this);
         MainActivity.setbtn27("btn27", ON2, this);
         MainActivity.setbtn28("btn28", ON2, this);
         MainActivity.setbtn29("btn29", ON2, this);
         MainActivity.setbtn30("btn30", ON2, this);
         MainActivityc.setsbtncc1("sbtncc1", AUTOMATIC, this);
         MainActivityc.setsbtncc2("sbtncc2", AUTOMATIC, this);
         MainActivityc.setbtnc1("btnc1", ON2, this);
         MainActivityc.setbtnc2("btnc2", ON2, this);
         MainActivityc.setbtnc7("btnc7", ON2, this);
         MainActivityc.setbtnc8("btnc8", ON2, this);
         MainActivityc.setbtnc9("btnc9", ON2, this);
         MainActivityc.setbtnc10("btnc10", ON2, this);
         MainActivityc.setbtnc11("btnc11", ON2, this);
         MainActivityc.setbtnc12("btnc12", ON2, this);
         MainActivityc.setbtnc13("btnc13", ON2, this);
         MainActivityc.setbtnc14("btnc14", ON2, this);
         MainActivityc.setbtnc15("btnc15", ON2, this);
         MainActivityc.setbtnc16("btnc16", ON2, this);
         MainActivityc.setbtnc17("btnc17", ON2, this);
         MainActivityc.setbtnc18("btnc18", ON2, this);
         MainActivityc.setbtnc19("btnc19", ON2, this);
         MainActivityc.setbtnc20("btnc20", ON2, this);
         MainActivityc.setbtnc21("btnc21", ON2, this);
         MainActivityc.setbtnc22("btnc22", ON2, this);
         MainActivityc.setbtnc23("btnc23", ON2, this);
         MainActivityc.setbtnc24("btnc24", ON2, this);
         MainActivityc.setbtnc25("btnc25", ON2, this);
         MainActivityc.setbtnc26("btnc26", ON2, this);
         MainActivityc.setbtnc27("btnc27", ON2, this);
         MainActivityc.setbtnc28("btnc28", ON2, this);
         MainActivityc.setbtnc29("btnc29", ON2, this);
         MainActivityc.setbtnc30("btnc30", ON2, this);
         MainActivityc.sbc1=0;
         MainActivityc.sbc2=0;
         MainActivity.sb1=0;
         MainActivity.sb2=0;
         MainActivityc.gc=1;
         MainActivity.gm=1;
         Intent intent = new Intent(Menu.this, pytzab.class);
         Menu.wyl=1; startActivity(intent);

     }
     public void testlit(View view) {
         Random generator = new Random();
         kon=1;
         zm=generator.nextInt(10)+1;
         zc=generator.nextInt(10)+1;
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
         MainActivityc.setDefaultsc2("etatTogglec2", ON, this);
         MainActivityc.setDefaultsc4("etatTogglec4", AUTOMATIC, this);
         MainActivityc.setDefaultsc6("etatTogglec6", ON, this);
         MainActivityc.setDefaultsc7("etatTogglec7", AUTOMATIC, this);
         MainActivityc.setDefaultsc8("etatTogglec8", AUTOMATIC, this);
         MainActivityc.setDefaultsc9("etatTogglec9", ON, this);
         //2
         MainActivityc.setDefaultsc22("etatTogglec22", ON, this);
         MainActivityc.setDefaultsc24("etatTogglec24", AUTOMATIC, this);
         MainActivityc.setDefaultsc26("etatTogglec26", ON, this);
         MainActivityc.setDefaultsc27("etatTogglec27", AUTOMATIC, this);
         MainActivityc.setDefaultsc28("etatTogglec28", AUTOMATIC, this);
         MainActivityc.setDefaultsc29("etatTogglec29", ON, this);
         //3
         MainActivityc.setDefaultsc32("etatTogglec32", ON, this);
         MainActivityc.setDefaultsc34("etatTogglec34", AUTOMATIC, this);
         MainActivityc.setDefaultsc36("etatTogglec36", ON, this);
         MainActivityc.setDefaultsc37("etatTogglec37", AUTOMATIC, this);
         MainActivityc.setDefaultsc38("etatTogglec38", AUTOMATIC, this);
         MainActivityc.setDefaultsc39("etatTogglec39", ON, this);
         //4
         MainActivityc.setDefaultsc42("etatTogglec42", ON, this);
         MainActivityc.setDefaultsc44("etatTogglec44", AUTOMATIC, this);
         MainActivityc.setDefaultsc46("etatTogglec46", ON, this);
         MainActivityc.setDefaultsc47("etatTogglec47", AUTOMATIC, this);
         MainActivityc.setDefaultsc48("etatTogglec48", AUTOMATIC, this);
         MainActivityc.setDefaultsc49("etatTogglec49", ON, this);
         //5
         MainActivityc.setDefaultsc52("etatTogglec52", ON, this);
         MainActivityc.setDefaultsc54("etatTogglec54", AUTOMATIC, this);
         MainActivityc.setDefaultsc56("etatTogglec56", ON, this);
         MainActivityc.setDefaultsc57("etatTogglec57", AUTOMATIC, this);
         MainActivityc.setDefaultsc58("etatTogglec58", AUTOMATIC, this);
         MainActivityc.setDefaultsc59("etatTogglec59", ON, this);
         //6
         MainActivityc.setDefaultsc62("etatTogglec62", ON, this);
         MainActivityc.setDefaultsc64("etatTogglec64", AUTOMATIC, this);
         MainActivityc.setDefaultsc66("etatTogglec66", ON, this);
         MainActivityc.setDefaultsc67("etatTogglec67", AUTOMATIC, this);
         MainActivityc.setDefaultsc68("etatTogglec68", AUTOMATIC, this);
         MainActivityc.setDefaultsc69("etatTogglec69", ON, this);
         punktyc=0;
         MainActivityc.skrzatyc=0;
         //czar
         MainActivity.setDefaults2("etatToggle2", ON, this);
         MainActivity.setDefaults4("etatToggle4", AUTOMATIC, this);
         MainActivity.setDefaults6("etatToggle6", ON, this);
         MainActivity.setDefaults7("etatToggle7", AUTOMATIC, this);
         MainActivity.setDefaults8("etatToggle8", AUTOMATIC, this);
         MainActivity.setDefaults9("etatToggle9", ON, this);
         //2
         MainActivity.setDefaults22("etatToggle22", ON, this);
         MainActivity.setDefaults24("etatToggle24", AUTOMATIC, this);
         MainActivity.setDefaults26("etatToggle26", ON, this);
         MainActivity.setDefaults27("etatToggle27", AUTOMATIC, this);
         MainActivity.setDefaults28("etatToggle28", AUTOMATIC, this);
         MainActivity.setDefaults29("etatToggle29", ON, this);
         //3
         MainActivity.setDefaults32("etatToggle32", ON, this);
         MainActivity.setDefaults34("etatToggle34", AUTOMATIC, this);
         MainActivity.setDefaults36("etatToggle36", ON, this);
         MainActivity.setDefaults37("etatToggle37", AUTOMATIC, this);
         MainActivity.setDefaults38("etatToggle38", AUTOMATIC, this);
         MainActivity.setDefaults39("etatToggle39", ON, this);
         //4
         MainActivity.setDefaults42("etatToggle42", ON, this);
         MainActivity.setDefaults44("etatToggle44", AUTOMATIC, this);
         MainActivity.setDefaults46("etatToggle46", ON, this);
         MainActivity.setDefaults47("etatToggle47", AUTOMATIC, this);
         MainActivity.setDefaults48("etatToggle48", AUTOMATIC, this);
         MainActivity.setDefaults49("etatToggle49", ON, this);
         //5
         MainActivity.setDefaults52("etatToggle52", ON, this);
         MainActivity.setDefaults54("etatToggle54", AUTOMATIC, this);
         MainActivity.setDefaults56("etatToggle56", ON, this);
         MainActivity.setDefaults57("etatToggle57", AUTOMATIC, this);
         MainActivity.setDefaults58("etatToggle58", AUTOMATIC, this);
         MainActivity.setDefaults59("etatToggle59", ON, this);
         //6
         MainActivity.setDefaults62("etatToggle62", ON, this);
         MainActivity.setDefaults64("etatToggle64", AUTOMATIC, this);
         MainActivity.setDefaults66("etatToggle66", ON, this);
         MainActivity.setDefaults67("etatToggle67", AUTOMATIC, this);
         MainActivity.setDefaults68("etatToggle68", AUTOMATIC, this);
         MainActivity.setDefaults69("etatToggle69", ON, this);
         punkty=0;
         MainActivity.skrzaty=0;
         // pytania czar
         pytania2c.setDefaultsc1p("etatTogglec1p", ON, this);
         pytania2c.setDefaultsc2p("etatTogglec2p", ON, this);
         pytania2c.setDefaultsc3p("etatTogglec3p", ON, this);
         pytania2c.setDefaultsc4p("etatTogglec4p", ON, this);
         pytania2c.setDefaultsc5p("etatTogglec5p", ON, this);
         pytania2c.setDefaultsc6p("etatTogglec6p", ON, this);
         pytania2c.setDefaultsc7p("etatTogglec7p", ON, this);
         pytania2c.setDefaultsc8p("etatTogglec8p", ON, this);
         pytania2c.setDefaultsc9p("etatTogglec9p", ON, this);
         pytania2c.setDefaultsc10p("etatTogglec10p", ON, this);
         pytania2c.setDefaultsc11p("etatTogglec11p", ON, this);
         pytania2c.setDefaultsc12p("etatTogglec12p", ON, this);
         pytania2c.setDefaultsc13p("etatTogglec13p", ON, this);
         pytania2c.setDefaultsc14p("etatTogglec14p", ON, this);
         pytania2c.setDefaultsc15p("etatTogglec15p", ON, this);
         pytania2c.setDefaultsc16p("etatTogglec16p", ON, this);
         pytania2c.setDefaultsc17p("etatTogglec17p", ON, this);
         pytania2c.setDefaultsc18p("etatTogglec18p", ON, this);
         pytania2c.setDefaultsc19p("etatTogglec19p", ON, this);
         pytania2c.setDefaultsc20p("etatTogglec20p", ON, this);
         pytania2c.setDefaultsc21p("etatTogglec21p", ON, this);
         pytania2c.setDefaultsc22p("etatTogglec22p", ON, this);
         pytania2c.setDefaultsc23p("etatTogglec23p", ON, this);
         pytania2c.setDefaultsc24p("etatTogglec24p", ON, this);
         pytania2c.setDefaultsca1p("etatToggleac1p", ON, this);
         pytania2c.setDefaultsca2p("etatToggleac2p", ON, this);
         pytania2c.setDefaultsca3p("etatToggleac3p", ON, this);
         pytania2c.setDefaultsca4p("etatToggleac4p", ON, this);
         pytania2c.setDefaultsca5p("etatToggleac5p", ON, this);
         pytania2c.setDefaultsca6p("etatToggleac6p", ON, this);
         pytania2c.setDefaultsca7p("etatToggleac7p", ON, this);
         pytania2c.setDefaultsca8p("etatToggleac8p", ON, this);
         pytania2c.setDefaultsca9p("etatToggleac9p", ON, this);
         pytania2c.setDefaultsca10p("etatToggleac10p", ON, this);
         pytania2c.setDefaultsca11p("etatToggleac11p", ON, this);
         pytania2c.setDefaultsca12p("etatToggleac12p", ON, this);
         pytania2c.setDefaultsca13p("etatToggleac13p", ON, this);
         pytania2c.setDefaultsca14p("etatToggleac14p", ON, this);
         pytania2c.setDefaultsca15p("etatToggleac15p", ON, this);
         pytania2c.setDefaultsca16p("etatToggleac16p", ON, this);
         pytania2c.setDefaultsca17p("etatToggleac17p", ON, this);
         pytania2c.setDefaultsca18p("etatToggleac18p", ON, this);
         pytania2c.setDefaultsca19p("etatToggleac19p", ON, this);
         pytania2c.setDefaultsca20p("etatToggleac20p", ON, this);
         pytania2c.setDefaultsca21p("etatToggleac21p", ON, this);
         pytania2c.setDefaultsca22p("etatToggleac22p", ON, this);
         pytania2c.setDefaultsca23p("etatToggleac23p", ON, this);
         pytania2c.setDefaultsca24p("etatToggleac24p", ON, this);
         // pytania mag
         pytania2.setDefaults1p("etatToggle1p", ON, this);
         pytania2.setDefaults2p("etatToggle2p", ON, this);
         pytania2.setDefaults3p("etatToggle3p", ON, this);
         pytania2.setDefaults4p("etatToggle4p", ON, this);
         pytania2.setDefaults5p("etatToggle5p", ON, this);
         pytania2.setDefaults6p("etatToggle6p", ON, this);
         pytania2.setDefaults7p("etatToggle7p", ON, this);
         pytania2.setDefaults8p("etatToggle8p", ON, this);
         pytania2.setDefaults9p("etatToggle9p", ON, this);
         pytania2.setDefaults10p("etatToggle10p", ON, this);
         pytania2.setDefaults11p("etatToggle11p", ON, this);
         pytania2.setDefaults12p("etatToggle12p", ON, this);
         pytania2.setDefaults13p("etatToggle13p", ON, this);
         pytania2.setDefaults14p("etatToggle14p", ON, this);
         pytania2.setDefaults15p("etatToggle15p", ON, this);
         pytania2.setDefaults16p("etatToggle16p", ON, this);
         pytania2.setDefaults17p("etatToggle17p", ON, this);
         pytania2.setDefaults18p("etatToggle18p", ON, this);
         pytania2.setDefaults19p("etatToggle19p", ON, this);
         pytania2.setDefaults20p("etatToggle20p", ON, this);
         pytania2.setDefaults21p("etatToggle21p", ON, this);
         pytania2.setDefaults22p("etatToggle22p", ON, this);
         pytania2.setDefaults23p("etatToggle23p", ON, this);
         pytania2.setDefaults24p("etatToggle24p", ON, this);
         pytania2.setDefaultsa1p("etatTogglea1p", ON, this);
         pytania2.setDefaultsa2p("etatTogglea2p", ON, this);
         pytania2.setDefaultsa3p("etatTogglea3p", ON, this);
         pytania2.setDefaultsa4p("etatTogglea4p", ON, this);
         pytania2.setDefaultsa5p("etatTogglea5p", ON, this);
         pytania2.setDefaultsa6p("etatTogglea6p", ON, this);
         pytania2.setDefaultsa7p("etatTogglea7p", ON, this);
         pytania2.setDefaultsa8p("etatTogglea8p", ON, this);
         pytania2.setDefaultsa9p("etatTogglea9p", ON, this);
         pytania2.setDefaultsa10p("etatTogglea10p", ON, this);
         pytania2.setDefaultsa11p("etatTogglea11p", ON, this);
         pytania2.setDefaultsa12p("etatTogglea12p", ON, this);
         pytania2.setDefaultsa13p("etatTogglea13p", ON, this);
         pytania2.setDefaultsa14p("etatTogglea14p", ON, this);
         pytania2.setDefaultsa15p("etatTogglea15p", ON, this);
         pytania2.setDefaultsa16p("etatTogglea16p", ON, this);
         pytania2.setDefaultsa17p("etatTogglea17p", ON, this);
         pytania2.setDefaultsa18p("etatTogglea18p", ON, this);
         pytania2.setDefaultsa19p("etatTogglea19p", ON, this);
         pytania2.setDefaultsa20p("etatTogglea20p", ON, this);
         pytania2.setDefaultsa21p("etatTogglea21p", ON, this);
         pytania2.setDefaultsa22p("etatTogglea22p", ON, this);
         pytania2.setDefaultsa23p("etatTogglea23p", ON, this);
         pytania2.setDefaultsa24p("etatTogglea24p", ON, this);
         MainActivity.setsbtn1("sbtn1", AUTOMATIC, this);
         MainActivity.setsbtn2("sbtn1", AUTOMATIC, this);
         MainActivity.setbtn1("btn1", ON2, this);
         MainActivity.setbtn2("btn2", ON2, this);
         MainActivity.setbtn7("btn7", ON2, this);
         MainActivity.setbtn8("btn8", ON2, this);
         MainActivity.setbtn9("btn9", ON2, this);
         MainActivity.setbtn10("btn10", ON2, this);
         MainActivity.setbtn11("btn11", ON2, this);
         MainActivity.setbtn12("btn12", ON2, this);
         MainActivity.setbtn13("btn13", ON2, this);
         MainActivity.setbtn14("btn14", ON2, this);
         MainActivity.setbtn15("btn15", ON2, this);
         MainActivity.setbtn16("btn16", ON2, this);
         MainActivity.setbtn17("btn17", ON2, this);
         MainActivity.setbtn18("btn18", ON2, this);
         MainActivity.setbtn19("btn19", ON2, this);
         MainActivity.setbtn20("btn20", ON2, this);
         MainActivity.setbtn21("btn21", ON2, this);
         MainActivity.setbtn22("btn22", ON2, this);
         MainActivity.setbtn23("btn23", ON2, this);
         MainActivity.setbtn24("btn24", ON2, this);
         MainActivity.setbtn25("btn25", ON2, this);
         MainActivity.setbtn26("btn26", ON2, this);
         MainActivity.setbtn27("btn27", ON2, this);
         MainActivity.setbtn28("btn28", ON2, this);
         MainActivity.setbtn29("btn29", ON2, this);
         MainActivity.setbtn30("btn30", ON2, this);
         MainActivityc.setsbtncc1("sbtncc1", AUTOMATIC, this);
         MainActivityc.setsbtncc2("sbtncc2", AUTOMATIC, this);
         MainActivityc.setbtnc1("btnc1", ON2, this);
         MainActivityc.setbtnc2("btnc2", ON2, this);
         MainActivityc.setbtnc7("btnc7", ON2, this);
         MainActivityc.setbtnc8("btnc8", ON2, this);
         MainActivityc.setbtnc9("btnc9", ON2, this);
         MainActivityc.setbtnc10("btnc10", ON2, this);
         MainActivityc.setbtnc11("btnc11", ON2, this);
         MainActivityc.setbtnc12("btnc12", ON2, this);
         MainActivityc.setbtnc13("btnc13", ON2, this);
         MainActivityc.setbtnc14("btnc14", ON2, this);
         MainActivityc.setbtnc15("btnc15", ON2, this);
         MainActivityc.setbtnc16("btnc16", ON2, this);
         MainActivityc.setbtnc17("btnc17", ON2, this);
         MainActivityc.setbtnc18("btnc18", ON2, this);
         MainActivityc.setbtnc19("btnc19", ON2, this);
         MainActivityc.setbtnc20("btnc20", ON2, this);
         MainActivityc.setbtnc21("btnc21", ON2, this);
         MainActivityc.setbtnc22("btnc22", ON2, this);
         MainActivityc.setbtnc23("btnc23", ON2, this);
         MainActivityc.setbtnc24("btnc24", ON2, this);
         MainActivityc.setbtnc25("btnc25", ON2, this);
         MainActivityc.setbtnc26("btnc26", ON2, this);
         MainActivityc.setbtnc27("btnc27", ON2, this);
         MainActivityc.setbtnc28("btnc28", ON2, this);
         MainActivityc.setbtnc29("btnc29", ON2, this);
         MainActivityc.setbtnc30("btnc30", ON2, this);
         MainActivityc.sbc1=0;
         MainActivityc.sbc2=0;
         MainActivity.sb1=0;
         MainActivity.sb2=0;
         MainActivityc.gc=1;
         MainActivity.gm=1;
         Intent intent = new Intent(Menu.this, pytlit.class);
         Menu.wyl=1; startActivity(intent);

     }
     */




}