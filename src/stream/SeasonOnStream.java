package stream;

import java.util.*;


public class SeasonOnStream {

    public static void main(String[] args) {

        System.out.println(SeasonOnStream.defineSeasone("October"));

    }

    public static String defineSeasone(String month) {

        Map<String, ArrayList<String>> map = new HashMap<>();
        map.put("Summer", new ArrayList<>(Arrays.asList("June", "July", "August")));
        map.put("Autumn", new ArrayList<>(Arrays.asList("September", "October", "November")));
        map.put("Spring", new ArrayList<>(Arrays.asList("March", "April", "May")));
        map.put("Winter", new ArrayList<>(Arrays.asList("December", "January", "February")));

        return map.entrySet().stream()
                .filter(entry -> entry.getValue().contains(month))
                .map(Map.Entry::getKey)
                .findFirst()
                .get();
    }
}
