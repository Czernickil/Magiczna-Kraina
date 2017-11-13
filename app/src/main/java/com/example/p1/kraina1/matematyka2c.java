package lukasz.p1.kraina1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

import static lukasz.p1.kraina1.Menu.kon; public class matematyka2c extends AppCompatActivity {    public void onStart(){         super.onStart(); Menu.wyl=0;}
    TextView odp1;
    TextView odp2;
    TextView odp3;
    TextView odp4;
    TextView pyt;
    Random generator = new Random();
    int i;
    public void onPause(){
        super.onPause();
        if(Menu.wyl==0){
                        Intro.z=0;             Intro.adp.run();
        }
    }
    public void onResume(){
        super.onResume();
        }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wybodp);
        pyt = (TextView)findViewById(R.id.editText);
        odp1 = (TextView) findViewById(R.id.od1);
        odp2 = (TextView) findViewById(R.id.od2);
        odp3 = (TextView) findViewById(R.id.od3);
        odp4 = (TextView) findViewById(R.id.od4);

        i =generator.nextInt(8);
         while(pytztxt.getPytmat2(i, 5).equals("Z"))
            i =generator.nextInt(8);
        pyt.setText(pytztxt.getPytmat2(i, 0));
        odp1.setText(pytztxt.getPytmat2(i, 1));
        odp2.setText(pytztxt.getPytmat2(i, 2));
        odp3.setText(pytztxt.getPytmat2(i, 3));
        odp4.setText(pytztxt.getPytmat2(i, 4));
        pytztxt.zajPytmat2(i);
    }

    public void sprawdz1(View view){
        if(pytztxt.getPytmat2(i, 6).equals(pytztxt.getPytmat2(i, 1)))
            dobra2(view);
        else
            zla(view);
    }
    public void sprawdz2(View view){
        if(pytztxt.getPytmat2(i, 6).equals(pytztxt.getPytmat2(i, 2)))
            dobra2(view);
        else
            zla(view);
    }
    public void sprawdz3(View view){
        if(pytztxt.getPytmat2(i, 6).equals(pytztxt.getPytmat2(i, 3)))
            dobra2(view);
        else
            zla(view);
    }
    public void sprawdz4(View view){
        if(pytztxt.getPytmat2(i, 6).equals(pytztxt.getPytmat2(i, 4)))
            dobra2(view);
        else
            zla(view);
    }

    public void dobra2(View view) {
        Intent intent = new Intent(matematyka2c.this, dobrze2c.class);
        Menu.wyl=1; startActivity(intent);
    }
    public void zla(View view) {
        Intent intent = new Intent(matematyka2c.this, zlec.class);
        Menu.wyl=1; startActivity(intent);
    }



}
