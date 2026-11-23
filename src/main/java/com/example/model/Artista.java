package com.example.model;

import java.util.List;

public abstract class Artista {
    
    private Integer id;
    private String nomeArte;
    private String biografia;
    private GenereMusicale generePrincipale;
    private List<Album> discografia;

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

}

