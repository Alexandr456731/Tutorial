import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class doubleLambda {
    public static void main(String[] args) {
        Function<String[], String[]> fa = (a) -> {

            String[] newArray = new String[a.length];
            for(int i = 0; i < a.length; i++){
                newArray[i] = deleteSpaces(a[i]);
            } new String();
            return newArray;
        };

        Function<String[], String[]> fb = fa.andThen((b) -> {

            String[] newArray = new String[b.length];
            for(int i = 0; i < b.length; i++){
                newArray[i] = b[i].toUpperCase();
            }
            return newArray;
        });

        String[] a = fb.apply(new String[]{"123", "fs", "nb     ", "v         c"});

        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }

    public static String delete(String stroka){

        StringBuilder a = new StringBuilder(stroka);
        for(int i = 0; i < stroka.length();){
            if(a.charAt(i) == ' ') {
                a.deleteCharAt(i);
            } else {
                i++;
            }
        }
        return a.toString();
    }

    
    public static String deleteSpaces(String stroka){


        for(int i = 0; i < stroka.length(); ){
            if (stroka.charAt(i) == ' ') {
                String a = stroka.substring(0, i);
                String b = stroka.substring(i + 1, stroka.length());
                stroka = a + b;
            } else {
                i++;
            }
        }
        return stroka;
    }
}
