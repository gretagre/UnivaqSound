package com.example.model;

public class ArtistaSolista extends Artista {

    private static final long serialVersionUID = 1L;

    private String nomeReale;
    private String cognomeReale;


    public ArtistaSolista() {
        super();
    }

    public ArtistaSolista(String nomeArte, String biografia, GenereMusicale generePrincipale, String nomeReale, String cognomeReale) {
        super(nomeArte, biografia, generePrincipale);
        this.nomeReale = nomeReale;
        this.cognomeReale = cognomeReale;
    }


    public String getNomeReale() {
        return nomeReale;
    }

    public void setNomeReale(String nomeReale) {
        this.nomeReale = nomeReale;
    }

    public String getCognomeReale() {
        return cognomeReale;
    }

    public void setCognomeReale(String cognomeReale) {
        this.cognomeReale = cognomeReale;
    }
}