package com.codeclan.openspaces.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "pois")
public class Bench extends Space {

    private int capacity;

    public Bench(double lat, double lon, String accessibility, String privacy, boolean sheltered, String createdBy, int capacity) {
        super(lat, lon, accessibility, privacy, sheltered, createdBy);
        this.capacity = capacity;
        this.setType("bench");

    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
