package com.example.p1.kraina1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import static com.example.p1.kraina1.FlashButton.FlashEnum.OFF;
import static com.example.p1.kraina1.FlashButton.FlashEnum.ON;
import static com.example.p1.kraina1.MainActivity.idskrzat;
import static com.example.p1.kraina1.MainActivity.setDefaults24;
import static com.example.p1.kraina1.MainActivity.setDefaults27;
import static com.example.p1.kraina1.MainActivity.setDefaults28;
import static com.example.p1.kraina1.MainActivity.setDefaults34;
import static com.example.p1.kraina1.MainActivity.setDefaults37;
import static com.example.p1.kraina1.MainActivity.setDefaults38;
import static com.example.p1.kraina1.MainActivity.setDefaults4;
import static com.example.p1.kraina1.MainActivity.setDefaults44;
import static com.example.p1.kraina1.MainActivity.setDefaults47;
import static com.example.p1.kraina1.MainActivity.setDefaults48;
import static com.example.p1.kraina1.MainActivity.setDefaults54;
import static com.example.p1.kraina1.MainActivity.setDefaults57;
import static com.example.p1.kraina1.MainActivity.setDefaults58;
import static com.example.p1.kraina1.MainActivity.setDefaults64;
import static com.example.p1.kraina1.MainActivity.setDefaults67;
import static com.example.p1.kraina1.MainActivity.setDefaults68;
import static com.example.p1.kraina1.MainActivity.setDefaults7;
import static com.example.p1.kraina1.MainActivity.setDefaults8;
import static com.example.p1.kraina1.MainActivity.setsbtn1;
import static com.example.p1.kraina1.MainActivity.setsbtn2;
import static com.example.p1.kraina1.MainActivityc.idskrzatc;
import static com.example.p1.kraina1.MainActivityc.setDefaultsc24;
import static com.example.p1.kraina1.MainActivityc.setDefaultsc27;
import static com.example.p1.kraina1.MainActivityc.setDefaultsc28;
import static com.example.p1.kraina1.MainActivityc.setDefaultsc34;
import static com.example.p1.kraina1.MainActivityc.setDefaultsc37;
import static com.example.p1.kraina1.MainActivityc.setDefaultsc38;
import static com.example.p1.kraina1.MainActivityc.setDefaultsc4;
import static com.example.p1.kraina1.MainActivityc.setDefaultsc44;
import static com.example.p1.kraina1.MainActivityc.setDefaultsc47;
import static com.example.p1.kraina1.MainActivityc.setDefaultsc48;
import static com.example.p1.kraina1.MainActivityc.setDefaultsc54;
import static com.example.p1.kraina1.MainActivityc.setDefaultsc57;
import static com.example.p1.kraina1.MainActivityc.setDefaultsc58;
import static com.example.p1.kraina1.MainActivityc.setDefaultsc64;
import static com.example.p1.kraina1.MainActivityc.setDefaultsc67;
import static com.example.p1.kraina1.MainActivityc.setDefaultsc68;
import static com.example.p1.kraina1.MainActivityc.setDefaultsc7;
import static com.example.p1.kraina1.MainActivityc.setDefaultsc8;
import static com.example.p1.kraina1.MainActivityc.setsbtncc1;
import static com.example.p1.kraina1.MainActivityc.setsbtncc2;
import static com.example.p1.kraina1.Menu.kon;
import static com.example.p1.kraina1.pytzab.g;

public class zlec extends AppCompatActivity {    public void onStart(){         super.onStart(); Menu.wyl=0;}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(g==0)
            setContentView(R.layout.activity_zle);
        if(g==1){
            g=0;
            setContentView(R.layout.activity_zlezab);
        }
        switch (idskrzatc){
            case("skrzat4"):
                setDefaults4("etatToggle4", ON, this);
                idskrzat="";
                break;
            case("skrzat7"):
                setDefaults7("etatToggle7", ON, this);
                idskrzat="";
                break;
            case("skrzat8"):
                setDefaults8("etatToggle8", ON, this);
                idskrzat="";
                break;
            case("skrzat24"):
                setDefaults24("etatToggle24", ON, this);
                idskrzat="";
                break;
            case("skrzat27"):
                setDefaults27("etatToggle27", ON, this);
                idskrzat="";
                break;
            case("skrzat28"):
                setDefaults28("etatToggle28", ON, this);
                idskrzat="";
                break;
            case("skrzat34"):
                setDefaults34("etatToggle34", ON, this);
                idskrzat="";
                break;
            case("skrzat37"):
                setDefaults37("etatToggle37", ON, this);
                idskrzat="";
                break;
            case("skrzat38"):
                setDefaults38("etatToggle38", ON, this);
                idskrzat="";
                break;
            case("skrzat44"):
                setDefaults44("etatToggle44", ON, this);
                idskrzat="";
                break;
            case("skrzat47"):
                setDefaults47("etatToggle47", ON, this);
                idskrzat="";
                break;
            case("skrzat48"):
                setDefaults48("etatToggle48", ON, this);
                idskrzat="";
                break;
            case("skrzat54"):
                setDefaults54("etatToggle54", ON, this);
                idskrzat="";
                break;
            case("skrzat57"):
                setDefaults57("etatToggle57", ON, this);
                idskrzat="";
                break;
            case("skrzat58"):
                setDefaults58("etatToggle58", ON, this);
                idskrzat="";
                break;
            case("skrzat64"):
                setDefaults64("etatToggle64", ON, this);
                idskrzat="";
                break;
            case("skrzat67"):
                setDefaults67("etatToggle67", ON, this);
                idskrzat="";
                break;
            case("skrzat68"):
                setDefaults68("etatToggle68", ON, this);
                idskrzat="";
                break;
            case("skrzatbtn1"):
                setsbtn1("sbtn1", ON, this);
                idskrzat="";
                break;
            case("skrzatbtn2"):
                setsbtn2("sbtn2", ON, this);
                idskrzat="";
                break;
            case("skrzatc4"):
                setDefaultsc4("etatTogglec4", OFF, this);
                idskrzatc="";
                break;
            case("skrzatc7"):
                setDefaultsc7("etatTogglec7", OFF, this);
                idskrzatc="";
                break;
            case("skrzatc8"):
                setDefaultsc8("etatTogglec8", OFF, this);
                idskrzatc="";
                break;
            case("skrzatc24"):
                setDefaultsc24("etatTogglec24", OFF, this);
                idskrzatc="";
                break;
            case("skrzatc27"):
                setDefaultsc27("etatTogglec27", OFF, this);
                idskrzatc="";
                break;
            case("skrzatc28"):
                setDefaultsc28("etatTogglec28", OFF, this);
                idskrzatc="";
                break;
            case("skrzatc34"):
                setDefaultsc34("etatTogglec34", OFF, this);
                idskrzatc="";
                break;
            case("skrzatc37"):
                setDefaultsc37("etatTogglec37", OFF, this);
                idskrzatc="";
                break;
            case("skrzatc38"):
                setDefaultsc38("etatTogglec38", OFF, this);
                idskrzatc="";
                break;
            case("skrzatc44"):
                setDefaultsc44("etatTogglec44", OFF, this);
                idskrzatc="";
                break;
            case("skrzatc47"):
                setDefaultsc47("etatTogglec47", OFF, this);
                idskrzatc="";
                break;
            case("skrzatc48"):
                setDefaultsc48("etatTogglec48", OFF, this);
                idskrzatc="";
                break;
            case("skrzatc54"):
                setDefaultsc54("etatTogglec54", OFF, this);
                idskrzatc="";
                break;
            case("skrzatc57"):
                setDefaultsc57("etatTogglec57", OFF, this);
                idskrzatc="";
                break;
            case("skrzatc58"):
                setDefaultsc58("etatTogglec58", OFF, this);
                idskrzatc="";
                break;
            case("skrzatc64"):
                setDefaultsc64("etatTogglec64", OFF, this);
                idskrzatc="";
                break;
            case("skrzatc67"):
                setDefaultsc67("etatTogglec67", OFF, this);
                idskrzatc="";
                break;
            case("skrzatc68"):
                setDefaultsc68("etatTogglec68", OFF, this);
                idskrzatc="";
                break;
            case("skrzatcbtn1"):
                setsbtncc1("sbtncc1", OFF, this);
                idskrzatc="";
                break;
            case("skrzatcbtn2"):
                setsbtncc2("sbtncc2", OFF, this);
                idskrzatc="";
                break;

        }

    }
    void kill_activity()
    {
        finish();
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
        Intent intent = new Intent(zlec.this, MainActivity.class);
        Menu.wyl=1; startActivity(intent);
    }
}
