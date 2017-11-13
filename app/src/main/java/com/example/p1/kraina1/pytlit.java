package lukasz.p1.kraina1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.util.Random;

import static com.example.Kraina1.context;
import static lukasz.p1.kraina1.MainActivity.r;

public class pytlit extends AppCompatActivity {
    static SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
    static SharedPreferences.Editor editor = prefs.edit();
    public void onStart(){         super.onStart(); Menu.wyl=0;}
    EditText odp;
    TextView pyt;
    ImageView lit1, lit2, lit3, lit4,lit5, lit6;
    String tekst;
    static String [][] poprawne = new String[19][6];
    int i=0;
    Random generator= new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        i =generator.nextInt(19);
        while(poprawne[i][5].equals("Z")){
            i =generator.nextInt(19);
        }
        setlit(i);
        switch(i){
            case(0):
                setContentView(R.layout.activity_pytlit);
                break;
            case(1):
                setContentView(R.layout.activity_pytlit1);
                break;
            case(2):
                setContentView(R.layout.activity_pytlit2);

                break;
            case(3):
                setContentView(R.layout.activity_pytlit3);
                break;
            case(4):
                setContentView(R.layout.activity_pytlit4);

                break;
            case(5):
                setContentView(R.layout.activity_pytlit5);
                break;
            case(6):
                setContentView(R.layout.activity_pytlit5l);
                 lit1= (ImageView)findViewById(R.id.lit1);
                lit1.setImageResource(R.drawable.imageb);
                 lit2= (ImageView)findViewById(R.id.lit2);
                lit2.setImageResource(R.drawable.imagea);
                 lit3= (ImageView)findViewById(R.id.lit3);
                lit3.setImageResource(R.drawable.imagej);
                 lit4= (ImageView)findViewById(R.id.lit4);
                lit4.setImageResource(R.drawable.imagek);
                 lit5= (ImageView)findViewById(R.id.lit5);
                lit5.setImageResource(R.drawable.imagei);
                break;
            case(7):
                setContentView(R.layout.activity_pytlit5l);
                lit1= (ImageView)findViewById(R.id.lit1);
                lit1.setImageResource(R.drawable.imagek);
                lit2= (ImageView)findViewById(R.id.lit2);
                lit2.setImageResource(R.drawable.imagey);
                lit3= (ImageView)findViewById(R.id.lit3);
                lit3.setImageResource(R.drawable.imaged);
                lit4= (ImageView)findViewById(R.id.lit4);
                lit4.setImageResource(R.drawable.imagen);
                lit5= (ImageView)findViewById(R.id.lit5);
                lit5.setImageResource(R.drawable.imagei);
                break;
            case(8):
                setContentView(R.layout.activity_pytlit5l);
                lit1= (ImageView)findViewById(R.id.lit1);
                lit1.setImageResource(R.drawable.imagea);
                lit2= (ImageView)findViewById(R.id.lit2);
                lit2.setImageResource(R.drawable.imager);
                lit3= (ImageView)findViewById(R.id.lit3);
                lit3.setImageResource(R.drawable.imageb);
                lit4= (ImageView)findViewById(R.id.lit4);
                lit4.setImageResource(R.drawable.imageu);
                lit5= (ImageView)findViewById(R.id.lit5);
                lit5.setImageResource(R.drawable.imagez);
                break;
            case(9):
                setContentView(R.layout.activity_pytlit5l);
                lit1= (ImageView)findViewById(R.id.lit1);
                lit1.setImageResource(R.drawable.imagen);
                lit2= (ImageView)findViewById(R.id.lit2);
                lit2.setImageResource(R.drawable.imagee);
                lit3= (ImageView)findViewById(R.id.lit3);
                lit3.setImageResource(R.drawable.imager);
                lit4= (ImageView)findViewById(R.id.lit4);
                lit4.setImageResource(R.drawable.imagea);
                lit5= (ImageView)findViewById(R.id.lit5);
                lit5.setImageResource(R.drawable.imagek);
                break;
            case(10):
                setContentView(R.layout.activity_pytlit5l);
                lit1= (ImageView)findViewById(R.id.lit1);
                lit1.setImageResource(R.drawable.images);
                lit2= (ImageView)findViewById(R.id.lit2);
                lit2.setImageResource(R.drawable.imagez);
                lit3= (ImageView)findViewById(R.id.lit3);
                lit3.setImageResource(R.drawable.imagea);
                lit4= (ImageView)findViewById(R.id.lit4);
                lit4.setImageResource(R.drawable.imager);
                lit5= (ImageView)findViewById(R.id.lit5);
                lit5.setImageResource(R.drawable.imagey);
                break;
            case(11):
                setContentView(R.layout.activity_pytlit6l);
                lit1= (ImageView)findViewById(R.id.lit1);
                lit1.setImageResource(R.drawable.imageb);
                lit2= (ImageView)findViewById(R.id.lit2);
                lit2.setImageResource(R.drawable.imageu);
                lit3= (ImageView)findViewById(R.id.lit3);
                lit3.setImageResource(R.drawable.imagek);
                lit4= (ImageView)findViewById(R.id.lit4);
                lit4.setImageResource(R.drawable.imagei);
                lit5= (ImageView)findViewById(R.id.lit5);
                lit5.setImageResource(R.drawable.imagee);
                lit6= (ImageView)findViewById(R.id.lit6);
                lit6.setImageResource(R.drawable.imaget);
                break;
            case(12):
                setContentView(R.layout.activity_pytlit6l);
                lit1= (ImageView)findViewById(R.id.lit1);
                lit1.setImageResource(R.drawable.imageb);
                lit2= (ImageView)findViewById(R.id.lit2);
                lit2.setImageResource(R.drawable.imageu);
                lit3= (ImageView)findViewById(R.id.lit3);
                lit3.setImageResource(R.drawable.imaged);
                lit4= (ImageView)findViewById(R.id.lit4);
                lit4.setImageResource(R.drawable.imagez);
                lit5= (ImageView)findViewById(R.id.lit5);
                lit5.setImageResource(R.drawable.imagei);
                lit6= (ImageView)findViewById(R.id.lit6);
                lit6.setImageResource(R.drawable.imagek);
                break;
            case(13):
                setContentView(R.layout.activity_pytlit6l);
                lit1= (ImageView)findViewById(R.id.lit1);
                lit1.setImageResource(R.drawable.imaget);
                lit2= (ImageView)findViewById(R.id.lit2);
                lit2.setImageResource(R.drawable.imager);
                lit3= (ImageView)findViewById(R.id.lit3);
                lit3.setImageResource(R.drawable.imageu);
                lit4= (ImageView)findViewById(R.id.lit4);
                lit4.setImageResource(R.drawable.imaged);
                lit5= (ImageView)findViewById(R.id.lit5);
                lit5.setImageResource(R.drawable.imagey);
                lit6= (ImageView)findViewById(R.id.lit6);
                lit6.setImageResource(R.drawable.imagen);
                break;
            case(14):
                setContentView(R.layout.activity_pytlit6l);
                lit1= (ImageView)findViewById(R.id.lit1);
                lit1.setImageResource(R.drawable.imaget);
                lit2= (ImageView)findViewById(R.id.lit2);
                lit2.setImageResource(R.drawable.imagey);
                lit3= (ImageView)findViewById(R.id.lit3);
                lit3.setImageResource(R.drawable.imaged);
                lit4= (ImageView)findViewById(R.id.lit4);
                lit4.setImageResource(R.drawable.imagee);
                lit5= (ImageView)findViewById(R.id.lit5);
                lit5.setImageResource(R.drawable.imager);
                lit6= (ImageView)findViewById(R.id.lit6);
                lit6.setImageResource(R.drawable.imagek);
                break;
            case(15):
                setContentView(R.layout.activity_pytlit6l);
                lit1= (ImageView)findViewById(R.id.lit1);
                lit1.setImageResource(R.drawable.imager);
                lit2= (ImageView)findViewById(R.id.lit2);
                lit2.setImageResource(R.drawable.imagez);
                lit3= (ImageView)findViewById(R.id.lit3);
                lit3.setImageResource(R.drawable.imageu);
                lit4= (ImageView)findViewById(R.id.lit4);
                lit4.setImageResource(R.drawable.imaget);
                lit5= (ImageView)findViewById(R.id.lit5);
                lit5.setImageResource(R.drawable.imagek);
                lit6= (ImageView)findViewById(R.id.lit6);
                lit6.setImageResource(R.drawable.imagei);
                break;
            case(16):
                setContentView(R.layout.activity_pytlit6l);
                lit1= (ImageView)findViewById(R.id.lit1);
                lit1.setImageResource(R.drawable.imagek);
                lit2= (ImageView)findViewById(R.id.lit2);
                lit2.setImageResource(R.drawable.imagei);
                lit3= (ImageView)findViewById(R.id.lit3);
                lit3.setImageResource(R.drawable.imagen);
                lit4= (ImageView)findViewById(R.id.lit4);
                lit4.setImageResource(R.drawable.imagem);
                lit5= (ImageView)findViewById(R.id.lit5);
                lit5.setImageResource(R.drawable.imagea);
                lit6= (ImageView)findViewById(R.id.lit6);
                lit6.setImageResource(R.drawable.imagej);
                break;
            case(17):
                setContentView(R.layout.activity_pytlit6l);
                lit1= (ImageView)findViewById(R.id.lit1);
                lit1.setImageResource(R.drawable.images);
                lit2= (ImageView)findViewById(R.id.lit2);
                lit2.setImageResource(R.drawable.imaget);
                lit3= (ImageView)findViewById(R.id.lit3);
                lit3.setImageResource(R.drawable.imageo);
                lit4= (ImageView)findViewById(R.id.lit4);
                lit4.setImageResource(R.drawable.imagej);
                lit5= (ImageView)findViewById(R.id.lit5);
                lit5.setImageResource(R.drawable.imagea);
                lit6= (ImageView)findViewById(R.id.lit6);
                lit6.setImageResource(R.drawable.imagek);
                break;
            case(18):
                setContentView(R.layout.activity_pytlit6l);
                lit1= (ImageView)findViewById(R.id.lit1);
                lit1.setImageResource(R.drawable.images);
                lit2= (ImageView)findViewById(R.id.lit2);
                lit2.setImageResource(R.drawable.imaget);
                lit3= (ImageView)findViewById(R.id.lit3);
                lit3.setImageResource(R.drawable.imageu);
                lit4= (ImageView)findViewById(R.id.lit4);
                lit4.setImageResource(R.drawable.imaged);
                lit5= (ImageView)findViewById(R.id.lit5);
                lit5.setImageResource(R.drawable.imagei);
                lit6= (ImageView)findViewById(R.id.lit6);
                lit6.setImageResource(R.drawable.imagea);
                break;

        }




        odp = (EditText)findViewById(R.id.odpp);

        if(i>5){
            pyt=(TextView)findViewById(R.id.pytanie);
            pyt.setText(poprawne[i][4]);
        }
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
    void kill_activity()
    {
        finish();
    }
    public void sprawdz(View view) {
        tekst =odp.getText().toString();
        if (r == 1) {
        if(tekst.equals(poprawne[i][0]) || tekst.equals(poprawne[i][1]) || tekst.equals(poprawne[i][2]) || tekst.equals(poprawne[i][3])){
            Intent intent = new Intent(pytlit.this, dobrze2.class);
            Menu.wyl=1; startActivity(intent);}
        else
        {
            Intent intent = new Intent(pytlit.this, zle.class);
            Menu.wyl=1; startActivity(intent);}
    }
    else if(r==0){
        if(tekst.equals(poprawne[i][0]) || tekst.equals(poprawne[i][1])|| tekst.equals(poprawne[i][2]) || tekst.equals(poprawne[i][3])){
            Intent intent = new Intent(pytlit.this, dobrze2c.class);
            Menu.wyl=1; startActivity(intent);}
        else
        {
            Intent intent = new Intent(pytlit.this, zlec.class);
            Menu.wyl=1; startActivity(intent);}
    }
    }
    static void setlit(int a ){
        poprawne[a][5]="Z";
        editor.putString(a+"lit", "Z");
        editor.commit();
    }
    static String getzaj(String s){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        return preferences.getString(s, "");}
    static void setlit(){
        poprawne[0][0]="ziemia";
        poprawne[0][1]="Ziemia";
        poprawne[0][2]="Ziemia ";
        poprawne[0][3]="ziemia ";

        poprawne[1][0]="burak";
        poprawne[1][1]="Burak";
        poprawne[1][2]="burak ";
        poprawne[1][3]="Burak ";

        poprawne[2][0]="kosz";
        poprawne[2][1]="Kosz";
        poprawne[2][2]="Szok";
        poprawne[2][3]="szok";

        poprawne[3][0]="cytryna";
        poprawne[3][1]="Cytryna";
        poprawne[3][2]="cytryna ";
        poprawne[3][3]="Cytryna ";

        poprawne[4][0]="Jurek";
        poprawne[4][1]="jurek";
        poprawne[4][2]="Jurek ";
        poprawne[4][3]="jurek ";

        poprawne[5][0]="Sosna";
        poprawne[5][1]="sosna";
        poprawne[5][2]="Sosna ";
        poprawne[5][3]="sosna ";

        poprawne[6][0]="Bajki";
        poprawne[6][1]="bajki";
        poprawne[6][2]="Bajki ";
        poprawne[6][3]="bajki ";
        poprawne[6][4]="Z rozsypanych liter ułóż slowo na literę B i wprowadź je powyżej";
        poprawne[7][0]="Indyk";
        poprawne[7][1]="indyk";
        poprawne[7][2]="Indyk ";
        poprawne[7][3]="indyk ";
        poprawne[7][4]="Z rozsypanych liter ułóż slowo na literę I i wprowadź je powyżej";
        poprawne[8][0]="Arbuz";
        poprawne[8][1]="arbuz";
        poprawne[8][2]="Burza";
        poprawne[8][3]="burza";
        poprawne[8][4]="Z rozsypanych liter ułóż slowo na literę B i wprowadź je powyżej";
        poprawne[9][0]="Ekran";
        poprawne[9][1]="ekran";
        poprawne[9][2]="Ekran ";
        poprawne[9][3]="ekran ";
        poprawne[9][4]="Z rozsypanych liter ułóż slowo na literę E i wprowadź je powyżej";
        poprawne[10][0]="Szary";
        poprawne[10][1]="szary";
        poprawne[10][2]="Szary ";
        poprawne[10][3]="szary ";
        poprawne[10][4]="Z rozsypanych liter ułóż slowo na literę S i wprowadź je powyżej";
        poprawne[11][0]="Bukiet";
        poprawne[11][1]="bukiet";
        poprawne[11][2]="Bukiet ";
        poprawne[11][3]="bukiet ";
        poprawne[11][4]="Z rozsypanych liter ułóż slowo na literę B i wprowadź je powyżej";
        poprawne[12][0]="Budzik";
        poprawne[12][1]="budzik";
        poprawne[12][2]="Budzik ";
        poprawne[12][3]="budzik ";
        poprawne[12][4]="Z rozsypanych liter ułóż slowo na literę S i wprowadź je powyżej";
        poprawne[13][0]="Trudny";
        poprawne[13][1]="trudny";
        poprawne[13][2]="Trudny ";
        poprawne[13][3]="trudny ";
        poprawne[13][4]="Z rozsypanych liter ułóż slowo na literę S i wprowadź je powyżej";
        poprawne[14][0]="Kredyt";
        poprawne[14][1]="kredyt";
        poprawne[14][2]="Kredyt ";
        poprawne[14][3]="kredyt ";
        poprawne[14][4]="Z rozsypanych liter ułóż slowo na literę K i wprowadź je powyżej";
        poprawne[15][0]="Rzutki";
        poprawne[15][1]="rzutki";
        poprawne[15][2]="Rzutki ";
        poprawne[15][3]="rzutki ";
        poprawne[15][4]="Z rozsypanych liter ułóż slowo na literę R i wprowadź je powyżej";
        poprawne[16][0]="Jaminik";
        poprawne[16][1]="jaminik";
        poprawne[16][2]="Jaminik ";
        poprawne[16][3]="jaminik ";
        poprawne[16][4]="Z rozsypanych liter ułóż slowo na literę J i wprowadź je powyżej";
        poprawne[17][0]="stojak";
        poprawne[17][1]="Stojak";
        poprawne[17][2]="stojak ";
        poprawne[17][3]="Stojak ";
        poprawne[17][4]="Z rozsypanych liter ułóż slowo na literę S i wprowadź je powyżej";
        poprawne[18][0]="Studia";
        poprawne[18][1]="studia";
        poprawne[18][2]="Studia ";
        poprawne[18][3]="studia ";
        poprawne[18][4]="Z rozsypanych liter ułóż slowo na literę S i wprowadź je powyżej";
        for(int i=0; i<19; i++){
            pytlit.poprawne[i][5]="W";
        }

    }
}
