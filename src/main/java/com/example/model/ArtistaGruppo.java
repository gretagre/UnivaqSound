package com.example.model;

import java.util.List;
import java.util.ArrayList;

public class ArtistaGruppo extends Artista {

    private static final long serialVersionUID = 1L;

    private List<Artista> componenti;


    public ArtistaGruppo() {
        super();
        this.componenti = new ArrayList<>();
    }

    public ArtistaGruppo(String nomeArte, String biografia, GenereMusicale generePrincipale) {
        super(nomeArte, biografia, generePrincipale);
        this.componenti = new ArrayList<>();
    }

    public List<Artista> getComponenti(){
        return componenti;
    }

    public void setComponenti(List<Artista> componenti){
        this.componenti = componenti;
    }
}