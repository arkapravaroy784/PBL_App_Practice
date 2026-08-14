package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Hero extends Vehicle {

    @Override
    public String getModelName() {
        return "Hero Splendor";
    }

    @Override
    public String getRegistrationNumber() {
        return "WB 34 AB 1234";
    }

    @Override
    public String getOwnerName() {
        return "Arkaprava Roy";
    }

    public int getSpeed() {
        return 80;
    }

    public void radio() {
        System.out.println("Radio is ON.");
    }

}