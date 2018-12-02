package lukasz.p1.kraina1;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import static lukasz.p1.kraina1.R.raw.kula;
import static lukasz.p1.kraina1.MainActivity.punkty;
import static lukasz.p1.kraina1.MainActivity.r;
import static lukasz.p1.kraina1.MainActivityc.punktyc;
import static lukasz.p1.kraina1.Menu.kon; public class portal1 extends AppCompatActivity {    public void onStart(){         super.onStart(); Menu.wyl=0;}
    GifViewportal po;
    GifViewportal po1;
    GifViewportal po2;
    GifViewportal po3;
    GifViewportal po4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portal1);
         po =(GifViewportal)findViewById(R.id.gif);
        po.setGif(this, R.raw.kula);
        po1 =(GifViewportal)findViewById(R.id.gifViewportal);
        po1.setGif(this, R.raw.image5);
        po2 =(GifViewportal)findViewById(R.id.gifViewportal2);
        po2.setGif(this, R.raw.image5);
        po3 =(GifViewportal)findViewById(R.id.gifViewportal3);
        po3.setGif(this, R.raw.image5);
        po4 =(GifViewportal)findViewById(R.id.gifViewportal4);
        po4.setGif(this, R.raw.image5);
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
    public void powrot(View view) {

        if (r == 1) {
            punkty=punkty+3;
            Intent intent = new Intent(portal1.this, MainActivityc.class);
            Menu.wyl=1; startActivity(intent);
        } else {
            punktyc=punktyc+3;
            Intent intent = new Intent(portal1.this, MainActivity.class);
            Menu.wyl=1; startActivity(intent);
        }
    }
}
