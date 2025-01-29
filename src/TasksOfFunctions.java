import java.util.*;

public class TasksOfFunctions {
    public static int minFrom2 (int a, int b){
        if(a > b){
            return a;
        }else if(a < b){
            return b;
        } else{
            return 0;
        }
    }

    public static boolean ifEven (int number){
        return number % 2 == 0;
    }

    public static int inSquare (int number){
        return (int) Math.pow(number, 2);
    }

    public static int inCube (int number){
        return (int) Math.pow(number, 3);
    }

    public static int inDegree(int number, int degree){
        return (int) Math.pow(number, degree);
    }

    public static boolean ifMore5(int number){
        if (number > 5){
            return true;
        } else if (number < 5){
            return false;
        } else {
            return false;
        }
    }

    
}
