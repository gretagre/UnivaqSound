package com.example.model;

public enum GenereMusicale {
    POP("Pop"),
    HIP_HOP("Hip-Hop"),
    RAP("Rap"),
    INDIE("Indie"),
    ROCK("Rock"),
    METAL("Metal"),
    CLASSICA("Classica"),
    JAZZ("Jazz"),
    BLUES("Blues"),
    SOUL("Soul"),
    AMBIENT("Ambient"),
    ELETTRONICA("Elettronica");

    private final String descrizione;

    GenereMusicale(String descrizione){
        this.descrizione = descrizione;
    }

    public String getDescrizione(){
        return descrizione;
    }
}
