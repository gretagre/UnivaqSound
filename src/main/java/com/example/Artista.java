package com.example;
//da mettere in sotto-package .model
import java.util.List;
//altri import

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

    public String getBiografia(){
        return biografia;
    }

    public GenereMusicale getGenerePrincipale(){
        return generePrincipale;
    }

    public List<Album> getDiscografia(){
        //return ecc
    }

    //metodi setter

}

