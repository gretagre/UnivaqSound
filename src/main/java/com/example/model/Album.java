package com.example.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.example.model.interfacce.Ricercabile;

public class Album implements Ricercabile, Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer id;
    private String titolo;
    private int annoPubblicazione;
    private GenereMusicale genere;
    private String copertina; //percorso testuale dell'immagine di copertina
    private Artista artista;
    private List<Brano> brani;

    public Album() {
        this.brani = new ArrayList<>();
    }

    public Album(String titolo, int annoPubblicazione, GenereMusicale genere, String copertina, Artista artista) {
        this(null, titolo, annoPubblicazione, genere, copertina, artista);
    }

    public Album(Integer id, String titolo, int annoPubblicazione, GenereMusicale genere, String copertina, Artista artista) {
        this.id = id;
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.genere = genere;
        this.copertina = copertina;
        this.artista = artista;
        this.brani = new ArrayList<>();
    }

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public void setAnnoPubblicazione(int annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    public GenereMusicale getGenere() {
        return genere;
    }

    public void setGenere(GenereMusicale genere) {
        this.genere = genere;
    }

    public String getCopertina() {
        return copertina;
    }

    public void setCopertina(String copertina) { //campo opzionale
        this.copertina = copertina;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public List<Brano> getBrani() {
        return brani;
    }

    public void setBrani(List<Brano> brani) {
        this.brani = brani;
    }

    @Override 
    public boolean corrisponde(String query) {
        if(query == null || query.isBlank() || titolo == null){
            return false;
        }
        return titolo.toLowerCase().contains(query.trim().toLowerCase());
    }
}