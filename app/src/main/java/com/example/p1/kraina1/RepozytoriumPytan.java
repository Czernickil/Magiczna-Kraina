package com.example.p1.kraina1;

import android.app.Application;
import android.os.AsyncTask;

import java.util.List;
import java.util.Random;

public class RepozytoriumPytan {
    public static boolean nowaBaza;
    private PytanieDAO pPytanieDAO;
    private List<Pytanie> pWszystkiePytania;
    private List<Pytanie> wyselekcjonowanePytania;
    int iloscPytan;
    int losowa;
    Pytanie nowePytanie;
    int licznik;
    String tresc, odp;

    RepozytoriumPytan(Application application) {
        BazaDanychPytan db = BazaDanychPytan.getDatabase(application);
        pPytanieDAO = db.pytanieDAO();
        pWszystkiePytania = pPytanieDAO.pozyskajWszystkiePytania();
        licznik=0;
        if (nowaBaza) {
            for (int i = 0; i < 7; i++) {
                nowePytanie = new Pytanie(licznik, PytanieTesktowe.getPytpol1(i, 0), PytanieTesktowe.getPytpol1(i, 1), PytanieTesktowe.getPytpol1(i, 2), PytanieTesktowe.getPytpol1(i, 3), PytanieTesktowe.getPytpol1(i, 4), PytanieTesktowe.getPytpol1(i, 6), "NIE", 1, "Polski");
                pPytanieDAO.insert(nowePytanie);
                licznik++;
            }
            for (int i = 0; i < 7; i++) {
                nowePytanie = new Pytanie(licznik, PytanieTesktowe.getPytpol2(i, 0), PytanieTesktowe.getPytpol2(i, 1), PytanieTesktowe.getPytpol2(i, 2), PytanieTesktowe.getPytpol2(i, 3), PytanieTesktowe.getPytpol2(i, 4), PytanieTesktowe.getPytpol2(i, 6), "NIE", 2, "Polski");
                pPytanieDAO.insert(nowePytanie);
                licznik++;
            }
            for (int i = 0; i < 7; i++) {
                nowePytanie = new Pytanie(licznik, PytanieTesktowe.getPytpol3(i, 0), PytanieTesktowe.getPytpol3(i, 1), PytanieTesktowe.getPytpol3(i, 2), PytanieTesktowe.getPytpol3(i, 3), PytanieTesktowe.getPytpol3(i, 4), PytanieTesktowe.getPytpol3(i, 6), "NIE", 3, "Polski");
                pPytanieDAO.insert(nowePytanie);
                licznik++;
            }
            for (int i = 0; i < 7; i++) {
                nowePytanie = new Pytanie(licznik, PytanieTesktowe.getPytmat1(i, 0), PytanieTesktowe.getPytmat1(i, 1), PytanieTesktowe.getPytmat1(i, 2), PytanieTesktowe.getPytmat1(i, 3), PytanieTesktowe.getPytmat1(i, 4), PytanieTesktowe.getPytmat1(i, 6), "NIE", 1, "Matematyka");
                pPytanieDAO.insert(nowePytanie);
                licznik++;
            }
            for (int i = 0; i < 7; i++) {
                nowePytanie = new Pytanie(licznik, PytanieTesktowe.getPytmat2(i, 0), PytanieTesktowe.getPytmat2(i, 1), PytanieTesktowe.getPytmat2(i, 2), PytanieTesktowe.getPytmat2(i, 3), PytanieTesktowe.getPytmat2(i, 4), PytanieTesktowe.getPytmat2(i, 6), "NIE", 2, "Matematyka");
                pPytanieDAO.insert(nowePytanie);
                licznik++;
            }
            for (int i = 0; i < 7; i++) {
                nowePytanie = new Pytanie(licznik, PytanieTesktowe.getPytmat3(i, 0), PytanieTesktowe.getPytmat3(i, 1), PytanieTesktowe.getPytmat3(i, 2), PytanieTesktowe.getPytmat3(i, 3), PytanieTesktowe.getPytmat3(i, 4), PytanieTesktowe.getPytmat3(i, 6), "NIE", 3, "Matematyka");
                pPytanieDAO.insert(nowePytanie);
                licznik++;
            }
            for (int i = 0; i < 7; i++) {
                nowePytanie = new Pytanie(licznik, PytanieTesktowe.getPytprz1(i, 0), PytanieTesktowe.getPytprz1(i, 1), PytanieTesktowe.getPytprz1(i, 2), PytanieTesktowe.getPytprz1(i, 3), PytanieTesktowe.getPytprz1(i, 4), PytanieTesktowe.getPytprz1(i, 6), "NIE", 1, "Przyroda");
                pPytanieDAO.insert(nowePytanie);
                licznik++;
            }
            for (int i = 0; i < 7; i++) {
                nowePytanie = new Pytanie(licznik, PytanieTesktowe.getPytprz2(i, 0), PytanieTesktowe.getPytprz2(i, 1), PytanieTesktowe.getPytprz2(i, 2), PytanieTesktowe.getPytprz2(i, 3), PytanieTesktowe.getPytprz2(i, 4), PytanieTesktowe.getPytprz2(i, 6), "NIE", 2, "Przyroda");
                pPytanieDAO.insert(nowePytanie);
                licznik++;
            }
            for (int i = 0; i < 7; i++) {
                nowePytanie = new Pytanie(licznik, PytanieTesktowe.getPytprz3(i, 0), PytanieTesktowe.getPytprz3(i, 1), PytanieTesktowe.getPytprz3(i, 2), PytanieTesktowe.getPytprz3(i, 3), PytanieTesktowe.getPytprz3(i, 4), PytanieTesktowe.getPytprz3(i, 6), "NIE", 3, "Przyroda");
                pPytanieDAO.insert(nowePytanie);
                licznik++;
            }
            for (int i = 0; i < 7; i++) {
                nowePytanie = new Pytanie(licznik, PytanieTesktowe.getPytzyc1(i, 0), PytanieTesktowe.getPytzyc1(i, 1), PytanieTesktowe.getPytzyc1(i, 2), PytanieTesktowe.getPytzyc1(i, 3), PytanieTesktowe.getPytzyc1(i, 4), PytanieTesktowe.getPytzyc1(i, 6), "NIE", 1, "Zycie");
                pPytanieDAO.insert(nowePytanie);
                licznik++;
            }
            for (int i = 0; i < 7; i++) {
                nowePytanie = new Pytanie(licznik, PytanieTesktowe.getPytzyc2(i, 0), PytanieTesktowe.getPytzyc2(i, 1), PytanieTesktowe.getPytzyc2(i, 2), PytanieTesktowe.getPytzyc2(i, 3), PytanieTesktowe.getPytzyc2(i, 4), PytanieTesktowe.getPytzyc2(i, 6), "NIE", 2, "Zycie");
                pPytanieDAO.insert(nowePytanie);
                licznik++;
            }
            for (int i = 0; i < 7; i++) {
                nowePytanie = new Pytanie(licznik, PytanieTesktowe.getPytzyc3(i, 0), PytanieTesktowe.getPytzyc3(i, 1), PytanieTesktowe.getPytzyc3(i, 2), PytanieTesktowe.getPytzyc3(i, 3), PytanieTesktowe.getPytzyc3(i, 4), PytanieTesktowe.getPytzyc3(i, 6), "NIE", 3, "Zycie");
                pPytanieDAO.insert(nowePytanie);
                licznik++;
            }
            nowaBaza = false;
        }
    }

    List<Pytanie> pozyskajWszystkiePytania() {
        return pWszystkiePytania;
    }

    Pytanie pozyskajPytaniaWedlugKategoriiPunktow(String kategoria, int punkty) {
        wyselekcjonowanePytania = pPytanieDAO.pozyskajPytaniaWedlugKategoriiPunktow(kategoria, punkty);
        Random rand = new Random();
        iloscPytan = wyselekcjonowanePytania.size();
        losowa = rand.nextInt(iloscPytan);
        Pytanie zwroconePytanie = wyselekcjonowanePytania.get(losowa);
        tresc = zwroconePytanie.getPTrescPytania();
        odp = zwroconePytanie.getPPoprawnaOdpowiedz();
        pPytanieDAO.pytanieUzyte(tresc, odp);
        return zwroconePytanie;

    }

    public void insert(Pytanie pytanie) {
        new insertAsyncTask(pPytanieDAO).execute(pytanie);
    }

    private static class insertAsyncTask extends AsyncTask<Pytanie, Void, Void> {

        private PytanieDAO mAsyncTaskDao;

        insertAsyncTask(PytanieDAO dao) {
            mAsyncTaskDao = dao;
        }

        @Override
        protected Void doInBackground(final Pytanie... params) {
            mAsyncTaskDao.insert(params[0]);
            return null;
        }
    }
}