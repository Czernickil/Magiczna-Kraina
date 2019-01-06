package com.example.p1.kraina1;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

@Database(entities = {Pytanie.class}, version = 1)
public abstract class BazaDanychPytan extends RoomDatabase {

    public abstract PytanieDAO pytanieDAO();

    private static volatile BazaDanychPytan INSTANCE;

    static BazaDanychPytan getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (BazaDanychPytan.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            BazaDanychPytan.class, "baza_pytan")
                            .allowMainThreadQueries()
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}