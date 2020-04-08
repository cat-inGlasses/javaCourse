import java.util.*;

public class Lesson8 {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();


//        hashSet.add("Mike");
//        hashSet.add("Kate");
//        hashSet.add("Tom");
//        hashSet.add("George");
//        hashSet.add("Donald");
//
//        System.out.println(hashSet.contains("Tom"));
//        System.out.println(hashSet.contains("Downald"));
//
//        System.out.println(hashSet.isEmpty());


//        testSet(hashSet);
//        System.out.println("----");
//        testSet(linkedHashSet);
//        System.out.println("----");
//        testSet(treeSet);


        // operations
        operations();

    }

    public static void testSet(Set<String> set) {
        set.add("Mike");
        set.add("Kate");
        set.add("Tom");
        set.add("Tom");
        set.add("Tom");
        set.add("George");
        set.add("Donald");

        for (String name : set) {
            System.out.println(name);
        }

        System.out.println(set);

    }

    public static void operations() {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(0);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);

        // union
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println(union);

        // intersection
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println(intersection);

        // difference
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println(difference);
    }
}
