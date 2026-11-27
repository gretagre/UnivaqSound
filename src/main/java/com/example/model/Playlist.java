package com.example.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.example.exception.DatiNonValidiException;
import com.example.exception.ElementoNonTrovatoException;
import com.example.exception.DuplicatoException;

/* implementa riproducibile */
public class Playlist implements Riproducibile {
    private String nome;
    private String descrizione;
    private final LocalDate dataCreazione;
    private final List<Brano> brani;

    public Playlist(String nome, String descrizione) throws DatiNonValidiException {
        if (nome == null || nome.trim().isEmpty())
            throw new DatiNonValidiException("Il nome della playlist non può essere vuoto.");
        this.nome = nome;
        this.descrizione = (descrizione != null) ? descrizione : "";
        this.dataCreazione = LocalDate.now();
        this.brani = new ArrayList<>();
    }

    /**
     * metodi get
     */

    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public LocalDate getDataCreazione() {
        return dataCreazione;
    }

    public List<Brano> getBrani() {
        return Collections.unmodifiableList(brani);
    }

    /**
     * metodi set
     */

    public void setNome(String nome) throws DatiNonValidiException {
        if (nome == null || nome.trim().isEmpty())
            throw new DatiNonValidiException("Il nome della playlist non può essere vuoto.");
        this.nome = nome.trim();
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = (descrizione != null) ? descrizione : "";
    }

    /**
     * aggiungi brano
     */
    public void aggiungiBrano(Brano brano) throws DatiNonValidiException, DuplicatoException {
        if (brano == null) {
            throw new DatiNonValidiException("Impossibile aggiungere un brano nullo.");
        }
        if (brani.contains(brano)) {
            throw new DuplicatoException("Il brano è già presente nella playlist.");
        }
        brani.add(brano);
    }

    /**
     * rimuovi brano
     */
    public void rimuoviBrano(Brano brano) throws DatiNonValidiException, ElementoNonTrovatoException {
        if (brano == null) {
            throw new DatiNonValidiException("Impossibile rimuovere un brano nullo.");
        }
        if (!brani.contains(brano)) {
            throw new ElementoNonTrovatoException("Il brano non è presente nella playlist.");
        }
        brani.remove(brano);
    }

    /**
     * riordina playlist
     */
    public void spostaBrano(int iPartenza, int iArrivo) throws DatiNonValidiException {
        if (iPartenza < 0 || iPartenza >= brani.size() || iArrivo >= brani.size() || iArrivo < 0)
            throw new DatiNonValidiException("indici non validi.");
        if (iPartenza == iArrivo)
            return;
        Brano brano = brani.remove(iPartenza);
        brani.add(iArrivo, brano);
    }

    public int durataTotale() {
        return brani.stream().mapToInt(brano::getDurata).sum();
    }
}