package com.automobile.fourwheeler;

import com.automobile.Vehicle;

public class Logan extends Vehicle {

    @Override
    public String getModelName() {
        return "Mahindra Logan";
    }

    @Override
    public String getRegistrationNumber() {
        return "WB 20 XY 4321";
    }

    @Override
    public String getOwnerName() {
        return "Arkaprava Roy";
    }

    public int speed() {
        return 100;
    }

    public void gps() {
        System.out.println("GPS is ON.");
    }
}