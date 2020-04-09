public class Lesson31 {
    public static void main(String[] args) {
        /*
         \\d - one digit
         \\w - one letter

         + - one or more
         * - 0 or more
         ? - 0 or 1

         (x|y|z) - one of string from the set

         [abc] == (a|b|c)
         [0-9] == \\d
         [a-zA-Z] - all of latin letters
         [^abc] - all latin symbols except a,b and c

         . - any symbol

         {2} - exect 2 symbols
         {2,} - from 2 till infinity
         {2,5} - from 2 till 5 symbols
        * */
        String a = "1";
        System.out.println(a.matches("\\d"));
    }
}
