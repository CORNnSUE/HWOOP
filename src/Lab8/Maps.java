package Lab8;

import java.util.*;

public class Maps {
    public static int count(Map<Integer, Integer> map){
        return map.size();

    }
    public static void empty (Map<Integer,Integer> map){
        map.clear();

    }
    public static boolean contains (Map<Integer,Integer>map, int key){
        return map.containsKey(key);

    }
    public static boolean containsKeyValue(Map<Integer, Integer>map, int key, int value){
        if (map.containsKey(key)) {
            if (map.get(key) == value) {
                return true;
            }
        }
        return false;
    }
    public static Set<Integer> keySet (Map<Integer, Integer> map){
        Set<Integer> result = map.keySet();
        return result;
    }
    public static Collection<Integer> values(Map<Integer, Integer> map){
        Set<Integer> result = new HashSet<>();
        Set<Integer> set = map.keySet();
        for (int key : set) {
            result.add(map.get(key));
        }
        return result;
    }
    public static String setColor (int value){
        if (value == 0) {
            value = Integer.parseInt("Black");
        }else if (value == 1) {
            value = Integer.parseInt("White");
        }else if (value == 2) {
            value = Integer.parseInt("Red");
        }
        return value + " " ;
    }

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(3, 1);
        map.put(2, 2);
        map.put(1, 3);
        System.out.println(count(map));
        System.out.println(contains(map, 2));
        System.out.println(containsKeyValue(map, 1, 3));
        System.out.println(keySet(map));
        System.out.println(values(map));
        System.out.println(setColor(3));
        empty(map);
    }
}
