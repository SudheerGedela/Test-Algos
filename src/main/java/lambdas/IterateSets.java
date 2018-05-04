package lambdas;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Project: algo-lambdas
 * Package: alogos
 * <p>
 * User: vthalapu
 * Date: 3/12/18
 * Time: 3:46 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class IterateSets {
    static public void main(String...args){
        Set<String> testSet = new HashSet<>();
        testSet.add("1");
        testSet.add("2");
        testSet.add("3");

        System.out.println(Arrays.toString(testSet.toArray()));
        testSet.forEach(sItem -> System.out.println(sItem));


        System.out.println("hello");
        testSet
                .stream()
                .filter(e -> e.contains("1"))
                .forEach(System.out::println);

        Optional<String> str = testSet.stream().findFirst();

        System.out.println("Optional -> "+str);


        Map<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"Vamsi");
        hashMap.put(2,"Ramani");
        hashMap.put(3,"Usha");

        Map<Integer,String> newMap = hashMap.entrySet().stream()
                .filter(p -> p.getValue().equalsIgnoreCase("vamsi"))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        newMap.entrySet().forEach( e -> System.out.println("Key: "+ e.getKey() + ", Value: "+ e.getValue()));

    }
}
