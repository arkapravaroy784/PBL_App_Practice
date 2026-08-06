class Orange extends Fruit {

    Orange() {
        super("Orange", "Sour", "Medium");
    }

    @Override
    void eat() {
        System.out.println("Fruit : " + name);
        System.out.println("Taste : " + taste);
    }
}