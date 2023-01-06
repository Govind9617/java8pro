import java.util.function.Supplier;

public class SupplerDemo {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "hie";
        System.out.println(supplier.get());
    }
}
