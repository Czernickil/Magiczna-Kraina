package com.example.p1.kraina1;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;

import android.view.View;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;

import static com.example.Kraina1.context;
import static com.example.p1.kraina1.Menu.kon; public class pytztxt extends AppCompatActivity {
    static SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
    static SharedPreferences.Editor editor = prefs.edit();
    public void onStart(){         super.onStart(); Menu.wyl=0;}
    static String[][] pytmat1 = new String[10][7];
    static String[][] pytmat2 = new String[10][7];
    static String[][] pytmat3 = new String[10][7];
    static String[][] pytpol1 = new String[10][7];
    static String[][] pytpol2 = new String[10][7];
    static String[][] pytpol3 = new String[10][7];
    static String[][] pytprz1 = new String[10][7];
    static String[][] pytprz2 = new String[10][7];
    static String[][] pytprz3 = new String[10][7];
    static String[][] pytzyc1 = new String[10][7];
    static String[][] pytzyc2 = new String[10][7];
    static String[][] pytzyc3 = new String[10][7];
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
        setContentView(R.layout.activity_pytztxt);


    }

    static void setPytmat1(){
          pytmat1[0][5]="W";
        pytmat1[1][5]="W";
        pytmat1[2][5]="W";
        pytmat1[3][5]="W";
        pytmat1[4][5]="W";
        pytmat1[5][5]="W";
        pytmat1[6][5]="W";
        pytmat1[7][5]="W";
          pytmat1[0][0]="Miałam 15 zł. Kupiłam czekoladę i zostało mi 9 zł. Ile kosztowała czekolada?";
          pytmat1[0][1]="7 zł";
          pytmat1[0][2]="6 zł";
          pytmat1[0][3]="8 zł";
          pytmat1[0][4]="9 zł";
          pytmat1[0][6]="6 zł";
          pytmat1[1][0]="Jaś ma 10 lat Janina jest 9 lat starsza ile lat ma Janina?";
          pytmat1[1][1]="10 lat";
          pytmat1[1][2]="14 lat";
          pytmat1[1][3]="20 lat";
          pytmat1[1][4]="19 lat";
          pytmat1[1][6]="19 lat";
          pytmat1[2][0]="Jaś ma 55 lat Janina dwa razy tyle ile lat ma Janina?";
          pytmat1[2][1]="110 lat";
          pytmat1[2][2]="14 lat";
          pytmat1[2][3]="12 lat";
          pytmat1[2][4]="19 lat";
          pytmat1[2][6]="110 lat";
          pytmat1[3][0]="Miałam 26 zł. Kupiłam dwie czekolady i zostało mi 6 zł. Ile kosztowała czekolada?";
          pytmat1[3][1]="11 zł";
          pytmat1[3][2]="10 zł";
          pytmat1[3][3]="8 zł";
          pytmat1[3][4]="9 zł";
          pytmat1[3][6]="10 zł";
        pytmat1[4][0]="Którego z banknotów nie można rozmienić na pół tak aby były 2 banknoty?";
        pytmat1[4][1]="20 zł";
        pytmat1[4][2]="100 zł";
        pytmat1[4][3]="200 zł";
        pytmat1[4][4]="50 zł";
        pytmat1[4][6]="50 zł";
        pytmat1[5][0]="Której z monet nie można rozmienić na pół tak aby były 2 monety?";
        pytmat1[5][1]="2 zł";
        pytmat1[5][2]="5 zł";
        pytmat1[5][3]="20 gr";
        pytmat1[5][4]="1 zł";
        pytmat1[5][6]="5 zł";
        pytmat1[5][0]="8+15=?";
        pytmat1[5][1]="13";
        pytmat1[5][2]="23";
        pytmat1[5][3]="25";
        pytmat1[5][4]="95";
        pytmat1[5][6]="23";
        pytmat1[6][0]="5+12=?";
        pytmat1[6][1]="512";
        pytmat1[6][2]="7";
        pytmat1[6][3]="17";
        pytmat1[6][4]="12";
        pytmat1[6][6]="17";
        pytmat1[7][0]="20-4=?";
        pytmat1[7][1]="16";
        pytmat1[7][2]="4";
        pytmat1[7][3]="6";
        pytmat1[7][4]="24";
        pytmat1[7][6]="16";
    }
    static void setPytmat2(){
        pytmat2[0][5]="W";
        pytmat2[1][5]="W";
        pytmat2[2][5]="W";
        pytmat2[3][5]="W";
        pytmat2[4][5]="W";
        pytmat2[5][5]="W";
        pytmat2[6][5]="W";
        pytmat2[7][5]="W";
        pytmat2[0][0]="Jedno jabłko to 4 ćwiartki a półtora jabłka to?";
        pytmat2[0][1]="6 ćwiartek";
        pytmat2[0][2]="5 ćwiartek";
        pytmat2[0][3]="3 ćwiartki";
        pytmat2[0][4]="8 ćwiartek";
        pytmat2[0][6]="6 ćwiartek";
        pytmat2[1][0]="Jedno jabłko to 4 ćwiartki a pół jabłka to?";
        pytmat2[1][1]="1 ćwiartka";
        pytmat2[1][2]="pół ćwiartki";
        pytmat2[1][3]="2 ćwiartki";
        pytmat2[1][4]="8 ćwiartek";
        pytmat2[1][6]="2 ćwiartki";
        pytmat2[2][0]="Co jest cięższe ?";
        pytmat2[2][1]="kilogram piór";
        pytmat2[2][2]="1000 g herbaty";
        pytmat2[2][3]="ważą tyle samo";
        pytmat2[2][4]="0,001 tony masła";
        pytmat2[2][6]="ważą tyle samo";
        pytmat2[3][0]="Cegła waży 1 kg i pół cegły.Ile waży cegła?";
        pytmat2[3][1]="1 i 1/2 kg";
        pytmat2[3][2]="2 kg";
        pytmat2[3][3]="3 kg";
        pytmat2[3][4]="1 kg";
        pytmat2[3][6]="2 kg";
        pytmat2[4][0]="Alek powiedział wczoraj, że za 3 dni są jego urodziny. Kiedy są urodziny Alka?";
        pytmat2[4][1]="jutro";
        pytmat2[4][2]="pojutrze";
        pytmat2[4][3]="za 3 dni";
        pytmat2[4][4]="dzisiaj";
        pytmat2[4][6]="pojutrze";
        pytmat2[4][0]="Alek powiedział przedwczoraj, że za 2 dni są jego urodziny. Kiedy są urodziny Alka?";
        pytmat2[4][1]="jutro";
        pytmat2[4][2]="pojutrze";
        pytmat2[4][3]="za 3 dni";
        pytmat2[4][4]="dzisiaj";
        pytmat2[4][6]="dzisiaj";
        pytmat2[5][0]="10-20=?";
        pytmat2[5][1]="10";
        pytmat2[5][2]="-10";
        pytmat2[5][3]="Nie można tak zrobić";
        pytmat2[5][4]="0";
        pytmat2[5][6]="-10";
        pytmat2[6][0]="3*4=?";
        pytmat2[6][1]="7";
        pytmat2[6][2]="-1";
        pytmat2[6][3]="15";
        pytmat2[6][4]="12";
        pytmat2[6][6]="12";
        pytmat2[7][0]="5*6=?";
        pytmat2[7][1]="13";
        pytmat2[7][2]="30";
        pytmat2[7][3]="11";
        pytmat2[7][4]="-1";
        pytmat2[7][6]="30";
    }
    static void setPytmat3(){
        pytmat3[0][5]="W";
        pytmat3[1][5]="W";
        pytmat3[2][5]="W";
        pytmat3[3][5]="W";
        pytmat3[4][5]="W";
        pytmat3[5][5]="W";
        pytmat3[6][5]="W";
        pytmat3[7][5]="W";
        pytmat3[0][0]="Przez jaką cyfrę nie dzielimy?";
        pytmat3[0][1]="przez 2";
        pytmat3[0][2]="przez 0";
        pytmat3[0][3]="nie jestem na tym etapie zaawansowania";
        pytmat3[0][4]="przez 9";
        pytmat3[0][6]="przez 0";
        pytmat3[1][0]="Gdy Mira miała 2 lata urodził się jej brat Teo.Ile lat ma teraz Mira jesli Teo ma 2 lata?";
        pytmat3[1][1]="2 lata";
        pytmat3[1][2]="5 lat";
        pytmat3[1][3]="4 lata";
        pytmat3[1][4]="3 lata";
        pytmat3[1][6]="4 lata";
        pytmat3[2][0]="Gdy Mira miała 6 lat urodził się jej brat Teo.Ile lat ma teraz Mira jesli Teo ma 18 lata?";
        pytmat3[2][1]="12 lat";
        pytmat3[2][2]="18 lat";
        pytmat3[2][3]="24 lata";
        pytmat3[2][4]="6 lat";
        pytmat3[2][6]="24 lata";
        pytmat3[3][0]="Tuzin ogórków to:";
        pytmat3[3][1]="2 słoiki po 30 ogórków";
        pytmat3[3][2]="54 ogórki";
        pytmat3[3][3]="60 ogórków";
        pytmat3[3][4]="12 ogórków";
        pytmat3[3][6]="12 ogórków";
        pytmat3[4][0]="Kopa to:";
        pytmat3[4][1]="12 sztuk";
        pytmat3[4][2]="44 sztuki";
        pytmat3[4][3]="60 sztuk";
        pytmat3[4][4]="90 sztuk";
        pytmat3[4][6]="60 sztuk";
        pytmat3[5][0]="15/5=?";
        pytmat3[5][1]="75";
        pytmat3[5][2]="11";
        pytmat3[5][3]="3";
        pytmat3[5][4]="10";
        pytmat3[5][6]="3";
        pytmat3[6][0]="36/6=?";
        pytmat3[6][1]="6";
        pytmat3[6][2]="31";
        pytmat3[6][3]="9";
        pytmat3[6][4]="15";
        pytmat3[6][6]="6";
        pytmat3[7][0]="4 do kwadratu to?";
        pytmat3[7][1]="2";
        pytmat3[7][2]="8";
        pytmat3[7][3]="4";
        pytmat3[7][4]="16";
        pytmat3[7][6]="16";
    }
    static void setPytpol1(){
        pytpol1[0][5]="W";
        pytpol1[1][5]="W";
        pytpol1[2][5]="W";
        pytpol1[3][5]="W";
        pytpol1[4][5]="W";
        pytpol1[5][5]="W";
        pytpol1[6][5]="W";
        pytpol1[7][5]="W";
        pytpol1[0][0]="Która forma jest poprawna?";
        pytpol1[0][1]="Orzeł";
        pytpol1[0][2]="Oszeł";
        pytpol1[0][3]="Ożeł";
        pytpol1[0][4]="Orzeu";
        pytpol1[0][6]="Orzeł";
        pytpol1[1][0]="Która forma jest poprawna?";
        pytpol1[1][1]="Grzegorz";
        pytpol1[1][2]="Gżegoż";
        pytpol1[1][3]="Grzegoż";
        pytpol1[1][4]="Gżegorz";
        pytpol1[1][6]="Grzegorz";
        pytpol1[2][0]="Która forma jest poprawna?";
        pytpol1[2][1]="Szczotka";
        pytpol1[2][2]="Szczodka";
        pytpol1[2][3]="Rzczokta";
        pytpol1[2][4]="Rzczodka";
        pytpol1[2][6]="Szczotka";
        pytpol1[3][0]="Która forma jest poprawna";
        pytpol1[3][1]="Pszczoła";
        pytpol1[3][2]="Przczoła";
        pytpol1[3][3]="Bszczoła";
        pytpol1[3][4]="Pżczoła";
        pytpol1[3][6]="Pszczoła";
        pytpol1[4][0]="Nie wszystko złoto...";
        pytpol1[4][1]="co się iskrzy";
        pytpol1[4][2]="co się świeci";
        pytpol1[4][3]="co na palcu leży";
        pytpol1[4][4]="co odleci";
        pytpol1[4][6]="co się świeci";
        pytpol1[5][0]="Gdzie kucharek sześć...";
        pytpol1[5][1]="da się wszystko zjeść";
        pytpol1[5][2]="tam nie ma co jeść";
        pytpol1[5][3]="tak wesel będzie";
        pytpol1[5][4]="tam jest co jeść";
        pytpol1[5][6]="tam nie ma co jeść";
        pytpol1[6][0]="Gdzie dwóch się bije...";
        pytpol1[6][1]="tam wióry lecą";
        pytpol1[6][2]="tam czwarty ucieka";
        pytpol1[6][3]="tam trzeci korzysta";
        pytpol1[6][4]="tam trzeci traci";
        pytpol1[6][6]="tam trzeci korzysta";
        pytpol1[7][0]="Jak sobie pościelesz...";
        pytpol1[7][1]="tak będziesz spał";
        pytpol1[7][2]="tak będziesz miał";
        pytpol1[7][3]="tak się obudzisz";
        pytpol1[7][4]="tak się wyśpisz";
        pytpol1[7][6]="tak się wyśpisz";


    }
    static void setPytpol2(){
        pytpol2[0][5]="W";
        pytpol2[1][5]="W";
        pytpol2[2][5]="W";
        pytpol2[3][5]="W";
        pytpol2[4][5]="W";
        pytpol2[5][5]="W";
        pytpol2[6][5]="W";
        pytpol2[7][5]="W";
        pytpol2[0][0]="Która forma jest poprawna?";
        pytpol2[0][1]="Burza";
        pytpol2[0][2]="Buża";
        pytpol2[0][3]="Busza";
        pytpol2[0][4]="Bórza";
        pytpol2[0][6]="Burza";
        pytpol2[1][0]="Która forma jest poprawna?";
        pytpol2[1][1]="Żylazko";
        pytpol2[1][2]="Rzylazko";
        pytpol2[1][3]="Żelazko";
        pytpol2[1][4]="Rzelazko";
        pytpol2[1][6]="Żelazko";
        pytpol2[2][0]="Która forma jest poprawna?";
        pytpol2[2][1]="Papiesz";
        pytpol2[2][2]="Papież";
        pytpol2[2][3]="Papjeż";
        pytpol2[2][4]="Papierz";
        pytpol2[2][6]="Papież";
        pytpol2[3][0]="Która forma jest poprawna?";
        pytpol2[3][1]="Rzuk";
        pytpol2[3][2]="Rzók";
        pytpol2[3][3]="Żók";
        pytpol2[3][4]="Żuk";
        pytpol2[3][6]="Żuk";
        pytpol2[4][0]="Oko za oko...";
        pytpol2[4][1]="nos za nos";
        pytpol2[4][2]="ucho za ucho";
        pytpol2[4][3]="ząb za ząb";
        pytpol2[4][4]="ręka za rękę";
        pytpol2[4][6]="ząb za ząb";
        pytpol2[5][0]="Nie taki diabeł straszny...";
        pytpol2[5][1]="jak o nim mówią";
        pytpol2[5][2]="jak go malują";
        pytpol2[5][3]="jak o nim piszą";
        pytpol2[5][4]="jak go rysują";
        pytpol2[5][6]="jak go malują";
        pytpol2[6][0]="Prawdziwych przyjaciół ";
        pytpol2[6][1]="wiatr nie rozwieje";
        pytpol2[6][2]="spotkasz w szkole";
        pytpol2[6][3]="poznaje się w bogactwie";
        pytpol2[6][4]="poznaje się w biedzie";
        pytpol2[6][6]="poznaje się w biedzie";
        pytpol2[7][0]="Nosił wilk razy kilka...";
        pytpol2[7][1]="aż zabrakło mu sił";
        pytpol2[7][2]="aż bardzo się zmęczył";
        pytpol2[7][3]="ponieśli i wilka";
        pytpol2[7][4]="poniosło więc wilka";
        pytpol2[7][6]="ponieśli i wilka";



    }
    static void setPytpol3(){
        pytpol3[0][5]="W";
        pytpol3[1][5]="W";
        pytpol3[2][5]="W";
        pytpol3[3][5]="W";
        pytpol3[4][5]="W";
        pytpol3[5][5]="W";
        pytpol3[6][5]="W";
        pytpol3[7][5]="W";
        pytpol3[0][0]="Która forma jest poprawna?";
        pytpol3[0][1]="Abarzur";
        pytpol3[0][2]="Abażur";
        pytpol3[0][3]="Abarzór";
        pytpol3[0][4]="Abażur";
        pytpol3[0][6]="Abażur";
        pytpol3[1][0]="Która forma jest poprawna?";
        pytpol3[1][1]="gżegżółka";
        pytpol3[1][2]="grzegżółka";
        pytpol3[1][3]="grzerzułka";
        pytpol3[1][4]="gżegżułka";
        pytpol3[1][6]="gżegżółka";
        pytpol3[2][0]="Która forma jest poprawna?";
        pytpol3[2][1]="Rzczebrzerzyn";
        pytpol3[2][2]="Szczebżeszyn";
        pytpol3[2][3]="Rzczebrzeszyn";
        pytpol3[2][4]="Szczebrzeszyn";
        pytpol3[2][6]="Szczebrzeszyn";
        pytpol3[3][0]="Która forma jest poprawna?";
        pytpol3[3][1]="hsząszcz";
        pytpol3[3][2]="chsząszcz";
        pytpol3[3][3]="chrząszcz";
        pytpol3[3][4]="hrząszcz";
        pytpol3[3][6]="chrząszcz";
        pytpol3[4][0]="W maju jak...";
        pytpol3[4][1]="w niebie";
        pytpol3[4][2]="w gaju";
        pytpol3[4][3]="w raju";
        pytpol3[4][4]="w garncu";
        pytpol3[4][6]="w gaju";
        pytpol3[5][0]="Bez pracy nie ma ";
        pytpol3[5][1]="ciasteczek";
        pytpol3[5][2]="wynagrodzenia";
        pytpol3[5][3]="kołaczy";
        pytpol3[5][4]="torbaczy";
        pytpol3[5][6]="kołaczy";
        pytpol3[6][0]="....wróbel w garści niż gałąb na dachu";
        pytpol3[6][1]="wyższy";
        pytpol3[6][2]="gorszy";
        pytpol3[6][3]="niższy";
        pytpol3[6][4]="lepszy";
        pytpol3[6][6]="lepszy";
        pytpol3[7][0]=".....tak cię piszą";
        pytpol3[7][1]="jak cię zobaczą";
        pytpol3[7][2]="jak cię widzą ";
        pytpol3[7][3]="jak cię ocenią";
        pytpol3[7][4]="jak cię czują";
        pytpol3[7][6]="jak cię widzą ";
    }
    static void setPytprz1(){
        pytprz1[0][5]="W";
        pytprz1[1][5]="W";
        pytprz1[2][5]="W";
        pytprz1[3][5]="W";
        pytprz1[4][5]="W";
        pytprz1[5][5]="W";
        pytprz1[6][5]="W";
        pytprz1[7][5]="W";
        pytprz1[0][0]="Jak nazywa się samica dzika ?";
        pytprz1[0][1]="Dziczka";
        pytprz1[0][2]="Dziczyzna";
        pytprz1[0][3]="Locha";
        pytprz1[0][4]="Loszka";
        pytprz1[0][6]="Locha";
        pytprz1[1][0]="Które zwierzę biega najszybciej ? ";
        pytprz1[1][1]="Gepard";
        pytprz1[1][2]="Ślimak";
        pytprz1[1][3]="Żółw";
        pytprz1[1][4]="Pies";
        pytprz1[1][6]="Gepard";
        pytprz1[2][0]="jak poznaje sie wiek konia ?";
        pytprz1[2][1]=" po wyglądzie zębów";
        pytprz1[2][2]=" po wyglądzie nosa";
        pytprz1[2][3]=" po wyglądzie nóg";
        pytprz1[2][4]="wystarczy go zapytać";
        pytprz1[2][6]=" po wyglądzie zębów";
        pytprz1[3][0]="Najdłuższy wąż to..";
        pytprz1[3][1]="Anakonda";
        pytprz1[3][2]="Pyton";
        pytprz1[3][3]="Zaskroniec";
        pytprz1[3][4]="Boa";
        pytprz1[3][6]="Anakonda";
        pytprz1[4][0]="Na kuli ziemskiej jest: ";
        pytprz1[4][1]="mniej wód od lądów";
        pytprz1[4][2]="więcej wód od lądów";
        pytprz1[4][3]="tyle samo wód i lądów";
        pytprz1[4][4]="nie ma wód";
        pytprz1[4][6]="więcej wód od lądów";
        pytprz1[5][0]="Przysmak wiewiórki to:";
        pytprz1[5][1]="ryby";
        pytprz1[5][2]="kora drzew";
        pytprz1[5][3]="orzechy";
        pytprz1[5][4]="truskawki";
        pytprz1[5][6]="orzechy";
        pytprz1[6][0]="Żaba jest:";
        pytprz1[6][1]="płazem";
        pytprz1[6][2]="gadem";
        pytprz1[6][3]="ssakiem";
        pytprz1[6][4]="ptakiem";
        pytprz1[6][6]="płazem";
        pytprz1[7][0]="Co jest przysmakiem królika?";
        pytprz1[7][1]="sałata";
        pytprz1[7][2]="żelki";
        pytprz1[7][3]="liście drzew";
        pytprz1[7][4]="sernik";
        pytprz1[7][6]="sałata";

    }
    static void setPytprz2(){
        pytprz2[0][5]="W";
        pytprz2[1][5]="W";
        pytprz2[2][5]="W";
        pytprz2[3][5]="W";
        pytprz2[4][5]="W";
        pytprz2[5][5]="W";
        pytprz2[6][5]="W";
        pytprz2[7][5]="W";
        pytprz2[0][0]="Największa góra na świecie to:";
        pytprz2[0][1]="Titanic";
        pytprz2[0][2]="Mount Everest";
        pytprz2[0][3]="K1";
        pytprz2[0][4]="Tatry";
        pytprz2[0][6]="Mount Everest";
        pytprz2[1][0]="Muczy i daje mleko";
        pytprz2[1][1]="Pies";
        pytprz2[1][2]="Kot";
        pytprz2[1][3]="Krowa";
        pytprz2[1][4]="Wąż";
        pytprz2[1][6]="Krowa";
        pytprz2[2][0]="Który z tych ptaków umie latać?";
        pytprz2[2][1]="Orzeł";
        pytprz2[2][2]="Pingwin";
        pytprz2[2][3]="Kura";
        pytprz2[2][4]="Kiwi";
        pytprz2[2][6]="Orzeł";
        pytprz2[3][0]="Jak się nazywa lekarz zwierząt?";
        pytprz2[3][1]="Patolog";
        pytprz2[3][2]="Pedagog";
        pytprz2[3][3]="Weterynarz";
        pytprz2[3][4]="Pediatra";
        pytprz2[3][6]="Weterynarz";
        pytprz2[4][0]="Który grzyb jest trujący?";
        pytprz2[4][1]="borowik";
        pytprz2[4][2]="rydz";
        pytprz2[4][3]="pieczarka";
        pytprz2[4][4]="muchomor";
        pytprz2[4][6]="muchomor";
        pytprz2[5][0]="Czym jest pokryte ciało świnki morskiej?";
        pytprz2[5][1]="sierścią";
        pytprz2[5][2]="piórami";
        pytprz2[5][3]="łuskami";
        pytprz2[5][4]="metalem";
        pytprz2[5][6]="sierścią";
        pytprz2[6][0]="Kto jest mamą szczeniaka?";
        pytprz2[6][1]="wiewiórka";
        pytprz2[6][2]="suka";
        pytprz2[6][3]="lis";
        pytprz2[6][4]="krowa";
        pytprz2[6][6]="suka";
        pytprz2[7][0]="Gdzie mieszka lis?";
        pytprz2[7][1]="w norze";
        pytprz2[7][2]="w dziupli";
        pytprz2[7][3]="w stawie";
        pytprz2[7][4]="w bloku";
        pytprz2[7][6]="w norze";


    }
    static void setPytprz3(){
        pytprz3[0][5]="W";
        pytprz3[1][5]="W";
        pytprz3[2][5]="W";
        pytprz3[3][5]="W";
        pytprz3[4][5]="W";
        pytprz3[5][5]="W";
        pytprz3[6][5]="W";
        pytprz3[7][5]="W";
        pytprz3[0][0]="Jaki jest największe zwierze na świecie?";
        pytprz3[0][1]="Płetwal Błękitny";
        pytprz3[0][2]="Żyrafa";
        pytprz3[0][3]="Krowa";
        pytprz3[0][4]="Lis";
        pytprz3[0][6]="Płetwal Błękitny";
        pytprz3[1][0]="Które z tych drzew jest liściaste?";
        pytprz3[1][1]="Sosna";
        pytprz3[1][2]="świerk";
        pytprz3[1][3]="Jodła";
        pytprz3[1][4]="Klon";
        pytprz3[1][6]="Klon";
        pytprz3[2][0]="W jakim kraju jest najcieplej";
        pytprz3[2][1]="W Egipcie";
        pytprz3[2][2]="W Rosji";
        pytprz3[2][3]="W Serbii";
        pytprz3[2][4]="W Kanadzie";
        pytprz3[2][6]="W Egipcie";
        pytprz3[3][0]="Które z tych zwierząt jest najmniejsze";
        pytprz3[3][1]="Mysz";
        pytprz3[3][2]="Mrówka";
        pytprz3[3][3]="Motyl";
        pytprz3[3][4]="Gołąb";
        pytprz3[3][6]="Mrówka";
        pytprz3[4][0]="Kły dzika to:";
        pytprz3[4][1]="siekacze";
        pytprz3[4][2]="szable";
        pytprz3[4][3]="szpady";
        pytprz3[4][4]="rogi";
        pytprz3[4][6]="szable";
        pytprz3[5][0]="Młode dziki nazywamy";
        pytprz3[5][1]="cielakami";
        pytprz3[5][2]="źrebakami";
        pytprz3[5][3]="szczeniakami";
        pytprz3[5][4]="warchlakami";
        pytprz3[5][6]="warchlakami";
        pytprz3[6][0]="Stado wilków to";
        pytprz3[6][1]="wataha";
        pytprz3[6][2]="ławica";
        pytprz3[6][3]="tabun";
        pytprz3[6][4]="plemię";
        pytprz3[6][6]="wataha";
        pytprz3[7][0]="Legowisko niedźwiedzia nazywamy:";
        pytprz3[7][1]="barłogiem ";
        pytprz3[7][2]="gawrą";
        pytprz3[7][3]="gniazdem";
        pytprz3[7][4]="budą";
        pytprz3[7][6]="gawrą";
        pytprz3[8][0]="Borsuki są ";
        pytprz3[8][1]="mięsożerne ";
        pytprz3[8][2]="roślinożerne";
        pytprz3[8][3]="wszystkożerne";
        pytprz3[8][4]="żywią się przez fotosyntezę";
        pytprz3[8][6]="wszystkożerne";
    }
    static void setPytzyc1(){
        pytzyc1[0][5]="W";
        pytzyc1[1][5]="W";
        pytzyc1[2][5]="W";
        pytzyc1[3][5]="W";
        pytzyc1[4][5]="W";
        pytzyc1[5][5]="W";
        pytzyc1[6][5]="W";
        pytzyc1[7][5]="W";
        pytzyc1[0][0]="Gdzie gotujemy";
        pytzyc1[0][1]="W przedpokoju";
        pytzyc1[0][2]="W Kuchni";
        pytzyc1[0][3]="W Piwnicy";
        pytzyc1[0][4]="W Salonie";
        pytzyc1[0][6]="W Kuchni";
        pytzyc1[1][0]="Czego nie wolno dotykać dzieciom?";
        pytzyc1[1][1]="Szklanki";
        pytzyc1[1][2]="Gniazdka";
        pytzyc1[1][3]="Zabawek";
        pytzyc1[1][4]="Krzesła";
        pytzyc1[1][6]="Gniazdka";
        pytzyc1[2][0]="Komu należy się szacunek?";
        pytzyc1[2][1]="Mamie";
        pytzyc1[2][2]="Tacie";
        pytzyc1[2][3]="Nauczycielce";
        pytzyc1[2][4]="Wszystkim";
        pytzyc1[2][6]="Wszystkim";
        pytzyc1[3][0]="Komu nie można ufać?";
        pytzyc1[3][1]="Nieznajomemu";
        pytzyc1[3][2]="Tacie";
        pytzyc1[3][3]="Cioci";
        pytzyc1[3][4]="Wujkowi";
        pytzyc1[3][6]="Nieznajomemu";
        pytzyc1[4][0]="Która z tych rzeczy nie leży lub stoi na podłodze?";
        pytzyc1[4][1]="dywan";
        pytzyc1[4][2]="żyrandol";
        pytzyc1[4][3]="biurko";
        pytzyc1[4][4]="krzesło";
        pytzyc1[4][6]="żyrandol";
        pytzyc1[5][0]="Po co trzyma się jedzenie w lodówce?";
        pytzyc1[5][1]="by mieć porządek w kuchni";
        pytzyc1[5][2]="by produkty były dłużej świeże";
        pytzyc1[5][3]="by ochłodzić trochę kuchnię";
        pytzyc1[5][4]="by było mu jasno";
        pytzyc1[5][6]="by produkty były dłużej świeże";
        pytzyc1[6][0]="Do podgrzania jedzenia nie służy";
        pytzyc1[6][1]="patelnia";
        pytzyc1[6][2]="mikrofalówka  ";
        pytzyc1[6][3]="radio";
        pytzyc1[6][4]="piekarnik";
        pytzyc1[6][6]="radio";
        pytzyc1[7][0]="Czego nie powinniśmy trzymać w szafie?";
        pytzyc1[7][1]="brudnych koszulek";
        pytzyc1[7][2]="zimowej kurtki";
        pytzyc1[7][3]="zabawek";
        pytzyc1[7][4]="zeszytów";
        pytzyc1[7][6]="brudnych koszulek";



    }
    static void setPytzyc2(){
        pytzyc2[0][5]="W";
        pytzyc2[1][5]="W";
        pytzyc2[2][5]="W";
        pytzyc2[3][5]="W";
        pytzyc2[4][5]="W";
        pytzyc2[5][5]="W";
        pytzyc2[6][5]="W";
        pytzyc2[7][5]="W";
        pytzyc2[0][0]="Co trzeba robić przed sprawdzianem?";
        pytzyc2[0][1]="Oglądać TV";
        pytzyc2[0][2]="Grać w piłke";
        pytzyc2[0][3]="Uczyć się";
        pytzyc2[0][4]="Leniuchować";
        pytzyc2[0][6]="Uczyć się";
        pytzyc2[1][0]="Jak widzisz kradzież to gdzie dzwonisz?";
        pytzyc2[1][1]="Na Policję";
        pytzyc2[1][2]="Do szpitala";
        pytzyc2[1][3]="Do Telewizji";
        pytzyc2[1][4]="Na straż pożarną";
        pytzyc2[1][6]="Na Policję";
        pytzyc2[2][0]="Po czym powinien chodzić pieszy?";
        pytzyc2[2][1]="Po chodniku";
        pytzyc2[2][2]="Po jezdni";
        pytzyc2[2][3]="Po rowie";
        pytzyc2[2][4]="Po ścieżce rowerowej";
        pytzyc2[2][6]="Po chodniku";
        pytzyc2[3][0]="Po wejściu da autobusu trzeba:";
        pytzyc2[3][1]="Puścić muzykę z telefonu";
        pytzyc2[3][2]="Rozsiąść się";
        pytzyc2[3][3]="Krzyczeć";
        pytzyc2[3][4]="Skasować bilet";
        pytzyc2[3][6]="Skasować bilet";
        pytzyc2[4][0]="Czego używamy do czesania włosów?";
        pytzyc2[4][1]="grzebienia";
        pytzyc2[4][2]="lokówki";
        pytzyc2[4][3]="widelca";
        pytzyc2[4][4]="nożyczek";
        pytzyc2[4][6]="grzebienia";
        pytzyc2[5][0]="Które urządzenie pracuje latem by nas ochłodzić?";
        pytzyc2[5][1]="wentylator";
        pytzyc2[5][2]="grzejnik";
        pytzyc2[5][3]="zmywarka";
        pytzyc2[5][4]="komputer";
        pytzyc2[5][6]="wentylator";
        pytzyc2[6][0]="Na czym smażymy placki lub kotlety?";
        pytzyc2[6][1]="na garnku";
        pytzyc2[6][2]="na patelni";
        pytzyc2[6][3]="na czajniku";
        pytzyc2[6][4]="na widelcu";
        pytzyc2[6][6]="na patelni";
        pytzyc2[7][0]="Do przygotowania której potrawy potrzebujemy drożdży?";
        pytzyc2[7][1]="zupy pomidorowej";
        pytzyc2[7][2]="pizzy";
        pytzyc2[7][3]="frytek";
        pytzyc2[7][4]="sałatki";
        pytzyc2[7][6]="pizzy";


    }
    static void setPytzyc3(){
        pytzyc3[0][5]="W";
        pytzyc3[1][5]="W";
        pytzyc3[2][5]="W";
        pytzyc3[3][5]="W";
        pytzyc3[4][5]="W";
        pytzyc3[5][5]="W";
        pytzyc3[6][5]="W";
        pytzyc3[7][5]="W";
        pytzyc3[0][0]="Gdzie nosi się pieniądze?";
        pytzyc3[0][1]="W portfelu";
        pytzyc3[0][2]="W kieszeni";
        pytzyc3[0][3]="W worku";
        pytzyc3[0][4]="W skarpetce";
        pytzyc3[0][6]="W portfelu";
        pytzyc3[1][0]="Czego nie wolno pić?";
        pytzyc3[1][1]="Wody";
        pytzyc3[1][2]="Mleka";
        pytzyc3[1][3]="Herbaty";
        pytzyc3[1][4]="Denaturatu";
        pytzyc3[1][6]="Denaturatu";
        pytzyc3[2][0]="Skąd się bierze leki?";
        pytzyc3[2][1]="Z Apteki";
        pytzyc3[2][2]="Z Supermarketu";
        pytzyc3[2][3]="Z Kina";
        pytzyc3[2][4]="Z Teatru";
        pytzyc3[2][6]="Z Apteki";
        pytzyc3[3][0]="Jaki jest numer na pogotowie?";
        pytzyc3[3][1]="999";
        pytzyc3[3][2]="997";
        pytzyc3[3][3]="998";
        pytzyc3[3][4]="69";
        pytzyc3[3][6]="999";
        pytzyc3[4][0]="Co jest głównym składnikiem sernika?";
        pytzyc3[4][1]="twaróg";
        pytzyc3[4][2]="bita śmietana";
        pytzyc3[4][3]="mąka";
        pytzyc3[4][4]="cukier";
        pytzyc3[4][6]="twaróg";
        pytzyc3[5][0]="Co jest najważniejszym składnikiem czekolady";
        pytzyc3[5][1]="cukier";
        pytzyc3[5][2]="mąka";
        pytzyc3[5][3]="bydyń";
        pytzyc3[5][4]="kakao";
        pytzyc3[5][6]="kakao";
        pytzyc3[6][0]="Która z nazw nie jest nazwą ciasta";
        pytzyc3[6][1]="makowiec";
        pytzyc3[6][2]="karmel";
        pytzyc3[6][3]="mazurek";
        pytzyc3[6][4]="sernik";
        pytzyc3[6][6]="karmel";
        pytzyc3[7][0]="Czym możemy słodzic zamiast cukru?";
        pytzyc3[7][1]="miodem";
        pytzyc3[7][2]="solą ";
        pytzyc3[7][3]="mąką";
        pytzyc3[7][4]="kredą";
        pytzyc3[7][6]="miodem";
    }
    static void zajPytmat1(int a){
        pytmat1[a][5]="Z";
        editor.putString(a+"mat1", "Z");
        editor.commit();
    }
    static void zajPytmat2(int a){
        pytmat2[a][5]="Z";
        editor.putString(a+"mat2", "Z");
        editor.commit();
    }
    static  void zajPytmat3(int a ){
        pytmat3[a][5]="Z";
         editor.putString(a+"mat3", "Z");
         editor.commit();
    }
    static void zajPytpol1(int a ){
        pytpol1[a][5]="Z";
         editor.putString(a+"pol1", "Z");
         editor.commit();
    }
    static  void zajPytpol2(int a ){
        pytpol2[a][5]="Z";
         editor.putString(a+"pol2", "Z");
         editor.commit();
    }
    static  void zajPytpol3(int a ){
        pytpol3[a][5]="Z";
         editor.putString(a+"pol3", "Z");
         editor.commit();
    }
    static void zajPytprz1(int a ){
        pytprz1[a][5]="Z";
         editor.putString(a+"prz1", "Z");
         editor.commit();
    }
    static void zajPytprz2(int a ){
        pytprz2[a][5]="Z";
         editor.putString(a+"prz2", "Z");
         editor.commit();
    }
    static void zajPytprz3(int a ){
        pytprz3[a][5]="Z";
         editor.putString(a+"prz3", "Z");
         editor.commit();
    }
    static void zajPytzyc1(int a ){
        pytzyc1[a][5]="Z";
         editor.putString(a+"zyc1", "Z");
         editor.commit();
    }
    static void zajPytzyc2(int a ){
        pytzyc2[a][5]="Z";
         editor.putString(a+"zyc2", "Z");
         editor.commit();
    }
    static void zajPytzyc3(int a ){
        pytzyc3[a][5]="Z";
         editor.putString(a+"zyc3", "Z");
         editor.commit();
    }
    static String getzaj(String s){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
    return preferences.getString(s, "");}
    static String getPytmat1(int a, int b){
        return pytmat1[a][b];
    }
    static String getPytmat2(int a, int b){
        return pytmat2[a][b];
    }
    static String getPytmat3(int a, int b){
        return pytmat3[a][b];
    }
    static String getPytprz1(int a, int b){
        return pytprz1[a][b];
    }
    static String getPytprz2(int a, int b){
        return pytprz2[a][b];
    }
    static String getPytprz3(int a, int b){
        return pytprz3[a][b];
    }
    static String getPytpol1(int a, int b){
        return pytpol1[a][b];
    }
    static String getPytpol2(int a, int b){
        return pytpol2[a][b];
    }
    static String getPytpol3(int a, int b){
        return pytpol3[a][b];
    }
    static String getPytzyc1(int a, int b){
        return pytzyc1[a][b];
    }
    static String getPytzyc2(int a, int b){
        return pytzyc2[a][b];
    }
    static String getPytzyc3(int a, int b){
        return pytzyc3[a][b];
    }

}



