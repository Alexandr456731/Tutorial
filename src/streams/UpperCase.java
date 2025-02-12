import java.util.*;

public class UpperCase{
    public static void main (String[] args) {
        List<String> words = List.of("hello", "world", "java", "stream");

        words.stream().map(el -> el.toUpperCase()).forEach(System.out::println);
    }
}
