package com.example.model;

import java.util.List;
import java.util.ArrayList;

public class ArtistaGruppo extends Artista {

    private List<Artista> componenti = new ArrayList<>();


    public List<Artista> getComponenti(){
        return componenti;
    }

    public void setComponenti(List<Artista> componenti){
        this.componenti = componenti;
    }
}