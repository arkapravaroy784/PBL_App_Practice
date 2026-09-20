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