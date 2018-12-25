package com.example.p1.kraina1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;



public class Intro extends Activity {
    public void onStart() {
        super.onStart();
        Menu.poprawneWylaczenie = 0;
    }

    public static int poprawneWylaczenieTrzy;
    public static int poprawneWylaczenieDwa = 1;
    public static AudioPlayer adp = new AudioPlayer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        if (Menu.poprawneWylaczenie == 1) {
            poprawneWylaczenieTrzy = 1;
        }
    }

    public void dalej(View view) {
        adp.run();
        adp.go();
        Intent intent = new Intent(Intro.this, Menu.class);
        Menu.poprawneWylaczenie = 1;
        startActivity(intent);
    }

    public void onPause() {
        super.onPause();
        if (Menu.poprawneWylaczenie == 0) {
            Intro.poprawneWylaczenieDwa = 0;
            Intro.adp.run();
        }
    }
}