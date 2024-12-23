import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class RandomNumber {
    public static void main(String[] args) {
        Supplier<Integer> sup = () -> (int)(Math.random() * (10 - 1) + 1);
        for(int i = 0; i < 10; i++){
            System.out.print(sup.get() + " ");
        }
    }
}
