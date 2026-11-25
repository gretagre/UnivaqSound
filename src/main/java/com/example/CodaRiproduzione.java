package com.example;

import com.example.interfacce.Riproducibile;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class CodaRiproduzione implements Riproducibile{

    private int indiceCorrente;
    private List<Brano> braniInCoda;
    private boolean shuffle;
    private ModalitàRepeat modalitàRepeat;
    
    public CodaRiproduzione() {
        // Costruttore della coda di riproduzione
    }
    @Override 
    public void getTitolo(String titolo) {
        // Implementazione del metodo getTitolo
    }
    @Override
    public void getDurataSecondi(int durataSecondi) {
        // Implementazione del metodo getDurataSecondi
    }

    public void avviaPlaylist(Playlist playlist) {
        // Avvia la riproduzione della playlist
    }
    public void avanti() {
        // Passa al brano successivo nella coda
    }
    public void indietro() {
        // Torna al brano precedente nella coda
    }
    public void impostaShuffle(boolean shuffle) {
        // Imposta la modalità shuffle
    }
    public void impostaRepeat(ModalitàRepeat modalitàRepeat) {
        // Imposta la modalità di ripetizione
    }
}
