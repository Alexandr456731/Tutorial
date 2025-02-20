import java.util.*;

public class PowNumbers{
    public static void main (String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 2, 4, 3, 5);
        numbers.stream().distinct().map(el -> el * el).forEach(System.out::println);
    }
}
