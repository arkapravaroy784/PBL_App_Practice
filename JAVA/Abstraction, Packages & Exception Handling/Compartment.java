//Create a class called Compartment that represents a ship compartment with the following attributes:
//• Height
//• Width
//• Breadth
//Important: This class should not conflict with the Compartment class created in the previous abstract class exercise. To avoid the conflict, create this class in a new package called:
//com.wipro.automobile.ship

package com.wipro.automobile.ship;

public class Compartment {

    private int height;
    private int width;
    private int breadth;

    public Compartment(int height, int width, int breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }

    public void displayDetails() {
        System.out.println("Height : " + height);
        System.out.println("Width  : " + width);
        System.out.println("Breadth: " + breadth);
    }
}
