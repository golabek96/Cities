package cities;

import java.util.*;

public class Countries {

    private Map<String, String> countries = new HashMap();

    public Countries() {
        countries.put("Poland", "Warsaw");
        countries.put("German", "Berlin");
        countries.put("France", "Paris");
        countries.put("Spain", "Madrid");
        countries.put("Russia", "Moscow");
        countries.put("Great Britain", "London");
    }

    @Override
    public String toString() {
        return countries.toString();
    }

    public static void main(String[] args) {
        Countries c = new Countries();
        System.out.println(c);

    }

}
