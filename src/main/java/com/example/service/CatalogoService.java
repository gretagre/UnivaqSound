//Creare ServiceException come classe padre (consigliata): create ServiceException extends Exception nel package service e fate estendere ServiceException alle vostre 5 eccezioni
package com.example.service;

import java.util.Comparator;
import java.util.List;

import com.example.model.interfacce.Ricercabile;
import com.example.service.exception.DatiNonValidiException;
import com.example.service.exception.DuplicatoException;
import com.example.service.exception.ElementoNonTrovatoException;

public interface CatalogoService<T extends Ricercabile> {
    
    void aggiungi(T elemento) throws DuplicatoException, DatiNonValidiException, ServiceException;

    void modifica(T vecchio, T nuovo) throws ElementoNonTrovatoException, DatiNonValidiException, DuplicatoException, ServiceException;

    void rimuovi(T elemento) throws ElementoNonTrovatoException, ServiceException;

}