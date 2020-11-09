package ba.edu.ssst.csis280;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, Map<String, String>> maps = new HashMap<>();

        maps.put("TITLE", new HashMap());
        maps.get("TITLE").put("EN", "This is new project for CSIS 280.");
        maps.get("TITLE").put("BA", "Ovo je novi projekat za predmet CSIS 280.");


//        maps.put("BA", new HashMap());
//        maps.get("BA").put("TITLE", "Ovo je novi projekat za predmet CSIS 280.");
//        maps.put("EN", new HashMap());
//        maps.get("EN").put("TITLE", "This is new project for CSIS 280.");

        System.out.println(generateTitle(maps.get("TITLE").get("EN")));
        System.out.println(generateTitle(maps.get("TITLE").get("BA")));
    }

    private static String generateTitle(String input) {
        return "<h1>" + input + "</h1>";
    }
}
