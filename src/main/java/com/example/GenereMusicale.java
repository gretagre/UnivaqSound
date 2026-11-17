package com.example;

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

    //vedi
    private final String nomeVisualizzato;

    GenereMusicale(String nomeVisualizzato){
        this.nomeVisualizzato = nomeVisualizzato;
    }

    //altro

}
