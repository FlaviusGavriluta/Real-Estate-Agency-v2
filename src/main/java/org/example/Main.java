package org.example;

import org.example.enums.District;
import org.example.model.Ad;
import org.example.model.Agent;
import org.example.model.User;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Agency agency = new Agency();

        User user1 = new User("John", "john@gmail.com");
        User user2 = new User("Jay", "jay@gmail.com");
        Agent agent1 = new Agent("001", "001@gmail.com");
        Agent agent2 = new Agent("002", "002@gmail.com");

        List<Ad> ads = new ArrayList<>();
        Ad ad1 = new Ad("Buch", District.V, agent1, 200000, false);
        Ad ad2 = new Ad("Timis", District.V, agent1, 150000, true);
        Ad ad3 = new Ad("Cluj", District.VI, agent1, 180000, false);
        Ad ad4 = new Ad("Iasi", District.XI, agent1, 130000, true);
        Ad ad5 = new Ad("Sibiu", District.VII, agent2, 120000, false);
        Ad ad6 = new Ad("Buch", District.VI, agent2, 180000, true);
        Ad ad7 = new Ad("Oradea", District.VII, agent2, 110000, false);

        //       agent1.addAd(ad1);
//        agent1.addAd(ad2);
//        agent1.addAd(ad3);
//        agent1.addAd(ad4);
//        agent2.addAd(ad5);
//        agent2.addAd(ad6);
//        agent2.addAd(ad7);

        ads.add(ad1);
        ads.add(ad2);
        ads.add(ad3);
        ads.add(ad4);
        ads.add(ad5);
        ads.add(ad6);
        ads.add(ad7);

        agency.addAd(ad1);
        agency.addAd(ad2);
        agency.addAd(ad3);
        agency.addAd(ad4);
        agency.addAd(ad5);
        agency.addAd(ad6);
        agency.addAd(ad7);


        agency.addUser(user1);
        agency.addUser(user2);
        agency.addUser(agent1);
        agency.addUser(agent2);

//        agency.listAdsByDistrict(District.XI).forEach(System.out::println);

//        agency.listAdsByPrice(140000).forEach(System.out::println);

//        agency.listAdsByFurnished(true).forEach(System.out::println);

//        agency.ads.forEach(System.out::println);
    }
}