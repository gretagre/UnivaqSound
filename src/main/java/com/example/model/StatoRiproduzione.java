package com.example.model;

public enum StatoRiproduzione {
    PLAY("In riproduzione"),
    PAUSE("In pausa"),
    STOP("Fermo");

    private final String descrizione;

    StatoRiproduzione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDescrizione() {
        return descrizione;
    }
}