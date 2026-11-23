package com.example.model;

import java.util.ArrayList;
import java.util.List;
import com.example.interfacce.Ricercabile;

public abstract class Artista implements Ricercabile {
    
    private Integer id;
    private String nomeArte;
    private String biografia;
    private GenereMusicale generePrincipale;
    private List<Album> discografia = new ArrayList<>();

    public Integer getId(){
        return id;
    }
    
    public void setId(Integer id){
        this.id = id;
    }

    public String getNomeArte(){
        return nomeArte;
    }

    public void setNomeArte(String nomeArte){
        this.nomeArte = nomeArte;
    }

    public String getBiografia(){
        return biografia;
    }

    public void setBiografia(String biografia){
        this.biografia = biografia;
    }

    public GenereMusicale getGenerePrincipale(){
        return generePrincipale;
    }

    public void setGenerePrincipale(GenereMusicale generePrincipale){
        this.generePrincipale = generePrincipale;
    }

    public List<Album> getDiscografia(){
        return discografia;
    }

    public void setDiscografia(List<Album> discografia){
        this.discografia = discografia;
    }

    @Override 
    public boolean corrisponde(String query){
        if (query == null || query.isBlank() || nomeArte == null){
            return false;
        }
        return nomeArte.toLowerCase().contains(query.trim().toLowerCase());
    }
}

