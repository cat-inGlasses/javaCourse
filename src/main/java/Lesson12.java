import java.util.*;

public class Lesson12 {

    public static void main(String[] args) {

        List<String> animals = new ArrayList<>();

        animals.add("dog");
        animals.add("catpl");
        animals.add("cat");
        animals.add("frog");
        animals.add("a");
        animals.add("bird");
        animals.add("bd");

        System.out.println(animals);
        Collections.sort(animals, new StringLengthComparator());
        System.out.println(animals);


        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(0);
        numbers.add(500);
        numbers.add(100);

        System.out.println(numbers);
        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(numbers);

        List<Person> people = new ArrayList<>();
        people.add(new Person(3, "Mike"));
        people.add(new Person(2, "Kate"));
        people.add(new Person(1, "Bob"));

        System.out.println(people);

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if(o1.getId() > o2.getId()) return 1;
                if(o1.getId() < o2.getId()) return -1;
                return 0;
            }
        });

        System.out.println(people);

    }
}

class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        /*

        o1 > o2 => 1
        o1 < o2 => -1
        o1 == o2 => 0

        compare(2,1) => 1
        compare(1,2) => -1
        compare(1,1) => 0

        */

        if (o1.length() > o2.length()) {
            return 1;
        } else if (o1.length() < o2.length()) {
            return -1;
        } else {
            return 0;
        }
    }
}


class BackwardsIntegerComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 > o2) return -1;
        if (o1 < o2) return 1;
        return 0;
    }
}

