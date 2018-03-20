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
        
        Map<String,String> map = new HashMap();
        for(String key : provinces.keySet())
        {
            List<String> list = provinces.get(key);
            String city = list.get(0);
            map.put(key, city);
        }
        return map;
    }

    public Collection<String> cities() {
        Collection<String> col = new ArrayList();
        for(List<String> list : provinces.values())
        {
            col.addAll(list);
        }
        return col;
    }

    public static void main(String args[]) {
        Cities c = new Cities();
        System.out.println(c.provinces);
        System.out.println(c.cities());
        System.out.println(c.provinceWithOneCity());

    }
}
