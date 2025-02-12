import java.util.*;

public class LenthsString{
    public static void main (String[] args) {
        List<String> words = List.of("Java", "Stream", "API", "Lambda");

        words.stream().mapToInt(el -> el.length()).forEach(System.out::println);
    }
}
