package com.example.p1.kraina1;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface PytanieDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Pytanie pytanie);

    @Query("DELETE FROM tabela_pytan")
    void deleteAll();

    @Query("SELECT * from tabela_pytan ORDER BY idPytania ASC")
    List<Pytanie> pozyskajWszystkiePytania();

    @Query("SELECT * from tabela_pytan Where czyUzyteWGrze ='NIE' AND kategoriaPytania = :kategoria AND wartoscPunktowa=:punkty ORDER BY idPytania ASC")
    List<Pytanie> pozyskajPytaniaWedlugKategoriiPunktow(String kategoria, int punkty);
    @Query("UPDATE tabela_pytan SET czyUzyteWGrze ='TAK' WHERE trescPytania =:tresc AND poprawnaOdpowiedz=:odp")
    void pytanieUzyte(String tresc, String odp);
}
