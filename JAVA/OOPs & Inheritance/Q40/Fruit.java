class Fruit {

    protected String name;
    protected String taste;
    protected String size;

    // Parameterized Constructor
    Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    // Method
    void eat() {
        System.out.println("Fruit : " + name);
        System.out.println("Taste : " + taste);
    }
}