import java.util.*;

public class filterWords{
    public static void main (String[] args) {
        List<String> words = List.of("apple", "banana", "cherry", "grape", "kiwi");

        System.out.print("массив: ");
        words.stream()
                .filter(el -> el.toLowerCase().contains("a"))
                .forEach(el -> System.out.print(el + " "));
        System.out.print("\nКол-во слов: " + words.stream()
                .filter(el -> el.toLowerCase().contains("a"))
                .count());
    }
}
