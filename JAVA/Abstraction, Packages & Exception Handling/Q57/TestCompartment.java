import java.util.Random;

class TestCompartment {

    public static void main(String[] args) {

        // Create an array of Compartment objects
        Compartment[] compartments = new Compartment[10];

        Random random = new Random();

        // Create random compartment objects
        for (int i = 0; i < compartments.length; i++) {

            int choice = random.nextInt(4) + 1;

            switch (choice) {

                case 1:
                    compartments[i] = new FirstClass();
                    break;

                case 2:
                    compartments[i] = new Ladies();
                    break;

                case 3:
                    compartments[i] = new General();
                    break;

                case 4:
                    compartments[i] = new Luggage();
                    break;
            }
        }

        // Display notices
        System.out.println("Compartment Notices:");
        System.out.println("---------------------");

        for (Compartment c : compartments) {
            System.out.println(c.notice());
        }
    }
}