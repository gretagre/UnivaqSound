package com.example.exception;

/** Eccezione sollevata quando viene richiesta un'operazione
 * non ammessa dallo stato corrente del sistema o player
*/

public class AzioneNonConsentitaException extends Exception {
    
    public AzioneNonConsentitaException () {
        super ("Operazione non consentita.");
    }

    public AzioneNonConsentitaException (String message) {
        super (message);
    }

    public AzioneNonConsentitaException (String message, Throwable cause) {
        super (message, cause);
    }

    public AzioneNonConsentitaException (Throwable cause) {
        super (cause);
    }
}
