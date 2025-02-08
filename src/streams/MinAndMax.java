import java.util.*;

public class MinAndMax{
    public static void main (String[] args) {
        List<Integer> numbers = List.of(10, 3, 5, 7, 9, 2, 6, 8);
        System.out.println("min: " + numbers.stream().mapToInt(i -> i).min().getAsInt());
        System.out.println("max: " + numbers.stream().mapToInt(i -> i).max().getAsInt());
    }
}
