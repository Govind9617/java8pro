import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<Integer> consumer = t -> {
            System.out.println(t);
        };
        consumer.accept(1);
    }


}
