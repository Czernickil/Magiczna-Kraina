package com.example.p1.kraina1;

import android.content.Context;
import android.os.Bundle;
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

import static com.example.p1.kraina1.Menu.kon; public class pytztxt extends AppCompatActivity {
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
          pytmat1[0][0]="Jaś ma 6 lat Janina dwa razy tyle ile lat ma Janina?";
          pytmat1[0][1]="10";
          pytmat1[0][2]="14";
          pytmat1[0][3]="12";
          pytmat1[0][4]="19";
          pytmat1[0][6]="12";
          pytmat1[1][0]="Jaś ma 10 lat Janina dwa razy tyle ile lat ma Janina?";
          pytmat1[1][1]="10";
          pytmat1[1][2]="14";
          pytmat1[1][3]="20";
          pytmat1[1][4]="19";
          pytmat1[1][6]="20";
          pytmat1[2][0]="Jaś ma 55 lat Janina dwa razy tyle ile lat ma Janina?";
          pytmat1[2][1]="110";
          pytmat1[2][2]="14";
          pytmat1[2][3]="12";
          pytmat1[2][4]="19";
          pytmat1[2][6]="110";
          pytmat1[3][0]="Jaś ma 7 lat Janina dwa razy tyle ile lat ma Janina?";
          pytmat1[3][1]="10";
          pytmat1[3][2]="14";
          pytmat1[3][3]="12";
          pytmat1[3][4]="19";
          pytmat1[3][6]="14";
        


    }
    static void setPytmat2(){
        pytmat2[0][5]="W";
        pytmat2[1][5]="W";
        pytmat2[2][5]="W";
        pytmat2[3][5]="W";
        pytmat2[0][0]="Jaś ma 6 lat Janina trzy razy tyle ile lat ma Janina?";
        pytmat2[0][1]="103";
        pytmat2[0][2]="142";
        pytmat2[0][3]="18";
        pytmat2[0][4]="191";
        pytmat2[0][6]="18";
        pytmat2[1][0]="Jaś ma 10 lat Janina cztery razy tyle ile lat ma Janina?";
        pytmat2[1][1]="10";
        pytmat2[1][2]="144";
        pytmat2[1][3]="20";
        pytmat2[1][4]="40";
        pytmat2[1][6]="40";
        pytmat2[2][0]="Jaś ma 55 lat Janina sto razy tyle ile lat ma Janina?";
        pytmat2[2][1]="1100";
        pytmat2[2][2]="5500";
        pytmat2[2][3]="1200";
        pytmat2[2][4]="190";
        pytmat2[2][6]="5500";
        pytmat2[3][0]="Jaś ma 7 lat Janina pięć razy tyle ile lat ma Janina?";
        pytmat2[3][1]="108";
        pytmat2[3][2]="35";
        pytmat2[3][3]="120";
        pytmat2[3][4]="197";
        pytmat2[3][6]="35";


    }
    static void setPytmat3(){
        pytmat3[0][5]="W";
        pytmat3[1][5]="W";
        pytmat3[2][5]="W";
        pytmat3[3][5]="W";
        pytmat3[0][0]="Jaś ma 0 lat Janina trzy razy tyle ile lat ma Janina?";
        pytmat3[0][1]="3";
        pytmat3[0][2]="5";
        pytmat3[0][3]="0";
        pytmat3[0][4]="9";
        pytmat3[0][6]="0";
        pytmat3[1][0]="Jaś ma 100 lat Janina cztery razy tyle ile lat ma Janina?";
        pytmat3[1][1]="10";
        pytmat3[1][2]="144";
        pytmat3[1][3]="20";
        pytmat3[1][4]="400";
        pytmat3[1][6]="400";
        pytmat3[2][0]="Jaś ma 55 lat Janina sto razy tyle ile lat ma Janina?";
        pytmat3[2][1]="1100";
        pytmat3[2][2]="5500";
        pytmat3[2][3]="120";
        pytmat3[2][4]="190";
        pytmat3[2][6]="5500";
        pytmat3[3][0]="Jaś ma 70 lat Janina pięć razy tyle ile lat ma Janina?";
        pytmat3[3][1]="108";
        pytmat3[3][2]="350";
        pytmat3[3][3]="120";
        pytmat3[3][4]="197";
        pytmat3[3][6]="350";
    }
    static void setPytpol1(){
        pytpol1[0][5]="W";
        pytpol1[1][5]="W";
        pytpol1[2][5]="W";
        pytpol1[3][5]="W";
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



    }
    static void setPytpol2(){
        pytpol2[0][5]="W";
        pytpol2[1][5]="W";
        pytpol2[2][5]="W";
        pytpol2[3][5]="W";
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




    }
    static void setPytpol3(){
        pytpol3[0][5]="W";
        pytpol3[1][5]="W";
        pytpol3[2][5]="W";
        pytpol3[3][5]="W";
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

    }
    static void setPytprz1(){
        pytprz1[0][5]="W";
        pytprz1[1][5]="W";
        pytprz1[2][5]="W";
        pytprz1[3][5]="W";
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


    }
    static void setPytprz2(){
        pytprz2[0][5]="W";
        pytprz2[1][5]="W";
        pytprz2[2][5]="W";
        pytprz2[3][5]="W";
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



    }
    static void setPytprz3(){
        pytprz3[0][5]="W";
        pytprz3[1][5]="W";
        pytprz3[2][5]="W";
        pytprz3[3][5]="W";
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


    }
    static void setPytzyc1(){
        pytzyc1[0][5]="W";
        pytzyc1[1][5]="W";
        pytzyc1[2][5]="W";
        pytzyc1[3][5]="W";
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




    }
    static void setPytzyc2(){
        pytzyc2[0][5]="W";
        pytzyc2[1][5]="W";
        pytzyc2[2][5]="W";
        pytzyc2[3][5]="W";
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



    }
    static void setPytzyc3(){
        pytzyc3[0][5]="W";
        pytzyc3[1][5]="W";
        pytzyc3[2][5]="W";
        pytzyc3[3][5]="W";
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

    }
    static void zajPytmat1(int a){
        pytmat1[a][5]="Z";
    }
    static void zajPytmat2(int a ){
        pytmat2[a][5]="Z";
    }
    static void zajPytmat3(int a ){
        pytmat3[a][5]="Z";
    }
    static void zajPytpol1(int a ){
        pytpol1[a][5]="Z";
    }
    static void zajPytpol2(int a ){
        pytpol2[a][5]="Z";
    }
    static void zajPytpol3(int a ){
        pytpol3[a][5]="Z";
    }
    static void zajPytprz1(int a ){
        pytprz1[a][5]="Z";
    }
    static void zajPytprz2(int a ){
        pytprz2[a][5]="Z";
    }
    static void zajPytprz3(int a ){
        pytprz3[a][5]="Z";
    }
    static void zajPytzyc1(int a ){
        pytzyc1[a][5]="Z";
    }
    static void zajPytzyc2(int a ){
        pytzyc2[a][5]="Z";
    }
    static void zajPytzyc3(int a ){
        pytzyc3[a][5]="Z";
    }
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



