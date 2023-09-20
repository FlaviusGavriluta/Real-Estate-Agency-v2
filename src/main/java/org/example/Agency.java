package org.example;

import org.example.enums.District;
import org.example.model.Ad;
import org.example.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Agency {
    private List<User> users;
    private List<Ad> ads;

    public Agency() {
        this.users = new ArrayList<>();
        this.ads = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void addAd(Ad ad) {
        ads.add(ad);
    }

    public List<Ad> filterAds(Predicate<Ad> criteria) {
        return ads.stream()
                .filter(criteria)
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "Agency{" + "users=" + users + ", ads=" + ads + '}';
    }
}