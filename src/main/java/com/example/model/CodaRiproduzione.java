package com.example.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import com.example.exception.*;
import com.example.model.interfacce.Riproducibile;

public class CodaRiproduzione implements Riproducibile{

    private int indiceCorrente = -1;
    private List<Brano> braniInCoda = new ArrayList<>();
    private boolean shuffle;
    private ModalitaRepeat modalitaRepeat;
    
    public CodaRiproduzione() {
        // Costruttore della coda di riproduzione
    }
    @Override 
    public void getTitolo(String titolo) {
        // Implementazione del metodo getTitolo
    }
    @Override
    public void getDurata(int durataSecondi) {
        // Implementazione del metodo getDurata
    }
    public void avviaPlaylist(Playlist playlist) throws PlaylistVuotaException {
        // Avvia la riproduzione della playlist
    }
    public Brano avanti() {
        // Passa al brano successivo nella coda
    }
    public Brano indietro() {
        // Torna al brano precedente nella coda
    }
    public void impostaShuffle(boolean shuffle) {
        // Imposta la modalità shuffle
    }
    public void impostaRepeat(ModalitaRepeat modalitaRepeat) {
        // Imposta la modalità di ripetizione
    }
}
