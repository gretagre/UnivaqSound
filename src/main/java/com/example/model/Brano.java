package com.example.model;

import java.io.Serializable; //?
import java.util.Objects;

public class Brano {
    //vedi

    private String titolo;
    private int durata;
    private String testo;
    private GenereMusicale genere;
    private Album album;
    private int numeroAscolti;

    private boolean inRiproduzione; //vedi

    public Brano(String titolo, int durata, String testo, GenereMusicale genere, Album album){
        setTitolo(titolo);
        setDurata(durata);
        setTesto(testo);
        setGenere(genere);
        setAlbum(album);
        this.numeroAscolti = 0;
        this.inRiproduzione = false;
    }

    //costruttore alternativo per brani senza testo
    
    
}
