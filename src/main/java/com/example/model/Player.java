package com.example.model;
public class Player {
    private CodaRiproduzione coda;
    private StatoRiproduzione stato;
    private int secondiAvanzamento;

    public Player(CodaRiproduzione coda, StatoRiproduzione stato, int secondiAvanzamento) {
        this.coda = coda;
        this.stato = stato;
        this.secondiAvanzamento = secondiAvanzamento;
    }
    
    public CodaRiproduzione getCoda() {
        return coda;
    }
    public void setCoda(CodaRiproduzione coda) {
        this.coda = coda;
    }
    public StatoRiproduzione getStato() {
        return stato;
    }
    public void setStato(StatoRiproduzione stato) {
        this.stato = stato;
    }
    public int getSecondiAvanzamento() {
        return secondiAvanzamento;
    }
    public void setSecondiAvanzamento(int secondiAvanzamento) {
        this.secondiAvanzamento = secondiAvanzamento;
    }
}
