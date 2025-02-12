import java.util.*;

public class Sorts{
    public static void main (String[] args) {
        List<Integer> numbers = List.of(3, 1, 4, 1, 5, 9, 2, 6, 5);

        List<Integer> sorter = new ArrayList<>(numbers.stream().toList());
        sorter.sort((a, b) -> b - a);
        sorter.forEach(System.out::println);
    }
}
