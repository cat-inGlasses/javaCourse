import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Lesson14 {
    public static void main(String[] args) {

        Person person1 = new Person(1, "A");
        Person person2 = new Person(2, "B");
        Person person3 = new Person(3, "C");
        Person person4 = new Person(4, "D");
//
//        Queue<Person> people = new LinkedList<>();
//        people.add(person3);
//        people.add(person2);
//        people.add(person4);
//        people.add(person1);
//
//        for (Person person : people) {
//            System.out.println(person);
//        }


        Queue<Person> people2 = new ArrayBlockingQueue<Person>(3);
        System.out.println(people2.offer(person3));
        System.out.println(people2.offer(person2));
        System.out.println(people2.offer(person4));
        System.out.println(people2.offer(person1));

//        System.out.println(people2.remove());
//        System.out.println(people2.peek());
//        System.out.println(people2);

//        for (Person person : people) {
//            System.out.println(person);
//        }



    }
}
