package lukasz.p1.kraina1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;

import android.view.View;

import static lukasz.p1.kraina1.Menu.kon;
public class autorzy extends AppCompatActivity {
    public void onStart() {
        super.onStart();
        Menu.wyl = 0;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autorzy);
    }
    public void onPause() {
        super.onPause();
        if (Menu.wyl == 0) {
            Intro.z = 0;
            Intro.adp.run();
        }
    }

    public void onResume() {
        super.onResume();
    }

    public void dalej(View view) {
        Intent intent = new Intent(autorzy.this, Menu.class);
        Menu.wyl = 1;
        startActivity(intent);
    }
}