package com.example.p1.kraina1;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "tabela_pytan")
public class Pytanie {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "idPytania")
    private int pIdPytania=0;
    @ColumnInfo(name = "trescPytania")
    private String pTrescPytania;
    @ColumnInfo(name = "odpowiedzA")
    private String pOdpowiedzA;
    @ColumnInfo(name = "odpowiedzB")
    private String pOdpowiedzB;
    @ColumnInfo(name = "odpowiedzC")
    private String pOdpowiedzC;
    @ColumnInfo(name = "odpowiedzD")
    private String pOdpowiedzD;
    @ColumnInfo(name = "poprawnaOdpowiedz")
    private String pPoprawnaOdpowiedz;
    @ColumnInfo(name = "czyUzyteWGrze")
    private String pCzyUzyteWGrze;
    @ColumnInfo(name = "wartoscPunktowa")
    private int pWartoscPunktowa;
    @ColumnInfo(name = "kategoriaPytania")
    private String pKategoriaPytania;
public  Pytanie(){};
    public Pytanie(int PidPytania,String PtrescPytania, String PodpowiedzA, String PodpowiedzB, String PodpowiedzC, String PodpowiedzD,
                   String PpoprawnaOdpowiedz, String PczyUzyteWGrze, int PwartoscPunktowa, String PkategoriaPytania) {
        this.pIdPytania=PidPytania;
        this.pTrescPytania = PtrescPytania;
        this.pOdpowiedzA =PodpowiedzA;
        this.pOdpowiedzB =PodpowiedzB;
        this.pOdpowiedzC =PodpowiedzC;
        this.pOdpowiedzD =PodpowiedzD;
        this.pPoprawnaOdpowiedz =PpoprawnaOdpowiedz;
        this.pCzyUzyteWGrze =PczyUzyteWGrze;
        this.pWartoscPunktowa =PwartoscPunktowa;
        this.pKategoriaPytania =PkategoriaPytania;
    }
    public int getPIdPytania(){return this.pIdPytania;}
    public String getPTrescPytania(){return this.pTrescPytania;}
    public String getPOdpowiedzA(){return this.pOdpowiedzA;}
    public String getPOdpowiedzB(){return this.pOdpowiedzB;}
    public String getPOdpowiedzC(){return this.pOdpowiedzC;}
    public String getPOdpowiedzD(){return this.pOdpowiedzD;}
    public String getPPoprawnaOdpowiedz(){return this.pPoprawnaOdpowiedz;}
    public String getPCzyUzyteWGrze(){return this.pCzyUzyteWGrze;}
    public int getPWartoscPunktowa(){return this.pWartoscPunktowa;}
    public String getPKategoriaPytania(){return this.pKategoriaPytania;}

    public void setPIdPytania(int id){this.pIdPytania=id;}
    public void setPTrescPytania(String tresc){this.pTrescPytania=tresc;}
    public void setPOdpowiedzA(String odpA){this.pOdpowiedzA=odpA;}
    public void setPOdpowiedzB(String odpB){this.pOdpowiedzB=odpB;}
    public void setPOdpowiedzC(String odpC){this.pOdpowiedzC=odpC;}
    public void setPOdpowiedzD(String odpD){this.pOdpowiedzD=odpD;}
    public void setPPoprawnaOdpowiedz(String popodp){this.pPoprawnaOdpowiedz=popodp;}
    public void setPCzyUzyteWGrze(String czyuz){this.pCzyUzyteWGrze=czyuz;}
    public void setPWartoscPunktowa(int war){this.pWartoscPunktowa=war;}
    public void setPKategoriaPytania(String kat){this.pKategoriaPytania=kat;}
}