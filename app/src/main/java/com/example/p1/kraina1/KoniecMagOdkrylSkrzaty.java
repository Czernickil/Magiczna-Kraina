package com.example.p1.kraina1;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.app.Activity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import static com.example.p1.kraina1.GlownyWidokMaga.punktyMaga;
import static com.example.p1.kraina1.GlownyWidokCzarnoksieznika.punktyCzarnoksieznika;

public class KoniecMagOdkrylSkrzaty extends Activity {

    public void onStart(){
        super.onStart(); Menu.poprawneWylaczenie =0;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_koniec);
        TextView textviev = (TextView) findViewById(R.id.textView9);
        String wynik = String.valueOf(String.valueOf(punktyMaga)+ " : "+ String.valueOf(punktyCzarnoksieznika));
        textviev.setText(wynik);
        TextView textviev2 = (TextView) findViewById(R.id.textView11);
        if(punktyMaga > punktyCzarnoksieznika)
            textviev2.setText("Maga");
        if(punktyMaga < punktyCzarnoksieznika)
            textviev2.setText("Czarnoksiężnika");
        if(punktyMaga == punktyCzarnoksieznika)
            textviev2.setText("REMIS");
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

    public void dalej(View view){
        Intent intent = new Intent(KoniecMagOdkrylSkrzaty.this, Menu.class);
        Menu.poprawneWylaczenie =1; startActivity(intent);
    }
}
