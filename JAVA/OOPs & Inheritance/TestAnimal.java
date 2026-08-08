//Create a class named Animal which includes the methods: eat(), sleep() 
//Create a child class of Animal named Bird and override the parent class methods.
//Add a new method named: fly() 
//In the main() method:
//•	Create an object of the Animal class and invoke the eat() and sleep() methods. 
//•	Create an object of the Bird class and invoke the eat(), sleep(), and fly() methods. 

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
