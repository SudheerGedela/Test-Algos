package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Project: algo-test
 * Package: Maps
 * <p>
 * User: vthalapu
 * Date: 3/20/18
 * Time: 7:52 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class TestMaps {

    static public void main(String... args) {
        Map<String, String> map = new HashMap<>();

        map.put("k1", "value1");
        map.put("k2", "value2");
        map.put("k3", "value3");
        map.put("k3", "value3");
        map.put("k4", "value4");
        System.out.println("**********************************************");
        for (Map.Entry<String, String> set : map.entrySet()) {
            System.out.println(set.getKey());
            System.out.println(set.getValue());
            System.out.println(set.hashCode());
        }

        System.out.println("**********************************************");
        System.out.println(map.values());
        System.out.println(map.keySet().toString());
        Set<Map.Entry<String, String>> set = map.entrySet();
        System.out.println("**********************************************");
        set.forEach(e -> {

            System.out.println("Key ->> " + e.getKey());
            System.out.println("Value ->> " + e.getValue());
            System.out.println("HashCode ->> " + e.hashCode());
        });

    }

}
