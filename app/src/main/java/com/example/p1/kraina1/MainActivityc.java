package com.example.p1.kraina1;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.p1.kraina1.FlashButtonc.FlashEnum;
import com.example.p1.kraina1.FlashButton2c.FlashEnum2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

import static com.example.Kraina1.context;
import static com.example.p1.kraina1.FlashButtonc.FlashEnum.AUTOMATIC;
import static com.example.p1.kraina1.FlashButton.FlashEnum.OFF;
import static com.example.p1.kraina1.FlashButton.FlashEnum.ON;
import static com.example.p1.kraina1.FlashButton2c.FlashEnum2.ON2;
import static com.example.p1.kraina1.MainActivity.punkty;
import static com.example.p1.kraina1.MainActivity.skrzaty;
import static com.example.p1.kraina1.Menu.pp;
import static com.example.p1.kraina1.Menu.setpc;
import static com.example.p1.kraina1.Menu.setpm;
import static com.example.p1.kraina1.Menu.setsc;
import static com.example.p1.kraina1.Menu.setsm;
import static com.example.p1.kraina1.Menu.zc;

import static com.example.p1.kraina1.Menu.kon; public class MainActivityc extends AppCompatActivity {
    Random generator = new Random();
    static SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
    static SharedPreferences.Editor editor = prefs.edit();
    public static int sbc1=0;
    public static int sbc2=0;
    public static int punktyc;
    public static int gc;
    public static int skrzatyc;
    public static int s;
    public static String idskrzatc="";
    FlashButton2c togglec2;
    FlashButtonc togglec4;
    FlashButton2c togglec6;
    FlashButtonc togglec7;
    FlashButtonc togglec8;
    FlashButton2c togglec9;
//2
    FlashButton2c togglec22;
    FlashButtonc togglec24;
    FlashButton2c togglec26;
    FlashButtonc togglec27;
    FlashButtonc togglec28;
    FlashButton2c togglec29;
//3
    FlashButton2c togglec32;
    FlashButtonc togglec34;
    FlashButton2c togglec36;
    FlashButtonc togglec37;
    FlashButtonc togglec38;
    FlashButton2c togglec39;
//4
    FlashButton2c togglec42;
    FlashButtonc togglec44;
    FlashButton2c togglec46;
    FlashButtonc togglec47;
    FlashButtonc togglec48;
    FlashButton2c togglec49;
//5
    FlashButton2c togglec52;
    FlashButtonc togglec54;
    FlashButton2c togglec56;
    FlashButtonc togglec57;
    FlashButtonc togglec58;
    FlashButton2c togglec59;
//6
    FlashButton2c togglec62;
    FlashButtonc togglec64;
    FlashButton2c togglec66;
    FlashButtonc togglec67;
    FlashButtonc togglec68;
    FlashButton2c togglec69;

    FlashButton2c btnc1;
    FlashButton2c btnc2;
    FlashButton2c btnc7;
    FlashButton2c btnc8;
    FlashButton2c btnc9;
    FlashButton2c btnc10;
    FlashButton2c btnc11;
    FlashButton2c btnc12;
    FlashButton2c btnc13;
    FlashButton2c btnc14;
    FlashButton2c btnc15;
    FlashButton2c btnc16;
    FlashButton2c btnc17;
    FlashButton2c btnc18;
    FlashButton2c btnc19;
    FlashButton2c btnc20;
    FlashButton2c btnc21;
    FlashButton2c btnc22;
    FlashButton2c btnc23;
    FlashButton2c btnc24;
    FlashButton2c btnc25;
    FlashButton2c btnc26;
    FlashButton2c btnc27;
    FlashButton2c btnc28;
    FlashButton2c btnc29;
    FlashButton2c btnc30;
    FlashButtonc  sbtncc1;
    FlashButtonc  sbtncc2;
    TextView textviev;
    TextView textviev2;
    public void onPause(){
        super.onPause();
        if(Menu.wyl==0){
                        Intro.z=0;             Intro.adp.run();
        }
    }
    public void onResume(){
        super.onResume();
        }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainc);
        MainActivity.r=0;

        switch(zc){
            case 1:
                setContentView(R.layout.activity_mainc);
                break;
            case 2:
                setContentView(R.layout.activity_mainc2);
                break;
            case 3:
                setContentView(R.layout.activity_mainc3);
                break;
            case 4:
                setContentView(R.layout.activity_mainc4);
                break;
            case 5:
                setContentView(R.layout.activity_mainc5);
                break;
            case 6:
                setContentView(R.layout.activity_mainc6);
                break;
            case 7:
                setContentView(R.layout.activity_mainc7);
                break;
            case 8:
               setContentView(R.layout.activity_mainc8);
               break;
           case 9:
               setContentView(R.layout.activity_mainc9);
               break;
           case 10:
               setContentView(R.layout.activity_mainc10);
               break;}





        togglec2 = (FlashButton2c) findViewById(R.id.togglecButton2);

        togglec4 = (FlashButtonc) findViewById(R.id.togglecButton4);

        togglec6 = (FlashButton2c) findViewById(R.id.togglecButton6);

        togglec7 = (FlashButtonc) findViewById(R.id.togglecButton7);

        togglec8 = (FlashButtonc) findViewById(R.id.togglecButton8);

        togglec9 = (FlashButton2c) findViewById(R.id.togglecButton9);
        //2
        togglec22 = (FlashButton2c) findViewById(R.id.togglec2Button2);

        togglec24 = (FlashButtonc) findViewById(R.id.togglec2Button4);

        togglec26 = (FlashButton2c) findViewById(R.id.togglec2Button6);

        togglec27 = (FlashButtonc) findViewById(R.id.togglec2Button7);

        togglec28 = (FlashButtonc) findViewById(R.id.togglec2Button8);

        togglec29 = (FlashButton2c) findViewById(R.id.togglec2Button9);
        //3
        togglec32 = (FlashButton2c) findViewById(R.id.togglec3Button2);

        togglec34 = (FlashButtonc) findViewById(R.id.togglec3Button4);

        togglec36 = (FlashButton2c) findViewById(R.id.togglec3Button6);

        togglec37 = (FlashButtonc) findViewById(R.id.togglec3Button7);

        togglec38 = (FlashButtonc) findViewById(R.id.togglec3Button8);

        togglec39 = (FlashButton2c) findViewById(R.id.togglec3Button9);
        //4
        togglec42 = (FlashButton2c) findViewById(R.id.togglec4Button2);

        togglec44 = (FlashButtonc) findViewById(R.id.togglec4Button4);

        togglec46 = (FlashButton2c) findViewById(R.id.togglec4Button6);

        togglec47 = (FlashButtonc) findViewById(R.id.togglec4Button7);

        togglec48 = (FlashButtonc) findViewById(R.id.togglec4Button8);

        togglec49 = (FlashButton2c) findViewById(R.id.togglec4Button9);
        //5
        togglec52 = (FlashButton2c) findViewById(R.id.togglec5Button2);

        togglec54 = (FlashButtonc) findViewById(R.id.sbtnc6);

        togglec56 = (FlashButton2c) findViewById(R.id.togglec5Button6);

        togglec57 = (FlashButtonc) findViewById(R.id.togglec5Button7);

        togglec58 = (FlashButtonc) findViewById(R.id.sbtnc5);

        togglec59 = (FlashButton2c) findViewById(R.id.togglec5Button9);
        //6
        togglec62 = (FlashButton2c) findViewById(R.id.togglec6Button2);

        togglec64 = (FlashButtonc) findViewById(R.id.sbtnc4);

        togglec66 = (FlashButton2c) findViewById(R.id.togglec6Button6);

        togglec67 = (FlashButtonc) findViewById(R.id.sbtnc3);

        togglec68 = (FlashButtonc) findViewById(R.id.togglec6Button8);

        togglec69 = (FlashButton2c) findViewById(R.id.togglec6Button9);

        btnc1 = (FlashButton2c) findViewById(R.id.btnc1);
        btnc2 = (FlashButton2c) findViewById(R.id.btnc2);
        btnc7 = (FlashButton2c) findViewById(R.id.btnc7);
        btnc8 = (FlashButton2c) findViewById(R.id.btnc8);
        btnc9 = (FlashButton2c) findViewById(R.id.btnc9);
        btnc10 = (FlashButton2c) findViewById(R.id.btnc10);
        btnc11 = (FlashButton2c) findViewById(R.id.btnc11);
        btnc12 = (FlashButton2c) findViewById(R.id.btnc12);
        btnc13 = (FlashButton2c) findViewById(R.id.btnc13);
        btnc14 = (FlashButton2c) findViewById(R.id.btnc14);
        btnc15 = (FlashButton2c) findViewById(R.id.btnc15);
        btnc16 = (FlashButton2c) findViewById(R.id.btnc16);
        btnc17 = (FlashButton2c) findViewById(R.id.btnc17);
        btnc18 = (FlashButton2c) findViewById(R.id.btnc18);
        btnc19 = (FlashButton2c) findViewById(R.id.btnc19);
        btnc20 = (FlashButton2c) findViewById(R.id.btnc20);
        btnc21 = (FlashButton2c) findViewById(R.id.btnc21);
        btnc22 = (FlashButton2c) findViewById(R.id.btnc22);
        btnc23 = (FlashButton2c) findViewById(R.id.btnc23);
        btnc24 = (FlashButton2c) findViewById(R.id.btnc24);
        btnc25 = (FlashButton2c) findViewById(R.id.btnc25);
        btnc26 = (FlashButton2c) findViewById(R.id.btnc26);
        btnc27 = (FlashButton2c) findViewById(R.id.btnc27);
        btnc28 = (FlashButton2c) findViewById(R.id.btnc28);
        btnc29 = (FlashButton2c) findViewById(R.id.btnc29);
        btnc30 = (FlashButton2c) findViewById(R.id.btnc30);
        sbtncc1 = (FlashButtonc) findViewById(R.id.sbtnc1);
        sbtncc2 = (FlashButtonc) findViewById(R.id.sbtnc2);
        textviev2 = (TextView) findViewById(R.id.textView13);
        String sk = String.valueOf(20-skrzatyc);
        textviev2.setText(sk);
        textviev = (TextView) findViewById(R.id.textView2);
        String wynik = String.valueOf(String.valueOf(punkty)+ " : "+ String.valueOf(punktyc));
        textviev.setText(wynik);

    }


    public void onStart(){
        super.onStart(); Menu.wyl=0;
// 1
        s=generator.nextInt(2);
        if(pp!=0){
        AlertDialog.Builder builder;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            builder = new AlertDialog.Builder(MainActivityc.this, android.R.style.Theme_Material_Dialog_Alert);
        } else {
            builder = new AlertDialog.Builder(MainActivityc.this);
        }
        builder.setTitle("Tura drużyny czarnoksiężnika")
                .setMessage("")
                .setPositiveButton("", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // continue with delete
                    }
                })
                .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // do nothing
                    }
                })
                .show();}
        setpm("c", punkty, this);
        setpc("d", punktyc, this);
        setsm("bbbbm", skrzaty, this);
        setsc("bbbbc", skrzatyc, this);
        MainActivity.r=0;

        if(skrzatyc==20){
            Intent intent = new Intent(MainActivityc.this, Koniecc.class);
            Menu.wyl=1; startActivity(intent);

        }
        togglec2.setState(getDefaultsc2("etatTogglec2",this));
        togglec4.setState(getDefaultsc4("etatTogglec4",this));
        togglec6.setState(getDefaultsc6("etatTogglec6",this));
        togglec7.setState(getDefaultsc7("etatTogglec7",this));
        togglec8.setState(getDefaultsc8("etatTogglec8",this));
        togglec9.setState(getDefaultsc9("etatTogglec9",this));
    //2
        togglec22.setState(getDefaultsc22("etatTogglec22",this));
        togglec24.setState(getDefaultsc24("etatTogglec24",this));
        togglec26.setState(getDefaultsc26("etatTogglec26",this));
        togglec27.setState(getDefaultsc27("etatTogglec27",this));
        togglec28.setState(getDefaultsc28("etatTogglec28",this));
        togglec29.setState(getDefaultsc29("etatTogglec29",this));
       //3
        togglec32.setState(getDefaultsc32("etatTogglec32",this));
        togglec34.setState(getDefaultsc34("etatTogglec34",this));
        togglec36.setState(getDefaultsc36("etatTogglec36",this));
        togglec37.setState(getDefaultsc37("etatTogglec37",this));
        togglec38.setState(getDefaultsc38("etatTogglec38",this));
        togglec39.setState(getDefaultsc39("etatTogglec39",this));
        //4
        togglec42.setState(getDefaultsc42("etatTogglec42",this));
        togglec44.setState(getDefaultsc44("etatTogglec44",this));
        togglec46.setState(getDefaultsc46("etatTogglec46",this));
        togglec47.setState(getDefaultsc47("etatTogglec47",this));
        togglec48.setState(getDefaultsc48("etatTogglec48",this));
        togglec49.setState(getDefaultsc49("etatTogglec49",this));
        //5
        togglec52.setState(getDefaultsc52("etatTogglec52",this));
        togglec54.setState(getDefaultsc54("etatTogglec54",this));
        togglec56.setState(getDefaultsc56("etatTogglec56",this));
        togglec57.setState(getDefaultsc57("etatTogglec57",this));
        togglec58.setState(getDefaultsc58("etatTogglec58",this));
        togglec59.setState(getDefaultsc59("etatTogglec59",this));
        //6
        togglec62.setState(getDefaultsc62("etatTogglec62",this));
        togglec64.setState(getDefaultsc64("etatTogglec64",this));
        togglec66.setState(getDefaultsc66("etatTogglec66",this));
        togglec67.setState(getDefaultsc67("etatTogglec67",this));
        togglec68.setState(getDefaultsc68("etatTogglec68",this));
        togglec69.setState(getDefaultsc69("etatTogglec69",this));
        sbtncc1.setState(getsbtncc1("sbtncc1",this));
        sbtncc2.setState(getsbtncc2("sbtncc2",this));
        btnc1.setState(getbtnc1("btnc1",this));
        btnc2.setState(getbtnc2("btnc2",this));
        btnc7.setState(getbtnc7("btnc7",this));
        btnc8.setState(getbtnc8("btnc8",this));
        btnc9.setState(getbtnc9("btnc9",this));
        btnc10.setState(getbtnc10("btnc10",this));
        btnc11.setState(getbtnc11("btnc11",this));
        btnc12.setState(getbtnc12("btnc12",this));
        btnc13.setState(getbtnc13("btnc13",this));
        btnc14.setState(getbtnc14("btnc14",this));
        btnc15.setState(getbtnc15("btnc15",this));
        btnc16.setState(getbtnc16("btnc16",this));
        btnc17.setState(getbtnc17("btnc17",this));
        btnc18.setState(getbtnc18("btnc18",this));
        btnc19.setState(getbtnc19("btnc19",this));
        btnc20.setState(getbtnc20("btnc20",this));
        btnc21.setState(getbtnc21("btnc21",this));
        btnc22.setState(getbtnc22("btnc22",this));
        btnc23.setState(getbtnc23("btnc23",this));
        btnc24.setState(getbtnc24("btnc24",this));
        btnc25.setState(getbtnc25("btnc25",this));
        btnc26.setState(getbtnc26("btnc26",this));
        btnc27.setState(getbtnc27("btnc27",this));
        btnc28.setState(getbtnc28("btnc28",this));
        btnc29.setState(getbtnc29("btnc29",this));
        btnc30.setState(getbtnc30("btnc30",this));
  //      punkty=getDefaultscp("etatTogglecp",this);
    }


    @Override
    public void onStop(){
        super.onStop();

        setDefaultsc2("etatTogglec2", togglec2.getState(), this);
        setDefaultsc4("etatTogglec4", togglec4.getState(), this);
        setDefaultsc6("etatTogglec6", togglec6.getState(), this);
        setDefaultsc7("etatTogglec7", togglec7.getState(), this);
        setDefaultsc8("etatTogglec8", togglec8.getState(), this);
        setDefaultsc9("etatTogglec9", togglec9.getState(), this);
        //2
        setDefaultsc22("etatTogglec22", togglec22.getState(), this);
        setDefaultsc24("etatTogglec24", togglec24.getState(), this);
        setDefaultsc26("etatTogglec26", togglec26.getState(), this);
        setDefaultsc27("etatTogglec27", togglec27.getState(), this);
        setDefaultsc28("etatTogglec28", togglec28.getState(), this);
        setDefaultsc29("etatTogglec29", togglec29.getState(), this);
        //3
        setDefaultsc32("etatTogglec32", togglec32.getState(), this);
        setDefaultsc34("etatTogglec34", togglec34.getState(), this);
        setDefaultsc36("etatTogglec36", togglec36.getState(), this);
        setDefaultsc37("etatTogglec37", togglec37.getState(), this);
        setDefaultsc38("etatTogglec38", togglec38.getState(), this);
        setDefaultsc39("etatTogglec39", togglec39.getState(), this);
        //4
        setDefaultsc42("etatTogglec42", togglec42.getState(), this);
        setDefaultsc44("etatTogglec44", togglec44.getState(), this);
        setDefaultsc46("etatTogglec46", togglec46.getState(), this);
        setDefaultsc47("etatTogglec47", togglec47.getState(), this);
        setDefaultsc48("etatTogglec48", togglec48.getState(), this);
        setDefaultsc49("etatTogglec49", togglec49.getState(), this);
        //5
        setDefaultsc52("etatTogglec52", togglec52.getState(), this);
        setDefaultsc54("etatTogglec54", togglec54.getState(), this);
        setDefaultsc56("etatTogglec56", togglec56.getState(), this);
        setDefaultsc57("etatTogglec57", togglec57.getState(), this);
        setDefaultsc58("etatTogglec58", togglec58.getState(), this);
        setDefaultsc59("etatTogglec59", togglec59.getState(), this);
        //6
        setDefaultsc62("etatTogglec62", togglec62.getState(), this);
        setDefaultsc64("etatTogglec64", togglec64.getState(), this);
        setDefaultsc66("etatTogglec66", togglec66.getState(), this);
        setDefaultsc67("etatTogglec67", togglec67.getState(), this);
        setDefaultsc68("etatTogglec68", togglec68.getState(), this);
        setDefaultsc69("etatTogglec69", togglec69.getState(), this);
        //  setDefaultscp("etatTogglecp", punktyc, this);
        setsbtncc1("sbtncc1", sbtncc1.getState(), this);
        setsbtncc2("sbtncc2", sbtncc2.getState(), this);
        setbtnc1("btnc1", btnc1.getState(), this);
        setbtnc2("btnc2", btnc2.getState(), this);
        setbtnc7("btnc7", btnc7.getState(), this);
        setbtnc8("btnc8", btnc8.getState(), this);
        setbtnc9("btnc9", btnc9.getState(), this);
        setbtnc10("btnc10", btnc10.getState(), this);
        setbtnc11("btnc11", btnc11.getState(), this);
        setbtnc12("btnc12", btnc12.getState(), this);
        setbtnc13("btnc13", btnc13.getState(), this);
        setbtnc14("btnc14", btnc14.getState(), this);
        setbtnc15("btnc15", btnc15.getState(), this);
        setbtnc16("btnc16", btnc16.getState(), this);
        setbtnc17("btnc17", btnc17.getState(), this);
        setbtnc18("btnc18", btnc18.getState(), this);
        setbtnc19("btnc19", btnc19.getState(), this);
        setbtnc20("btnc20", btnc20.getState(), this);
        setbtnc21("btnc21", btnc21.getState(), this);
        setbtnc22("btnc22", btnc22.getState(), this);
        setbtnc23("btnc23", btnc23.getState(), this);
        setbtnc24("btnc24", btnc24.getState(), this);
        setbtnc25("btnc25", btnc25.getState(), this);
        setbtnc26("btnc26", btnc26.getState(), this);
        setbtnc27("btnc27", btnc27.getState(), this);
        setbtnc28("btnc28", btnc28.getState(), this);
        setbtnc29("btnc29", btnc29.getState(), this);
        setbtnc30("btnc30", btnc30.getState(), this);

    }
    public void onDestroy(){
        super.onDestroy();

        setDefaultsc2("etatTogglec2", togglec2.getState(), this);
        setDefaultsc4("etatTogglec4", togglec4.getState(), this);
        setDefaultsc6("etatTogglec6", togglec6.getState(), this);
        setDefaultsc7("etatTogglec7", togglec7.getState(), this);
        setDefaultsc8("etatTogglec8", togglec8.getState(), this);
        setDefaultsc9("etatTogglec9", togglec9.getState(), this);
        //2
        setDefaultsc22("etatTogglec22", togglec22.getState(), this);
        setDefaultsc24("etatTogglec24", togglec24.getState(), this);
        setDefaultsc26("etatTogglec26", togglec26.getState(), this);
        setDefaultsc27("etatTogglec27", togglec27.getState(), this);
        setDefaultsc28("etatTogglec28", togglec28.getState(), this);
        setDefaultsc29("etatTogglec29", togglec29.getState(), this);
        //3
        setDefaultsc32("etatTogglec32", togglec32.getState(), this);
        setDefaultsc34("etatTogglec34", togglec34.getState(), this);
        setDefaultsc36("etatTogglec36", togglec36.getState(), this);
        setDefaultsc37("etatTogglec37", togglec37.getState(), this);
        setDefaultsc38("etatTogglec38", togglec38.getState(), this);
        setDefaultsc39("etatTogglec39", togglec39.getState(), this);
        //4
        setDefaultsc42("etatTogglec42", togglec42.getState(), this);
        setDefaultsc44("etatTogglec44", togglec44.getState(), this);
        setDefaultsc46("etatTogglec46", togglec46.getState(), this);
        setDefaultsc47("etatTogglec47", togglec47.getState(), this);
        setDefaultsc48("etatTogglec48", togglec48.getState(), this);
        setDefaultsc49("etatTogglec49", togglec49.getState(), this);
        //5
        setDefaultsc52("etatTogglec52", togglec52.getState(), this);
        setDefaultsc54("etatTogglec54", togglec54.getState(), this);
        setDefaultsc56("etatTogglec56", togglec56.getState(), this);
        setDefaultsc57("etatTogglec57", togglec57.getState(), this);
        setDefaultsc58("etatTogglec58", togglec58.getState(), this);
        setDefaultsc59("etatTogglec59", togglec59.getState(), this);
        //6
        setDefaultsc62("etatTogglec62", togglec62.getState(), this);
        setDefaultsc64("etatTogglec64", togglec64.getState(), this);
        setDefaultsc66("etatTogglec66", togglec66.getState(), this);
        setDefaultsc67("etatTogglec67", togglec67.getState(), this);
        setDefaultsc68("etatTogglec68", togglec68.getState(), this);
        setDefaultsc69("etatTogglec69", togglec69.getState(), this);
        //  setDefaultscp("etatTogglecp", punktyc, this);
        setsbtncc1("sbtncc1", sbtncc1.getState(), this);
        setsbtncc2("sbtncc2", sbtncc2.getState(), this);
        setbtnc1("btnc1", btnc1.getState(), this);
        setbtnc2("btnc2", btnc2.getState(), this);
        setbtnc7("btnc7", btnc7.getState(), this);
        setbtnc8("btnc8", btnc8.getState(), this);
        setbtnc9("btnc9", btnc9.getState(), this);
        setbtnc10("btnc10", btnc10.getState(), this);
        setbtnc11("btnc11", btnc11.getState(), this);
        setbtnc12("btnc12", btnc12.getState(), this);
        setbtnc13("btnc13", btnc13.getState(), this);
        setbtnc14("btnc14", btnc14.getState(), this);
        setbtnc15("btnc15", btnc15.getState(), this);
        setbtnc16("btnc16", btnc16.getState(), this);
        setbtnc17("btnc17", btnc17.getState(), this);
        setbtnc18("btnc18", btnc18.getState(), this);
        setbtnc19("btnc19", btnc19.getState(), this);
        setbtnc20("btnc20", btnc20.getState(), this);
        setbtnc21("btnc21", btnc21.getState(), this);
        setbtnc22("btnc22", btnc22.getState(), this);
        setbtnc23("btnc23", btnc23.getState(), this);
        setbtnc24("btnc24", btnc24.getState(), this);
        setbtnc25("btnc25", btnc25.getState(), this);
        setbtnc26("btnc26", btnc26.getState(), this);
        setbtnc27("btnc27", btnc27.getState(), this);
        setbtnc28("btnc28", btnc28.getState(), this);
        setbtnc29("btnc29", btnc29.getState(), this);
        setbtnc30("btnc30", btnc30.getState(), this);

    }
    public static void setDefaultsc2(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getDefaultsc2(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
         String zwrot3 = preferences.getString(key, "");
       return FlashEnum2.toMyEnum(zwrot3);
    }

    public static void setDefaultsc4(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum getDefaultsc4(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON4");
        return FlashEnum.toMyEnum(zwrot3);
    }

    public static void setDefaultsc6(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getDefaultsc6(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setDefaultsc7(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum getDefaultsc7(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum.toMyEnum(zwrot3);
    }
    public static void setDefaultsc8(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum getDefaultsc8(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON8");
        return FlashEnum.toMyEnum(zwrot3);
    }
    public static void setDefaultsc9(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getDefaultsc9(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    //2
    public static void setDefaultsc22(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getDefaultsc22(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum2.toMyEnum(zwrot3);
    }

    public static void setDefaultsc24(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum getDefaultsc24(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON4");
        return FlashEnum.toMyEnum(zwrot3);
    }

    public static void setDefaultsc26(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getDefaultsc26(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setDefaultsc27(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum getDefaultsc27(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum.toMyEnum(zwrot3);
    }
    public static void setDefaultsc28(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum getDefaultsc28(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON8");
        return FlashEnum.toMyEnum(zwrot3);
    }
    public static void setDefaultsc29(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getDefaultsc29(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    //3
    public static void setDefaultsc32(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getDefaultsc32(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum2.toMyEnum(zwrot3);
    }

    public static void setDefaultsc34(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum getDefaultsc34(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON4");
        return FlashEnum.toMyEnum(zwrot3);
    }

    public static void setDefaultsc36(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getDefaultsc36(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setDefaultsc37(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum getDefaultsc37(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum.toMyEnum(zwrot3);
    }
    public static void setDefaultsc38(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum getDefaultsc38(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON8");
        return FlashEnum.toMyEnum(zwrot3);
    }
    public static void setDefaultsc39(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getDefaultsc39(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    //4
    public static void setDefaultsc42(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getDefaultsc42(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum2.toMyEnum(zwrot3);
    }

    public static void setDefaultsc44(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum getDefaultsc44(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON4");
        return FlashEnum.toMyEnum(zwrot3);
    }

    public static void setDefaultsc46(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getDefaultsc46(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setDefaultsc47(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum getDefaultsc47(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum.toMyEnum(zwrot3);
    }
    public static void setDefaultsc48(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum getDefaultsc48(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON8");
        return FlashEnum.toMyEnum(zwrot3);
    }
    public static void setDefaultsc49(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getDefaultsc49(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    //5
    public static void setDefaultsc52(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getDefaultsc52(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum2.toMyEnum(zwrot3);
    }

    public static void setDefaultsc54(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum getDefaultsc54(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON4");
        return FlashEnum.toMyEnum(zwrot3);
    }

    public static void setDefaultsc56(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getDefaultsc56(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setDefaultsc57(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum getDefaultsc57(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum.toMyEnum(zwrot3);
    }
    public static void setDefaultsc58(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum getDefaultsc58(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON8");
        return FlashEnum.toMyEnum(zwrot3);
    }
    public static void setDefaultsc59(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getDefaultsc59(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    //6
    public static void setDefaultsc62(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getDefaultsc62(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum2.toMyEnum(zwrot3);
    }

    public static void setDefaultsc64(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum getDefaultsc64(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON4");
        return FlashEnum.toMyEnum(zwrot3);
    }

    public static void setDefaultsc66(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getDefaultsc66(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setDefaultsc67(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum getDefaultsc67(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum.toMyEnum(zwrot3);
    }
    public static void setDefaultsc68(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum getDefaultsc68(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON8");
        return FlashEnum.toMyEnum(zwrot3);
    }
    public static void setDefaultsc69(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getDefaultsc69(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setDefaultscp(String key, int value, Context context)
    {


        editor.putInt(key, value);
        editor.commit();
    }
    public static void setsbtncc1(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum getsbtncc1(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum.toMyEnum(zwrot3);
    }
    public static void setsbtncc2(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum getsbtncc2(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum.toMyEnum(zwrot3);
    }
//    public static int getDefaultscp(String key, Context context)
//    {
//        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
//        return preferences.getInt(key, punkty);
//    }

    public static void setbtnc2(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getbtnc2(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setbtnc1(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }
    public static FlashEnum2 getbtnc1(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static FlashEnum2 getbtnc7(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setbtnc7(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getbtnc8(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setbtnc8(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getbtnc9(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setbtnc9(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getbtnc10(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setbtnc10(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getbtnc11(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setbtnc11(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getbtnc12(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setbtnc12(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getbtnc13(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setbtnc13(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getbtnc14(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setbtnc14(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getbtnc15(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setbtnc15(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getbtnc16(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setbtnc16(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getbtnc17(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setbtnc17(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getbtnc18(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setbtnc18(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getbtnc19(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setbtnc19(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getbtnc20(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setbtnc20(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getbtnc21(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setbtnc21(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getbtnc22(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setbtnc22(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getbtnc23(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setbtnc23(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getbtnc24(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setbtnc24(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getbtnc25(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setbtnc25(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getbtnc26(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setbtnc26(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getbtnc27(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setbtnc27(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getbtnc28(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setbtnc28(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getbtnc29(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setbtnc29(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getbtnc30(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setbtnc30(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public void skrzat4(View view) {
        if(AUTOMATIC == togglec4.getState()){
            idskrzatc="skrzatc4";
        punktyc++;  Intent intent = new Intent(MainActivityc.this, pytania2c.class);
        Menu.wyl=1; startActivity(intent);}

    }
    public void skrzat7(View view) {
        if(AUTOMATIC == togglec7.getState()){
            idskrzatc="skrzatc7";
            punktyc++;  Intent intent = new Intent(MainActivityc.this, pytania2c.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void skrzat8(View view) {
        if(AUTOMATIC == togglec8.getState()){
            idskrzatc="skrzatc8";
            punktyc++;  Intent intent = new Intent(MainActivityc.this, pytania2c.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void skrzat24(View view) {
        if(AUTOMATIC == togglec24.getState()){
            idskrzatc="skrzatc24";
            punktyc++;  Intent intent = new Intent(MainActivityc.this, pytania2c.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void skrzat27(View view) {
        if(AUTOMATIC == togglec27.getState()){
            idskrzatc="skrzatc27";
            punktyc++;  Intent intent = new Intent(MainActivityc.this, pytania2c.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void skrzat28(View view) {
        if(AUTOMATIC == togglec28.getState()){
            idskrzatc="skrzatc28";
            punktyc++;  Intent intent = new Intent(MainActivityc.this, pytania2c.class);
            Menu.wyl=1; startActivity(intent);}

    }

    public void skrzat34(View view) {
        if(AUTOMATIC == togglec34.getState()){
            idskrzatc="skrzatc34";
            punktyc++;  Intent intent = new Intent(MainActivityc.this, pytania2c.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void skrzat37(View view) {
        if(AUTOMATIC == togglec37.getState()){
            idskrzatc="skrzatc37";
            punktyc++;  Intent intent = new Intent(MainActivityc.this, pytania2c.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void skrzat38(View view) {
        if(AUTOMATIC == togglec38.getState()){
            idskrzatc="skrzatc38";
            punktyc++;  Intent intent = new Intent(MainActivityc.this, pytania2c.class);
            Menu.wyl=1; startActivity(intent);}

    }

    public void skrzat44(View view) {
        if(AUTOMATIC == togglec44.getState()){
            idskrzatc="skrzatc44";
            punktyc++;  Intent intent = new Intent(MainActivityc.this, pytania2c.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void skrzat47(View view) {
        if(AUTOMATIC == togglec47.getState()){
            idskrzatc="skrzatc47";
            punktyc++;  Intent intent = new Intent(MainActivityc.this, pytania2c.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void skrzat48(View view) {
        if(AUTOMATIC == togglec48.getState()){
            idskrzatc="skrzatc48";
            punktyc++;  Intent intent = new Intent(MainActivityc.this, pytania2c.class);
            Menu.wyl=1; startActivity(intent);}

    }

    public void skrzat54(View view) {
        if(AUTOMATIC == togglec54.getState()){
            idskrzatc="skrzatc54";
            punktyc++;  Intent intent = new Intent(MainActivityc.this, pytania2c.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void skrzat57(View view) {
        if(AUTOMATIC == togglec57.getState()){
            idskrzatc="skrzatc57";
            punktyc++;  Intent intent = new Intent(MainActivityc.this, pytania2c.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void skrzat58(View view) {
        if(AUTOMATIC == togglec58.getState()){
            idskrzatc="skrzatc58";
            punktyc++;  Intent intent = new Intent(MainActivityc.this, pytania2c.class);
            Menu.wyl=1; startActivity(intent);}

    }

    public void skrzat64(View view) {
        if(AUTOMATIC == togglec64.getState()){
            idskrzatc="skrzatc64";
            punktyc++;  Intent intent = new Intent(MainActivityc.this, pytania2c.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void skrzat67(View view) {
        if(AUTOMATIC == togglec67.getState()){
            idskrzatc="skrzatc67";
            punktyc++;  Intent intent = new Intent(MainActivityc.this, pytania2c.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void skrzat68(View view) {
        if(AUTOMATIC == togglec68.getState()){
            idskrzatc="skrzatc68";
            punktyc++;  Intent intent = new Intent(MainActivityc.this, pytania2c.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void skrzatbtncc1(View view) {
        if(AUTOMATIC == sbtncc1.getState()){
            idskrzatc="skrzatcbtnc1";
            sbc1=1;
             punktyc++;  Intent intent = new Intent(MainActivityc.this, pytania2c.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void skrzatbtncc2(View view) {
        if(AUTOMATIC == sbtncc2.getState()){
            idskrzatc="skrzatcbtnc2";
            sbc2=1;
             punktyc++;  Intent intent = new Intent(MainActivityc.this, pytania2c.class);
            Menu.wyl=1; startActivity(intent);}

    }

    public void zmiana12(View view) {
        if(ON2 == togglec2.getState()){
            Intent intent = new Intent(MainActivityc.this, MainActivity.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmiana16(View view) {
        if(ON2 == togglec6.getState()){
            Intent intent = new Intent(MainActivityc.this, MainActivity.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmiana19(View view) {
        if(ON2 == togglec9.getState()){
            Intent intent = new Intent(MainActivityc.this, MainActivity.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmiana22(View view) {
        if(ON2 == togglec22.getState()){
            Intent intent = new Intent(MainActivityc.this, MainActivity.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmiana26(View view) {
        if(ON2 == togglec26.getState()){
            Intent intent = new Intent(MainActivityc.this, MainActivity.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmiana29(View view) {
        if(ON2 == togglec29.getState()){
            Intent intent = new Intent(MainActivityc.this, MainActivity.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmiana32(View view) {
        if(ON2 == togglec32.getState()){
            Intent intent = new Intent(MainActivityc.this, MainActivity.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmiana36(View view) {
        if(ON2 == togglec36.getState()){
            Intent intent = new Intent(MainActivityc.this, MainActivity.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmiana39(View view) {
        if(ON2 == togglec39.getState()){
            Intent intent = new Intent(MainActivityc.this, MainActivity.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmiana42(View view) {
        if(ON2 == togglec42.getState()){
            Intent intent = new Intent(MainActivityc.this, MainActivity.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmiana46(View view) {
        if(ON2 == togglec46.getState()){
            Intent intent = new Intent(MainActivityc.this, MainActivity.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmiana49(View view) {
        if(ON2 == togglec49.getState()){
            Intent intent = new Intent(MainActivityc.this, MainActivity.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmiana52(View view) {
        if(ON2 == togglec52.getState()){
            Intent intent = new Intent(MainActivityc.this, MainActivity.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmiana56(View view) {
        if(ON2 == togglec56.getState()){
            Intent intent = new Intent(MainActivityc.this, MainActivity.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmiana59(View view) {
        if(ON2 == togglec59.getState()){
            Intent intent = new Intent(MainActivityc.this, MainActivity.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmiana62(View view) {
        if(ON2 == togglec62.getState()){
            Intent intent = new Intent(MainActivityc.this, MainActivity.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmiana66(View view) {
        if(ON2 == togglec66.getState()){
            Intent intent = new Intent(MainActivityc.this, MainActivity.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmiana69(View view) {
        if(ON2 == togglec69.getState()){
            Intent intent = new Intent(MainActivityc.this, MainActivity.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmianab1(View view) {
        if(ON2 == btnc1.getState()){
            Intent intent = new Intent(MainActivityc.this, MainActivity.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmianab2(View view) {
        if(ON2 == btnc2.getState()){
            Intent intent = new Intent(MainActivityc.this, MainActivity.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmianab7(View view) {
        if(ON2 == btnc7.getState()){
            Intent intent = new Intent(MainActivityc.this, MainActivity.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmianab8(View view) {
        if(ON2 == btnc8.getState()){
            Intent intent = new Intent(MainActivityc.this, MainActivity.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmianab9(View view) {
        if(ON2 == btnc9.getState()){
            Intent intent = new Intent(MainActivityc.this, MainActivity.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmianab10(View view) {
        if(ON2 == btnc10.getState()){
            Intent intent = new Intent(MainActivityc.this, MainActivity.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmianab11(View view) {
        if(ON2 == btnc11.getState()){
            Intent intent = new Intent(MainActivityc.this, MainActivity.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmianab12(View view) {
        if(ON2 == btnc12.getState()){
            Intent intent = new Intent(MainActivityc.this, MainActivity.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmianab13(View view) {
        if(ON2 == btnc13.getState()){
            Intent intent = new Intent(MainActivityc.this, MainActivity.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmianab14(View view) {
        if(ON2 == btnc14.getState()){
            Intent intent = new Intent(MainActivityc.this, MainActivity.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmianab15(View view) {
        if(ON2 == btnc15.getState()){
            Intent intent = new Intent(MainActivityc.this, MainActivity.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmianab16(View view) {
        if(ON2 == btnc16.getState()){
            Intent intent = new Intent(MainActivityc.this, MainActivity.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmianab17(View view) {
        if(ON2 == btnc17.getState()){
            Intent intent = new Intent(MainActivityc.this, MainActivity.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmianab18(View view) {
        if(ON2 == btnc18.getState()){
            Intent intent = new Intent(MainActivityc.this, MainActivity.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmianab19(View view) {
        if(ON2 == btnc19.getState()){
            Intent intent = new Intent(MainActivityc.this, MainActivity.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmianab20(View view) {
        if(ON2 == btnc20.getState()){
            Intent intent = new Intent(MainActivityc.this, MainActivity.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmianab21(View view) {
        if(ON2 == btnc21.getState()){
            Intent intent = new Intent(MainActivityc.this, MainActivity.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmianab22(View view) {
        if(ON2 == btnc22.getState()){
            Intent intent = new Intent(MainActivityc.this, MainActivity.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmianab23(View view) {
        if(ON2 == btnc23.getState()){
            Intent intent = new Intent(MainActivityc.this, MainActivity.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmianab24(View view) {
        if(ON2 == btnc24.getState()){
            Intent intent = new Intent(MainActivityc.this, MainActivity.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmianab25(View view) {
        if(ON2 == btnc25.getState()){
            Intent intent = new Intent(MainActivityc.this, MainActivity.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmianab26(View view) {
        if(ON2 == btnc26.getState()){
            Intent intent = new Intent(MainActivityc.this, MainActivity.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmianab27(View view) {
        if(ON2 == btnc27.getState()){
            Intent intent = new Intent(MainActivityc.this, MainActivity.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmianab28(View view) {
        if(ON2 == btnc28.getState()){
            Intent intent = new Intent(MainActivityc.this, MainActivity.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmianab29(View view) {
        if(ON2 == btnc29.getState()){
            Intent intent = new Intent(MainActivityc.this, MainActivity.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmianab30(View view) {
        if(ON2 == btnc30.getState()){
            Intent intent = new Intent(MainActivityc.this, MainActivity.class);
            Menu.wyl=1; startActivity(intent);}

    }


}
