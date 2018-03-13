package cities;

import java.util.*;

public class Cities {

    private Map<String, List<String>> provinces = new HashMap();

    public Cities() {
        List<String> lista1 = new ArrayList();
        lista1.add("Malbork");
        lista1.add("Tczew");
        provinces.put("Pomorskie", lista1);

        List<String> lista2 = new ArrayList();
        lista2.add("Elbląg");
        lista2.add("Olsztyn");
        lista2.add("Ostróda");
        provinces.put("WarmińskoMazurskie", lista2);
    }

    public Collection<String> provinces() {
        return provinces.keySet();
    }

    public List<String> cities(String province) {
        return provinces.get(province);
    }

    public Map<String, String> provinceWithOneCity() {
        
        return null;
    }

    public Collection<String> cities() {
        return null; 
    }

    public static void main(String args[]) {
        Cities c = new Cities();
        System.out.println(c.provinces);

    }
}
