package com.example.service.exception;

/** Eccezione sollevata quando un'operazione di ricerca, 
 * modifica o eliminazione fa riferimento ad un elemento 
 * che non è presente nel sistema 
*/

public class ElementoNonTrovatoException extends Exception {
    
    public ElementoNonTrovatoException () {
        super ("Elemento non trovato.") ;
    }
    
    public ElementoNonTrovatoException (String message) {
        super (message) ;
    }
    
    public ElementoNonTrovatoException (String message, Throwable cause) {
        super (message, cause) ;
    }
    
    public ElementoNonTrovatoException (Throwable cause) {
        super (cause) ;
    }
}
