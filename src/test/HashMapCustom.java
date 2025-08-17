package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapCustom {
    public static void main(String[] args) {
        Map<Integer, Integer> map =  new HashMap<>();

        map.put(1,1000);
        map.put(1, 2000);

        System.out.println(map);

        Set<Integer> set =  new HashSet<>();

        set.add(1000);
        set.add(1000);

        System.out.println(set);
    }
}
