package com.example.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Album {
    //aggiungi riga

    private String titolo;
    private int annoPubblicazione;
    private GenereMusicale genere;
    private String copertina; //percorso testuale dell'immagine di copertina
    private Artista artista;
    private final List<Brano> brani;

    public Album(String titolo, int annoPubblicazione, GenereMusicale genere, String copertina, Artista artista){
        setTitolo(titolo);
        setAnnoPubblicazione(annoPubblicazione);
        setGenere(genere);
        setCopertina(copertina);
        setArtista(artista);
        this.brani = new ArrayList<>();
    }

    public Album(String titolo, int annoPubblicazione, GenereMusicale genere, String copertina, Artista artista, List<Brano> brani){
        this(titolo, annoPubblicazione, genere, copertina, artista);
        if(brani != null){
            for(Brano corrente: brani){
                if(corrente != null){
                    aggiungiBrano(brano);
                }
            }
        }
    }

    public String getTitolo(){
        return titolo;
    }

    public void setTitolo(String titolo){
        If(titolo == null || titolo.trim().isEmpty()){
            throw 
        }
        this.titolo = titolo.trim();
    }

    public int getAnnoPubblicazione(){

    }


}
