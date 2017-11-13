package lukasz.p1.kraina1;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import lukasz.p1.kraina1.FlashButton.FlashEnum;
import lukasz.p1.kraina1.FlashButton2.FlashEnum2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Random;

import static android.support.v4.content.ContextCompat.startActivity;
import static com.example.Kraina1.context;
import static lukasz.p1.kraina1.FlashButton.FlashEnum.AUTOMATIC;
import static lukasz.p1.kraina1.FlashButton.FlashEnum.ON;
import static lukasz.p1.kraina1.FlashButton2.FlashEnum2.ON2;
import static lukasz.p1.kraina1.MainActivityc.punktyc;
import static lukasz.p1.kraina1.MainActivityc.skrzatyc;
import static lukasz.p1.kraina1.Menu.pp;
import static lukasz.p1.kraina1.Menu.setpc;
import static lukasz.p1.kraina1.Menu.setpm;
import static lukasz.p1.kraina1.Menu.setsc;
import static lukasz.p1.kraina1.Menu.setsm;
import static lukasz.p1.kraina1.Menu.zm;

import static lukasz.p1.kraina1.Menu.kon; public class MainActivity extends AppCompatActivity {
    Random generator = new Random();
    static SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
    static SharedPreferences.Editor editor = prefs.edit();
    public static int sb1=0;
    public static int sb2=0;
    public static int r;
    public static int s;
    public static int gm;
    FlashButton2 btn1;
    FlashButton2 btn2;
    FlashButton2 btn7;
    FlashButton2 btn8;
    FlashButton2 btn9;
    FlashButton2 btn10;
    FlashButton2 btn11;
    FlashButton2 btn12;
    FlashButton2 btn13;
    FlashButton2 btn14;
    FlashButton2 btn15;
    FlashButton2 btn16;
    FlashButton2 btn17;
    FlashButton2 btn18;
    FlashButton2 btn19;
    FlashButton2 btn20;
    FlashButton2 btn21;
    FlashButton2 btn22;
    FlashButton2 btn23;
    FlashButton2 btn24;
    FlashButton2 btn25;
    FlashButton2 btn26;
    FlashButton2 btn27;
    FlashButton2 btn28;
    FlashButton2 btn29;
    FlashButton2 btn30;
    FlashButton  sbtn1;
    FlashButton  sbtn2;

    public static int punkty;
    public static int skrzaty;
    public static String idskrzat="";
    FlashButton2 toggle2;
    FlashButton toggle4;
    FlashButton2 toggle6;
    FlashButton toggle7;
    FlashButton toggle8;
    FlashButton2 toggle9;
//2
    FlashButton2 toggle22;
    FlashButton toggle24;
    FlashButton2 toggle26;
    FlashButton toggle27;
    FlashButton toggle28;
    FlashButton2 toggle29;
//3
    FlashButton2 toggle32;
    FlashButton toggle34;
    FlashButton2 toggle36;
    FlashButton toggle37;
    FlashButton toggle38;
    FlashButton2 toggle39;
//4
    FlashButton2 toggle42;
    FlashButton toggle44;
    FlashButton2 toggle46;
    FlashButton toggle47;
    FlashButton toggle48;
    FlashButton2 toggle49;
//5
    FlashButton2 toggle52;
    FlashButton toggle54;
    FlashButton2 toggle56;
    FlashButton toggle57;
    FlashButton toggle58;
    FlashButton2 toggle59;
//6
    FlashButton2 toggle62;
    FlashButton toggle64;
    FlashButton2 toggle66;
    FlashButton toggle67;
    FlashButton toggle68;
    FlashButton2 toggle69;

    TextView textviev2;
    TextView textviev;
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
        r=1;


        switch(zm){
            case 1:
                setContentView(R.layout.activity_main);
              break;
            case 2:
                setContentView(R.layout.activity_main2);
                break;
            case 3:
                setContentView(R.layout.activity_main3);
                break;
            case 4:
                setContentView(R.layout.activity_main4);
                break;
            case 5:
                setContentView(R.layout.activity_main5);
                break;
            case 6:
                setContentView(R.layout.activity_main6);
                break;
            case 7:
                setContentView(R.layout.activity_main7);
                break;
           case 8:
               setContentView(R.layout.activity_main8);
               break;
           case 9:
               setContentView(R.layout.activity_main9);
               break;
           case 10:
               setContentView(R.layout.activity_main10);
               break;}




        toggle2 = (FlashButton2) findViewById(R.id.toggleButton2);

        toggle4 = (FlashButton) findViewById(R.id.toggleButton4);

        toggle6 = (FlashButton2) findViewById(R.id.toggleButton6);

        toggle7 = (FlashButton) findViewById(R.id.toggleButton7);

        toggle8 = (FlashButton) findViewById(R.id.toggleButton8);

        toggle9 = (FlashButton2) findViewById(R.id.toggleButton9);
        //2
        toggle22 = (FlashButton2) findViewById(R.id.toggle2Button2);

        toggle24 = (FlashButton) findViewById(R.id.toggle2Button4);

        toggle26 = (FlashButton2) findViewById(R.id.toggle2Button6);

        toggle27 = (FlashButton) findViewById(R.id.toggle2Button7);

        toggle28 = (FlashButton) findViewById(R.id.toggle2Button8);

        toggle29 = (FlashButton2) findViewById(R.id.toggle2Button9);
        //3
        toggle32 = (FlashButton2) findViewById(R.id.toggle3Button2);

        toggle34 = (FlashButton) findViewById(R.id.toggle3Button4);

        toggle36 = (FlashButton2) findViewById(R.id.toggle3Button6);

        toggle37 = (FlashButton) findViewById(R.id.toggle3Button7);

        toggle38 = (FlashButton) findViewById(R.id.toggle3Button8);

        toggle39 = (FlashButton2) findViewById(R.id.toggle3Button9);
        //4
        toggle42 = (FlashButton2) findViewById(R.id.toggle4Button2);

        toggle44 = (FlashButton) findViewById(R.id.toggle4Button4);

        toggle46 = (FlashButton2) findViewById(R.id.toggle4Button6);

        toggle47 = (FlashButton) findViewById(R.id.toggle4Button7);

        toggle48 = (FlashButton) findViewById(R.id.toggle4Button8);

        toggle49 = (FlashButton2) findViewById(R.id.toggle4Button9);
        //5
        toggle52 = (FlashButton2) findViewById(R.id.toggle5Button2);

        toggle54 = (FlashButton) findViewById(R.id.sbtn6);

        toggle56 = (FlashButton2) findViewById(R.id.toggle5Button6);

        toggle57 = (FlashButton) findViewById(R.id.toggle5Button7);

        toggle58 = (FlashButton) findViewById(R.id.sbtn5);

        toggle59 = (FlashButton2) findViewById(R.id.toggle5Button9);
        //6
        toggle62 = (FlashButton2) findViewById(R.id.toggle6Button2);

        toggle64 = (FlashButton) findViewById(R.id.sbtn4);

        toggle66 = (FlashButton2) findViewById(R.id.toggle6Button6);

        toggle67 = (FlashButton) findViewById(R.id.sbtn3);

        toggle68 = (FlashButton) findViewById(R.id.toggle6Button8);

        toggle69 = (FlashButton2) findViewById(R.id.toggle6Button9);
        btn1 = (FlashButton2) findViewById(R.id.btn1);
        btn2 = (FlashButton2) findViewById(R.id.btn2);
        btn7 = (FlashButton2) findViewById(R.id.btn7);
        btn8 = (FlashButton2) findViewById(R.id.btn8);
        btn9 = (FlashButton2) findViewById(R.id.btn9);
        btn10 = (FlashButton2) findViewById(R.id.btn10);
        btn11 = (FlashButton2) findViewById(R.id.btn11);
        btn12 = (FlashButton2) findViewById(R.id.btn12);
        btn13 = (FlashButton2) findViewById(R.id.btn13);
        btn14 = (FlashButton2) findViewById(R.id.btn14);
        btn15 = (FlashButton2) findViewById(R.id.btn15);
        btn16 = (FlashButton2) findViewById(R.id.btn16);
        btn17 = (FlashButton2) findViewById(R.id.btn17);
        btn18 = (FlashButton2) findViewById(R.id.btn18);
        btn19 = (FlashButton2) findViewById(R.id.btn19);
        btn20 = (FlashButton2) findViewById(R.id.btn20);
        btn21 = (FlashButton2) findViewById(R.id.btn21);
        btn22 = (FlashButton2) findViewById(R.id.btn22);
        btn23 = (FlashButton2) findViewById(R.id.btn23);
        btn24 = (FlashButton2) findViewById(R.id.btn24);
        btn25 = (FlashButton2) findViewById(R.id.btn25);
        btn26 = (FlashButton2) findViewById(R.id.btn26);
        btn27 = (FlashButton2) findViewById(R.id.btn27);
        btn28 = (FlashButton2) findViewById(R.id.btn28);
        btn29 = (FlashButton2) findViewById(R.id.btn29);
        btn30 = (FlashButton2) findViewById(R.id.btn30);
        sbtn1 = (FlashButton) findViewById(R.id.sbtn1);
        sbtn2 = (FlashButton) findViewById(R.id.sbtn2);
        textviev = (TextView) findViewById(R.id.textView2);
        String wynik = String.valueOf(String.valueOf(punkty)+ " : "+ String.valueOf(punktyc));
        textviev.setText(wynik);
        textviev2 = (TextView) findViewById(R.id.textView13);
        String sk = String.valueOf(20-skrzaty);
       textviev2.setText(sk);
         PopupWindow pop=new PopupWindow();
    }


    public void onStart(){
        super.onStart(); Menu.wyl=0;
// 1
        if(pp!=0){
        AlertDialog.Builder builder;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            builder = new AlertDialog.Builder(MainActivity.this, android.R.style.Theme_Material_Dialog_Alert);
        } else {
            builder = new AlertDialog.Builder(MainActivity.this);
        }
        builder.setTitle("Tura drużyny maga")
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
        r=1;
        if(skrzaty==20){
            Intent intent = new Intent(MainActivity.this, Koniec.class);
            Menu.wyl=1; startActivity(intent);

        }
        toggle2.setState(getDefaults2("etatToggle2",this));
        toggle4.setState(getDefaults4("etatToggle4",this));
        toggle6.setState(getDefaults6("etatToggle6",this));
        toggle7.setState(getDefaults7("etatToggle7",this));
        toggle8.setState(getDefaults8("etatToggle8",this));
        toggle9.setState(getDefaults9("etatToggle9",this));
    //2
        toggle22.setState(getDefaults22("etatToggle22",this));
        toggle24.setState(getDefaults24("etatToggle24",this));
        toggle26.setState(getDefaults26("etatToggle26",this));
        toggle27.setState(getDefaults27("etatToggle27",this));
        toggle28.setState(getDefaults28("etatToggle28",this));
        toggle29.setState(getDefaults29("etatToggle29",this));
       //3
        toggle32.setState(getDefaults32("etatToggle32",this));
        toggle34.setState(getDefaults34("etatToggle34",this));
        toggle36.setState(getDefaults36("etatToggle36",this));
        toggle37.setState(getDefaults37("etatToggle37",this));
        toggle38.setState(getDefaults38("etatToggle38",this));
        toggle39.setState(getDefaults39("etatToggle39",this));
        //4
        toggle42.setState(getDefaults42("etatToggle42",this));
        toggle44.setState(getDefaults44("etatToggle44",this));
        toggle46.setState(getDefaults46("etatToggle46",this));
        toggle47.setState(getDefaults47("etatToggle47",this));
        toggle48.setState(getDefaults48("etatToggle48",this));
        toggle49.setState(getDefaults49("etatToggle49",this));
        //5
        toggle52.setState(getDefaults52("etatToggle52",this));
        toggle54.setState(getDefaults54("etatToggle54",this));
        toggle56.setState(getDefaults56("etatToggle56",this));
        toggle57.setState(getDefaults57("etatToggle57",this));
        toggle58.setState(getDefaults58("etatToggle58",this));
        toggle59.setState(getDefaults59("etatToggle59",this));
        //6
        toggle62.setState(getDefaults62("etatToggle62",this));
        toggle64.setState(getDefaults64("etatToggle64",this));
        toggle66.setState(getDefaults66("etatToggle66",this));
        toggle67.setState(getDefaults67("etatToggle67",this));
        toggle68.setState(getDefaults68("etatToggle68",this));
        toggle69.setState(getDefaults69("etatToggle69",this));
        sbtn1.setState(getsbtn1("sbtn1",this));
        sbtn2.setState(getsbtn2("sbtn2",this));
        btn1.setState(getbtn1("btn1",this));
        btn2.setState(getbtn2("btn2",this));
        btn7.setState(getbtn7("btn7",this));
        btn8.setState(getbtn8("btn8",this));
        btn9.setState(getbtn9("btn9",this));
        btn10.setState(getbtn10("btn10",this));
        btn11.setState(getbtn11("btn11",this));
        btn12.setState(getbtn12("btn12",this));
        btn13.setState(getbtn13("btn13",this));
        btn14.setState(getbtn14("btn14",this));
        btn15.setState(getbtn15("btn15",this));
        btn16.setState(getbtn16("btn16",this));
        btn17.setState(getbtn17("btn17",this));
        btn18.setState(getbtn18("btn18",this));
        btn19.setState(getbtn19("btn19",this));
        btn20.setState(getbtn20("btn20",this));
        btn21.setState(getbtn21("btn21",this));
        btn22.setState(getbtn22("btn22",this));
        btn23.setState(getbtn23("btn23",this));
        btn24.setState(getbtn24("btn24",this));
        btn25.setState(getbtn25("btn25",this));
        btn26.setState(getbtn26("btn26",this));
        btn27.setState(getbtn27("btn27",this));
        btn28.setState(getbtn28("btn28",this));
        btn29.setState(getbtn29("btn29",this));
        btn30.setState(getbtn30("btn30",this));
  //      punkty=getDefaultsp("etatTogglep",this);
        s=generator.nextInt(2);
    }


    @Override
    public void onStop(){
        super.onStop();

        setDefaults2("etatToggle2", toggle2.getState(), this);
        setDefaults4("etatToggle4", toggle4.getState(), this);
        setDefaults6("etatToggle6", toggle6.getState(), this);
        setDefaults7("etatToggle7", toggle7.getState(), this);
        setDefaults8("etatToggle8", toggle8.getState(), this);
        setDefaults9("etatToggle9", toggle9.getState(), this);
        //2
        setDefaults22("etatToggle22", toggle22.getState(), this);
        setDefaults24("etatToggle24", toggle24.getState(), this);
        setDefaults26("etatToggle26", toggle26.getState(), this);
        setDefaults27("etatToggle27", toggle27.getState(), this);
        setDefaults28("etatToggle28", toggle28.getState(), this);
        setDefaults29("etatToggle29", toggle29.getState(), this);
        //3
        setDefaults32("etatToggle32", toggle32.getState(), this);
        setDefaults34("etatToggle34", toggle34.getState(), this);
        setDefaults36("etatToggle36", toggle36.getState(), this);
        setDefaults37("etatToggle37", toggle37.getState(), this);
        setDefaults38("etatToggle38", toggle38.getState(), this);
        setDefaults39("etatToggle39", toggle39.getState(), this);
        //4
        setDefaults42("etatToggle42", toggle42.getState(), this);
        setDefaults44("etatToggle44", toggle44.getState(), this);
        setDefaults46("etatToggle46", toggle46.getState(), this);
        setDefaults47("etatToggle47", toggle47.getState(), this);
        setDefaults48("etatToggle48", toggle48.getState(), this);
        setDefaults49("etatToggle49", toggle49.getState(), this);
        //5
        setDefaults52("etatToggle52", toggle52.getState(), this);
        setDefaults54("etatToggle54", toggle54.getState(), this);
        setDefaults56("etatToggle56", toggle56.getState(), this);
        setDefaults57("etatToggle57", toggle57.getState(), this);
        setDefaults58("etatToggle58", toggle58.getState(), this);
        setDefaults59("etatToggle59", toggle59.getState(), this);
        //6
        setDefaults62("etatToggle62", toggle62.getState(), this);
        setDefaults64("etatToggle64", toggle64.getState(), this);
        setDefaults66("etatToggle66", toggle66.getState(), this);
        setDefaults67("etatToggle67", toggle67.getState(), this);
        setDefaults68("etatToggle68", toggle68.getState(), this);
        setDefaults69("etatToggle69", toggle69.getState(), this);
      //  setDefaultsp("etatTogglep", punkty, this);
        setsbtn1("sbtn1", sbtn1.getState(), this);
        setsbtn2("sbtn2", sbtn2.getState(), this);
        setbtn1("btn1", btn1.getState(), this);
        setbtn2("btn2", btn2.getState(), this);
        setbtn7("btn7", btn7.getState(), this);
        setbtn8("btn8", btn8.getState(), this);
        setbtn9("btn9", btn9.getState(), this);
        setbtn10("btn10", btn10.getState(), this);
        setbtn11("btn11", btn11.getState(), this);
        setbtn12("btn12", btn12.getState(), this);
        setbtn13("btn13", btn13.getState(), this);
        setbtn14("btn14", btn14.getState(), this);
        setbtn15("btn15", btn15.getState(), this);
        setbtn16("btn16", btn16.getState(), this);
        setbtn17("btn17", btn17.getState(), this);
        setbtn18("btn18", btn18.getState(), this);
        setbtn19("btn19", btn19.getState(), this);
        setbtn20("btn20", btn20.getState(), this);
        setbtn21("btn21", btn21.getState(), this);
        setbtn22("btn22", btn22.getState(), this);
        setbtn23("btn23", btn23.getState(), this);
        setbtn24("btn24", btn24.getState(), this);
        setbtn25("btn25", btn25.getState(), this);
        setbtn26("btn26", btn26.getState(), this);
        setbtn27("btn27", btn27.getState(), this);
        setbtn28("btn28", btn28.getState(), this);
        setbtn29("btn29", btn29.getState(), this);
        setbtn30("btn30", btn30.getState(), this);
    }
    @Override
    public void onDestroy(){
        super.onDestroy();

        setDefaults2("etatToggle2", toggle2.getState(), this);
        setDefaults4("etatToggle4", toggle4.getState(), this);
        setDefaults6("etatToggle6", toggle6.getState(), this);
        setDefaults7("etatToggle7", toggle7.getState(), this);
        setDefaults8("etatToggle8", toggle8.getState(), this);
        setDefaults9("etatToggle9", toggle9.getState(), this);
        //2
        setDefaults22("etatToggle22", toggle22.getState(), this);
        setDefaults24("etatToggle24", toggle24.getState(), this);
        setDefaults26("etatToggle26", toggle26.getState(), this);
        setDefaults27("etatToggle27", toggle27.getState(), this);
        setDefaults28("etatToggle28", toggle28.getState(), this);
        setDefaults29("etatToggle29", toggle29.getState(), this);
        //3
        setDefaults32("etatToggle32", toggle32.getState(), this);
        setDefaults34("etatToggle34", toggle34.getState(), this);
        setDefaults36("etatToggle36", toggle36.getState(), this);
        setDefaults37("etatToggle37", toggle37.getState(), this);
        setDefaults38("etatToggle38", toggle38.getState(), this);
        setDefaults39("etatToggle39", toggle39.getState(), this);
        //4
        setDefaults42("etatToggle42", toggle42.getState(), this);
        setDefaults44("etatToggle44", toggle44.getState(), this);
        setDefaults46("etatToggle46", toggle46.getState(), this);
        setDefaults47("etatToggle47", toggle47.getState(), this);
        setDefaults48("etatToggle48", toggle48.getState(), this);
        setDefaults49("etatToggle49", toggle49.getState(), this);
        //5
        setDefaults52("etatToggle52", toggle52.getState(), this);
        setDefaults54("etatToggle54", toggle54.getState(), this);
        setDefaults56("etatToggle56", toggle56.getState(), this);
        setDefaults57("etatToggle57", toggle57.getState(), this);
        setDefaults58("etatToggle58", toggle58.getState(), this);
        setDefaults59("etatToggle59", toggle59.getState(), this);
        //6
        setDefaults62("etatToggle62", toggle62.getState(), this);
        setDefaults64("etatToggle64", toggle64.getState(), this);
        setDefaults66("etatToggle66", toggle66.getState(), this);
        setDefaults67("etatToggle67", toggle67.getState(), this);
        setDefaults68("etatToggle68", toggle68.getState(), this);
        setDefaults69("etatToggle69", toggle69.getState(), this);
        //  setDefaultsp("etatTogglep", punkty, this);
        setsbtn1("sbtn1", sbtn1.getState(), this);
        setsbtn2("sbtn2", sbtn2.getState(), this);
        setbtn1("btn1", btn1.getState(), this);
        setbtn2("btn2", btn2.getState(), this);
        setbtn7("btn7", btn7.getState(), this);
        setbtn8("btn8", btn8.getState(), this);
        setbtn9("btn9", btn9.getState(), this);
        setbtn10("btn10", btn10.getState(), this);
        setbtn11("btn11", btn11.getState(), this);
        setbtn12("btn12", btn12.getState(), this);
        setbtn13("btn13", btn13.getState(), this);
        setbtn14("btn14", btn14.getState(), this);
        setbtn15("btn15", btn15.getState(), this);
        setbtn16("btn16", btn16.getState(), this);
        setbtn17("btn17", btn17.getState(), this);
        setbtn18("btn18", btn18.getState(), this);
        setbtn19("btn19", btn19.getState(), this);
        setbtn20("btn20", btn20.getState(), this);
        setbtn21("btn21", btn21.getState(), this);
        setbtn22("btn22", btn22.getState(), this);
        setbtn23("btn23", btn23.getState(), this);
        setbtn24("btn24", btn24.getState(), this);
        setbtn25("btn25", btn25.getState(), this);
        setbtn26("btn26", btn26.getState(), this);
        setbtn27("btn27", btn27.getState(), this);
        setbtn28("btn28", btn28.getState(), this);
        setbtn29("btn29", btn29.getState(), this);
        setbtn30("btn30", btn30.getState(), this);
    }
    public static void setDefaults2(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getDefaults2(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
         String zwrot3 = preferences.getString(key, "");
       return FlashEnum2.toMyEnum(zwrot3);
    }

    public static void setDefaults4(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum getDefaults4(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON4");
        return FlashEnum.toMyEnum(zwrot3);
    }

    public static void setDefaults6(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getDefaults6(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setDefaults7(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum getDefaults7(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum.toMyEnum(zwrot3);
    }
    public static void setDefaults8(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum getDefaults8(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON8");
        return FlashEnum.toMyEnum(zwrot3);
    }
    public static void setDefaults9(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getDefaults9(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    //2
    public static void setDefaults22(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getDefaults22(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum2.toMyEnum(zwrot3);
    }

    public static void setDefaults24(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum getDefaults24(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON4");
        return FlashEnum.toMyEnum(zwrot3);
    }

    public static void setDefaults26(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getDefaults26(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setDefaults27(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum getDefaults27(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum.toMyEnum(zwrot3);
    }
    public static void setDefaults28(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum getDefaults28(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON8");
        return FlashEnum.toMyEnum(zwrot3);
    }
    public static void setDefaults29(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getDefaults29(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    //3
    public static void setDefaults32(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getDefaults32(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum2.toMyEnum(zwrot3);
    }

    public static void setDefaults34(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum getDefaults34(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON4");
        return FlashEnum.toMyEnum(zwrot3);
    }

    public static void setDefaults36(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getDefaults36(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setDefaults37(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum getDefaults37(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum.toMyEnum(zwrot3);
    }
    public static void setDefaults38(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum getDefaults38(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON8");
        return FlashEnum.toMyEnum(zwrot3);
    }
    public static void setDefaults39(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getDefaults39(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    //4
    public static void setDefaults42(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getDefaults42(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum2.toMyEnum(zwrot3);
    }

    public static void setDefaults44(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum getDefaults44(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON4");
        return FlashEnum.toMyEnum(zwrot3);
    }

    public static void setDefaults46(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getDefaults46(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setDefaults47(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum getDefaults47(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum.toMyEnum(zwrot3);
    }
    public static void setDefaults48(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum getDefaults48(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON8");
        return FlashEnum.toMyEnum(zwrot3);
    }
    public static void setDefaults49(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getDefaults49(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    //5
    public static void setDefaults52(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getDefaults52(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum2.toMyEnum(zwrot3);
    }

    public static void setDefaults54(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum getDefaults54(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON4");
        return FlashEnum.toMyEnum(zwrot3);
    }

    public static void setDefaults56(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getDefaults56(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setDefaults57(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum getDefaults57(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum.toMyEnum(zwrot3);
    }
    public static void setDefaults58(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum getDefaults58(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON8");
        return FlashEnum.toMyEnum(zwrot3);
    }
    public static void setDefaults59(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getDefaults59(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    //6
    public static void setDefaults62(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getDefaults62(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum2.toMyEnum(zwrot3);
    }

    public static void setDefaults64(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum getDefaults64(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON4");
        return FlashEnum.toMyEnum(zwrot3);
    }

    public static void setDefaults66(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getDefaults66(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setDefaults67(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum getDefaults67(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum.toMyEnum(zwrot3);
    }
    public static void setDefaults68(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum getDefaults68(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON8");
        return FlashEnum.toMyEnum(zwrot3);
    }
    public static void setDefaults69(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getDefaults69(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setDefaultsp(String key, int value, Context context)
    {


        editor.putInt(key, value);
        editor.commit();
    }
    public static FlashEnum getsbtn1(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ONs");
        return FlashEnum.toMyEnum(zwrot3);
    }
    public static void setsbtn2(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum getsbtn2(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ONs");
        return FlashEnum.toMyEnum(zwrot3);
    }
//    public static int getDefaultsp(String key, Context context)
//    {
//        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
//        return preferences.getInt(key, punkty);
//    }

    public static void setbtn2(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getbtn2(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setbtn1(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }
    public static FlashEnum2 getbtn1(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static FlashEnum2 getbtn7(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setbtn7(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getbtn8(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setbtn8(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getbtn9(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setbtn9(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getbtn10(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setbtn10(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getbtn11(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setbtn11(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getbtn12(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setbtn12(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getbtn13(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setbtn13(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getbtn14(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setbtn14(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getbtn15(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setbtn15(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getbtn16(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setbtn16(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getbtn17(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setbtn17(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getbtn18(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setbtn18(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getbtn19(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setbtn19(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getbtn20(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setbtn20(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getbtn21(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setbtn21(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getbtn22(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setbtn22(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getbtn23(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setbtn23(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getbtn24(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setbtn24(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getbtn25(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setbtn25(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getbtn26(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setbtn26(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getbtn27(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setbtn27(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getbtn28(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setbtn28(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getbtn29(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setbtn29(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum2 getbtn30(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "ON7");
        return FlashEnum2.toMyEnum(zwrot3);
    }
    public static void setbtn30(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }

    public void skrzat4(View view) {
        if(AUTOMATIC == toggle4.getState()){
            idskrzat="skrzat4";
       punkty++;  Intent intent = new Intent(MainActivity.this, pytania2.class);
        Menu.wyl=1; startActivity(intent);}

    }
    public void skrzat7(View view) {
        if(AUTOMATIC == toggle7.getState()){
            idskrzat="skrzat7";
 punkty++;             Intent intent = new Intent(MainActivity.this, pytania2.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void skrzat8(View view) {
        if(AUTOMATIC == toggle8.getState()){
            idskrzat="skrzat8";
 punkty++;             Intent intent = new Intent(MainActivity.this, pytania2.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void skrzat24(View view) {
        if(AUTOMATIC == toggle24.getState()){
            idskrzat="skrzat24";
 punkty++;             Intent intent = new Intent(MainActivity.this, pytania2.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void skrzat27(View view) {
        if(AUTOMATIC == toggle27.getState()){
            idskrzat="skrzat27";
 punkty++;             Intent intent = new Intent(MainActivity.this, pytania2.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void skrzat28(View view) {
        if(AUTOMATIC == toggle28.getState()){
            idskrzat="skrzat28";
 punkty++;             Intent intent = new Intent(MainActivity.this, pytania2.class);
            Menu.wyl=1; startActivity(intent);}

    }

    public void skrzat34(View view) {
        if(AUTOMATIC == toggle34.getState()){
            idskrzat="skrzat34";
 punkty++;             Intent intent = new Intent(MainActivity.this, pytania2.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void skrzat37(View view) {
        if(AUTOMATIC == toggle37.getState()){
            idskrzat="skrzat37";
 punkty++;             Intent intent = new Intent(MainActivity.this, pytania2.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void skrzat38(View view) {
        if(AUTOMATIC == toggle38.getState()){
            idskrzat="skrzat38";
 punkty++;             Intent intent = new Intent(MainActivity.this, pytania2.class);
            Menu.wyl=1; startActivity(intent);}

    }

    public void skrzat44(View view) {
        if(AUTOMATIC == toggle44.getState()){
            idskrzat="skrzat44";
 punkty++;             Intent intent = new Intent(MainActivity.this, pytania2.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void skrzat47(View view) {
        if(AUTOMATIC == toggle47.getState()){
            idskrzat="skrzat47";
 punkty++;             Intent intent = new Intent(MainActivity.this, pytania2.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void skrzat48(View view) {
        if(AUTOMATIC == toggle48.getState()){
            idskrzat="skrzat48";
 punkty++;             Intent intent = new Intent(MainActivity.this, pytania2.class);
            Menu.wyl=1; startActivity(intent);}

    }

    public void skrzat54(View view) {
        if(AUTOMATIC == toggle54.getState()){
            idskrzat="skrzat54";
 punkty++;             Intent intent = new Intent(MainActivity.this, pytania2.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void skrzat57(View view) {
        if(AUTOMATIC == toggle57.getState()){
            idskrzat="skrzat57";
 punkty++;             Intent intent = new Intent(MainActivity.this, pytania2.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void skrzat58(View view) {
        if(AUTOMATIC == toggle58.getState()){
            idskrzat="skrzat58";
 punkty++;             Intent intent = new Intent(MainActivity.this, pytania2.class);
            Menu.wyl=1; startActivity(intent);}

    }

    public void skrzat64(View view) {
        if(AUTOMATIC == toggle64.getState()){
            idskrzat="skrzat64";
 punkty++;             Intent intent = new Intent(MainActivity.this, pytania2.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void skrzat67(View view) {
        if(AUTOMATIC == toggle67.getState()){
            idskrzat="skrzat67";
 punkty++;             Intent intent = new Intent(MainActivity.this, pytania2.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void skrzat68(View view) {
        if(AUTOMATIC == toggle68.getState()){
            idskrzat="skrzat68";
 punkty++;             Intent intent = new Intent(MainActivity.this, pytania2.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zeruj(View view){
        setpm("c", punkty, this);
        setpc("d", punktyc, this);
        Intent intent = new Intent(MainActivity.this, Menu.class);
        Menu.wyl=1; startActivity(intent);
    }
    public void zmiana12(View view) {
        if(ON2 == toggle2.getState()){
            Intent intent = new Intent(MainActivity.this, MainActivityc.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmiana16(View view) {
        if(ON2 == toggle6.getState()){
            Intent intent = new Intent(MainActivity.this, MainActivityc.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmiana19(View view) {
        if(ON2 == toggle9.getState()){
            Intent intent = new Intent(MainActivity.this, MainActivityc.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmiana22(View view) {
        if(ON2 == toggle22.getState()){
            Intent intent = new Intent(MainActivity.this, MainActivityc.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmiana26(View view) {
        if(ON2 == toggle26.getState()){
            Intent intent = new Intent(MainActivity.this, MainActivityc.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmiana29(View view) {
        if(ON2 == toggle29.getState()){
            Intent intent = new Intent(MainActivity.this, MainActivityc.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmiana32(View view) {
        if(ON2 == toggle32.getState()){
            Intent intent = new Intent(MainActivity.this, MainActivityc.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmiana36(View view) {
        if(ON2 == toggle36.getState()){
            Intent intent = new Intent(MainActivity.this, MainActivityc.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmiana39(View view) {
        if(ON2 == toggle39.getState()){
            Intent intent = new Intent(MainActivity.this, MainActivityc.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmiana42(View view) {
        if(ON2 == toggle42.getState()){
            Intent intent = new Intent(MainActivity.this, MainActivityc.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmiana46(View view) {
        if(ON2 == toggle46.getState()){
            Intent intent = new Intent(MainActivity.this, MainActivityc.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmiana49(View view) {
        if(ON2 == toggle49.getState()){
            Intent intent = new Intent(MainActivity.this, MainActivityc.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmiana52(View view) {
        if(ON2 == toggle52.getState()){
            Intent intent = new Intent(MainActivity.this, MainActivityc.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmiana56(View view) {
        if(ON2 == toggle56.getState()){
            Intent intent = new Intent(MainActivity.this, MainActivityc.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmiana59(View view) {
        if(ON2 == toggle59.getState()){
            Intent intent = new Intent(MainActivity.this, MainActivityc.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmiana62(View view) {
        if(ON2 == toggle62.getState()){
            Intent intent = new Intent(MainActivity.this, MainActivityc.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmiana66(View view) {
        if(ON2 == toggle66.getState()){
            Intent intent = new Intent(MainActivity.this, MainActivityc.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmiana69(View view) {
        if(ON2 == toggle69.getState()){
            Intent intent = new Intent(MainActivity.this, MainActivityc.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public static void setsbtn1(String key, Enum value, Context context)
    {


        editor.putString(key, value.toString());
        editor.commit();
    }


    public void skrzatbtn1(View view) {
        if(AUTOMATIC == sbtn1.getState()){
            idskrzat="skrzatbtn1";
            sb1=1;
             punkty++;  Intent intent = new Intent(MainActivity.this, pytania2.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void skrzatbtn2(View view) {
        if(AUTOMATIC == sbtn2.getState()){
            idskrzat="skrzatbtn2";
            sb2=1;
             punkty++;   Intent intent = new Intent(MainActivity.this, pytania2.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmianab1(View view) {
        if(ON2 == btn1.getState()){
            Intent intent = new Intent(MainActivity.this, MainActivityc.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmianab2(View view) {
        if(ON2 == btn2.getState()){
            Intent intent = new Intent(MainActivity.this, MainActivityc.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmianab7(View view) {
        if(ON2 == btn7.getState()){
            Intent intent = new Intent(MainActivity.this, MainActivityc.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmianab8(View view) {
        if(ON2 == btn8.getState()){
            Intent intent = new Intent(MainActivity.this, MainActivityc.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmianab9(View view) {
        if(ON2 == btn9.getState()){
            Intent intent = new Intent(MainActivity.this, MainActivityc.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmianab10(View view) {
        if(ON2 == btn10.getState()){
            Intent intent = new Intent(MainActivity.this, MainActivityc.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmianab11(View view) {
        if(ON2 == btn11.getState()){
            Intent intent = new Intent(MainActivity.this, MainActivityc.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmianab12(View view) {
        if(ON2 == btn12.getState()){
            Intent intent = new Intent(MainActivity.this, MainActivityc.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmianab13(View view) {
        if(ON2 == btn13.getState()){
            Intent intent = new Intent(MainActivity.this, MainActivityc.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmianab14(View view) {
        if(ON2 == btn14.getState()){
            Intent intent = new Intent(MainActivity.this, MainActivityc.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmianab15(View view) {
        if(ON2 == btn15.getState()){
            Intent intent = new Intent(MainActivity.this, MainActivityc.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmianab16(View view) {
        if(ON2 == btn16.getState()){
            Intent intent = new Intent(MainActivity.this, MainActivityc.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmianab17(View view) {
        if(ON2 == btn17.getState()){
            Intent intent = new Intent(MainActivity.this, MainActivityc.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmianab18(View view) {
        if(ON2 == btn18.getState()){
            Intent intent = new Intent(MainActivity.this, MainActivityc.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmianab19(View view) {
        if(ON2 == btn19.getState()){
            Intent intent = new Intent(MainActivity.this, MainActivityc.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmianab20(View view) {
        if(ON2 == btn20.getState()){
            Intent intent = new Intent(MainActivity.this, MainActivityc.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmianab21(View view) {
        if(ON2 == btn21.getState()){
            Intent intent = new Intent(MainActivity.this, MainActivityc.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmianab22(View view) {
        if(ON2 == btn22.getState()){
            Intent intent = new Intent(MainActivity.this, MainActivityc.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmianab23(View view) {
        if(ON2 == btn23.getState()){
            Intent intent = new Intent(MainActivity.this, MainActivityc.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmianab24(View view) {
        if(ON2 == btn24.getState()){
            Intent intent = new Intent(MainActivity.this, MainActivityc.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmianab25(View view) {
        if(ON2 == btn25.getState()){
            Intent intent = new Intent(MainActivity.this, MainActivityc.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmianab26(View view) {
        if(ON2 == btn26.getState()){
            Intent intent = new Intent(MainActivity.this, MainActivityc.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmianab27(View view) {
        if(ON2 == btn27.getState()){
            Intent intent = new Intent(MainActivity.this, MainActivityc.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmianab28(View view) {
        if(ON2 == btn28.getState()){
            Intent intent = new Intent(MainActivity.this, MainActivityc.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmianab29(View view) {
        if(ON2 == btn29.getState()){
            Intent intent = new Intent(MainActivity.this, MainActivityc.class);
            Menu.wyl=1; startActivity(intent);}

    }
    public void zmianab30(View view) {
        if(ON2 == btn30.getState()){
            Intent intent = new Intent(MainActivity.this, MainActivityc.class);
            Menu.wyl=1; startActivity(intent);}

    }

}
