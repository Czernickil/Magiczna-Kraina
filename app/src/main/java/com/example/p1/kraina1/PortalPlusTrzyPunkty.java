package com.example.p1.kraina1;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import static com.example.p1.kraina1.GlownyWidokCzarnoksieznika.punktyCzarnoksieznika;
import static com.example.p1.kraina1.GlownyWidokMaga.punktyMaga;
import static com.example.p1.kraina1.GlownyWidokMaga.r;

public class PortalPlusTrzyPunkty extends Activity {    public void onStart(){         super.onStart(); Menu.poprawneWylaczenie =0;}
    GifyPortalowe po;
    GifyPortalowe po1;
    GifyPortalowe po2;
    GifyPortalowe po3;
    GifyPortalowe po4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portal1);
         po =(GifyPortalowe)findViewById(R.id.gif);
        po.setGif(this, R.raw.kula);
        po1 =(GifyPortalowe)findViewById(R.id.gifViewportal);
        po1.setGif(this, R.raw.image5);
        po2 =(GifyPortalowe)findViewById(R.id.gifViewportal2);
        po2.setGif(this, R.raw.image5);
        po3 =(GifyPortalowe)findViewById(R.id.gifViewportal3);
        po3.setGif(this, R.raw.image5);
        po4 =(GifyPortalowe)findViewById(R.id.gifViewportal4);
        po4.setGif(this, R.raw.image5);
        MediaPlayer mpb = MediaPlayer.create(this, R.raw.brawa);

        if(Intro.poprawneWylaczenieDwa ==1 )mpb.start();
    }
    public void onPause(){
        super.onPause();
        if(Menu.poprawneWylaczenie ==0){
                        Intro.poprawneWylaczenieDwa =0;             Intro.adp.run();
        }
    }
    public void onResume(){
        super.onResume();
        }
    public void powrot(View view) {

        if (r == 1) {
            punktyMaga = punktyMaga +3;
            Intent intent = new Intent(PortalPlusTrzyPunkty.this, GlownyWidokCzarnoksieznika.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);
        } else {
            punktyCzarnoksieznika = punktyCzarnoksieznika +3;
            Intent intent = new Intent(PortalPlusTrzyPunkty.this, GlownyWidokMaga.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);
        }
    }
}
