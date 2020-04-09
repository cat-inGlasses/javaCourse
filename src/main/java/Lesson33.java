import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson33 {
    public static void main(String[] args) {
        String text = "Hello, Guys! I send you my email joe@gmail.com so we can\n" +
                "keep in touch. Thanks, Joe! That's cool. I am sending you\n" +
                "my address: tim@o2.pl. Lets stay in touch...";

        Pattern email = Pattern.compile("(\\w+)@(gmail|o2)\\.(com|pl)");
        Matcher matcher = email.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }
}
