package com.example.model;

import java.time.LocalDate;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import com.example.exception.DatiNonValidiException;
import com.example.exception.DuplicatoException;
import com.example.exception.ElementoNonTrovatoException;

public class Utente {
    private String nome;
    private String cognome;
    private String email;
    private LocalDate dataDiNascita;
    private final Set<GenereMusicale> preferenzeMusicali;

    public Utente (String nome, String cognome, String email, LocalDate dataDiNascita) {
    this.nome = nome ;
    this.cognome = cognome ;
    this.email = email ;
    this.dataDiNascita = dataDiNascita ;
    this.preferenzeMusicali = new HashSet<>();
    }

    /* metodi get */
    public String getNome () {
        return nome;
    }

    public String getCognome () {
        return cognome;
    }

    public String getEmail () {
        return email;
    }

    public LocalDate getDataDiNascita () {
        return dataDiNascita;
    }

    public Set<GenereMusicale> getPreferenzeMusicali () {
        return Collections.unmodifiableSet(preferenzeMusicali); /* in sola lettura */
    }

    /* metodi set */
    public void setNome (String nome) {
        this.nome = nome;
    }

    public void setCognome (String cognome) {
        this.cognome = cognome;
    }

    public void  setEmail (String email) {
        this.email = email;
    }

    public void setDataDiNascita (LocalDate dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public void aggiungiPreferenza (GenereMusicale genere) throws DatiNonValidiException, DuplicatoException {
        if (genere == null) {
            throw new DatiNonValidiException("Il genere musicale non può essere nullo.");
        }
        if(!preferenzeMusicali.add(genere)) {
            throw new DuplicatoException("Il genere " + genere + " è già nelle preferenze.");
        }
    }

    public void rimuoviPreferenza (GenereMusicale genere) throws DatiNonValidiException, ElementoNonTrovatoException {
        if (genere == null) {
            throw new DatiNonValidiException("Il genere musicale non può essere nullo.");
        }
        if(!preferenzeMusicali.remove(genere)) {
            throw new ElementoNonTrovatoException("Il genere " + genere + " non è nelle preferenze.");
        }
    }

    /**   
     * per verificare quando due oggetti di tipo Utente rappresentano la stessa persona (hanno la stessa email)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object o) {
        if (this==o) return true;
        if (!(o instanceof Utente)) return false;
        Utente utente = (Utente) o;
        return Objects.equals(email, utente.email);
    }

    /** 
     * restituisce il codice hash dell'indirizzo email dell'utente
     * @see java.lang.Object#hashCode()
     */
    @Override 
    public int hashCode () {
        return Objects.hash(email);
    }

    @Override 
    public String toString () {
        return nome + " " + cognome + " " + email ;
    }
}