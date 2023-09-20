package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Agent extends User {
    public Agent(String name, String contact) {
        super(name, contact);
    }

    public void postAd(Ad ad) {
        System.out.println(this.getName() + " posted an AD: " + ad);
    }
}