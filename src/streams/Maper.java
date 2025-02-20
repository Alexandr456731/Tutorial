import java.util.*;
import java.util.stream.Collectors;

public class Maper{
    public static void main (String[] args) {
        List<String> words = List.of("a", "bb", "ccc", "dd", "eee", "ffff");
        Map<Integer, List<String>> map= words.stream().collect(Collectors.groupingBy(String::length));
        map.forEach((el1, el2) -> System.out.println(el1 + " - " + el2));
    }
}
