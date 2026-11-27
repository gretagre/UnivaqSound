package com.example.service.exception;

/**
 * Eccezione sollevata quando un'operazione non è ammessa datto stato corrente
 */
public class AzioneNonConsentitaException extends Exception {
    public AzioneNonConsentitaException() {
        super("Operazione non consentita.");
    }

    public AzioneNonConsentitaException(String message) {
        super(message);
    }

    public AzioneNonConsentitaException(String message, Throwable cause) {
        super(message, cause);
    }

    public AzioneNonConsentitaException(Throwable cause) {
        super(cause);
    }
}
