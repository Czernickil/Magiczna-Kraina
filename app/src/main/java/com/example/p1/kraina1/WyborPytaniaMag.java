package com.example.p1.kraina1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;

import com.example.p1.kraina1.PrzyciskWyboruPytania.FlashEnum3;

import java.util.Random;

import static com.example.p1.kraina1.PrzyciskWyboruPytania.FlashEnum3.OFF3;

import static com.example.p1.kraina1.GlownyWidokMaga.skrzatyMaga;
import static com.example.p1.kraina1.GlownyWidokCzarnoksieznika.skrzatyCzarnoksieznika;
import static com.example.p1.kraina1.Menu.setsc;
import static com.example.p1.kraina1.Menu.setsm;

public class WyborPytaniaMag extends Activity {
    Random generator = new Random();
    int i=0;
    PrzyciskWyboruPytania toggle1p;
    PrzyciskWyboruPytania toggle2p;
    PrzyciskWyboruPytania toggle3p;
    PrzyciskWyboruPytania toggle4p;
    PrzyciskWyboruPytania toggle5p;
    PrzyciskWyboruPytania toggle6p;
    PrzyciskWyboruPytania toggle7p;
    PrzyciskWyboruPytania toggle8p;
    PrzyciskWyboruPytania toggle9p;
    PrzyciskWyboruPytania toggle10p;
    PrzyciskWyboruPytania toggle11p;
    PrzyciskWyboruPytania toggle12p;
    PrzyciskWyboruPytania toggle13p;
    PrzyciskWyboruPytania toggle14p;
    PrzyciskWyboruPytania toggle15p;
    PrzyciskWyboruPytania toggle16p;
    PrzyciskWyboruPytania toggle17p;
    PrzyciskWyboruPytania toggle18p;
    PrzyciskWyboruPytania toggle19p;
    PrzyciskWyboruPytania toggle20p;
    PrzyciskWyboruPytania toggle21p;
    PrzyciskWyboruPytania toggle22p;
    PrzyciskWyboruPytania toggle23p;
    PrzyciskWyboruPytania toggle24p;
    PrzyciskWyboruPytania togglea1p;
    PrzyciskWyboruPytania togglea2p;
    PrzyciskWyboruPytania togglea3p;
    PrzyciskWyboruPytania togglea4p;
    PrzyciskWyboruPytania togglea5p;
    PrzyciskWyboruPytania togglea6p;
    PrzyciskWyboruPytania togglea7p;
    PrzyciskWyboruPytania togglea8p;
    PrzyciskWyboruPytania togglea9p;
    PrzyciskWyboruPytania togglea10p;
    PrzyciskWyboruPytania togglea11p;
    PrzyciskWyboruPytania togglea12p;
    PrzyciskWyboruPytania togglea13p;
    PrzyciskWyboruPytania togglea14p;
    PrzyciskWyboruPytania togglea15p;
    PrzyciskWyboruPytania togglea16p;
    PrzyciskWyboruPytania togglea17p;
    PrzyciskWyboruPytania togglea18p;
    PrzyciskWyboruPytania togglea19p;
    PrzyciskWyboruPytania togglea20p;
    PrzyciskWyboruPytania togglea21p;
    PrzyciskWyboruPytania togglea22p;
    PrzyciskWyboruPytania togglea23p;
    PrzyciskWyboruPytania togglea24p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pytania2);
        toggle1p = (PrzyciskWyboruPytania)findViewById(R.id.button1);
        toggle1p.setState(getDefaults1p("etatToggle1p",this));
        setDefaults1p("etatTogglep", toggle1p.getState(), this);
        toggle2p = (PrzyciskWyboruPytania) findViewById(R.id.button2);
        toggle2p.setState(getDefaults2p("etatToggle2p",this));
        setDefaults2p("etatTogglep", toggle2p.getState(), this);
        toggle3p = (PrzyciskWyboruPytania) findViewById(R.id.button3);
        toggle3p.setState(getDefaults3p("etatToggle3p",this));
        setDefaults3p("etatTogglep", toggle3p.getState(), this);
        toggle4p = (PrzyciskWyboruPytania) findViewById(R.id.button4);
        toggle4p.setState(getDefaults4p("etatToggle4p",this));
        setDefaults4p("etatTogglep", toggle4p.getState(), this);
        toggle5p = (PrzyciskWyboruPytania) findViewById(R.id.button5);
        toggle5p.setState(getDefaults5p("etatToggle5p",this));
        setDefaults5p("etatTogglep", toggle5p.getState(), this);
        toggle6p = (PrzyciskWyboruPytania) findViewById(R.id.button6);
        toggle6p.setState(getDefaults6p("etatToggle6p",this));
        setDefaults6p("etatTogglep", toggle6p.getState(), this);
        toggle7p = (PrzyciskWyboruPytania) findViewById(R.id.button7);
        toggle7p.setState(getDefaults7p("etatToggle7p",this));
        setDefaults7p("etatTogglep", toggle7p.getState(), this);
        toggle8p = (PrzyciskWyboruPytania) findViewById(R.id.button8);
        toggle8p.setState(getDefaults8p("etatToggle8p",this));
        setDefaults8p("etatTogglep", toggle8p.getState(), this);
        toggle9p = (PrzyciskWyboruPytania) findViewById(R.id.button9);
        toggle9p.setState(getDefaults9p("etatToggle9p",this));
        setDefaults9p("etatTogglep", toggle9p.getState(), this);
        toggle10p = (PrzyciskWyboruPytania) findViewById(R.id.button10);
        toggle10p.setState(getDefaults10p("etatToggle10p",this));
        setDefaults10p("etatTogglep", toggle10p.getState(), this);
        toggle11p = (PrzyciskWyboruPytania) findViewById(R.id.button11);
        toggle11p.setState(getDefaults11p("etatToggle11p",this));
        setDefaults11p("etatTogglep", toggle11p.getState(), this);
        toggle12p = (PrzyciskWyboruPytania) findViewById(R.id.button12);
        toggle12p.setState(getDefaults12p("etatToggle12p",this));
        setDefaults12p("etatTogglep", toggle12p.getState(), this);
        toggle13p = (PrzyciskWyboruPytania) findViewById(R.id.button13);
        toggle13p.setState(getDefaults13p("etatToggle13p",this));
        setDefaults13p("etatTogglep", toggle13p.getState(), this);
        toggle14p = (PrzyciskWyboruPytania) findViewById(R.id.button14);
        toggle14p.setState(getDefaults14p("etatToggle14p",this));
        setDefaults14p("etatTogglep", toggle14p.getState(), this);
        toggle15p = (PrzyciskWyboruPytania) findViewById(R.id.button15);
        toggle15p.setState(getDefaults15p("etatToggle15p",this));
        setDefaults15p("etatTogglep", toggle15p.getState(), this);
        toggle16p = (PrzyciskWyboruPytania) findViewById(R.id.button16);
        toggle16p.setState(getDefaults16p("etatToggle16p",this));
        setDefaults16p("etatTogglep", toggle16p.getState(), this);
        toggle17p = (PrzyciskWyboruPytania) findViewById(R.id.button17);
        toggle17p.setState(getDefaults17p("etatToggle17p",this));
        setDefaults17p("etatTogglep", toggle17p.getState(), this);
        toggle18p = (PrzyciskWyboruPytania) findViewById(R.id.button18);
        toggle18p.setState(getDefaults18p("etatToggle18p",this));
        setDefaults18p("etatTogglep", toggle18p.getState(), this);
        toggle19p = (PrzyciskWyboruPytania) findViewById(R.id.button19);
        toggle19p.setState(getDefaults19p("etatToggle19p",this));
        setDefaults19p("etatTogglep", toggle19p.getState(), this);
        toggle20p = (PrzyciskWyboruPytania) findViewById(R.id.button20);
        toggle20p.setState(getDefaults20p("etatToggle20p",this));
        setDefaults20p("etatTogglep", toggle20p.getState(), this);
        toggle21p = (PrzyciskWyboruPytania) findViewById(R.id.button21);
        toggle21p.setState(getDefaults21p("etatToggle21p",this));
        setDefaults21p("etatTogglep", toggle21p.getState(), this);
        toggle22p = (PrzyciskWyboruPytania) findViewById(R.id.button22);
        toggle22p.setState(getDefaults22p("etatToggle22p",this));
        setDefaults22p("etatTogglep", toggle22p.getState(), this);
        toggle23p = (PrzyciskWyboruPytania) findViewById(R.id.button23);
        toggle23p.setState(getDefaults23p("etatToggle23p",this));
        setDefaults23p("etatTogglep", toggle23p.getState(), this);
        toggle24p = (PrzyciskWyboruPytania) findViewById(R.id.button24);
        toggle24p.setState(getDefaults24p("etatToggle24p",this));
        setDefaults24p("etatTogglep", toggle24p.getState(), this);
        togglea1p = (PrzyciskWyboruPytania) findViewById(R.id.buttonb1);
        togglea1p.setState(getDefaultsa1p("etatTogglea1p",this));
        setDefaultsa1p("etatToggleap", togglea1p.getState(), this);
        togglea2p = (PrzyciskWyboruPytania) findViewById(R.id.buttonb2);
        togglea2p.setState(getDefaultsa2p("etatTogglea2p",this));
        setDefaultsa2p("etatToggleap", togglea2p.getState(), this);
        togglea3p = (PrzyciskWyboruPytania) findViewById(R.id.buttonb3);
        togglea3p.setState(getDefaultsa3p("etatTogglea3p",this));
        setDefaultsa3p("etatToggleap", togglea3p.getState(), this);
        togglea4p = (PrzyciskWyboruPytania) findViewById(R.id.buttonb4);
        togglea4p.setState(getDefaultsa4p("etatTogglea4p",this));
        setDefaultsa4p("etatToggleap", togglea4p.getState(), this);
        togglea5p = (PrzyciskWyboruPytania) findViewById(R.id.buttonb5);
        togglea5p.setState(getDefaultsa5p("etatTogglea5p",this));
        setDefaultsa5p("etatToggleap", togglea5p.getState(), this);
        togglea6p = (PrzyciskWyboruPytania) findViewById(R.id.buttonb6);
        togglea6p.setState(getDefaultsa6p("etatTogglea6p",this));
        setDefaultsa6p("etatToggleap", togglea6p.getState(), this);
        togglea7p = (PrzyciskWyboruPytania) findViewById(R.id.buttonb7);
        togglea7p.setState(getDefaultsa7p("etatTogglea7p",this));
        setDefaultsa7p("etatToggleap", togglea7p.getState(), this);
        togglea8p = (PrzyciskWyboruPytania) findViewById(R.id.buttonb8);
        togglea8p.setState(getDefaultsa8p("etatTogglea8p",this));
        setDefaultsa8p("etatToggleap", togglea8p.getState(), this);
        togglea9p = (PrzyciskWyboruPytania) findViewById(R.id.buttonb9);
        togglea9p.setState(getDefaultsa9p("etatTogglea9p",this));
        setDefaultsa9p("etatToggleap", togglea9p.getState(), this);
        togglea10p = (PrzyciskWyboruPytania) findViewById(R.id.buttonb10);
        togglea10p.setState(getDefaultsa10p("etatTogglea10p",this));
        setDefaultsa10p("etatToggleap", togglea10p.getState(), this);
        togglea11p = (PrzyciskWyboruPytania) findViewById(R.id.buttonb11);
        togglea11p.setState(getDefaultsa11p("etatTogglea11p",this));
        setDefaultsa11p("etatToggleap", togglea11p.getState(), this);
        togglea12p = (PrzyciskWyboruPytania) findViewById(R.id.buttonb12);
        togglea12p.setState(getDefaultsa12p("etatTogglea12p",this));
        setDefaultsa12p("etatToggleap", togglea12p.getState(), this);
        togglea13p = (PrzyciskWyboruPytania) findViewById(R.id.buttonb13);
        togglea13p.setState(getDefaultsa13p("etatTogglea13p",this));
        setDefaultsa13p("etatToggleap", togglea13p.getState(), this);
        togglea14p = (PrzyciskWyboruPytania) findViewById(R.id.buttonb14);
        togglea14p.setState(getDefaultsa14p("etatTogglea14p",this));
        setDefaultsa14p("etatToggleap", togglea14p.getState(), this);
        togglea15p = (PrzyciskWyboruPytania) findViewById(R.id.buttonb15);
        togglea15p.setState(getDefaultsa15p("etatTogglea15p",this));
        setDefaultsa15p("etatToggleap", togglea15p.getState(), this);
        togglea16p = (PrzyciskWyboruPytania) findViewById(R.id.buttonb16);
        togglea16p.setState(getDefaultsa16p("etatTogglea16p",this));
        setDefaultsa16p("etatToggleap", togglea16p.getState(), this);
        togglea17p = (PrzyciskWyboruPytania) findViewById(R.id.buttonb17);
        togglea17p.setState(getDefaultsa17p("etatTogglea17p",this));
        setDefaultsa17p("etatToggleap", togglea17p.getState(), this);
        togglea18p = (PrzyciskWyboruPytania) findViewById(R.id.buttonb18);
        togglea18p.setState(getDefaultsa18p("etatTogglea18p",this));
        setDefaultsa18p("etatToggleap", togglea18p.getState(), this);
        togglea19p = (PrzyciskWyboruPytania) findViewById(R.id.buttonb19);
        togglea19p.setState(getDefaultsa19p("etatTogglea19p",this));
        setDefaultsa19p("etatToggleap", togglea19p.getState(), this);
        togglea20p = (PrzyciskWyboruPytania) findViewById(R.id.buttonb20);
        togglea20p.setState(getDefaultsa20p("etatTogglea20p",this));
        setDefaultsa20p("etatToggleap", togglea20p.getState(), this);
        togglea21p = (PrzyciskWyboruPytania) findViewById(R.id.buttonb21);
        togglea21p.setState(getDefaultsa21p("etatTogglea21p",this));
        setDefaultsa21p("etatToggleap", togglea21p.getState(), this);
        togglea22p = (PrzyciskWyboruPytania) findViewById(R.id.buttonb22);
        togglea22p.setState(getDefaultsa22p("etatTogglea22p",this));
        setDefaultsa22p("etatToggleap", togglea22p.getState(), this);
        togglea23p = (PrzyciskWyboruPytania) findViewById(R.id.buttonb23);
        togglea23p.setState(getDefaultsa23p("etatTogglea23p",this));
        setDefaultsa23p("etatToggleap", togglea23p.getState(), this);
        togglea24p = (PrzyciskWyboruPytania) findViewById(R.id.buttonb24);
        togglea24p.setState(getDefaultsa24p("etatTogglea24p",this));
        setDefaultsa24p("etatToggleap", togglea24p.getState(), this);

    }
    public void onPause(){
        super.onPause();
        if(Menu.poprawneWylaczenie ==0){
                        Intro.poprawneWylaczenieDwa=0;             Intro.adp.run();
        }
    }
    public void onResume(){
        super.onResume();
        }
    public void polski1(View view) {
        if(toggle1p.getState()!=OFF3){if(i==7){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieZabawne.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==3 || i==5){             Intent intent = new Intent(WyborPytaniaMag.this, PytanieRebusowe.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else   if(i==1){             Intent intent = new Intent(WyborPytaniaMag.this, WyborPortalu.class);           Menu.poprawneWylaczenie =1; startActivity(intent);}else
        {Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytaniePolskiJedenPunktMag.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}}
    }
    public void polski2(View view) {
        if(toggle3p.getState()!=OFF3){if(i==7){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieZabawne.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==3 || i==5){             Intent intent = new Intent(WyborPytaniaMag.this, PytanieRebusowe.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==1){             Intent intent = new Intent(WyborPytaniaMag.this, WyborPortalu.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else{
            Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytaniePolskiDwaPunktyMag.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}
    }}
    public void polski3(View view) {
        if(toggle5p.getState()!=OFF3){if(i==7){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieZabawne.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==3 || i==5){             Intent intent = new Intent(WyborPytaniaMag.this, PytanieRebusowe.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==1){             Intent intent = new Intent(WyborPytaniaMag.this, WyborPortalu.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else{
            Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytaniePolskiTrzyPunktyMag.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}
    }}
    public void matematyka1(View view) {
        if(toggle7p.getState()!=OFF3){if(i==7){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieZabawne.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==1){             Intent intent = new Intent(WyborPytaniaMag.this, WyborPortalu.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else{
            Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieMatematykaJedenPunktMag.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}
    }}
    public void matematyka2(View view) {
        if(toggle9p.getState()!=OFF3){if(i==7){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieZabawne.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==1){             Intent intent = new Intent(WyborPytaniaMag.this, WyborPortalu.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else{
            Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieMatematykaDwaPunktyMag.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}
    }}
    public void matematyka3(View view) {
        if(toggle11p.getState()!=OFF3){if(i==7){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieZabawne.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==1){             Intent intent = new Intent(WyborPytaniaMag.this, WyborPortalu.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else{
            Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieMatematykaTrzyPunktyMag.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}
    }}
    public void przyroda1(View view) {
        if(toggle13p.getState()!=OFF3){if(i==7){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieZabawne.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==3 || i==5){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieLiterkowe.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==1){             Intent intent = new Intent(WyborPytaniaMag.this, WyborPortalu.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else{
            Intent intent = new Intent(WyborPytaniaMag.this, PytaniePrzyrodaJedenPunktMag.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}
    }}
    public void przyroda2(View view) {
        if(toggle15p.getState()!=OFF3){if(i==7){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieZabawne.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==3 || i==5){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieLiterkowe.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==1){             Intent intent = new Intent(WyborPytaniaMag.this, WyborPortalu.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else{
            Intent intent = new Intent(WyborPytaniaMag.this, PytaniePrzyrodaDwaPunktyMag.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}
    }}
    public void przyroda3(View view) {
        if(toggle17p.getState()!=OFF3){if(i==7){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieZabawne.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==3 || i==5){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieLiterkowe.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==1){             Intent intent = new Intent(WyborPytaniaMag.this, WyborPortalu.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else{
            Intent intent = new Intent(WyborPytaniaMag.this, PytaniePrzyrodaTrzyPunktyMag.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}
    }}
    public void zycie1(View view) {
        if(toggle19p.getState()!=OFF3){if(i==7){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieZabawne.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i>2 || i<6){
            Intent intent = new Intent(WyborPytaniaMag.this, PytanieObrazkowe.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}else if (i==1){             Intent intent = new Intent(WyborPytaniaMag.this, WyborPortalu.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else{
            Intent intent = new Intent(WyborPytaniaMag.this, PytanieZycieJedenPunktMag.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}
    }}
    public void zycie2(View view) {
        if(toggle21p.getState()!=OFF3){if(i==7){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieZabawne.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i>2 || i<6){
            Intent intent = new Intent(WyborPytaniaMag.this, PytanieObrazkowe.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==1){             Intent intent = new Intent(WyborPytaniaMag.this, WyborPortalu.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else{
            Intent intent = new Intent(WyborPytaniaMag.this, PytanieZycieDwaPunktyMag.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}
    }}
    public void zycie3(View view) {
        if(toggle23p.getState()!=OFF3){if(i==7){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieZabawne.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i>2 || i<6){
            Intent intent = new Intent(WyborPytaniaMag.this, PytanieObrazkowe.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==1){             Intent intent = new Intent(WyborPytaniaMag.this, WyborPortalu.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else{
            Intent intent = new Intent(WyborPytaniaMag.this, PytanieZycieTrzyPunktyMag.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}
    }}
    public void polski12(View view) {
        if(toggle2p.getState()!=OFF3){if(i==7){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieZabawne.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==3 || i==5){             Intent intent = new Intent(WyborPytaniaMag.this, PytanieRebusowe.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==1){             Intent intent = new Intent(WyborPytaniaMag.this, WyborPortalu.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else{
            Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytaniePolskiJedenPunktMag.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}
    }}
    public void polski22(View view) {
        if(toggle4p.getState()!=OFF3){if(i==7){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieZabawne.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==3 || i==5){             Intent intent = new Intent(WyborPytaniaMag.this, PytanieRebusowe.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==1){             Intent intent = new Intent(WyborPytaniaMag.this, WyborPortalu.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else{
            Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytaniePolskiDwaPunktyMag.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}
    }}
    public void polski32(View view) {
        if(toggle6p.getState()!=OFF3){if(i==7){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieZabawne.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==3 || i==5){             Intent intent = new Intent(WyborPytaniaMag.this, PytanieRebusowe.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==1){             Intent intent = new Intent(WyborPytaniaMag.this, WyborPortalu.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else{
            Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytaniePrzyrodaTrzyPunktyMag.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}
    }}
    public void matematyka12(View view) {
        if(toggle8p.getState()!=OFF3){if(i==7){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieZabawne.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==1){             Intent intent = new Intent(WyborPytaniaMag.this, WyborPortalu.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else{
            Intent intent = new Intent(WyborPytaniaMag.this, PytanieMatematykaJedenPunktMag.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}
    }}
    public void matematyka22(View view) {
        if(toggle10p.getState()!=OFF3){if(i==7){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieZabawne.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==1){             Intent intent = new Intent(WyborPytaniaMag.this, WyborPortalu.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else{
            Intent intent = new Intent(WyborPytaniaMag.this, PytanieMatematykaDwaPunktyMag.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}
    }}
    public void matematyka32(View view) {
        if(toggle12p.getState()!=OFF3){if(i==7){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieZabawne.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==1){             Intent intent = new Intent(WyborPytaniaMag.this, WyborPortalu.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else{
            Intent intent = new Intent(WyborPytaniaMag.this, PytanieMatematykaTrzyPunktyMag.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}
    }}
    public void przyroda12(View view) {
        if(toggle14p.getState()!=OFF3){if(i==7){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieZabawne.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==3 || i==5){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieLiterkowe.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==1){             Intent intent = new Intent(WyborPytaniaMag.this, WyborPortalu.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else{
            Intent intent = new Intent(WyborPytaniaMag.this, PytaniePrzyrodaJedenPunktMag.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}
    }}
    public void przyroda22(View view) {
        if(toggle16p.getState()!=OFF3){if(i==7){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieZabawne.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==3 || i==5){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieLiterkowe.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==1){             Intent intent = new Intent(WyborPytaniaMag.this, WyborPortalu.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else{
            Intent intent = new Intent(WyborPytaniaMag.this, PytaniePrzyrodaDwaPunktyMag.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}
    }}
    public void przyroda32(View view) {
        if(toggle18p.getState()!=OFF3){if(i==7){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieZabawne.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==3 || i==5){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieLiterkowe.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==1){             Intent intent = new Intent(WyborPytaniaMag.this, WyborPortalu.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else{
            Intent intent = new Intent(WyborPytaniaMag.this, PytaniePrzyrodaTrzyPunktyMag.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}
    }}
    public void zycie12(View view) {
        if(toggle20p.getState()!=OFF3){if(i==7){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieZabawne.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i>2 || i<6){
            Intent intent = new Intent(WyborPytaniaMag.this, PytanieObrazkowe.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==1){             Intent intent = new Intent(WyborPytaniaMag.this, WyborPortalu.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else{
            Intent intent = new Intent(WyborPytaniaMag.this, PytanieZycieJedenPunktMag.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}
    }}
    public void zycie22(View view) {
        if(toggle22p.getState()!=OFF3){if(i==7){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieZabawne.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i>2 || i<6){
            Intent intent = new Intent(WyborPytaniaMag.this, PytanieObrazkowe.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==1){             Intent intent = new Intent(WyborPytaniaMag.this, WyborPortalu.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else{
            Intent intent = new Intent(WyborPytaniaMag.this, PytanieZycieDwaPunktyMag.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}
    }}
    public void zycie32(View view) {
        if(toggle24p.getState()!=OFF3){if(i==7){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieZabawne.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i>2 || i<6){
            Intent intent = new Intent(WyborPytaniaMag.this, PytanieObrazkowe.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==1){             Intent intent = new Intent(WyborPytaniaMag.this, WyborPortalu.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else{
            Intent intent = new Intent(WyborPytaniaMag.this, PytanieZycieTrzyPunktyMag.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}
    }}
    public void polskia1(View view) {
        if(togglea1p.getState()!=OFF3){if(i==7){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieZabawne.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==3 || i==5){             Intent intent = new Intent(WyborPytaniaMag.this, PytanieRebusowe.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==1){             Intent intent = new Intent(WyborPytaniaMag.this, WyborPortalu.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else{
            Intent intent = new Intent(WyborPytaniaMag.this, PytaniePolskiJedenPunktMag.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}
    }}
    public void polskia2(View view) {
        if(togglea3p.getState()!=OFF3){if(i==7){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieZabawne.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==3 || i==5){             Intent intent = new Intent(WyborPytaniaMag.this, PytanieRebusowe.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==1){             Intent intent = new Intent(WyborPytaniaMag.this, WyborPortalu.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else{
            Intent intent = new Intent(WyborPytaniaMag.this, PytaniePolskiDwaPunktyMag.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}
    }}
    public void polskia3(View view) {
        if(togglea5p.getState()!=OFF3){if(i==7){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieZabawne.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==3 || i==5){             Intent intent = new Intent(WyborPytaniaMag.this, PytanieRebusowe.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==1){             Intent intent = new Intent(WyborPytaniaMag.this, WyborPortalu.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else{
            Intent intent = new Intent(WyborPytaniaMag.this, PytaniePolskiTrzyPunktyMag.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}
    }}
    public void matematykaa1(View view) {
        if(togglea7p.getState()!=OFF3){if(i==7){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieZabawne.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==1){             Intent intent = new Intent(WyborPytaniaMag.this, WyborPortalu.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else{
            Intent intent = new Intent(WyborPytaniaMag.this, PytanieMatematykaJedenPunktMag.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}
    }}
    public void matematykaa2(View view) {
        if(togglea9p.getState()!=OFF3){if(i==7){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieZabawne.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==1){             Intent intent = new Intent(WyborPytaniaMag.this, WyborPortalu.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else{
            Intent intent = new Intent(WyborPytaniaMag.this, PytanieMatematykaDwaPunktyMag.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}
    }}
    public void matematykaa3(View view) {
        if(togglea11p.getState()!=OFF3){if(i==7){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieZabawne.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==1){             Intent intent = new Intent(WyborPytaniaMag.this, WyborPortalu.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else{
            Intent intent = new Intent(WyborPytaniaMag.this, PytanieMatematykaTrzyPunktyMag.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}
    }}
    public void przyrodaa1(View view) {
        if(togglea13p.getState()!=OFF3){if(i==7){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieZabawne.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==3 || i==5){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieLiterkowe.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==1){             Intent intent = new Intent(WyborPytaniaMag.this, WyborPortalu.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else{
            Intent intent = new Intent(WyborPytaniaMag.this, PytaniePrzyrodaJedenPunktMag.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}
    }}
    public void przyrodaa2(View view) {
        if(togglea15p.getState()!=OFF3){if(i==7){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieZabawne.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==3 || i==5){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieLiterkowe.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==1){             Intent intent = new Intent(WyborPytaniaMag.this, WyborPortalu.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else{
            Intent intent = new Intent(WyborPytaniaMag.this, PytaniePrzyrodaDwaPunktyMag.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}
    }}
    public void przyrodaa3(View view) {
        if(togglea17p.getState()!=OFF3){if(i==7){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieZabawne.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==3 || i==5){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieLiterkowe.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==1){             Intent intent = new Intent(WyborPytaniaMag.this, WyborPortalu.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else{
            Intent intent = new Intent(WyborPytaniaMag.this, PytaniePrzyrodaTrzyPunktyMag.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}
    }}
    public void zyciea1(View view) {
        if(togglea19p.getState()!=OFF3){if(i==7){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieZabawne.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==1){             Intent intent = new Intent(WyborPytaniaMag.this, WyborPortalu.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i>2 || i<6){
            Intent intent = new Intent(WyborPytaniaMag.this, PytanieObrazkowe.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}else{
            Intent intent = new Intent(WyborPytaniaMag.this, PytanieZycieJedenPunktMag.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}
    }}
    public void zyciea2(View view) {
        if(togglea21p.getState()!=OFF3){if(i==7){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieZabawne.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==1){             Intent intent = new Intent(WyborPytaniaMag.this, WyborPortalu.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i>2 || i<6){
            Intent intent = new Intent(WyborPytaniaMag.this, PytanieObrazkowe.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}else{
            Intent intent = new Intent(WyborPytaniaMag.this, PytanieZycieDwaPunktyMag.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}
    }}
    public void zyciea3(View view) {if(togglea23p.getState()!=OFF3){if(i==7){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieZabawne.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==1){             Intent intent = new Intent(WyborPytaniaMag.this, WyborPortalu.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i>2 || i<6){
        Intent intent = new Intent(WyborPytaniaMag.this, PytanieObrazkowe.class);
        Menu.poprawneWylaczenie =1; startActivity(intent);}else{
            Intent intent = new Intent(WyborPytaniaMag.this, PytanieZycieTrzyPunktyMag.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}
    }}
    public void polskia12(View view) {
        if(togglea2p.getState()!=OFF3){if(i==7){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieZabawne.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==3 || i==5){             Intent intent = new Intent(WyborPytaniaMag.this, PytanieRebusowe.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==1){             Intent intent = new Intent(WyborPytaniaMag.this, WyborPortalu.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else{
            Intent intent = new Intent(WyborPytaniaMag.this, PytaniePolskiJedenPunktMag.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}
    }}
    public void polskia22(View view) {
        if(togglea4p.getState()!=OFF3){if(i==7){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieZabawne.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==3 || i==5){             Intent intent = new Intent(WyborPytaniaMag.this, PytanieRebusowe.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==1){             Intent intent = new Intent(WyborPytaniaMag.this, WyborPortalu.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else{
            Intent intent = new Intent(WyborPytaniaMag.this, PytaniePolskiDwaPunktyMag.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}
    }}
    public void polskia32(View view) {
        if(togglea6p.getState()!=OFF3){if(i==7){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieZabawne.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==3 || i==5){             Intent intent = new Intent(WyborPytaniaMag.this, PytanieRebusowe.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==1){             Intent intent = new Intent(WyborPytaniaMag.this, WyborPortalu.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else{
            Intent intent = new Intent(WyborPytaniaMag.this, PytaniePolskiTrzyPunktyMag.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}
    }}
    public void matematykaa12(View view) {
        if(togglea8p.getState()!=OFF3){if(i==7){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieZabawne.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==1){             Intent intent = new Intent(WyborPytaniaMag.this, WyborPortalu.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else{
            Intent intent = new Intent(WyborPytaniaMag.this, PytanieMatematykaJedenPunktMag.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}
    }}
    public void matematykaa22(View view) {
        if(togglea10p.getState()!=OFF3){if(i==7){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieZabawne.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==1){             Intent intent = new Intent(WyborPytaniaMag.this, WyborPortalu.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else{
            Intent intent = new Intent(WyborPytaniaMag.this, PytanieMatematykaDwaPunktyMag.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}
    }}
    public void matematykaa32(View view) {
        if(togglea12p.getState()!=OFF3){if(i==7){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieZabawne.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==1){             Intent intent = new Intent(WyborPytaniaMag.this, WyborPortalu.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else{
            Intent intent = new Intent(WyborPytaniaMag.this, PytanieMatematykaTrzyPunktyMag.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}
    }}
    public void przyrodaa12(View view) {
        if(togglea14p.getState()!=OFF3){if(i==7){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieZabawne.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==3 || i==5){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieLiterkowe.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==1){             Intent intent = new Intent(WyborPytaniaMag.this, WyborPortalu.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else{
            Intent intent = new Intent(WyborPytaniaMag.this, PytaniePrzyrodaJedenPunktMag.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}
    }}
    public void przyrodaa22(View view) {
        if(togglea16p.getState()!=OFF3){if(i==7){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieZabawne.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==3 || i==5){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieLiterkowe.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==1){             Intent intent = new Intent(WyborPytaniaMag.this, WyborPortalu.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else{
            Intent intent = new Intent(WyborPytaniaMag.this, PytaniePrzyrodaDwaPunktyMag.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}
    }}
    public void przyrodaa32(View view) {
        if(togglea18p.getState()!=OFF3){if(i==7){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieZabawne.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==3 || i==5){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieLiterkowe.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==1){             Intent intent = new Intent(WyborPytaniaMag.this, WyborPortalu.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else{
            Intent intent = new Intent(WyborPytaniaMag.this, PytaniePrzyrodaTrzyPunktyMag.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}
    }}
    public void zyciea12(View view) {
        if(togglea20p.getState()!=OFF3){if(i==7){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieZabawne.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==1){             Intent intent = new Intent(WyborPytaniaMag.this, WyborPortalu.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i>2 || i<6){
            Intent intent = new Intent(WyborPytaniaMag.this, PytanieObrazkowe.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}else{
            Intent intent = new Intent(WyborPytaniaMag.this, PytanieZycieJedenPunktMag.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}
    }}
    public void zyciea22(View view) {
        if(togglea22p.getState()!=OFF3){if(i==7){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieZabawne.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==1){             Intent intent = new Intent(WyborPytaniaMag.this, WyborPortalu.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i>2 || i<6){
            Intent intent = new Intent(WyborPytaniaMag.this, PytanieObrazkowe.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}else{
            Intent intent = new Intent(WyborPytaniaMag.this, PytanieZycieDwaPunktyMag.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}
    }}
    public void zyciea32(View view) {
        if(togglea24p.getState()!=OFF3){if(i==7){             Intent intent = new Intent(WyborPytaniaMag.this, com.example.p1.kraina1.PytanieZabawne.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i==1){             Intent intent = new Intent(WyborPytaniaMag.this, WyborPortalu.class);             Menu.poprawneWylaczenie =1; startActivity(intent);}else if(i>2 || i<6){
            Intent intent = new Intent(WyborPytaniaMag.this, PytanieObrazkowe.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}else
        {
            Intent intent = new Intent(WyborPytaniaMag.this, PytanieZycieTrzyPunktyMag.class);
            Menu.poprawneWylaczenie =1; startActivity(intent);}
    }}
    public void onStart(){
        super.onStart(); Menu.poprawneWylaczenie =0;
        setsm("bbbbm", skrzatyMaga, this);
        setsc("bbbbc", skrzatyCzarnoksieznika, this);
        i=generator.nextInt(8)+1;
        toggle1p.setState(getDefaults1p("etatToggle1p",this));
        toggle2p.setState(getDefaults2p("etatToggle2p",this));
        toggle3p.setState(getDefaults3p("etatToggle3p",this));
        toggle4p.setState(getDefaults4p("etatToggle4p",this));
        toggle5p.setState(getDefaults5p("etatToggle5p",this));
        toggle6p.setState(getDefaults6p("etatToggle6p",this));
        toggle7p.setState(getDefaults7p("etatToggle7p",this));
        toggle8p.setState(getDefaults8p("etatToggle8p",this));
        toggle9p.setState(getDefaults9p("etatToggle9p",this));
        toggle10p.setState(getDefaults10p("etatToggle10p",this));
        toggle11p.setState(getDefaults11p("etatToggle11p",this));
        toggle12p.setState(getDefaults12p("etatToggle12p",this));
        toggle13p.setState(getDefaults13p("etatToggle13p",this));
        toggle14p.setState(getDefaults14p("etatToggle14p",this));
        toggle15p.setState(getDefaults15p("etatToggle15p",this));
        toggle16p.setState(getDefaults16p("etatToggle16p",this));
        toggle17p.setState(getDefaults17p("etatToggle17p",this));
        toggle18p.setState(getDefaults18p("etatToggle18p",this));
        toggle19p.setState(getDefaults19p("etatToggle19p",this));
        toggle20p.setState(getDefaults20p("etatToggle20p",this));
        toggle21p.setState(getDefaults21p("etatToggle21p",this));
        toggle22p.setState(getDefaults22p("etatToggle22p",this));
        toggle23p.setState(getDefaults23p("etatToggle23p",this));
        toggle24p.setState(getDefaults24p("etatToggle24p",this));
        togglea1p.setState(getDefaultsa1p("etatTogglea1p",this));
        togglea2p.setState(getDefaultsa2p("etatTogglea2p",this));
        togglea3p.setState(getDefaultsa3p("etatTogglea3p",this));
        togglea4p.setState(getDefaultsa4p("etatTogglea4p",this));
        togglea5p.setState(getDefaultsa5p("etatTogglea5p",this));
        togglea6p.setState(getDefaultsa6p("etatTogglea6p",this));
        togglea7p.setState(getDefaultsa7p("etatTogglea7p",this));
        togglea8p.setState(getDefaultsa8p("etatTogglea8p",this));
        togglea9p.setState(getDefaultsa9p("etatTogglea9p",this));
        togglea10p.setState(getDefaultsa10p("etatTogglea10p",this));
        togglea11p.setState(getDefaultsa11p("etatTogglea11p",this));
        togglea12p.setState(getDefaultsa12p("etatTogglea12p",this));
        togglea13p.setState(getDefaultsa13p("etatTogglea13p",this));
        togglea14p.setState(getDefaultsa14p("etatTogglea14p",this));
        togglea15p.setState(getDefaultsa15p("etatTogglea15p",this));
        togglea16p.setState(getDefaultsa16p("etatTogglea16p",this));
        togglea17p.setState(getDefaultsa17p("etatTogglea17p",this));
        togglea18p.setState(getDefaultsa18p("etatTogglea18p",this));
        togglea19p.setState(getDefaultsa19p("etatTogglea19p",this));
        togglea20p.setState(getDefaultsa20p("etatTogglea20p",this));
        togglea21p.setState(getDefaultsa21p("etatTogglea21p",this));
        togglea22p.setState(getDefaultsa22p("etatTogglea22p",this));
        togglea23p.setState(getDefaultsa23p("etatTogglea23p",this));
        togglea24p.setState(getDefaultsa24p("etatTogglea24p",this));
    }


    @Override
    public void onStop(){
        super.onStop();

        setDefaults1p("etatToggle1p", toggle1p.getState(), this);
        setDefaults2p("etatToggle2p", toggle2p.getState(), this);
        setDefaults3p("etatToggle3p", toggle3p.getState(), this);
        setDefaults4p("etatToggle4p", toggle4p.getState(), this);
        setDefaults5p("etatToggle5p", toggle5p.getState(), this);
        setDefaults6p("etatToggle6p", toggle6p.getState(), this);
        setDefaults7p("etatToggle7p", toggle7p.getState(), this);
        setDefaults8p("etatToggle8p", toggle8p.getState(), this);
        setDefaults9p("etatToggle9p", toggle9p.getState(), this);
        setDefaults10p("etatToggle10p", toggle10p.getState(), this);
        setDefaults11p("etatToggle11p", toggle11p.getState(), this);
        setDefaults12p("etatToggle12p", toggle12p.getState(), this);
        setDefaults13p("etatToggle13p", toggle13p.getState(), this);
        setDefaults14p("etatToggle14p", toggle14p.getState(), this);
        setDefaults15p("etatToggle15p", toggle15p.getState(), this);
        setDefaults16p("etatToggle16p", toggle16p.getState(), this);
        setDefaults17p("etatToggle17p", toggle17p.getState(), this);
        setDefaults18p("etatToggle18p", toggle18p.getState(), this);
        setDefaults19p("etatToggle19p", toggle19p.getState(), this);
        setDefaults20p("etatToggle20p", toggle20p.getState(), this);
        setDefaults21p("etatToggle21p", toggle21p.getState(), this);
        setDefaults22p("etatToggle22p", toggle22p.getState(), this);
        setDefaults23p("etatToggle23p", toggle23p.getState(), this);
        setDefaults24p("etatToggle24p", toggle24p.getState(), this);
        setDefaultsa1p("etatTogglea1p", togglea1p.getState(), this);
        setDefaultsa2p("etatTogglea2p", togglea2p.getState(), this);
        setDefaultsa3p("etatTogglea3p", togglea3p.getState(), this);
        setDefaultsa4p("etatTogglea4p", togglea4p.getState(), this);
        setDefaultsa5p("etatTogglea5p", togglea5p.getState(), this);
        setDefaultsa6p("etatTogglea6p", togglea6p.getState(), this);
        setDefaultsa7p("etatTogglea7p", togglea7p.getState(), this);
        setDefaultsa8p("etatTogglea8p", togglea8p.getState(), this);
        setDefaultsa9p("etatTogglea9p", togglea9p.getState(), this);
        setDefaultsa10p("etatTogglea10p", togglea10p.getState(), this);
        setDefaultsa11p("etatTogglea11p", togglea11p.getState(), this);
        setDefaultsa12p("etatTogglea12p", togglea12p.getState(), this);
        setDefaultsa13p("etatTogglea13p", togglea13p.getState(), this);
        setDefaultsa14p("etatTogglea14p", togglea14p.getState(), this);
        setDefaultsa15p("etatTogglea15p", togglea15p.getState(), this);
        setDefaultsa16p("etatTogglea16p", togglea16p.getState(), this);
        setDefaultsa17p("etatTogglea17p", togglea17p.getState(), this);
        setDefaultsa18p("etatTogglea18p", togglea18p.getState(), this);
        setDefaultsa19p("etatTogglea19p", togglea19p.getState(), this);
        setDefaultsa20p("etatTogglea20p", togglea20p.getState(), this);
        setDefaultsa21p("etatTogglea21p", togglea21p.getState(), this);
        setDefaultsa22p("etatTogglea22p", togglea22p.getState(), this);
        setDefaultsa23p("etatTogglea23p", togglea23p.getState(), this);
        setDefaultsa24p("etatTogglea24p", togglea24p.getState(), this);
    }
    public static void setDefaults1p(String key, Enum value, Context context)
    {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaults1p(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");         return FlashEnum3.toMyEnum(zwrot3);
    }
    public static void setDefaults2p(String key, Enum value, Context context)
    {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaults2p(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");         return FlashEnum3.toMyEnum(zwrot3);
    }
    public static void setDefaults3p(String key, Enum value, Context context)
    {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaults3p(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");         return FlashEnum3.toMyEnum(zwrot3);
    }
    public static void setDefaults4p(String key, Enum value, Context context)
    {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }
    public static FlashEnum3 getDefaults4p(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");         return FlashEnum3.toMyEnum(zwrot3);
    }

    public static void setDefaults5p(String key, Enum value, Context context)
    {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaults5p(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");         return FlashEnum3.toMyEnum(zwrot3);
    }
    public static void setDefaults6p(String key, Enum value, Context context)
    {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaults6p(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");         return FlashEnum3.toMyEnum(zwrot3);
    }
    public static void setDefaults7p(String key, Enum value, Context context)
    {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaults7p(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");         return FlashEnum3.toMyEnum(zwrot3);
    }
    public static void setDefaults8p(String key, Enum value, Context context)
    {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaults8p(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");         return FlashEnum3.toMyEnum(zwrot3);
    }
    public static void setDefaults9p(String key, Enum value, Context context)
    {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaults9p(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");         return FlashEnum3.toMyEnum(zwrot3);
    }
    public static void setDefaults10p(String key, Enum value, Context context)
    {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaults10p(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");         return FlashEnum3.toMyEnum(zwrot3);
    }
    public static void setDefaults11p(String key, Enum value, Context context)
    {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaults11p(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");         return FlashEnum3.toMyEnum(zwrot3);
    }
    public static void setDefaults12p(String key, Enum value, Context context)
    {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaults12p(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");         return FlashEnum3.toMyEnum(zwrot3);
    }
    public static void setDefaults13p(String key, Enum value, Context context)
    {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaults13p(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");         return FlashEnum3.toMyEnum(zwrot3);
    }
    public static void setDefaults14p(String key, Enum value, Context context)
    {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaults14p(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");         return FlashEnum3.toMyEnum(zwrot3);
    }
    public static void setDefaults15p(String key, Enum value, Context context)
    {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaults15p(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");         return FlashEnum3.toMyEnum(zwrot3);
    }
    public static void setDefaults16p(String key, Enum value, Context context)
    {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaults16p(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");         return FlashEnum3.toMyEnum(zwrot3);
    }
    public static void setDefaults17p(String key, Enum value, Context context)
    {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaults17p(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");         return FlashEnum3.toMyEnum(zwrot3);
    }
    public static void setDefaults18p(String key, Enum value, Context context)
    {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaults18p(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");         return FlashEnum3.toMyEnum(zwrot3);
    }
    public static void setDefaults19p(String key, Enum value, Context context)
    {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaults19p(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");         return FlashEnum3.toMyEnum(zwrot3);
    }
    public static void setDefaults20p(String key, Enum value, Context context)
    {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaults20p(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");         return FlashEnum3.toMyEnum(zwrot3);
    }
    public static void setDefaults21p(String key, Enum value, Context context)
    {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaults21p(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");         return FlashEnum3.toMyEnum(zwrot3);
    }
    public static void setDefaults22p(String key, Enum value, Context context)
    {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaults22p(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");         return FlashEnum3.toMyEnum(zwrot3);
    }
    public static void setDefaults23p(String key, Enum value, Context context)
    {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaults23p(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");         return FlashEnum3.toMyEnum(zwrot3);
    }
    public static void setDefaults24p(String key, Enum value, Context context)
    {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaults24p(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");         return FlashEnum3.toMyEnum(zwrot3);
    }
    public static void setDefaultsa1p(String key, Enum value, Context context)
    {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsa1p(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");         return FlashEnum3.toMyEnum(zwrot3);
    }
    public static void setDefaultsa2p(String key, Enum value, Context context)
    {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsa2p(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");         return FlashEnum3.toMyEnum(zwrot3);
    }
    public static void setDefaultsa3p(String key, Enum value, Context context)
    {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsa3p(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");         return FlashEnum3.toMyEnum(zwrot3);
    }
    public static void setDefaultsa4p(String key, Enum value, Context context)
    {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }
    public static FlashEnum3 getDefaultsa4p(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");         return FlashEnum3.toMyEnum(zwrot3);
    }

    public static void setDefaultsa5p(String key, Enum value, Context context)
    {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsa5p(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");         return FlashEnum3.toMyEnum(zwrot3);
    }
    public static void setDefaultsa6p(String key, Enum value, Context context)
    {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsa6p(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");         return FlashEnum3.toMyEnum(zwrot3);
    }
    public static void setDefaultsa7p(String key, Enum value, Context context)
    {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsa7p(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");         return FlashEnum3.toMyEnum(zwrot3);
    }
    public static void setDefaultsa8p(String key, Enum value, Context context)
    {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsa8p(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");         return FlashEnum3.toMyEnum(zwrot3);
    }
    public static void setDefaultsa9p(String key, Enum value, Context context)
    {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsa9p(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");         return FlashEnum3.toMyEnum(zwrot3);
    }
    public static void setDefaultsa10p(String key, Enum value, Context context)
    {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsa10p(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");         return FlashEnum3.toMyEnum(zwrot3);
    }
    public static void setDefaultsa11p(String key, Enum value, Context context)
    {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsa11p(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");         return FlashEnum3.toMyEnum(zwrot3);
    }
    public static void setDefaultsa12p(String key, Enum value, Context context)
    {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsa12p(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");         return FlashEnum3.toMyEnum(zwrot3);
    }
    public static void setDefaultsa13p(String key, Enum value, Context context)
    {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsa13p(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");         return FlashEnum3.toMyEnum(zwrot3);
    }
    public static void setDefaultsa14p(String key, Enum value, Context context)
    {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsa14p(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");         return FlashEnum3.toMyEnum(zwrot3);
    }
    public static void setDefaultsa15p(String key, Enum value, Context context)
    {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsa15p(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");         return FlashEnum3.toMyEnum(zwrot3);
    }
    public static void setDefaultsa16p(String key, Enum value, Context context)
    {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsa16p(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");         return FlashEnum3.toMyEnum(zwrot3);
    }
    public static void setDefaultsa17p(String key, Enum value, Context context)
    {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsa17p(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");         return FlashEnum3.toMyEnum(zwrot3);
    }
    public static void setDefaultsa18p(String key, Enum value, Context context)
    {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsa18p(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");         return FlashEnum3.toMyEnum(zwrot3);
    }
    public static void setDefaultsa19p(String key, Enum value, Context context)
    {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsa19p(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");         return FlashEnum3.toMyEnum(zwrot3);
    }
    public static void setDefaultsa20p(String key, Enum value, Context context)
    {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsa20p(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");         return FlashEnum3.toMyEnum(zwrot3);
    }
    public static void setDefaultsa21p(String key, Enum value, Context context)
    {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsa21p(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");         return FlashEnum3.toMyEnum(zwrot3);
    }
    public static void setDefaultsa22p(String key, Enum value, Context context)
    {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsa22p(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");         return FlashEnum3.toMyEnum(zwrot3);
    }
    public static void setDefaultsa23p(String key, Enum value, Context context)
    {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsa23p(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");         return FlashEnum3.toMyEnum(zwrot3);
    }
    public static void setDefaultsa24p(String key, Enum value, Context context)
    {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsa24p(String key, Context context)
    {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");         return FlashEnum3.toMyEnum(zwrot3);
    }
}

