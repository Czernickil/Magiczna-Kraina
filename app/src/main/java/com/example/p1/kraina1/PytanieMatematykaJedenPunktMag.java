package com.example.p1.kraina1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class PytanieMatematykaJedenPunktMag extends Activity {
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
        while (PytanieTesktowe.getPytmat1(i, 5).equals("Z"))
            i = generator.nextInt(8);
        pyt.setText(PytanieTesktowe.getPytmat1(i, 0));
        odp1.setText(PytanieTesktowe.getPytmat1(i, 1));
        odp2.setText(PytanieTesktowe.getPytmat1(i, 2));
        odp3.setText(PytanieTesktowe.getPytmat1(i, 3));
        odp4.setText(PytanieTesktowe.getPytmat1(i, 4));
        PytanieTesktowe.zajPytmat1(i);
    }

    public void sprawdz1(View view) {
        if (PytanieTesktowe.getPytmat1(i, 6).equals(PytanieTesktowe.getPytmat1(i, 1)))
            dobra(view);
        else
            zla(view);
    }

    public void sprawdz2(View view) {
        if (PytanieTesktowe.getPytmat1(i, 6).equals(PytanieTesktowe.getPytmat1(i, 2)))
            dobra(view);
        else
            zla(view);
    }

    public void sprawdz3(View view) {
        if (PytanieTesktowe.getPytmat1(i, 6).equals(PytanieTesktowe.getPytmat1(i, 3)))
            dobra(view);
        else
            zla(view);
    }

    public void sprawdz4(View view) {
        if (PytanieTesktowe.getPytmat1(i, 6).equals(PytanieTesktowe.getPytmat1(i, 4)))
            dobra(view);
        else
            zla(view);
    }

    public void dobra(View view) {
        Intent intent = new Intent(PytanieMatematykaJedenPunktMag.this, DobrzeMagJedenPunkt.class);
        Menu.poprawneWylaczenie = 1;
        startActivity(intent);
    }

    public void zla(View view) {
        Intent intent = new Intent(PytanieMatematykaJedenPunktMag.this, ZlaOdpowiedzMaga.class);
        Menu.poprawneWylaczenie = 1;
        startActivity(intent);
    }


}
