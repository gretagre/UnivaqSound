package com.example.exception;

/**
 * *Eccezione generata quando si tenta di avviare la riproduzione
 * di una plaulist o di una coda di riproduzione priva di brani
 * */

public class PlaylistVuotaException extends Exception {
    
    public PlaylistVuotaException () {
        super ("Impossibile avviare la riproduzione: la playlist o la coda è vuota.") ;
    }
    
    public PlaylistVuotaException (String message) {
        super (message) ;
    }
    
    public PlaylistVuotaException (String message, Throwable cause) {
        super (message, cause) ;
    }
    
    public PlaylistVuotaException (Throwable cause) {
        super (cause) ;
    }
}
