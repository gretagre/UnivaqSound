package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class Album {
    
    private Integer id;
    private String titolo;
    private int annoPubblicazione;
    private GenereMusicale genere;
    private String copertina; //percorso testuale dell'immagine di copertina
    private Artista artista;
    private List<Brano> brani = new ArrayList<>();

    
    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getTitolo(){
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getAnnoPubblicazione(){
        return annoPubblicazione;
    }

    public void setAnnoPubblicazione(int annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    public GenereMusicale getGenere(){
        return genere;
    }

    public void setGenere(GenereMusicale genere) {
        this.genere = genere;
    }

    public String getCopertina(){
        return copertina;
    }

    public void setCopertina(String copertina){ //campo opzionale
        this.coprtina = copertina;
    }

    public Artista getArtista(){
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public List<Brano> getBrani(){
        return brani;
    }
}