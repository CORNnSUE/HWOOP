import java.util.*;

public class Lists {
    public static void insertFirst(ArrayList<Integer> list, int value) {
        list.add(0, value);
    }

    public static void insertLast(ArrayList<Integer> list, int value) {
        list.add(value);
    }

    public static void replace(ArrayList<Integer> list, int value) {
        list.set(2, value);
    }

    public static void removeThird(ArrayList<Integer> list) {
        list.remove(2);
    }

    public static void removeEvil(ArrayList<Integer> list) {
        list.removeIf(t -> t.equals(666));
    }

    public static ArrayList<Integer> generateSquare () {
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        int number = 1;
        while (count < 10) {
            for (int i = 0; i <= number; i++) {
                if (number == i * i) {
                    list.add(number);
                    count ++;
                }
            }
            number ++;
        }
        return list;
    }

    public static boolean contains(ArrayList<Integer> list, int value) {
        return list.contains(value);
    }

    public static void copy(ArrayList<Integer> source, ArrayList<Integer> target) {
        target.clear();
        for (int i = 0; i < source.size(); i++) {
            target.add(source.get(i));
        }
    }

    public static void reverse(ArrayList<Integer> list) {
        Collections.reverse(list);

    }

    public static void reverseManual(ArrayList<Integer> list ) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i++) {
            temp.add(list.get(i));
        }
        for (int i = 0; i < list.size(); i++) {
            list.set(i, temp.get(i));
        }
    }

    public static void insertBeginningEnd(LinkedList<Integer> list, int value) {
        list.add(value);
        list.add(0, value);
    }

    public static void main(String[] args) {
        ArrayList<Integer> result = generateSquare();
        System.out.println("\n");

        insertFirst(result, 10);
        insertLast(result, 10);
        replace(result, 11);
        System.out.println(contains(result, 100));
        System.out.println("\n");


        removeThird(result);
        removeEvil(result);
        for (int i : result) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("\n");


        ArrayList<Integer> target = new ArrayList<Integer>();
        copy(result, target);
        reverse(target);
        for (int i : target) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("\n");


        LinkedList<Integer> list = new LinkedList<>(result);
        insertBeginningEnd(list, 1);
        for (int i : list) {
            System.out.print(i + " ");
        }
    }
}


