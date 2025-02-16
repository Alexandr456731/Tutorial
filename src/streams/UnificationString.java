import java.util.*;
import java.util.stream.Collectors;

public class UnificationString{
    public static void main (String[] args) {
        List<String> words = List.of("apple", "banana", "cherry");
        words.stream().map(Object::toString).collect(Collectors.joining(", "));
    }
}
