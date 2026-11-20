package com.example.exception;

/** 
 * Eccezione sollevata quando un dato inserito dall'utente 
 * non è valido 
*/

public class DatiNonValidiException extends Exception {
    
    public DatiNonValidiException () {
        super ("I dati inseriti non sono validi.");
    }

    public DatiNonValidiException (String message) {
        super (message);
    }

    public DatiNonValidiException (String message, Throwable cause) {
        super (message, cause);
    }
    
    public DatiNonValidiException (Throwable cause) {
        super (cause);
    }
}
