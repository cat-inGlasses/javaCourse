import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
        // because of convention for collections it is better to create the with the type of inteface
        // but not with the type of class, so it will be:
//        List<Integer> list = new ArrayList<>();
//
//
//        for (int i = 0; i < 10; i++) {
//            list.add(i);
//        }

        // step. 1
//        System.out.println(list);
//        System.out.println(list.get(0));
//        System.out.println(list.get(99));
//        System.out.println(list.size());

        // step. 2
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//
//        for (Integer i : list) {
//            System.out.println(i);
//        }

        // step 3
//        list.remove(5);
//        System.out.println(list);

        //------------------
//        Lesson 3: Linked List
//        List<Integer> linkedList = new LinkedList<>();
//        List<Integer> arrayList = new ArrayList<>();
//
//        measureTime(linkedList);
//        measureTime(arrayList);

        //------------------
        // lesson 4
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(10);
        System.out.println(myLinkedList);

        System.out.println(myLinkedList.get(1));

        myLinkedList.remove(1);
        System.out.println(myLinkedList);
        myLinkedList.remove(1);
        System.out.println(myLinkedList);
        myLinkedList.remove(0);
        System.out.println(myLinkedList);


    }

    private static void measureTime(List<Integer> list) {

        // 2
//        for (int i = 0; i < 100000; i++) {
//            list.add(i);
//        }

        long start = System.currentTimeMillis();

        // 1
//        for (int i = 0; i < 1000000; i++) {
//            list.add(i);
//        }

        // 2
//        for (int i = 0; i < 10000; i++){
//            list.get(i);
//        }

        for (int i = 0; i < 100000; i++) {
            list.add(0,i);
        }

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
