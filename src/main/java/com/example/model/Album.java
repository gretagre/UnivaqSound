package com.example.model;

import com.example.exception.DatiNonValidiException;
import com.example.exception.DuplicatoException;
import com.example.exception.ElementoNonTrovatoException;
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


    public Album(String titolo, int annoPubblicazione, GenereMusicale genere, String copertina, Artista artista) throws DatiNonValidiException {
        setTitolo(titolo);
        setAnnoPubblicazione(annoPubblicazione);
        setGenere(genere);
        setCopertina(copertina);
        setArtista(artista);
        this.brani = new ArrayList<>();
    }

    public Album(String titolo, int annoPubblicazione, GenereMusicale genere, String copertina, Artista artista, List<Brano> brani) throws DatiNonValidiException, DuplicatoException {
        this(titolo, annoPubblicazione, genere, copertina, artista);
        if(brani != null){
            for(Brano corrente: brani){
                if(corrente != null){
                    aggiungiBrano(brano);
                }
            }
        }
    }


    //getters e setters

    public String getTitolo(){
        return titolo;
    }

    public void setTitolo(String titolo) throws DatiNonValidiException {
        if(titolo == null || titolo.trim().isEmpty()){
            throw new DatiNonValidiException("Il titolo dell'album non può essere nullo o vuoto");
        }
        this.titolo = titolo.trim();
    }


    public int getAnnoPubblicazione(){
        return annoPubblicazione;
    }

    public void setAnnoPubblicazione(int annoPubblicazione) throws DatiNonValidiException {
        if(annoPubblicazione <= 0){
            throw new DatiNonValidiException("L'anno di pubblicazione deve essere un numero positivo");
        }
        this.annoPubblicazione = annoPubblicazione;
    }

    public GenereMusicale getGenere(){
        return genere;
    }

    public void setGenere(GenereMusicale genere) throws DatiNonValidiException {
        if(genere == null){
            throw new DatiNonValidiException("Il genere musicale non può essere nullo");
        }
        this.genere = genere;
    }

    public String getCopertina(){
        return copertina;
    }

    public void setCopertina(String copertina){ //campo opzionale
        if(copertina != null){
            this.copertina = copertina.trim();
        }
        else{
            this.copertina = "";
        }
    }

    public Artista getArtista(){
        return artista;
    }

    public void setArtista(Artista artista) throws DatiNonValidiException {
        if(artista == null){
            throw new DatiNonValidiException("Ogni album deve essere associato a un artista");
        }
        this.artista = artista;
    }

    public List<Brano> getBrani(){
        return Collections.unmodifiableList(brani);
    }


    // gestione dei brani

    public void aggiungiBrano(Brano brano) throws DatiNonValidiException, DuplicatoException {
        if(brano == null){
            throw new DatiNonValidiException("Il brano non può essere null");
        }
        if(this.brani.contains(brano)){
            throw new DuplicatoException("Il brano è già presente nell'album");
        }
        this.brani.add(brano);
    }

    public void rimuoviBrano(Brano brano) throws DatiNonValidiException, ElementoNonTrovatoException{
        if(brano == null){
            throw new DatiNonValidiException("Il brano non può essere null");
        }
        if(!this.brani.remove(brano)){
            throw new ElementoNonTrovatoException("Il brano non è presente nell'album");
        }
    }

    public int getNumeroBrani(){
        return this.brani.size();
    }

    public int getDurataTotale(){}


    @Override 
    
}
