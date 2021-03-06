package com.example.p1.kraina1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;
import static com.example.p1.kraina1.Menu.kategoria;
import static com.example.p1.kraina1.Menu.wartoscPunktowa;
public class PytanieABCDCzarnoksieznika extends Activity {
    public void onStart() {
        super.onStart();
        Menu.poprawneWylaczenie = 0;
    }

    TextView odp1;
    TextView odp2;
    TextView odp3;
    TextView odp4;
    TextView pyt;
    Random generator = new Random();
    int i;
    Pytanie pytanie;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wybodp);
        pyt = (TextView) findViewById(R.id.editText);
        odp1 = (TextView) findViewById(R.id.od1);
        odp2 = (TextView) findViewById(R.id.od2);
        odp3 = (TextView) findViewById(R.id.od3);
        odp4 = (TextView) findViewById(R.id.od4);
        i = generator.nextInt(8);
        RepozytoriumPytan repozytoriumPytan= new RepozytoriumPytan(getApplication());
        pytanie = repozytoriumPytan.pozyskajPytaniaWedlugKategoriiPunktow(kategoria, wartoscPunktowa);
        pyt.setText(pytanie.getPTrescPytania());
        odp1.setText(pytanie.getPOdpowiedzA());
        odp2.setText(pytanie.getPOdpowiedzB());
        odp3.setText(pytanie.getPOdpowiedzC());
        odp4.setText(pytanie.getPOdpowiedzD());
    }

    public void sprawdz1(View view) {
        if (pytanie.getPOdpowiedzA().equals(pytanie.getPPoprawnaOdpowiedz()))
            dobra(view);
        else
            zla(view);
    }

    public void sprawdz2(View view) {
        if (pytanie.getPOdpowiedzB().equals(pytanie.getPPoprawnaOdpowiedz()))
            dobra(view);
        else
            zla(view);
    }

    public void sprawdz3(View view) {
        if (pytanie.getPOdpowiedzC().equals(pytanie.getPPoprawnaOdpowiedz()))
            dobra(view);
        else
            zla(view);
    }

    public void sprawdz4(View view) {
        if (pytanie.getPOdpowiedzD().equals(pytanie.getPPoprawnaOdpowiedz()))
            dobra(view);
        else
            zla(view);
    }
    public void dobra(View view) {
        Intent intent;
        if(wartoscPunktowa==1){
            intent = new Intent(PytanieABCDCzarnoksieznika.this, DobrzeCzernoksieznikJedenPunkt.class);}
        else if(wartoscPunktowa==2){
            intent = new Intent(PytanieABCDCzarnoksieznika.this, DobrzeCzernoksieznikDwaPunkty.class);}
        else {
            intent = new Intent(PytanieABCDCzarnoksieznika.this, DobrzeCzernoksieznikTrzyPunkty.class);}
        Menu.poprawneWylaczenie = 1;
        startActivity(intent);
    }

    public void zla(View view) {
        Intent intent = new Intent(PytanieABCDCzarnoksieznika.this, ZlaOdpowiedzCzarnoksieznika.class);
        Menu.poprawneWylaczenie = 1;
        startActivity(intent);
    }


}
