import java.util.ArrayList;
import java.util.Hashtable;

public class CountryHashtableTest {

    public static void main(String[] args) {

        CountryHashtable obj = new CountryHashtable();

        // Add Country-Capital Pairs
        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");
        obj.saveCountryCapital("Germany", "Berlin");
        obj.saveCountryCapital("France", "Paris");
        obj.saveCountryCapital("Canada", "Ottawa");

        // Display Original Hashtable
        System.out.println("Original Hashtable (M1):");
        System.out.println(obj.saveCountryCapital("Australia", "Canberra"));

        // Get Capital
        System.out.println("\nCapital of India: "
                + obj.getCapital("India"));

        // Get Country
        System.out.println("Country of Tokyo: "
                + obj.getCountry("Tokyo"));

        // Swap Key and Value
        Hashtable<String, String> M2 = obj.swapKeyValue();

        System.out.println("\nSwapped Hashtable (M2):");
        System.out.println(M2);

        // Convert Keys to ArrayList
        ArrayList<String> countries = obj.toArrayList();

        System.out.println("\nCountries in ArrayList:");
        System.out.println(countries);

    }

}