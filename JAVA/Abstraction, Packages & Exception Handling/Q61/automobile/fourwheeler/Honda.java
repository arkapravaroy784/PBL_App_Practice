package com.automobile.fourwheeler;

import com.automobile.Vehicle;

public class Honda extends Vehicle {

    @Override
    public String getModelName() {
        return "Honda City";
    }

    @Override
    public String getRegistrationNumber() {
        return "WB 02 CD 5678";
    }

    @Override
    public String getOwnerName() {
        return "Arkaprava Roy";
    }

    public int getSpeed() {
        return 120;
    }

    public void cdplayer() {
        System.out.println("CD Player is ON.");
    }

}