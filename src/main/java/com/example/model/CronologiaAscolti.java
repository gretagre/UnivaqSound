package com.example.model;

import java.time.LocalDate;

public class CronologiaAscolti {
    private final Brano brano;
    private final LocalDataTime dataOraAscolto;
    private final int durateEffettiva;

    public CronologiaAscolti(Brano brano, int durataEffettiva) {
        this.brano = brano;
        this.dataOraAscolto = LocalDateTime.now();
        this.durateEffettiva = durataEffettiva;
    }

    public Brano getBrano() {
        return brano;
    }

    public LocalDataTime getDataOraAscolto() {
        return dataOraAscolto;
    }

    public int getDurataEffettiva() {
        return durateEffettiva;
    }
}
