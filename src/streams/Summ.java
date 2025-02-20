import java.util.*;

public class Summ{
    public static void main (String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        int number = 0;
        for(int el : numbers){
            number += el;
        }
        System.out.println(number);
    }
}
