//Develop a Java class with an instance variable H1 (HashSet).
//Create the following methods:
//1. HashSet<String> saveCountryNames(String countryName)
//o Adds the given country name to the HashSet (H1).
//o Returns the updated HashSet.
//2. String getCountry(String countryName)
//o Iterates through the HashSet.
//o Returns the country name if it exists.
//o Otherwise returns null.
//Note: Test both methods using the main() method.


import java.util.HashSet;
import java.util.Iterator;

public class CountryHashSet {

    // Instance Variable
    HashSet<String> H1 = new HashSet<>();

    // Method to add country names
    public HashSet<String> saveCountryNames(String countryName) {

        H1.add(countryName);

        return H1;
    }

    // Method to search a country
    public String getCountry(String countryName) {

        Iterator<String> iterator = H1.iterator();

        while (iterator.hasNext()) {

            String country = iterator.next();

            if (country.equalsIgnoreCase(countryName)) {
                return country;
            }

        }

        return null;
    }

    public static void main(String[] args) {

        CountryHashSet obj = new CountryHashSet();

        obj.saveCountryNames("India");
        obj.saveCountryNames("Japan");
        obj.saveCountryNames("Germany");
        obj.saveCountryNames("France");
        obj.saveCountryNames("Canada");

        System.out.println("Countries in HashSet:");
        System.out.println(obj.H1);

        System.out.println();

        String result = obj.getCountry("Germany");

        if (result != null) {
            System.out.println("Country Found : " + result);
        } else {
            System.out.println("Country Not Found");
        }

        result = obj.getCountry("Brazil");

        if (result != null) {
            System.out.println("Country Found : " + result);
        } else {
            System.out.println("Country Not Found");
        }

    }
}
