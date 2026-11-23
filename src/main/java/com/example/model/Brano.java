package com.example.model;

public class Brano {

    private Integer id;
    private String titolo;
    private int durata;
    private String testo;
    private GenereMusicale genere;
    private Album album;
    private int numeroAscolti = 0;

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getTitolo(){
        return titolo;
    }

    public void setTitolo(String titolo){
        this.titolo = titolo;
    }

    public int getDurata(){
        return durata;
    }

    public void setDurata(int durata){
        this.durata = durata;
    }

    public String getTesto(){
        return testo;
    }

    public void setTesto(String testo){
        this.testo = testo;
    }

    public GenereMusicale getGenere(){
        return genere;
    }

    public void setGenere(GenereMusicale genere){
        this.genere = genere;
    }

    public Album getAlbum(){
        return album;
    }
    
    public void setAlbum(Album album){
        this.album = album;
    }

    public int getNumeroAscolti(){
        return numeroAscolti;
    }

    public void setNumeroAscolti(int numeroAscolti){
        this.numeroAscolti = numeroAscolti;
    }
}
