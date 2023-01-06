import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class pridDemo {
    static List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

    public static void main(String[] args) {
        Predicate<Integer> predicate = integer -> {
            if (integer % 2 == 0) {
                return true;
            } else {
                return false;
            }
        };
//        System.out.println(predicate.test(6));

        list.stream().filter(t -> t % 2 == 0).forEach(System.out::println);
    }


}
