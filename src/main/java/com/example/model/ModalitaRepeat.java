package com.example.model;

public enum ModalitaRepeat {
    OFF("Disattivato"),
    REPEAT_ONE("Ripeti brano"),
    REPEAT_ALL("Ripeti coda");

    private final String descrizione;

    ModalitaRepeat(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDescrizione() {
        return descrizione;
    }
}
