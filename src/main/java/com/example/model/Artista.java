package com.example.model;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;

public abstract class Artista {
    private String nomeArte;
    private String biografia;
    private GenereMusicale generePrincipale;
    private List<Album> discografia;

    public Artista(String nomeArte, String biografia, GenereMusicale generePrincipale){
        //uso setter per la validazione dei dati (logica di controllo)
        setNomeArte(nomeArte);
        setBiografia(biografia);
        setGenerePrincipale(generePrincipale);
        this.discografia = new ArrayList<>(); //creazione dell'oggetto artista con discografia inizialmente vuota
    }

    public String getNomeArte(){
        return nomeArte;
    }

    public void setNomeArte(){}


    public String getBiografia(){
        return biografia;
    }

    public GenereMusicale getGenerePrincipale(){
        return generePrincipale;
    }

    public List<Album> getDiscografia(){
        //return ecc
    }


}

