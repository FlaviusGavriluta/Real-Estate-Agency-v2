package org.example.model;

import org.example.enums.District;

public class Ad {
    private final int id;
    private String address;
    private District district;
    private Agent agent;
    private int price;
    private boolean isFurnished;
    private static int count = 1;

    public Ad(String address, District district, Agent agent, int price, boolean isFurnished) {
        this.id = count++;
        this.address = address;
        this.district = district;
        this.agent = agent;
        this.price = price;
        this.isFurnished = isFurnished;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isFurnished() {
        return isFurnished;
    }

    public void setFurnished(boolean furnished) {
        isFurnished = furnished;
    }

    @Override
    public String toString() {
        return "Ad{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", district=" + district +
                ", agent=" + agent +
                ", price=" + price +
                ", isFurnished=" + isFurnished +
                '}';
    }
}