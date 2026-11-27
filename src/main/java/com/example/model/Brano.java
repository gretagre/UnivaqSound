package com.example.model;

import java.io.Serializable;

import com.example.model.interfacce.Ricercabile;
import com.example.model.interfacce.Riproducibile;

public class Brano implements Ricercabile, Riproducibile, Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String titolo;
    private int durata;
    private String testo;
    private GenereMusicale genere;
    private Album album;
    private int numeroAscolti;

    public Brano() {
        this.numeroAscolti = 0;
    }

    public Brano(String titolo, int durata, String testo, GenereMusicale genere, Album album) {
        this(null, titolo, durata, testo, genere, album, 0);
    }

    public Brano(Integer id, String titolo, int durata, String testo, GenereMusicale genere, Album album, int numeroAscolti) {
        this.id = id;
        this.titolo = titolo;
        this.durata = durata;
        this.testo = testo;
        this.genere = genere;
        this.album = album;
        this.numeroAscolti = numeroAscolti;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override 
    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    @Override
    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }

    public GenereMusicale getGenere() {
        return genere;
    }

    public void setGenere(GenereMusicale genere) {
        this.genere = genere;
    }

    public Album getAlbum() {
        return album;
    }
    
    public void setAlbum(Album album) {
        this.album = album;
    }

    public int getNumeroAscolti() {
        return numeroAscolti;
    }

    public void setNumeroAscolti(int numeroAscolti) {
        this.numeroAscolti = numeroAscolti;
    }

    @Override 
    public boolean corrisponde(String query) {
        if (query == null || query.isBlank() || titolo == null) {
            return false;
        }
        return titolo.toLowerCase().contains(query.trim().toLowerCase());
    }
}