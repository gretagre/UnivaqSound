package com.example.service;

public interface CriterioFiltro<T> {
    //verifica se l'elemento soddisfa il criterio di filtro specificato.
    boolean verifica(T elemento);
}