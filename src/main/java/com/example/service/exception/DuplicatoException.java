package com.example.service.exception;

/**
 * Eccezione sollevata quando si tenta di inserire un elemento
 * già presente 
*/

public class DuplicatoException extends Exception {
    
    public DuplicatoException() {
        super ("Elemento già presente.") ;
    }
    
    public DuplicatoException (String message) {
        super (message) ;
    }
    
    public DuplicatoException (String message, Throwable cause) {
        super (message, cause) ;
    }
    
    public DuplicatoException (Throwable cause) {
        super (cause) ;
    }
}
