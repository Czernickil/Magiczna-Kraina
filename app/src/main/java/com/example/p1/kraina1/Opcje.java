package com.example.p1.kraina1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;

import static com.example.p1.kraina1.Menu.stanPopupow;

public class Opcje extends Activity {
    public void onStart() {
        super.onStart();
        Menu.poprawneWylaczenie = 0;
    }

    PrzyciskWlaczeniaDzwiekuOpcje voices;
    ToggleButton toggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opcje);
        voices = (PrzyciskWlaczeniaDzwiekuOpcje) findViewById(R.id.voiced);
        toggleButton = (ToggleButton) findViewById(R.id.toggleButton);
        if (Intro.poprawneWylaczenieDwa == 0) {
            voices.setState(PrzyciskWlaczeniaDzwiekuOpcje.FlashEnum6.OFF6);
        } else
            voices.setState(PrzyciskWlaczeniaDzwiekuOpcje.FlashEnum6.ON6);

        if (stanPopupow == 0) {
            toggleButton.setChecked(true);
        } else
            toggleButton.setChecked(false);
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
        Intent intent = new Intent(Opcje.this, Menu.class);
        Menu.poprawneWylaczenie = 1;
        startActivity(intent);
    }

    public void voice(View view) {
        if (voices.getState() == PrzyciskWlaczeniaDzwiekuOpcje.FlashEnum6.ON6) {
            Intro.poprawneWylaczenieDwa = 0;
            Intro.adp.run();
        } else {
            Intro.poprawneWylaczenieDwa = 1;
            Intro.adp.run();
        }

    }

    public void popup(View view) {
        if (toggleButton.isChecked()) {
            stanPopupow = 0;
        } else {
            stanPopupow = 1;
        }

    }
}
