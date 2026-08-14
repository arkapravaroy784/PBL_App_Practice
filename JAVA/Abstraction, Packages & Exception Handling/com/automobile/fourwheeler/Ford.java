package com.automobile.fourwheeler;

import com.automobile.Vehicle;

public class Ford extends Vehicle {

    @Override
    public String getModelName() {
        return "Ford EcoSport";
    }

    @Override
    public String getRegistrationNumber() {
        return "WB 12 EF 9876";
    }

    @Override
    public String getOwnerName() {
        return "Arkaprava Roy";
    }

    public int speed() {
        return 140;
    }

    public void tempControl() {
        System.out.println("Air Conditioner is ON.");
    }

}