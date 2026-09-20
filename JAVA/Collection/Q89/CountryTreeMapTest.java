import java.util.ArrayList;
import java.util.TreeMap;

public class CountryTreeMapTest {

    public static void main(String[] args) {

        CountryTreeMap obj = new CountryTreeMap();

        // Add Country-Capital Pairs
        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");
        obj.saveCountryCapital("Germany", "Berlin");
        obj.saveCountryCapital("France", "Paris");
        obj.saveCountryCapital("Canada", "Ottawa");
        obj.saveCountryCapital("Australia", "Canberra");

        // Display Original TreeMap
        System.out.println("Original TreeMap (M1):");
        System.out.println(obj.saveCountryCapital("Brazil", "Brasilia"));

        // Get Capital
        System.out.println("\nCapital of India: "
                + obj.getCapital("India"));

        // Get Country
        System.out.println("Country of Tokyo: "
                + obj.getCountry("Tokyo"));

        // Swap Key and Value
        TreeMap<String, String> M2 = obj.swapKeyValue();

        System.out.println("\nSwapped TreeMap (M2):");
        System.out.println(M2);

        // Convert Keys to ArrayList
        ArrayList<String> countries = obj.toArrayList();

        System.out.println("\nCountries in ArrayList:");
        System.out.println(countries);

    }

}