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

import static lukasz.p1.kraina1.FlashButton.FlashEnum.OFF;
import static lukasz.p1.kraina1.FlashButton.FlashEnum.ON;
import static lukasz.p1.kraina1.MainActivity.idskrzat;
import static lukasz.p1.kraina1.MainActivity.punkty;
import static lukasz.p1.kraina1.MainActivity.setDefaults24;
import static lukasz.p1.kraina1.MainActivity.setDefaults27;
import static lukasz.p1.kraina1.MainActivity.setDefaults28;
import static lukasz.p1.kraina1.MainActivity.setDefaults34;
import static lukasz.p1.kraina1.MainActivity.setDefaults37;
import static lukasz.p1.kraina1.MainActivity.setDefaults38;
import static lukasz.p1.kraina1.MainActivity.setDefaults4;
import static lukasz.p1.kraina1.MainActivity.setDefaults44;
import static lukasz.p1.kraina1.MainActivity.setDefaults47;
import static lukasz.p1.kraina1.MainActivity.setDefaults48;
import static lukasz.p1.kraina1.MainActivity.setDefaults54;
import static lukasz.p1.kraina1.MainActivity.setDefaults57;
import static lukasz.p1.kraina1.MainActivity.setDefaults58;
import static lukasz.p1.kraina1.MainActivity.setDefaults64;
import static lukasz.p1.kraina1.MainActivity.setDefaults67;
import static lukasz.p1.kraina1.MainActivity.setDefaults68;
import static lukasz.p1.kraina1.MainActivity.setDefaults7;
import static lukasz.p1.kraina1.MainActivity.setDefaults8;
import static lukasz.p1.kraina1.MainActivity.setsbtn1;
import static lukasz.p1.kraina1.MainActivity.setsbtn2;
import static lukasz.p1.kraina1.MainActivityc.idskrzatc;
import static lukasz.p1.kraina1.MainActivityc.punktyc;
import static lukasz.p1.kraina1.MainActivityc.setsbtncc1;
import static lukasz.p1.kraina1.MainActivityc.setsbtncc2;
import static lukasz.p1.kraina1.MainActivity.s;
import static lukasz.p1.kraina1.Menu.kon;
import static lukasz.p1.kraina1.Menu.mp;

public class dobrze3 extends AppCompatActivity {    public void onStart(){         super.onStart(); Menu.wyl=0;}
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

        setContentView(R.layout.activity_dobrze);
        Random generator = new Random();
        int i=generator.nextInt(2);
        MediaPlayer mpb = MediaPlayer.create(this, R.raw.brawa);
        if(Intro.z==1 )mpb.start();
        TextView textviev;
        textviev = (TextView) findViewById(R.id.textView3);
        if(idskrzat=="skrzatbtn1" || idskrzat=="skrzatbtn2" || idskrzatc=="skrzatcbtnc1" || idskrzatc=="skrzatcbtnc2")
            s=0;
        if(s==1){
            punkty=punkty+3;
            textviev.setText("");

            GifView gifView= (GifView) findViewById(R.id.gif);  gifView.setVisibility(View.INVISIBLE);



            switch (idskrzat){
                case("skrzat4"):
                    setDefaults4("etatToggle4", OFF, this);
                    idskrzat="";
                    break;
                case("skrzat7"):
                    setDefaults7("etatToggle7", OFF, this);
                    idskrzat="";
                    break;
                case("skrzat8"):
                    setDefaults8("etatToggle8", OFF, this);
                    idskrzat="";
                    break;
                case("skrzat24"):
                    setDefaults24("etatToggle24", OFF, this);
                    idskrzat="";
                    break;
                case("skrzat27"):
                    setDefaults27("etatToggle27", OFF, this);
                    idskrzat="";
                    break;
                case("skrzat28"):
                    setDefaults28("etatToggle28", OFF, this);
                    idskrzat="";
                    break;
                case("skrzat34"):
                    setDefaults34("etatToggle34", OFF, this);
                    idskrzat="";
                    break;
                case("skrzat37"):
                    setDefaults37("etatToggle37", OFF, this);
                    idskrzat="";
                    break;
                case("skrzat38"):
                    setDefaults38("etatToggle38", OFF, this);
                    idskrzat="";
                    break;
                case("skrzat44"):
                    setDefaults44("etatToggle44", OFF, this);
                    idskrzat="";
                    break;
                case("skrzat47"):
                    setDefaults47("etatToggle47", OFF, this);
                    idskrzat="";
                    break;
                case("skrzat48"):
                    setDefaults48("etatToggle48", OFF, this);
                    idskrzat="";
                    break;
                case("skrzat54"):
                    setDefaults54("etatToggle54", OFF, this);
                    idskrzat="";
                    break;
                case("skrzat57"):
                    setDefaults57("etatToggle57", OFF, this);
                    idskrzat="";
                    break;
                case("skrzat58"):
                    setDefaults58("etatToggle58", OFF, this);
                    idskrzat="";
                    break;
                case("skrzat64"):
                    setDefaults64("etatToggle64", OFF, this);
                    idskrzat="";
                    break;
                case("skrzat67"):
                    setDefaults67("etatToggle67", OFF, this);
                    idskrzat="";
                    break;
                case("skrzat68"):
                    setDefaults68("etatToggle68", OFF, this);
                    idskrzat="";
                    break;
                case("skrzatbtn1"):
                    setsbtn1("sbtn1", OFF, this);
                    idskrzat="";
                    break;
                case("skrzatbtn2"):
                    setsbtn2("sbtn2", OFF, this);
                    idskrzat="";
                    break;

            }

        }else{
            textviev.setText("");

            GifViewz gifView= (GifViewz) findViewById(R.id.gifz);

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

            }}

    }
    public static int getDefaultsp(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        return preferences.getInt(key, punkty);
    }

    public static void setDefaultsp(String key, int value, Context context)
    {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        value=value+3;
        editor.putInt(key, value);
        editor.commit();
    }

    void kill_activity()
    {
        finish();
    }
    public void powrot(View view) {
        punkty=punkty+3;
        setDefaultsp("etatTogglep", punkty, this);
        Intent intent = new Intent(dobrze3.this, MainActivityc.class);
        Menu.wyl=1; startActivity(intent);
    }

}
