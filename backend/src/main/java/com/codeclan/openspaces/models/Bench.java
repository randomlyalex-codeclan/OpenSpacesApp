package com.codeclan.openspaces.models;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document(collection = "pois")
public class Bench extends Space {

    private int capacity;

    public Bench(double lat, double lon, String accessibility, String privacy, boolean sheltered, int capacity, String createdBy) {
        super(lat, lon, accessibility, privacy, sheltered, createdBy);
        this.capacity = capacity;
    }
//    public Bench(double lat, double lon, String accessibility, String privacy, boolean sheltered, int capacity, String createdBy, ArrayList<String> favBy, ArrayList<Rating> ratedBy) {
//        super(lat, lon, accessibility, privacy, sheltered, createdBy, favBy, ratedBy);
//        this.capacity = capacity;
//    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
