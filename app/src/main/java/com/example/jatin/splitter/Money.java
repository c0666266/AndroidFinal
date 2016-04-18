package com.example.jatin.splitter;

import java.util.Date;


public class Money {
    private long id;
    private String description;
    private double toGive;
    private String dateAdded;
    private double toTake;

    public Money(long id, String description, double toGive, String dateAdded, double toTake) {
        this.id = id;
        this.description = description;
        this.toGive = toGive;
        this.dateAdded = dateAdded;
        this.toTake = toTake;
    }

    public Money(String description, double toGive, double toTake) {
        this.description = description;
        this.toGive = toGive;
        this.toTake = toTake;
    }

    public Money(){
        description = "";
        toGive = 0.0;
        dateAdded = "";
        toTake = 0.0;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getToGive() {
        return toGive;
    }

    public void setToGive(double toGive) {
        this.toGive = toGive;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    public double getToTake() {
        return toTake;
    }

    public void setToTake(double toTake) {
        this.toTake = toTake;
    }
}
