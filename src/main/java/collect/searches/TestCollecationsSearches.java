package collect.searches;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Project: Test-Algos
 * Package: collect.searches
 * <p>
 * User: vamshi
 * Date: 4/27/18
 * Time: 10:25 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class TestCollecationsSearches {

    static public void main(String... args) {

        List<String> objList = new ArrayList<>();
        Map<String, String> objMap = new HashMap<>();

        objMap.put("1", "Vsha");
        objMap.put("2", "Uamsi");
        System.out.println("Item status -> " + Collections.binarySearch(objList, "2"));
//        Arrays.
//        objMap.entrySet().stream().


        Map<String, String> finalMap = objMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return (int) o2.toUpperCase().substring(0, 1).charAt(0) -
                                (int) o1.toUpperCase().substring(0, 1).charAt(0);
                    }
                }))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        finalMap.entrySet().forEach(e -> System.out.println(e.getKey() + " <-> " + e.getValue()));

        System.out.println("***********************************************");

        Map<String, Integer> unsortMap = new HashMap<>();
        unsortMap.put("z", 10);
        unsortMap.put("b", 5);
        unsortMap.put("a", 6);
        unsortMap.put("c", 20);
        unsortMap.put("d", 1);
        unsortMap.put("e", 7);
        unsortMap.put("y", 8);
        unsortMap.put("n", 99);
        unsortMap.put("g", 50);
        unsortMap.put("m", 2);
        unsortMap.put("f", 9);

        Map<String, Integer> finalMap1 = unsortMap.entrySet()
                .stream()
//                .sorted(Map.Entry.comparingByKey())
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        finalMap1.entrySet().forEach(e -> System.out.println(e.getKey() + " <-> " + e.getValue()));


        //filtering maps
        unsortMap.entrySet()
                .stream()
                .filter(e -> e.getKey() == "a" ||
                        e.getKey() == "b" ||
                        e.getKey() == "z")
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println("****************");
        unsortMap.entrySet().forEach(System.out::println);

    }


}


//https://www.mkyong.com/java8/java-8-how-to-sort-a-map/
