package com.example.model;

public enum GenereMusicale {
    POP("Pop"),
    HIP_HOP("Hip-Hop"),
    RAP("Rap"),
    INDIE("Indie"),
    ROCK("Rock"),
    METAL("Metal"),
    CLASSICA("Classica"),
    JAZZ("Jazz"),
    BLUES("Blues"),
    SOUL("Soul"),
    AMBIENT("Ambient"),
    ELETTRONICA("Elettronica");

    private final String nomeVisualizzato;

    GenereMusicale(String nomeVisualizzato){
        this.nomeVisualizzato = nomeVisualizzato;
    }

    public String getNomeVisualizzato(){
        return nomeVisualizzato;
    }

    //metodo per conversione stringa
    public static GenereMusicale daStringa(String testo){
        if(testo == null || testo.isBlank()){  //oppure trim().isEmpty()
            throw new IllegalArgumentException("il genere musicale non può essere nullo o vuoto");
        }
        //continua
    }

    public String toString(){
        return nomeVisualizzato;
    }

}
