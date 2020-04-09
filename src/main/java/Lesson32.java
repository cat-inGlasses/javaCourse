import java.util.Arrays;

public class Lesson32 {
    public static void main(String[] args) {
        String a = "Hello.there.hey";
        String[] words = a.split("\\.");
        System.out.println(Arrays.toString(words));

        String b = "Hello there hey";
        String modifiedString = b.replaceAll(" ", ".");
        String modifiedString2 = b.replaceFirst(" ",  ".");
        System.out.println(modifiedString);
        System.out.println(modifiedString2);

    }
}
