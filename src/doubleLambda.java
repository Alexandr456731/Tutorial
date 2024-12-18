import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void doubleLambda(String[] args) {
        Function<String[], String[]> fa = (a) -> {

            String[] newArray = new String[a.length];
            for(int i = 0; i < a.length; i++){
                newArray[i] = a[i].trim();
            }
            return newArray;
        };

        Function<String[], String[]> fb = fa.andThen((b) -> {

            String[] newArray = new String[b.length];
            for(int i = 0; i < b.length; i++){
                newArray[i] = b[i].toUpperCase();
            }
            return newArray;
        });

        String[] a = fb.apply(new String[]{"123", "fs", "nb     ", "vc"});

        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}
