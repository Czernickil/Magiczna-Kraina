package lukasz.p1.kraina1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;



public class Intro extends AppCompatActivity {
    public void onStart() {
        super.onStart();
        Menu.wyl = 0;
    }

    public static int v;
    public static int z = 1;
    public static AudioPlayer adp = new AudioPlayer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        if (Menu.wyl == 1) {
            v = 1;
        }
    }

    public void dalej(View view) {
        adp.run();
        adp.go();
        Intent intent = new Intent(Intro.this, Menu.class);
        Menu.wyl = 1;
        startActivity(intent);
    }

    public void onPause() {
        super.onPause();
        if (Menu.wyl == 0) {
            Intro.z = 0;
            Intro.adp.run();
        }
    }
}