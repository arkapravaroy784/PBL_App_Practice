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