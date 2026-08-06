class Apple extends Fruit {

    Apple() {
        super("Apple", "Sweet", "Medium");
    }

    @Override
    void eat() {
        System.out.println("Fruit : " + name);
        System.out.println("Taste : " + taste);
    }
}