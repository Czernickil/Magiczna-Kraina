package lukasz.p1.kraina1;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.VideoView;

import java.util.Random;

import static lukasz.p1.kraina1.FlashButton.FlashEnum.ON;
import static lukasz.p1.kraina1.FlashButton.FlashEnum.OFF;
import static lukasz.p1.kraina1.MainActivity.idskrzat;
import static lukasz.p1.kraina1.MainActivity.punkty;
import static lukasz.p1.kraina1.MainActivity.setDefaults24;
import static lukasz.p1.kraina1.MainActivity.setDefaults4;
import static lukasz.p1.kraina1.MainActivity.setDefaults7;
import static lukasz.p1.kraina1.MainActivity.setDefaults8;
import static lukasz.p1.kraina1.MainActivityc.idskrzatc;
import static lukasz.p1.kraina1.MainActivityc.punktyc;
import static lukasz.p1.kraina1.MainActivityc.*;
import static lukasz.p1.kraina1.MainActivityc.setDefaultsc4;
import static lukasz.p1.kraina1.MainActivityc.setsbtncc1;
import static lukasz.p1.kraina1.MainActivityc.setsbtncc2;

import static lukasz.p1.kraina1.Menu.kon;
import static lukasz.p1.kraina1.Menu.mp;

public class dobrzec extends AppCompatActivity {
    public void onStart() {
        super.onStart();
        Menu.wyl = 0;
    }
    public void onPause() {
        super.onPause();
        if (Menu.wyl == 0) {
            Intro.z = 0;
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
        if (Intro.z == 1) mpb.start();
        textviev = (TextView) findViewById(R.id.textView3);
        if (idskrzat == "skrzatbtn1" || idskrzat == "skrzatbtn2" || idskrzatc == "skrzatcbtnc1" || idskrzatc == "skrzatcbtnc2")
            s = 0;
        if (s == 1) {
            textviev.setText("");
            punktyc = punktyc + 3;
            GifViewc gifView = (GifViewc) findViewById(R.id.gifz);
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
            GifViewzc gifView = (GifViewzc) findViewById(R.id.gif);
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
        return preferences.getInt(key, punktyc);
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
        Intent intent = new Intent(dobrzec.this, MainActivity.class);
        Menu.wyl = 1;
        startActivity(intent);
        setDefaultspc("etatTogglep", punktyc++, this);
    }

}