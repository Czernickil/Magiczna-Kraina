package lukasz.p1.kraina1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.Random;

import static com.example.Kraina1.context;
import static lukasz.p1.kraina1.MainActivity.r;

public class pytreb extends AppCompatActivity {
    static SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
    static SharedPreferences.Editor editor = prefs.edit();
    public void onStart(){         super.onStart(); Menu.wyl=0;}
    EditText odp;
    ImageView rebus;

    String tekst;
    static String [][] poprawne = new String[13][6];
    int i=0;
    Random generator= new Random();
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
        setContentView(R.layout.activity_pytreb);
         odp = (EditText)findViewById(R.id.odpp);
        rebus = (ImageView)findViewById(R.id.rebuss);



   /*     poprawne[0][0]="";
        poprawne[0][1]="";
        poprawne[0][2]=" ";
        poprawne[0][3]=" "; */

        i =generator.nextInt(13);
        while(poprawne[i][5].equals("Z")){
            i =generator.nextInt(13);
        }
        setreb(i);
        switch(i){
            case(0):
                rebus.setImageResource(R.drawable.rebus1);
                break;
            case(1):
                rebus.setImageResource(R.drawable.rebus2);
                break;
            case(2):
                rebus.setImageResource(R.drawable.rebus3);
                break;
            case(3):
                rebus.setImageResource(R.drawable.rebus4);
                break;
            case(4):
                rebus.setImageResource(R.drawable.rebus5);
                break;
            case(5):
                rebus.setImageResource(R.drawable.rebus6);
                break;
            case(6):
                rebus.setImageResource(R.drawable.rebus7);
                break;
            case(7):
                rebus.setImageResource(R.drawable.rebus8);
                break;
            case(8):
                rebus.setImageResource(R.drawable.rebus9);
                break;
            case(9):
                rebus.setImageResource(R.drawable.rebus10);
                break;
            case(10):
                rebus.setImageResource(R.drawable.rebus11);
                break;
            case(11):
                rebus.setImageResource(R.drawable.rebus12);
                break;
            case(12):
                rebus.setImageResource(R.drawable.rebus13);
                break;
        }

}

       static void setreb(){
            for(int i=0; i<13; i++){
                pytreb.poprawne[i][5]="W";
            }
            poprawne[0][0]="pietruszka";
            poprawne[0][1]="Pietruszka";
            poprawne[0][2]="pietruszka ";
            poprawne[0][3]="Pietruszka ";

            poprawne[1][0]="burak";
            poprawne[1][1]="Burak";
            poprawne[1][2]="burak ";
            poprawne[1][3]="Burak ";

            poprawne[2][0]="karkonosze";
            poprawne[2][1]="Karkonosze";
            poprawne[2][2]="karkonosze ";
            poprawne[2][3]="Karkonosze ";

            poprawne[3][0]="makaron";
            poprawne[3][1]="Makaron";
            poprawne[3][2]="makaron ";
            poprawne[3][3]="Makaron ";

            poprawne[4][0]="Poduszka";
            poprawne[4][1]="poduszka";
            poprawne[4][2]="Poduszka ";
            poprawne[4][3]="poduszka ";

            poprawne[5][0]="lotnisko";
            poprawne[5][1]="lotnisko ";
            poprawne[5][2]="Lotnisko ";
            poprawne[5][3]="Lotnisko";

            poprawne[6][0]="Smakosz";
            poprawne[6][1]="smakosz";
            poprawne[6][2]="Smakosz ";
            poprawne[6][3]="smakosz ";

            poprawne[7][0]="Paralotnia";
            poprawne[7][1]="paralotnia";
            poprawne[7][2]="Paralotnia ";
            poprawne[7][3]="paralotnia ";

            poprawne[8][0]="Wianek";
            poprawne[8][1]="wianek";
            poprawne[8][2]="Wianek ";
            poprawne[8][3]="wianek ";

            poprawne[9][0]="Butelka";
            poprawne[9][1]="butelka";
            poprawne[9][2]="Butelka ";
            poprawne[9][3]="butelka ";

            poprawne[10][0]="Torebka";
            poprawne[10][1]="torebka";
            poprawne[10][2]="Torebka ";
            poprawne[10][3]="torebka ";

            poprawne[11][0]="Serwetka";
            poprawne[11][1]="serwetka";
            poprawne[11][2]="Serwetka ";
            poprawne[11][3]="serwetka ";

            poprawne[12][0]="Kotwica";
            poprawne[12][1]="kotwica";
            poprawne[12][2]="Kotwica ";
            poprawne[12][3]="kotwica ";

        }
    void kill_activity()
    {
        finish();
    }

    public void sprawdz(View view) {
        tekst =odp.getText().toString();

        if (r == 1) {
        if(tekst.equals(poprawne[i][0]) || tekst.equals(poprawne[i][1]) || tekst.equals(poprawne[i][2])
                || tekst.equals(poprawne[i][3]) ){
        Intent intent = new Intent(pytreb.this, dobrze2.class);

        Menu.wyl=1; startActivity(intent);}
        else
        {
            Intent intent = new Intent(pytreb.this, zle.class);
            Menu.wyl=1; startActivity(intent);}}
        if (r == 0) {
            if(tekst.equals(poprawne[i][0]) || tekst.equals(poprawne[i][1]) || tekst.equals(poprawne[i][2])
                    || tekst.equals(poprawne[i][3]) ){
                Intent intent = new Intent(pytreb.this, dobrze2c.class);
                Menu.wyl=1; startActivity(intent);}
            else
            {
                Intent intent = new Intent(pytreb.this, zlec.class);
                Menu.wyl=1; startActivity(intent);}}
    }
    static void setreb(int a ){
        poprawne[a][5]="Z";
        editor.putString(a+"reb", "Z");
        editor.commit();
    }
    static String getzaj(String s){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        return preferences.getString(s, "");}
}
