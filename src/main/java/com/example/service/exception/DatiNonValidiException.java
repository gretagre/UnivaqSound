package com.example.service.exception;

/**
 * Eccezione sollevata quando un utente inserisce dati non validi (es. durata negativa)
 */

public class DatiNonValidiException extends Exception{

    public DatiNonValidiException() {
        super("I dati inseriti non sono validi.");
    }

    public DatiNonValidiException(String message) {
        super(message);
    }

    public DatiNonValidiException(String message, Throwable cause) {
        super(message, cause);
    }

    public DatiNonValidiException(Throwable cause) {
        super(cause);
    }
}
