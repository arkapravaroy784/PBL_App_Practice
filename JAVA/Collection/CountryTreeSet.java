import java.util.Iterator;
import java.util.TreeSet;

public class CountryTreeSet {

    // Instance Variable
    TreeSet<String> T1 = new TreeSet<>();

    // Method to add country names
    public TreeSet<String> saveCountryNames(String countryName) {

        T1.add(countryName);

        return T1;
    }

    // Method to search a country
    public String getCountry(String countryName) {

        Iterator<String> iterator = T1.iterator();

        while (iterator.hasNext()) {

            String country = iterator.next();

            if (country.equalsIgnoreCase(countryName)) {
                return country;
            }

        }

        return null;
    }

    public static void main(String[] args) {

        CountryTreeSet obj = new CountryTreeSet();

        obj.saveCountryNames("India");
        obj.saveCountryNames("Japan");
        obj.saveCountryNames("Germany");
        obj.saveCountryNames("France");
        obj.saveCountryNames("Canada");

        System.out.println("Countries in TreeSet:");
        System.out.println(obj.T1);

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