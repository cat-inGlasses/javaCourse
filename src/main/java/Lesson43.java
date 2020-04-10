import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Lesson43 {
    public static void main(String[] args) throws ClassNotFoundException {
        Person2 person2 = new Person2();

        Class personClass = Person2.class;
        Class personClass2 = person2.getClass();
        Class personClass3 = Class.forName("Person2");

//        Method[] methods = personClass.getMethods();
//        for (Method method : methods) {
//            System.out.println(method.getName() + ", "
//                    + method.getReturnType() + ", "
//                    + Arrays.toString(method.getParameterTypes()));
//        }

//        Field[] fields = personClass.getFields();
//        Field[] fields = personClass.getDeclaredFields();
//        for (Field field : fields) {
//            System.out.println(field.getName() + ", "
//                    + field.getType());
//        }

        Annotation[] annotations = personClass.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
            if(annotation instanceof Author) {
                System.out.println("Yes");
            }
        }

    }
}
