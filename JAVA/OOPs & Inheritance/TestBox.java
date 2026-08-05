//Create a class Box that uses a parameterized constructor to initialize the dimensions of a box.
//The dimensions of the box are: Width, Height, Depth
//The class should have a method that returns the volume of the box.
//Create an object of the Box class and test the functionalities.
class Box {

    double width;
    double height;
    double depth;

    // Parameterized Constructor
    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Method to calculate volume
    double getVolume() {
        return width * height * depth;
    }
}

class TestBox {
    public static void main(String[] args) {

        // Create Box object
        Box box = new Box(10, 5, 2);

        System.out.println("Width  = " + box.width);
        System.out.println("Height = " + box.height);
        System.out.println("Depth  = " + box.depth);

        System.out.println("Volume = " + box.getVolume());
    }
}
