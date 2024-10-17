package com.example.userauthapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class SecondaryInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cauce;
    private String google;
    private String openstreetmap;
    private String wikidata;
    private double cotaCoron;
    private double altCimien;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCauce() {
        return cauce;
    }

    public void setCauce(String cauce) {
        this.cauce = cauce;
    }

    public String getGoogle() {
        return google;
    }

    public void setGoogle(String google) {
        this.google = google;
    }

    public String getOpenstreetmap() {
        return openstreetmap;
    }

    public void setOpenstreetmap(String openstreetmap) {
        this.openstreetmap = openstreetmap;
    }

    public String getWikidata() {
        return wikidata;
    }

    public void setWikidata(String wikidata) {
        this.wikidata = wikidata;
    }

    public double getCotaCoron() {
        return cotaCoron;
    }

    public void setCotaCoron(double cotaCoron) {
        this.cotaCoron = cotaCoron;
    }

    public double getAltCimien() {
        return altCimien;
    }

    public void setAltCimien(double altCimien) {
        this.altCimien = altCimien;
    }
}
