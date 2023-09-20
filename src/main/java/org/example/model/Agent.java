package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Agent extends User {
    List<Ad> ads;

    public Agent(String name, String contact) {
        super(name, contact);
        this.ads = new ArrayList<>();
    }

    public void postAd(Ad ad) {
        System.out.println(ad);
    }

    public List<Ad> getAds() {
        return ads;
    }

    public void setAds(List<Ad> ads) {
        this.ads = ads;
    }
}