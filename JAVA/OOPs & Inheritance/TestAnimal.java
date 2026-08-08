class Animal {

    void eat() {
        System.out.println("Animal is eating.");
    }

    void sleep() {
        System.out.println("Animal is sleeping.");
    }
}

class Bird extends Animal {

    // Overriding eat()
    @Override
    void eat() {
        System.out.println("Bird is eating.");
    }

    // Overriding sleep()
    @Override
    void sleep() {
        System.out.println("Bird is sleeping.");
    }

    // New method
    void fly() {
        System.out.println("Bird is flying.");
    }
}

class TestAnimal {

    public static void main(String[] args) {

        // Animal object
        Animal animal = new Animal();

        animal.eat();
        animal.sleep();

        System.out.println();

        // Bird object
        Bird bird = new Bird();

        bird.eat();
        bird.sleep();
        bird.fly();
    }
}