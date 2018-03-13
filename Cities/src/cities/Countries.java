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
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.countries);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Countries other = (Countries) obj;
        if (!Objects.equals(this.countries, other.countries)) {
            return false;
        }
        return true;
    }

    public Collection<String> capitals() {
        return countries.keySet();
    }

    public Collection<String> countries() {
        return countries.values();
    }

    public Collection<String> sortedCapitals() {
        TreeSet set = new TreeSet();
        set.addAll(capitals());
        return set;
    }

    public Collection<String> sortedCountries() {
        TreeSet set = new TreeSet();
        set.addAll(countries());
        return set;
    }

    public Map<String, String> sortedByCountries() {
        TreeMap map = new TreeMap(countries);
        return map;
    }

    public Map<String, String> sortedByCapitals() {
        Map<String, String> map = new TreeMap();
        for (String key : countries.keySet()) {
            String value = countries.get(key);
            map.put(value, key);
        }

        return map;
    }

    @Override
    public String toString() {
        return countries.toString();
    }

    public static void main(String[] args) {
        Countries c = new Countries();
        System.out.println(c);
        System.out.println();

        System.out.println(c.capitals());
        System.out.println(c.countries());
        System.out.println();
        System.out.println(c.sortedCountries());
        System.out.println(c.sortedCapitals());
        System.out.println();
        System.out.println(c.sortedByCountries());
        System.out.println(c.sortedByCapitals());

    }

}
