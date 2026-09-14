import java.util.ArrayList;

public class NumberArrayList {

    public static void main(String[] args) {

        ArrayList<Number> numbers = new ArrayList<>();

        numbers.add(10);          // Integer
        numbers.add(25.5);        // Double
        numbers.add(15.75f);      // Float
        numbers.add(5000L);       // Long
        numbers.add((short)100);  // Short
        numbers.add((byte)20);    // Byte

        System.out.println("Numbers in the ArrayList:");

        for (Number num : numbers) {
            System.out.println(num);
        }

    }
}