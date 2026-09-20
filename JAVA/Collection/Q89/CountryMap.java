import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountryMap {

    // Instance Variable
    private HashMap<String, String> M1 = new HashMap<>();

    // Add Country and Capital
    public HashMap<String, String> saveCountryCapital(String countryName, String capital) {

        M1.put(countryName, capital);

        return M1;
    }

    // Get Capital using Country
    public String getCapital(String countryName) {

        return M1.get(countryName);
    }

    // Get Country using Capital
    public String getCountry(String capitalName) {

        for (Map.Entry<String, String> entry : M1.entrySet()) {

            if (entry.getValue().equalsIgnoreCase(capitalName)) {
                return entry.getKey();
            }

        }

        return null;
    }

    // Swap Key and Value
    public HashMap<String, String> swapKeyValue() {

        HashMap<String, String> M2 = new HashMap<>();

        for (Map.Entry<String, String> entry : M1.entrySet()) {

            M2.put(entry.getValue(), entry.getKey());

        }

        return M2;
    }

    // Convert Keys to ArrayList
    public ArrayList<String> toArrayList() {

        ArrayList<String> list = new ArrayList<>();

        for (String country : M1.keySet()) {

            list.add(country);

        }

        return list;
    }

}