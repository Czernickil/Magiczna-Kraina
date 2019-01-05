package com.example.p1.kraina1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class Autrorzy extends Activity {
    public void onStart() {
        super.onStart();
        Menu.poprawneWylaczenie = 0;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autorzy);
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

    public void dalej(View view) {
        Intent intent = new Intent(Autrorzy.this, Menu.class);
        Menu.poprawneWylaczenie = 1;
        startActivity(intent);
    }
}