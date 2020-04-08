import java.util.Stack;

public class Lesson15 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(); // LIFO queue

        stack.push(5);
        stack.push(3);
        stack.push(1);

//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop()); // Exception thrown
//        System.out.println(stack);

//        System.out.println(stack.peek());
//        System.out.println(stack.pop());
//        System.out.println(stack);

        while (!stack.empty()) {
            System.out.println(stack.pop());
        }

    }
}
