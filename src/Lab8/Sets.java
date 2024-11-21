package Lab8;

import java.io.CharArrayReader;
import java.util.*;
public class Sets {
    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second){
        Set<Integer> result = new HashSet<>();
        for (int i : first) {
            if (second.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }
    public static Set<Integer> unionManual (Set<Integer> first, Set<Integer>second) {
        Set<Integer> result = new HashSet<>(second);
        for (int i : first) {
            if (!second.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }
    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second){
        first.retainAll(second);
        return first;
    }
    public static Set<Integer> union(Set<Integer> first, Set<Integer>second) {
        first.addAll(second);
        return first;
    }

    public static List<Integer> tolist (Set<Integer> source){
        List<Integer> result = new ArrayList<>(source);
        return result;
    }
    public static  List<Integer> removeDuplicates (List<Integer> source){
        Set<Integer> temp = new HashSet<>(source);
        List<Integer> result = new ArrayList<>(temp);
        return result;
    }
    public static  List<Integer> removeDuplicatesManual (List<Integer> source){
        for (int i = 0; i < source.size() - 1; i++) {
            for (int j = i + 1; j < source.size(); j++) {
                if (source.get(i) == source.get(j)) {
                    source.remove(j);
                }
            }
        }
        return source;
    }
    public static String firstRecurringCharacter(String s ) {
        HashSet<Character> result = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!result.contains(c)) {
                result.add(c);
            } else {
                return "FirstRecurringchars: [ " + c + " ]";
            }
        }
        return null;
    }
    public static Set<Character> allRecurringChars (String s) {

        Set<Character> temp = new HashSet<>();
        Set<Character> result = new HashSet<>();
        for (int i = 0; i < s.length() - 1; i++) {
            char c1 = s.charAt(i);
            temp.add(c1);
            for (int j = i + 1; j < s.length(); j++) {
                char c2 = s.charAt(j);
                if (temp.contains(c2)) {
                    result.add(c2);
                }
            }
        }
        return result;
    }
    public static Integer[] toArray (Set<Integer> source){
        Integer[] arr = new Integer[source.size()];
        ArrayList<Integer> temp = new ArrayList<>(source);
        for (int i = 0; i < source.size(); i++) {
            arr[i] = temp.get(i);
        }
        return arr;
    }

    public static int getFirst(TreeSet<Integer> source){
        return source.first();
    }

    public static int getLast(TreeSet<Integer> source){
        return source.last();
    }
    public static int getGreater(TreeSet<Integer> source, int value){
        for (int i : source) {
            if (i > value) {
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Set<Integer> first = new HashSet<>();
        first.add(1);
        first.add(2);
        first.add(3);

        Set<Integer> second = new HashSet<>();
        second.add(1);
        second.add(3);
        second.add(6);

        System.out.println(intersectionManual(first, second));
        System.out.println(unionManual(first, second));
        System.out.println(intersection(first, second));
        System.out.println(union(first, second));
        System.out.println();


        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        System.out.println(removeDuplicates(list));
        System.out.println();


        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(2);
        System.out.println(removeDuplicatesManual(list2));

        System.out.println(firstRecurringCharacter("abcacbabca"));
        System.out.printf("AllRecurringChars");
        System.out.println(allRecurringChars("abcacbabca"));
        System.out.println();


        Integer[] arr = toArray(second);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();


        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(5);
        System.out.printf("First ");
        System.out.println(getFirst(treeSet));
        System.out.printf("Last ");
        System.out.println(getLast(treeSet));
        System.out.printf("Greater ");
        System.out.print(getGreater(treeSet, 6));

    }
}
