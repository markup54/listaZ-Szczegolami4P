package com.example.listaelementow;

public class Miejsca {
    private String miejsce;
    private int idObrazka;

    public static Miejsca miejscaWyswietlane []= new Miejsca[]{
            new Miejsca("Radiostacja",R.drawable.radio),
            new Miejsca("Lotnisko",R.drawable.lotnisko),
            new Miejsca("Zamek",R.drawable.zamek)
    };
    public Miejsca(String miejsce, int idObrazka) {
        this.miejsce = miejsce;
        this.idObrazka = idObrazka;
    }

    public String getMiejsce() {
        return miejsce;
    }

    public void setMiejsce(String miejsce) {
        this.miejsce = miejsce;
    }

    public int getIdObrazka() {
        return idObrazka;
    }

    public void setIdObrazka(int idObrazka) {
        this.idObrazka = idObrazka;
    }
}
