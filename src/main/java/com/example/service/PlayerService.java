package com.example.service;
import com.example.exception.AzioneNonConsentitaException;
import com.example.model.Player;
import com.example.model.StatoRiproduzione;

public class PlayerService {
    private Player player;

    public PlayerService(Player player) {
        this.player = player;
    }

    public void play() throws AzioneNonConsentitaException {
        if (player.getStato() == StatoRiproduzione.PLAY) {
            throw new AzioneNonConsentitaException("Il player è già in riproduzione.");
        }
        player.setStato(StatoRiproduzione.PLAY);
    }
    public void pause() throws AzioneNonConsentitaException {
        if (player.getStato() == StatoRiproduzione.PAUSE) {
            throw new AzioneNonConsentitaException("Il player è già in pausa.");
        }
        player.setStato(StatoRiproduzione.PAUSE);
    }
    public void stop() throws AzioneNonConsentitaException {
        if (player.getStato() == StatoRiproduzione.PAUSE) {
            throw new AzioneNonConsentitaException("Il player è già fermo.");
        }
        player.setStato(StatoRiproduzione.PAUSE);
        player.setSecondiAvanzamento(0);
    }
    public void avanti() throws AzioneNonConsentitaException {
        if (player.getStato() == StatoRiproduzione.PAUSE) {
            throw new AzioneNonConsentitaException("Non è possibile avanzare in pausa.");
        }
        player.setSecondiAvanzamento(0);
    }
    public void indietro() throws AzioneNonConsentitaException {
        if (player.getStato() == StatoRiproduzione.PAUSE) {
            throw new AzioneNonConsentitaException("Non è possibile tornare indietro in pausa.");
        }
        player.setSecondiAvanzamento(0);
    }
}
