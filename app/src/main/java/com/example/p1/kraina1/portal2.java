package lukasz.p1.kraina1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import static lukasz.p1.kraina1.MainActivity.punkty;
import static lukasz.p1.kraina1.MainActivity.r;
import static lukasz.p1.kraina1.MainActivityc.punktyc;
import static lukasz.p1.kraina1.Menu.kon; public class portal2 extends AppCompatActivity {    public void onStart(){         super.onStart(); Menu.wyl=0;}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portal2);

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
            punkty=punkty+2;
            Intent intent = new Intent(portal2.this, MainActivityc.class);
            Menu.wyl=1; startActivity(intent);
        } else {
            punktyc=punktyc+2;
            Intent intent = new Intent(portal2.this, MainActivity.class);
            Menu.wyl=1; startActivity(intent);
        }
    }
}
