package lukasz.p1.kraina1;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import static lukasz.p1.kraina1.MainActivity.punkty;
import static lukasz.p1.kraina1.MainActivityc.punktyc;
import static lukasz.p1.kraina1.Menu.kon; public class Koniec extends AppCompatActivity {

    public void onStart(){
        super.onStart(); Menu.wyl=0;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_koniec);
        TextView textviev = (TextView) findViewById(R.id.textView9);
        String wynik = String.valueOf(String.valueOf(punkty)+ " : "+ String.valueOf(punktyc));
        textviev.setText(wynik);
        TextView textviev2 = (TextView) findViewById(R.id.textView11);
        if(punkty>punktyc)
            textviev2.setText("Maga");
        if(punkty<punktyc)
            textviev2.setText("Czarnoksiężnika");
        if(punkty==punktyc)
            textviev2.setText("REMIS");
        MediaPlayer mpb = MediaPlayer.create(this, R.raw.brawa);
        if(Intro.z==1 )mpb.start();
    }

    public void onPause(){
        super.onPause();
        if(Menu.wyl==0){
                        Intro.z=0;             Intro.adp.run();
        }
    }

    public void onResume(){
        super.onResume();
        }

    public void dalej(View view){
        Intent intent = new Intent(Koniec.this, Menu.class);
        Menu.wyl=1; startActivity(intent);
    }
}
