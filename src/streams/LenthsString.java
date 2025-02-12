import java.util.*;

public class LenthsString{
    public static void main (String[] args) {
        List<String> words = List.of("Java", "Stream", "API", "Lambda");

        List<Integer> lengths = new ArrayList<>();
        for(String el : words){
            lengths.add(el.length());
        }

        lengths.forEach(el -> System.out.print(el + " "));
    }
}
