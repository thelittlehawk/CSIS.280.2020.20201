package ba.edu.ssst.csis280;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
//	    Map<String, Person> pMap =s new HashMap<>();
//        Map<String, Person> pMap = new TreeMap<>();
        Map<String, Person> pMap = new LinkedHashMap<>();

        pMap.put("key-5", new Person("Smith", "John", 1986));
        pMap.put("key-2", new Person("Other Me", "Cat", 1980));
        pMap.put("key-1", new Person("Faik", "Catibusic", 1986));
        pMap.put("key-4", new Person("Random", "Catibusic", 1986));
        pMap.put("key-3", new Person("Faik", "Catibusic", 1986));


        System.out.println("SIZE:" + pMap.size());

        System.out.println("KEYS:");
        for (String key: pMap.keySet()) {
            System.out.println(key);
        }

        System.out.println("VALUES:");
        for (Person p: pMap.values()) {
            System.out.println(p);
        }

        System.out.println("DO YOU HAVE A KEY?");
        if (pMap.containsKey("291198017xxxx") ){
            Person p = pMap.get("291198017xxxx");
            System.out.println("\"291198017xxxx\" is in a map. " + p);
        }
    }
}
