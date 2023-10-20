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

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}