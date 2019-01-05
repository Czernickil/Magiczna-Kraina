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

import static com.example.p1.kraina1.GlownyWidokCzarnoksieznika.skrzatyCzarnoksieznika;
import static com.example.p1.kraina1.GlownyWidokMaga.skrzatyMaga;
import static com.example.p1.kraina1.Menu.setsc;
import static com.example.p1.kraina1.Menu.setsm;
import static com.example.p1.kraina1.PrzyciskWyboruPytania.FlashEnum3.OFF3;

public class WyborPytaniaCzarnoksieznik extends Activity {
    Random generator = new Random();
    int i = 0;
    PrzyciskWyboruPytania togglec1p;
    PrzyciskWyboruPytania togglec2p;
    PrzyciskWyboruPytania togglec3p;
    PrzyciskWyboruPytania togglec4p;
    PrzyciskWyboruPytania togglec5p;
    PrzyciskWyboruPytania togglec6p;
    PrzyciskWyboruPytania togglec7p;
    PrzyciskWyboruPytania togglec8p;
    PrzyciskWyboruPytania togglec9p;
    PrzyciskWyboruPytania togglec10p;
    PrzyciskWyboruPytania togglec11p;
    PrzyciskWyboruPytania togglec12p;
    PrzyciskWyboruPytania togglec13p;
    PrzyciskWyboruPytania togglec14p;
    PrzyciskWyboruPytania togglec15p;
    PrzyciskWyboruPytania togglec16p;
    PrzyciskWyboruPytania togglec17p;
    PrzyciskWyboruPytania togglec18p;
    PrzyciskWyboruPytania togglec19p;
    PrzyciskWyboruPytania togglec20p;
    PrzyciskWyboruPytania togglec21p;
    PrzyciskWyboruPytania togglec22p;
    PrzyciskWyboruPytania togglec23p;
    PrzyciskWyboruPytania togglec24p;
    PrzyciskWyboruPytania toggleca1p;
    PrzyciskWyboruPytania toggleca2p;
    PrzyciskWyboruPytania toggleca3p;
    PrzyciskWyboruPytania toggleca4p;
    PrzyciskWyboruPytania toggleca5p;
    PrzyciskWyboruPytania toggleca6p;
    PrzyciskWyboruPytania toggleca7p;
    PrzyciskWyboruPytania toggleca8p;
    PrzyciskWyboruPytania toggleca9p;
    PrzyciskWyboruPytania toggleca10p;
    PrzyciskWyboruPytania toggleca11p;
    PrzyciskWyboruPytania toggleca12p;
    PrzyciskWyboruPytania toggleca13p;
    PrzyciskWyboruPytania toggleca14p;
    PrzyciskWyboruPytania toggleca15p;
    PrzyciskWyboruPytania toggleca16p;
    PrzyciskWyboruPytania toggleca17p;
    PrzyciskWyboruPytania toggleca18p;
    PrzyciskWyboruPytania toggleca19p;
    PrzyciskWyboruPytania toggleca20p;
    PrzyciskWyboruPytania toggleca21p;
    PrzyciskWyboruPytania toggleca22p;
    PrzyciskWyboruPytania toggleca23p;
    PrzyciskWyboruPytania toggleca24p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pytania2c);
        togglec1p = (PrzyciskWyboruPytania) findViewById(R.id.button1);
        togglec1p.setState(getDefaultsc1p("etatTogglec1p", this));
        setDefaultsc1p("etatTogglecp", togglec1p.getState(), this);
        togglec2p = (PrzyciskWyboruPytania) findViewById(R.id.button2);
        togglec2p.setState(getDefaultsc2p("etatTogglec2p", this));
        setDefaultsc2p("etatTogglecp", togglec2p.getState(), this);
        togglec3p = (PrzyciskWyboruPytania) findViewById(R.id.button3);
        togglec3p.setState(getDefaultsc3p("etatTogglec3p", this));
        setDefaultsc3p("etatTogglecp", togglec3p.getState(), this);
        togglec4p = (PrzyciskWyboruPytania) findViewById(R.id.button4);
        togglec4p.setState(getDefaultsc4p("etatTogglec4p", this));
        setDefaultsc4p("etatTogglecp", togglec4p.getState(), this);
        togglec5p = (PrzyciskWyboruPytania) findViewById(R.id.button5);
        togglec5p.setState(getDefaultsc5p("etatTogglec5p", this));
        setDefaultsc5p("etatTogglecp", togglec5p.getState(), this);
        togglec6p = (PrzyciskWyboruPytania) findViewById(R.id.button6);
        togglec6p.setState(getDefaultsc6p("etatTogglec6p", this));
        setDefaultsc6p("etatTogglecp", togglec6p.getState(), this);
        togglec7p = (PrzyciskWyboruPytania) findViewById(R.id.button7);
        togglec7p.setState(getDefaultsc7p("etatTogglec7p", this));
        setDefaultsc7p("etatTogglecp", togglec7p.getState(), this);
        togglec8p = (PrzyciskWyboruPytania) findViewById(R.id.button8);
        togglec8p.setState(getDefaultsc8p("etatTogglec8p", this));
        setDefaultsc8p("etatTogglecp", togglec8p.getState(), this);
        togglec9p = (PrzyciskWyboruPytania) findViewById(R.id.button9);
        togglec9p.setState(getDefaultsc9p("etatTogglec9p", this));
        setDefaultsc9p("etatTogglecp", togglec9p.getState(), this);
        togglec10p = (PrzyciskWyboruPytania) findViewById(R.id.button10);
        togglec10p.setState(getDefaultsc10p("etatTogglec10p", this));
        setDefaultsc10p("etatTogglecp", togglec10p.getState(), this);
        togglec11p = (PrzyciskWyboruPytania) findViewById(R.id.button11);
        togglec11p.setState(getDefaultsc11p("etatTogglec11p", this));
        setDefaultsc11p("etatTogglecp", togglec11p.getState(), this);
        togglec12p = (PrzyciskWyboruPytania) findViewById(R.id.button12);
        togglec12p.setState(getDefaultsc12p("etatTogglec12p", this));
        setDefaultsc12p("etatTogglecp", togglec12p.getState(), this);
        togglec13p = (PrzyciskWyboruPytania) findViewById(R.id.button13);
        togglec13p.setState(getDefaultsc13p("etatTogglec13p", this));
        setDefaultsc13p("etatTogglecp", togglec13p.getState(), this);
        togglec14p = (PrzyciskWyboruPytania) findViewById(R.id.button14);
        togglec14p.setState(getDefaultsc14p("etatTogglec14p", this));
        setDefaultsc14p("etatTogglecp", togglec14p.getState(), this);
        togglec15p = (PrzyciskWyboruPytania) findViewById(R.id.button15);
        togglec15p.setState(getDefaultsc15p("etatTogglec15p", this));
        setDefaultsc15p("etatTogglecp", togglec15p.getState(), this);
        togglec16p = (PrzyciskWyboruPytania) findViewById(R.id.button16);
        togglec16p.setState(getDefaultsc16p("etatTogglec16p", this));
        setDefaultsc16p("etatTogglecp", togglec16p.getState(), this);
        togglec17p = (PrzyciskWyboruPytania) findViewById(R.id.button17);
        togglec17p.setState(getDefaultsc17p("etatTogglec17p", this));
        setDefaultsc17p("etatTogglecp", togglec17p.getState(), this);
        togglec18p = (PrzyciskWyboruPytania) findViewById(R.id.button18);
        togglec18p.setState(getDefaultsc18p("etatTogglec18p", this));
        setDefaultsc18p("etatTogglecp", togglec18p.getState(), this);
        togglec19p = (PrzyciskWyboruPytania) findViewById(R.id.button19);
        togglec19p.setState(getDefaultsc19p("etatTogglec19p", this));
        setDefaultsc19p("etatTogglecp", togglec19p.getState(), this);
        togglec20p = (PrzyciskWyboruPytania) findViewById(R.id.button20);
        togglec20p.setState(getDefaultsc20p("etatTogglec20p", this));
        setDefaultsc20p("etatTogglecp", togglec20p.getState(), this);
        togglec21p = (PrzyciskWyboruPytania) findViewById(R.id.button21);
        togglec21p.setState(getDefaultsc21p("etatTogglec21p", this));
        setDefaultsc21p("etatTogglecp", togglec21p.getState(), this);
        togglec22p = (PrzyciskWyboruPytania) findViewById(R.id.button22);
        togglec22p.setState(getDefaultsc22p("etatTogglec22p", this));
        setDefaultsc22p("etatTogglecp", togglec22p.getState(), this);
        togglec23p = (PrzyciskWyboruPytania) findViewById(R.id.button23);
        togglec23p.setState(getDefaultsc23p("etatTogglec23p", this));
        setDefaultsc23p("etatTogglecp", togglec23p.getState(), this);
        togglec24p = (PrzyciskWyboruPytania) findViewById(R.id.button24);
        togglec24p.setState(getDefaultsc24p("etatTogglec24p", this));
        setDefaultsc24p("etatTogglecp", togglec24p.getState(), this);
        toggleca1p = (PrzyciskWyboruPytania) findViewById(R.id.buttonb1);
        toggleca1p.setState(getDefaultsca1p("etatToggleac1p", this));
        setDefaultsca1p("etatToggleacp", toggleca1p.getState(), this);
        toggleca2p = (PrzyciskWyboruPytania) findViewById(R.id.buttonb2);
        toggleca2p.setState(getDefaultsca2p("etatToggleac2p", this));
        setDefaultsca2p("etatToggleacp", toggleca2p.getState(), this);
        toggleca3p = (PrzyciskWyboruPytania) findViewById(R.id.buttonb3);
        toggleca3p.setState(getDefaultsca3p("etatToggleac3p", this));
        setDefaultsca3p("etatToggleacp", toggleca3p.getState(), this);
        toggleca4p = (PrzyciskWyboruPytania) findViewById(R.id.buttonb4);
        toggleca4p.setState(getDefaultsca4p("etatToggleac4p", this));
        setDefaultsca4p("etatToggleacp", toggleca4p.getState(), this);
        toggleca5p = (PrzyciskWyboruPytania) findViewById(R.id.buttonb5);
        toggleca5p.setState(getDefaultsca5p("etatToggleac5p", this));
        setDefaultsca5p("etatToggleacp", toggleca5p.getState(), this);
        toggleca6p = (PrzyciskWyboruPytania) findViewById(R.id.buttonb6);
        toggleca6p.setState(getDefaultsca6p("etatTogglec6p", this));
        setDefaultsca6p("etatToggleacp", toggleca6p.getState(), this);
        toggleca7p = (PrzyciskWyboruPytania) findViewById(R.id.buttonb7);
        toggleca7p.setState(getDefaultsca7p("etatToggleac7p", this));
        setDefaultsca7p("etatToggleacp", toggleca7p.getState(), this);
        toggleca8p = (PrzyciskWyboruPytania) findViewById(R.id.buttonb8);
        toggleca8p.setState(getDefaultsca8p("etatToggleac8p", this));
        setDefaultsca8p("etatToggleacp", toggleca8p.getState(), this);
        toggleca9p = (PrzyciskWyboruPytania) findViewById(R.id.buttonb9);
        toggleca9p.setState(getDefaultsca9p("etatToggleac9p", this));
        setDefaultsca9p("etatToggleacp", toggleca9p.getState(), this);
        toggleca10p = (PrzyciskWyboruPytania) findViewById(R.id.buttonb10);
        toggleca10p.setState(getDefaultsca10p("etatToggleac10p", this));
        setDefaultsca10p("etatToggleacp", toggleca10p.getState(), this);
        toggleca11p = (PrzyciskWyboruPytania) findViewById(R.id.buttonb11);
        toggleca11p.setState(getDefaultsca11p("etatToggleac11p", this));
        setDefaultsca11p("etatToggleacp", toggleca11p.getState(), this);
        toggleca12p = (PrzyciskWyboruPytania) findViewById(R.id.buttonb12);
        toggleca12p.setState(getDefaultsca12p("etatToggleac12p", this));
        setDefaultsca12p("etatToggleacp", toggleca12p.getState(), this);
        toggleca13p = (PrzyciskWyboruPytania) findViewById(R.id.buttonb13);
        toggleca13p.setState(getDefaultsca13p("etatToggleac13p", this));
        setDefaultsca13p("etatToggleacp", toggleca13p.getState(), this);
        toggleca14p = (PrzyciskWyboruPytania) findViewById(R.id.buttonb14);
        toggleca14p.setState(getDefaultsca14p("etatToggleac14p", this));
        setDefaultsca14p("etatToggleacp", toggleca14p.getState(), this);
        toggleca15p = (PrzyciskWyboruPytania) findViewById(R.id.buttonb15);
        toggleca15p.setState(getDefaultsca15p("etatToggleac15p", this));
        setDefaultsca15p("etatToggleacp", toggleca15p.getState(), this);
        toggleca16p = (PrzyciskWyboruPytania) findViewById(R.id.buttonb16);
        toggleca16p.setState(getDefaultsca16p("etatToggleac16p", this));
        setDefaultsca16p("etatToggleacp", toggleca16p.getState(), this);
        toggleca17p = (PrzyciskWyboruPytania) findViewById(R.id.buttonb17);
        toggleca17p.setState(getDefaultsca17p("etatToggleac17p", this));
        setDefaultsca17p("etatToggleacp", toggleca17p.getState(), this);
        toggleca18p = (PrzyciskWyboruPytania) findViewById(R.id.buttonb18);
        toggleca18p.setState(getDefaultsca18p("etatToggleac18p", this));
        setDefaultsca18p("etatToggleacp", toggleca18p.getState(), this);
        toggleca19p = (PrzyciskWyboruPytania) findViewById(R.id.buttonb19);
        toggleca19p.setState(getDefaultsca19p("etatToggleac19p", this));
        setDefaultsca19p("etatToggleacp", toggleca19p.getState(), this);
        toggleca20p = (PrzyciskWyboruPytania) findViewById(R.id.buttonb20);
        toggleca20p.setState(getDefaultsca20p("etatToggleac20p", this));
        setDefaultsca20p("etatToggleacp", toggleca20p.getState(), this);
        toggleca21p = (PrzyciskWyboruPytania) findViewById(R.id.buttonb21);
        toggleca21p.setState(getDefaultsca21p("etatToggleac21p", this));
        setDefaultsca21p("etatToggleacp", toggleca21p.getState(), this);
        toggleca22p = (PrzyciskWyboruPytania) findViewById(R.id.buttonb22);
        toggleca22p.setState(getDefaultsca22p("etatToggleac22p", this));
        setDefaultsca22p("etatToggleacp", toggleca22p.getState(), this);
        toggleca23p = (PrzyciskWyboruPytania) findViewById(R.id.buttonb23);
        toggleca23p.setState(getDefaultsca23p("etatToggleac23p", this));
        setDefaultsca23p("etatToggleacp", toggleca23p.getState(), this);
        toggleca24p = (PrzyciskWyboruPytania) findViewById(R.id.buttonb24);
        toggleca24p.setState(getDefaultsca24p("etatToggleac24p", this));
        setDefaultsca24p("etatToggleacp", toggleca24p.getState(), this);

    }

    public void onPause() {
        super.onPause();
        if (Menu.poprawneWylaczenie == 0) {
            Intro.poprawneWylaczenieDwa = 0;
            Intro.adp.run();
        }
    }

    public void onResume() {
        super.onResume();
    }

    public void polski1(View view) {
        if (togglec1p.getState() != OFF3) {
            if (i == 7) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, com.example.p1.kraina1.PytanieZabawne.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 4) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, WyborPortalu.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytaniePolskiJedenPunktCzarnoksieznik.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            }
        }
    }

    public void polski2(View view) {
        if (togglec3p.getState() != OFF3) {
            if (i == 7) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, com.example.p1.kraina1.PytanieZabawne.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 4) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, WyborPortalu.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytaniePolskiDwaPunktyCzarnoksieznik.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            }
        }
    }

    public void polski3(View view) {
        if (togglec5p.getState() != OFF3) {
            if (i == 7) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, com.example.p1.kraina1.PytanieZabawne.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 4) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, WyborPortalu.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytaniePolskiTrzyPunktyCzarnoksieznik.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            }
        }
    }

    public void matematyka1(View view) {
        if (togglec7p.getState() != OFF3) {
            if (i == 7) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, com.example.p1.kraina1.PytanieZabawne.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 4) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, WyborPortalu.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytanieMatematykaJedenPunktCzarnoksieznik.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            }
        }
    }

    public void matematyka2(View view) {
        if (togglec9p.getState() != OFF3) {
            if (i == 7) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, com.example.p1.kraina1.PytanieZabawne.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 4) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, WyborPortalu.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytanieMatematykaDwaPunktyCzarnoksieznik.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            }
        }
    }

    public void matematyka3(View view) {
        if (togglec11p.getState() != OFF3) {
            if (i == 7) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, com.example.p1.kraina1.PytanieZabawne.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 4) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, WyborPortalu.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytanieMatematykaTrzyPunktyCzarnoksieznik.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            }
        }
    }

    public void przyroda1(View view) {
        if (togglec13p.getState() != OFF3) {
            if (i == 7) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, com.example.p1.kraina1.PytanieZabawne.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 5 || i == 6) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, com.example.p1.kraina1.PytanieLiterkowe.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 4) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, WyborPortalu.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytaniePrzyrodaJedenPunktCzarnoksieznik.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            }
        }
    }

    public void przyroda2(View view) {
        if (togglec15p.getState() != OFF3) {
            if (i == 7) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, com.example.p1.kraina1.PytanieZabawne.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 5 || i == 6) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, com.example.p1.kraina1.PytanieLiterkowe.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 4) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, WyborPortalu.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytaniePrzyrodaDwaPunktyCzarnoksieznik.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            }
        }
    }

    public void przyroda3(View view) {
        if (togglec17p.getState() != OFF3) {
            if (i == 7) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, com.example.p1.kraina1.PytanieZabawne.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 5 || i == 6) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, com.example.p1.kraina1.PytanieLiterkowe.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 4) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, WyborPortalu.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytaniePrzyrodaTrzyPunktyCzarnoksieznik.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            }
        }
    }

    public void zycie1(View view) {
        if (togglec19p.getState() != OFF3) {
            if (i == 7) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, com.example.p1.kraina1.PytanieZabawne.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 5 || i == 6) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytanieObrazkowe.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 4) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, WyborPortalu.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytanieZycieJedenPunktCzarnoksieznik.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            }
        }
    }

    public void zycie2(View view) {
        if (togglec21p.getState() != OFF3) {
            if (i == 7) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, com.example.p1.kraina1.PytanieZabawne.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 5 || i == 6) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytanieObrazkowe.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 4) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, WyborPortalu.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytanieZycieDwaPunktyCzarnoksieznik.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            }
        }
    }

    public void zycie3(View view) {
        if (togglec23p.getState() != OFF3) {
            if (i == 7) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, com.example.p1.kraina1.PytanieZabawne.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 5 || i == 6) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytanieObrazkowe.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 4) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, WyborPortalu.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytanieZycieTrzyPunktyCzarnoksieznik.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            }
        }
    }

    public void polski12(View view) {
        if (togglec2p.getState() != OFF3) {
            if (i == 7) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, com.example.p1.kraina1.PytanieZabawne.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 4) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, WyborPortalu.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytaniePolskiJedenPunktCzarnoksieznik.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            }
        }
    }

    public void polski22(View view) {
        if (togglec4p.getState() != OFF3) {
            if (i == 7) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, com.example.p1.kraina1.PytanieZabawne.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 4) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, WyborPortalu.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytaniePolskiDwaPunktyCzarnoksieznik.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            }
        }
    }

    public void polski32(View view) {
        if (togglec6p.getState() != OFF3) {
            if (i == 7) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, com.example.p1.kraina1.PytanieZabawne.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 4) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, WyborPortalu.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytaniePolskiTrzyPunktyCzarnoksieznik.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            }
        }
    }

    public void matematyka12(View view) {
        if (togglec8p.getState() != OFF3) {
            if (i == 7) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, com.example.p1.kraina1.PytanieZabawne.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 4) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, WyborPortalu.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytanieMatematykaJedenPunktCzarnoksieznik.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            }
        }
    }

    public void matematyka22(View view) {
        if (togglec10p.getState() != OFF3) {
            if (i == 7) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, com.example.p1.kraina1.PytanieZabawne.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 4) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, WyborPortalu.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytanieMatematykaDwaPunktyCzarnoksieznik.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            }
        }
    }

    public void matematyka32(View view) {
        if (togglec12p.getState() != OFF3) {
            if (i == 7) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, com.example.p1.kraina1.PytanieZabawne.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 4) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, WyborPortalu.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytanieMatematykaTrzyPunktyCzarnoksieznik.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            }
        }
    }

    public void przyroda12(View view) {
        if (togglec14p.getState() != OFF3) {
            if (i == 7) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, com.example.p1.kraina1.PytanieZabawne.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 5 || i == 6) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, com.example.p1.kraina1.PytanieLiterkowe.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 4) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, WyborPortalu.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytaniePrzyrodaJedenPunktCzarnoksieznik.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            }
        }
    }

    public void przyroda22(View view) {
        if (togglec16p.getState() != OFF3) {
            if (i == 7) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, com.example.p1.kraina1.PytanieZabawne.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 5 || i == 6) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, com.example.p1.kraina1.PytanieLiterkowe.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 4) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, WyborPortalu.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytaniePrzyrodaDwaPunktyCzarnoksieznik.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            }
        }
    }

    public void przyroda32(View view) {
        if (togglec18p.getState() != OFF3) {
            if (i == 7) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, com.example.p1.kraina1.PytanieZabawne.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 5 || i == 6) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, com.example.p1.kraina1.PytanieLiterkowe.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 4) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, WyborPortalu.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytaniePrzyrodaTrzyPunktyCzarnoksieznik.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            }
        }
    }

    public void zycie12(View view) {
        if (togglec20p.getState() != OFF3) {
            if (i == 7) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, com.example.p1.kraina1.PytanieZabawne.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 5 || i == 6) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytanieObrazkowe.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 4) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, WyborPortalu.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytanieZycieJedenPunktCzarnoksieznik.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            }
        }
    }

    public void zycie22(View view) {
        if (togglec22p.getState() != OFF3) {
            if (i == 7) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, com.example.p1.kraina1.PytanieZabawne.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 5 || i == 6) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytanieObrazkowe.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 4) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, WyborPortalu.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytanieZycieDwaPunktyCzarnoksieznik.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            }
        }
    }

    public void zycie32(View view) {
        if (togglec24p.getState() != OFF3) {
            if (i == 7) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, com.example.p1.kraina1.PytanieZabawne.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 5 || i == 6) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytanieObrazkowe.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 4) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, WyborPortalu.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytanieZycieTrzyPunktyCzarnoksieznik.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            }
        }
    }

    public void polskia1(View view) {
        if (toggleca1p.getState() != OFF3) {
            if (i == 7) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, com.example.p1.kraina1.PytanieZabawne.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 4) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, WyborPortalu.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytaniePolskiJedenPunktCzarnoksieznik.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            }
        }
    }

    public void polskia2(View view) {
        if (toggleca3p.getState() != OFF3) {
            if (i == 7) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, com.example.p1.kraina1.PytanieZabawne.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 4) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, WyborPortalu.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytaniePolskiDwaPunktyCzarnoksieznik.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            }
        }
    }

    public void polskia3(View view) {
        if (toggleca5p.getState() != OFF3) {
            if (i == 7) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, com.example.p1.kraina1.PytanieZabawne.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 4) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, WyborPortalu.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytaniePolskiTrzyPunktyCzarnoksieznik.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            }
        }
    }

    public void matematykaa1(View view) {
        if (toggleca7p.getState() != OFF3) {
            if (i == 7) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, com.example.p1.kraina1.PytanieZabawne.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 4) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, WyborPortalu.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytanieMatematykaJedenPunktCzarnoksieznik.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            }
        }
    }

    public void matematykaa2(View view) {
        if (toggleca9p.getState() != OFF3) {
            if (i == 7) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, com.example.p1.kraina1.PytanieZabawne.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 4) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, WyborPortalu.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytanieMatematykaDwaPunktyCzarnoksieznik.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            }
        }
    }

    public void matematykaa3(View view) {
        if (toggleca11p.getState() != OFF3) {
            if (i == 7) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, com.example.p1.kraina1.PytanieZabawne.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 4) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, WyborPortalu.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytanieMatematykaTrzyPunktyCzarnoksieznik.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            }
        }
    }

    public void przyrodaa1(View view) {
        if (toggleca13p.getState() != OFF3) {
            if (i == 7) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, com.example.p1.kraina1.PytanieZabawne.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 4) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, WyborPortalu.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytaniePrzyrodaJedenPunktCzarnoksieznik.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            }
        }
    }

    public void przyrodaa2(View view) {
        if (toggleca15p.getState() != OFF3) {
            if (i == 7) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, com.example.p1.kraina1.PytanieZabawne.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 4) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, WyborPortalu.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytaniePrzyrodaDwaPunktyCzarnoksieznik.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            }
        }
    }

    public void przyrodaa3(View view) {
        if (toggleca17p.getState() != OFF3) {
            if (i == 7) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, com.example.p1.kraina1.PytanieZabawne.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 4) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, WyborPortalu.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytaniePrzyrodaTrzyPunktyCzarnoksieznik.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            }
        }
    }

    public void zyciea1(View view) {
        if (toggleca19p.getState() != OFF3) {
            if (i == 7) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, com.example.p1.kraina1.PytanieZabawne.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 5 || i == 6) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytanieObrazkowe.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 4) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, WyborPortalu.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytanieZycieJedenPunktCzarnoksieznik.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            }
        }
    }

    public void zyciea2(View view) {
        if (toggleca21p.getState() != OFF3) {
            if (i == 7) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, com.example.p1.kraina1.PytanieZabawne.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 5 || i == 6) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytanieObrazkowe.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 4) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, WyborPortalu.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytanieZycieDwaPunktyCzarnoksieznik.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            }
        }
    }

    public void zyciea3(View view) {
        if (toggleca23p.getState() != OFF3) {
            if (i == 7) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, com.example.p1.kraina1.PytanieZabawne.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 5 || i == 6) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytanieObrazkowe.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 4) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, WyborPortalu.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytanieZycieTrzyPunktyCzarnoksieznik.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            }
        }
    }

    public void polskia12(View view) {
        if (toggleca2p.getState() != OFF3) {
            if (i == 7) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, com.example.p1.kraina1.PytanieZabawne.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 4) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, WyborPortalu.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytaniePolskiJedenPunktCzarnoksieznik.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            }
        }
    }

    public void polskia22(View view) {
        if (toggleca4p.getState() != OFF3) {
            if (i == 7) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, com.example.p1.kraina1.PytanieZabawne.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 4) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, WyborPortalu.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytaniePolskiDwaPunktyCzarnoksieznik.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            }
        }
    }

    public void polskia32(View view) {
        if (toggleca6p.getState() != OFF3) {
            if (i == 7) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, com.example.p1.kraina1.PytanieZabawne.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 4) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, WyborPortalu.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytaniePolskiTrzyPunktyCzarnoksieznik.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            }
        }
    }

    public void matematykaa12(View view) {
        if (toggleca8p.getState() != OFF3) {
            if (i == 7) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, com.example.p1.kraina1.PytanieZabawne.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 4) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, WyborPortalu.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytanieMatematykaJedenPunktCzarnoksieznik.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            }
        }
    }

    public void matematykaa22(View view) {
        if (toggleca10p.getState() != OFF3) {
            if (i == 7) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, com.example.p1.kraina1.PytanieZabawne.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 4) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, WyborPortalu.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytanieMatematykaDwaPunktyCzarnoksieznik.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            }
        }
    }

    public void matematykaa32(View view) {
        if (toggleca12p.getState() != OFF3) {
            if (i == 7) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, com.example.p1.kraina1.PytanieZabawne.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 4) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, WyborPortalu.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytanieMatematykaTrzyPunktyCzarnoksieznik.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            }
        }
    }

    public void przyrodaa12(View view) {
        if (toggleca14p.getState() != OFF3) {
            if (i == 7) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, com.example.p1.kraina1.PytanieZabawne.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 4) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, WyborPortalu.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytaniePrzyrodaJedenPunktCzarnoksieznik.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            }
        }
    }

    public void przyrodaa22(View view) {
        if (toggleca16p.getState() != OFF3) {
            if (i == 7) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, com.example.p1.kraina1.PytanieZabawne.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 4) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, WyborPortalu.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytaniePrzyrodaDwaPunktyCzarnoksieznik.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            }
        }
    }

    public void przyrodaa32(View view) {
        if (toggleca18p.getState() != OFF3) {
            if (i == 7) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, com.example.p1.kraina1.PytanieZabawne.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 4) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, WyborPortalu.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytaniePrzyrodaTrzyPunktyCzarnoksieznik.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            }
        }
    }

    public void zyciea12(View view) {
        if (toggleca20p.getState() != OFF3) {
            if (i == 7) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, com.example.p1.kraina1.PytanieZabawne.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 5 || i == 6) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytanieObrazkowe.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 4) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, WyborPortalu.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytanieZycieJedenPunktCzarnoksieznik.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            }
        }
    }

    public void zyciea22(View view) {
        if (toggleca22p.getState() != OFF3) {
            if (i == 7) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, com.example.p1.kraina1.PytanieZabawne.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 5 || i == 6) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytanieObrazkowe.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 4) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, WyborPortalu.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytanieZycieDwaPunktyCzarnoksieznik.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            }
        }
    }

    public void zyciea32(View view) {
        if (toggleca24p.getState() != OFF3) {
            if (i == 7) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, com.example.p1.kraina1.PytanieZabawne.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 5 || i == 6) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytanieObrazkowe.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else if (i == 4) {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, WyborPortalu.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            } else {
                Intent intent = new Intent(WyborPytaniaCzarnoksieznik.this, PytanieZycieTrzyPunktyCzarnoksieznik.class);
                Menu.poprawneWylaczenie = 1;
                startActivity(intent);
            }
        }
    }

    public void onStart() {
        super.onStart();
        Menu.poprawneWylaczenie = 0;
        setsm("bbbbm", skrzatyMaga, this);
        setsc("bbbbc", skrzatyCzarnoksieznika, this);
        i = generator.nextInt(8) + 1;
        togglec1p.setState(getDefaultsc1p("etatTogglec1p", this));
        togglec2p.setState(getDefaultsc2p("etatTogglec2p", this));
        togglec3p.setState(getDefaultsc3p("etatTogglec3p", this));
        togglec4p.setState(getDefaultsc4p("etatTogglec4p", this));
        togglec5p.setState(getDefaultsc5p("etatTogglec5p", this));
        togglec6p.setState(getDefaultsc6p("etatTogglec6p", this));
        togglec7p.setState(getDefaultsc7p("etatTogglec7p", this));
        togglec8p.setState(getDefaultsc8p("etatTogglec8p", this));
        togglec9p.setState(getDefaultsc9p("etatTogglec9p", this));
        togglec10p.setState(getDefaultsc10p("etatTogglec10p", this));
        togglec11p.setState(getDefaultsc11p("etatTogglec11p", this));
        togglec12p.setState(getDefaultsc12p("etatTogglec12p", this));
        togglec13p.setState(getDefaultsc13p("etatTogglec13p", this));
        togglec14p.setState(getDefaultsc14p("etatTogglec14p", this));
        togglec15p.setState(getDefaultsc15p("etatTogglec15p", this));
        togglec16p.setState(getDefaultsc16p("etatTogglec16p", this));
        togglec17p.setState(getDefaultsc17p("etatTogglec17p", this));
        togglec18p.setState(getDefaultsc18p("etatTogglec18p", this));
        togglec19p.setState(getDefaultsc19p("etatTogglec19p", this));
        togglec20p.setState(getDefaultsc20p("etatTogglec20p", this));
        togglec21p.setState(getDefaultsc21p("etatTogglec21p", this));
        togglec22p.setState(getDefaultsc22p("etatTogglec22p", this));
        togglec23p.setState(getDefaultsc23p("etatTogglec23p", this));
        togglec24p.setState(getDefaultsc24p("etatTogglec24p", this));
        toggleca1p.setState(getDefaultsca1p("etatToggleac1p", this));
        toggleca2p.setState(getDefaultsca2p("etatToggleac2p", this));
        toggleca3p.setState(getDefaultsca3p("etatToggleac3p", this));
        toggleca4p.setState(getDefaultsca4p("etatToggleac4p", this));
        toggleca5p.setState(getDefaultsca5p("etatToggleac5p", this));
        toggleca6p.setState(getDefaultsca6p("etatToggleac6p", this));
        toggleca7p.setState(getDefaultsca7p("etatToggleac7p", this));
        toggleca8p.setState(getDefaultsca8p("etatToggleac8p", this));
        toggleca9p.setState(getDefaultsca9p("etatToggleac9p", this));
        toggleca10p.setState(getDefaultsca10p("etatToggleac10p", this));
        toggleca11p.setState(getDefaultsca11p("etatToggleac11p", this));
        toggleca12p.setState(getDefaultsca12p("etatToggleac12p", this));
        toggleca13p.setState(getDefaultsca13p("etatToggleac13p", this));
        toggleca14p.setState(getDefaultsca14p("etatToggleac14p", this));
        toggleca15p.setState(getDefaultsca15p("etatToggleac15p", this));
        toggleca16p.setState(getDefaultsca16p("etatToggleac16p", this));
        toggleca17p.setState(getDefaultsca17p("etatToggleac17p", this));
        toggleca18p.setState(getDefaultsca18p("etatToggleac18p", this));
        toggleca19p.setState(getDefaultsca19p("etatToggleac19p", this));
        toggleca20p.setState(getDefaultsca20p("etatToggleac20p", this));
        toggleca21p.setState(getDefaultsca21p("etatToggleac21p", this));
        toggleca22p.setState(getDefaultsca22p("etatToggleac22p", this));
        toggleca23p.setState(getDefaultsca23p("etatToggleac23p", this));
        toggleca24p.setState(getDefaultsca24p("etatToggleac24p", this));
    }


    @Override
    public void onStop() {
        super.onStop();

        setDefaultsc1p("etatTogglec1p", togglec1p.getState(), this);
        setDefaultsc2p("etatTogglec2p", togglec2p.getState(), this);
        setDefaultsc3p("etatTogglec3p", togglec3p.getState(), this);
        setDefaultsc4p("etatTogglec4p", togglec4p.getState(), this);
        setDefaultsc5p("etatTogglec5p", togglec5p.getState(), this);
        setDefaultsc6p("etatTogglec6p", togglec6p.getState(), this);
        setDefaultsc7p("etatTogglec7p", togglec7p.getState(), this);
        setDefaultsc8p("etatTogglec8p", togglec8p.getState(), this);
        setDefaultsc9p("etatTogglec9p", togglec9p.getState(), this);
        setDefaultsc10p("etatTogglec10p", togglec10p.getState(), this);
        setDefaultsc11p("etatTogglec11p", togglec11p.getState(), this);
        setDefaultsc12p("etatTogglec12p", togglec12p.getState(), this);
        setDefaultsc13p("etatTogglec13p", togglec13p.getState(), this);
        setDefaultsc14p("etatTogglec14p", togglec14p.getState(), this);
        setDefaultsc15p("etatTogglec15p", togglec15p.getState(), this);
        setDefaultsc16p("etatTogglec16p", togglec16p.getState(), this);
        setDefaultsc17p("etatTogglec17p", togglec17p.getState(), this);
        setDefaultsc18p("etatTogglec18p", togglec18p.getState(), this);
        setDefaultsc19p("etatTogglec19p", togglec19p.getState(), this);
        setDefaultsc20p("etatTogglec20p", togglec20p.getState(), this);
        setDefaultsc21p("etatTogglec21p", togglec21p.getState(), this);
        setDefaultsc22p("etatTogglec22p", togglec22p.getState(), this);
        setDefaultsc23p("etatTogglec23p", togglec23p.getState(), this);
        setDefaultsc24p("etatTogglec24p", togglec24p.getState(), this);
        setDefaultsca1p("etatToggleac1p", toggleca1p.getState(), this);
        setDefaultsca2p("etatToggleac2p", toggleca2p.getState(), this);
        setDefaultsca3p("etatToggleac3p", toggleca3p.getState(), this);
        setDefaultsca4p("etatToggleac4p", toggleca4p.getState(), this);
        setDefaultsca5p("etatToggleac5p", toggleca5p.getState(), this);
        setDefaultsca6p("etatToggleac6p", toggleca6p.getState(), this);
        setDefaultsca7p("etatToggleac7p", toggleca7p.getState(), this);
        setDefaultsca8p("etatToggleac8p", toggleca8p.getState(), this);
        setDefaultsca9p("etatToggleac9p", toggleca9p.getState(), this);
        setDefaultsca10p("etatToggleac10p", toggleca10p.getState(), this);
        setDefaultsca11p("etatToggleac11p", toggleca11p.getState(), this);
        setDefaultsca12p("etatToggleac12p", toggleca12p.getState(), this);
        setDefaultsca13p("etatToggleac13p", toggleca13p.getState(), this);
        setDefaultsca14p("etatToggleac14p", toggleca14p.getState(), this);
        setDefaultsca15p("etatToggleac15p", toggleca15p.getState(), this);
        setDefaultsca16p("etatToggleac16p", toggleca16p.getState(), this);
        setDefaultsca17p("etatToggleac17p", toggleca17p.getState(), this);
        setDefaultsca18p("etatToggleac18p", toggleca18p.getState(), this);
        setDefaultsca19p("etatToggleac19p", toggleca19p.getState(), this);
        setDefaultsca20p("etatToggleac20p", toggleca20p.getState(), this);
        setDefaultsca21p("etatToggleac21p", toggleca21p.getState(), this);
        setDefaultsca22p("etatToggleac22p", toggleca22p.getState(), this);
        setDefaultsca23p("etatToggleac23p", toggleca23p.getState(), this);
        setDefaultsca24p("etatToggleac24p", toggleca24p.getState(), this);
    }

    public static void setDefaultsc1p(String key, Enum value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsc1p(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum3.toMyEnum(zwrot3);
    }

    public static void setDefaultsc2p(String key, Enum value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsc2p(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum3.toMyEnum(zwrot3);
    }

    public static void setDefaultsc3p(String key, Enum value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsc3p(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum3.toMyEnum(zwrot3);
    }

    public static void setDefaultsc4p(String key, Enum value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsc4p(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum3.toMyEnum(zwrot3);
    }

    public static void setDefaultsc5p(String key, Enum value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsc5p(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum3.toMyEnum(zwrot3);
    }

    public static void setDefaultsc6p(String key, Enum value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsc6p(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum3.toMyEnum(zwrot3);
    }

    public static void setDefaultsc7p(String key, Enum value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsc7p(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum3.toMyEnum(zwrot3);
    }

    public static void setDefaultsc8p(String key, Enum value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsc8p(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum3.toMyEnum(zwrot3);
    }

    public static void setDefaultsc9p(String key, Enum value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsc9p(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum3.toMyEnum(zwrot3);
    }

    public static void setDefaultsc10p(String key, Enum value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsc10p(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum3.toMyEnum(zwrot3);
    }

    public static void setDefaultsc11p(String key, Enum value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsc11p(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum3.toMyEnum(zwrot3);
    }

    public static void setDefaultsc12p(String key, Enum value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsc12p(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum3.toMyEnum(zwrot3);
    }

    public static void setDefaultsc13p(String key, Enum value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsc13p(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum3.toMyEnum(zwrot3);
    }

    public static void setDefaultsc14p(String key, Enum value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsc14p(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum3.toMyEnum(zwrot3);
    }

    public static void setDefaultsc15p(String key, Enum value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsc15p(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum3.toMyEnum(zwrot3);
    }

    public static void setDefaultsc16p(String key, Enum value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsc16p(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum3.toMyEnum(zwrot3);
    }

    public static void setDefaultsc17p(String key, Enum value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsc17p(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum3.toMyEnum(zwrot3);
    }

    public static void setDefaultsc18p(String key, Enum value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsc18p(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum3.toMyEnum(zwrot3);
    }

    public static void setDefaultsc19p(String key, Enum value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsc19p(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum3.toMyEnum(zwrot3);
    }

    public static void setDefaultsc20p(String key, Enum value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsc20p(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum3.toMyEnum(zwrot3);
    }

    public static void setDefaultsc21p(String key, Enum value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsc21p(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum3.toMyEnum(zwrot3);
    }

    public static void setDefaultsc22p(String key, Enum value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsc22p(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum3.toMyEnum(zwrot3);
    }

    public static void setDefaultsc23p(String key, Enum value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsc23p(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum3.toMyEnum(zwrot3);
    }

    public static void setDefaultsc24p(String key, Enum value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsc24p(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum3.toMyEnum(zwrot3);
    }

    public static void setDefaultsca1p(String key, Enum value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsca1p(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum3.toMyEnum(zwrot3);
    }

    public static void setDefaultsca2p(String key, Enum value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsca2p(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum3.toMyEnum(zwrot3);
    }

    public static void setDefaultsca3p(String key, Enum value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsca3p(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum3.toMyEnum(zwrot3);
    }

    public static void setDefaultsca4p(String key, Enum value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsca4p(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum3.toMyEnum(zwrot3);
    }

    public static void setDefaultsca5p(String key, Enum value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsca5p(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum3.toMyEnum(zwrot3);
    }

    public static void setDefaultsca6p(String key, Enum value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsca6p(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum3.toMyEnum(zwrot3);
    }

    public static void setDefaultsca7p(String key, Enum value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsca7p(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum3.toMyEnum(zwrot3);
    }

    public static void setDefaultsca8p(String key, Enum value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsca8p(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum3.toMyEnum(zwrot3);
    }

    public static void setDefaultsca9p(String key, Enum value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsca9p(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum3.toMyEnum(zwrot3);
    }

    public static void setDefaultsca10p(String key, Enum value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsca10p(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum3.toMyEnum(zwrot3);
    }

    public static void setDefaultsca11p(String key, Enum value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsca11p(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum3.toMyEnum(zwrot3);
    }

    public static void setDefaultsca12p(String key, Enum value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsca12p(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum3.toMyEnum(zwrot3);
    }

    public static void setDefaultsca13p(String key, Enum value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsca13p(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum3.toMyEnum(zwrot3);
    }

    public static void setDefaultsca14p(String key, Enum value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsca14p(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum3.toMyEnum(zwrot3);
    }

    public static void setDefaultsca15p(String key, Enum value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsca15p(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum3.toMyEnum(zwrot3);
    }

    public static void setDefaultsca16p(String key, Enum value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsca16p(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum3.toMyEnum(zwrot3);
    }

    public static void setDefaultsca17p(String key, Enum value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsca17p(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum3.toMyEnum(zwrot3);
    }

    public static void setDefaultsca18p(String key, Enum value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsca18p(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum3.toMyEnum(zwrot3);
    }

    public static void setDefaultsca19p(String key, Enum value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsca19p(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum3.toMyEnum(zwrot3);
    }

    public static void setDefaultsca20p(String key, Enum value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsca20p(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum3.toMyEnum(zwrot3);
    }

    public static void setDefaultsca21p(String key, Enum value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsca21p(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum3.toMyEnum(zwrot3);
    }

    public static void setDefaultsca22p(String key, Enum value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsca22p(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum3.toMyEnum(zwrot3);
    }

    public static void setDefaultsca23p(String key, Enum value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsca23p(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum3.toMyEnum(zwrot3);
    }

    public static void setDefaultsca24p(String key, Enum value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value.toString());
        editor.commit();
    }

    public static FlashEnum3 getDefaultsca24p(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String zwrot3 = preferences.getString(key, "");
        return FlashEnum3.toMyEnum(zwrot3);
    }
}

