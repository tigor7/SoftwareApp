package org.ulpgc.is1.model;

import java.time.LocalDateTime;

public class Contract {
    private LocalDateTime start;
    private LocalDateTime end;
    private int budget;

    public Contract(LocalDateTime start, LocalDateTime end, int budget) {
        this.start = start;
        this.end = end;
        this.budget = budget;
    }
}