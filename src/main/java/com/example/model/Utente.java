package com.example.model;

import java.time.LocalDate;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;

import com.example.exception.DatiNonValidiException;
import com.example.exception.DuplicatoException;
import com.example.exception.ElementoNonTrovatoException;

public class Utente {
    private String nome;
    private String cognome;
    private String email;
    private LocalDate dataDiNascita;
    private final Set<GenereMusicale> preferenzeMusicali;
    private final List<Playlist> listaPlaylist;
    private final CronologiaAscolti cronologia;

    public Utente(String nome, String cognome, String email, LocalDate dataDiNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataDiNascita = dataDiNascita;
        this.preferenzeMusicali = new HashSet<>();
        this.listaPlaylist = new ArrayList<>();
        this.cronologia = new CronologiaAscolti();
    }

    /* metodi get */
    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDataDiNascita() {
        return dataDiNascita;
    }

    public Set<GenereMusicale> getPreferenzeMusicali() {
        return Collections.unmodifiableSet(preferenzeMusicali); /* in sola lettura */
    }

    public List<Playlist> getListPlaylist() {
        return Collections.unmodifiableList(listaPlaylist);
    }

    public CronologiaAscolti getCronologia() {
        return cronologia;
    }

    /* metodi set */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDataDiNascita(LocalDate dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public void aggiungiPreferenza(GenereMusicale genere) throws DatiNonValidiException, DuplicatoException {
        if (genere == null) {
            throw new DatiNonValidiException("Il genere musicale non può essere nullo.");
        }
        if (!preferenzeMusicali.add(genere)) {
            throw new DuplicatoException("Il genere " + genere + " è già nelle preferenze.");
        }
    }

    public void rimuoviPreferenza(GenereMusicale genere) throws DatiNonValidiException, ElementoNonTrovatoException {
        if (genere == null) {
            throw new DatiNonValidiException("Il genere musicale non può essere nullo.");
        }
        if (!preferenzeMusicali.remove(genere)) {
            throw new ElementoNonTrovatoException("Il genere " + genere + " non è nelle preferenze.");
        }
    }

    public void creaPlaylist(String nome, String descrizione) throws DuplicatoException {
        Playlist nuova = new Playlist(nome, descrizione);
        for (Playlist p : listaPlaylist) {
            if (p.getNome().equals(nome))
                throw new DuplicatoException("esiste una playlist con questo nome.");
        }
        listaPlaylist.add(nuova);
    }

    public void modificaPlaylist(Playlist playlist, String nome, String descrizione)
            throws DatiNonValidiException, ElementoNonTrovatoException {
        if (playlist == null)
            throw new DatiNonValidiException("la playlist da modificare non può essere nulla.");
        if (!listaPlaylist.contains(playlist))
            throw new ElementoNonTrovatoException("la playlist non appartiene all'utente.");
        playlist.setNome(nome);
        playlist.setDescrizione(descrizione);
    }

    public void eliminaPlaylist(Playlist playlist) throws DatiNonValidiException, ElementoNonTrovatoException {
        if (playlist == null)
            throw new DatiNonValidiException("la playlist da eliminare non può essere nulla.");
        if (!listaPlaylist.remove(playlist))
            throw new ElementoNonTrovatoException("la playlist non appartiene all'utente.");
    }

    public void registraAscolto(Brano brano, int durataEffettiva) throws DatiNonValidiException {
        if (brano == null)
            throw new DatiNonValidiException("Il brano ascoltato non può essere nullo.");
        if (durataEffettiva <= 0)
            throw new DatiNonValidiException("La durata del brano deve essere maggiore di zero.");
        cronologia.aggiungiAscolto(brano, durataEffettiva);
    }

    public int tempoTotaleAscolto() {
        return cronologia.getTempoTotaleAscolto();
    }

    /**
     * per verificare quando due oggetti di tipo Utente rappresentano la stessa
     * persona (hanno la stessa email)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Utente))
            return false;
        Utente utente = (Utente) o;
        return Objects.equals(email, utente.email);
    }

    /**
     * restituisce il codice hash dell'indirizzo email dell'utente
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        return Objects.hash(email);
    }

    @Override
    public String toString() {
        return nome + " " + cognome + " " + email;
    }
}