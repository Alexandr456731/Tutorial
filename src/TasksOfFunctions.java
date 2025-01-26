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

    class ConsoleCalculator{
        private static Scanner scan = new Scanner(System.in);
        public static int getInt(){
            int number;
            while (true){
                try{
                    System.out.print("Введите число: ");
                    number = scan.nextInt();
                    return number;
                }catch (InputMismatchException e){
                    System.out.println("Ошибка!");
                    scan.nextLine();
                }
            }
        }

        public static char getOperation(){
            String stroka = "e";

            boolean work = true;
            while (work){
                System.out.println("\"+\" - сложение");
                System.out.println("\"-\" - вычитаение");
                System.out.println("\"*\" - умножение");
                System.out.println("\"/\" - деление");
                System.out.print("Введите тип действия: ");
                stroka = scan.nextLine();

                switch (stroka){
                    case "+", "-", "*", "/":
                        work = false;
                        break;
                    default:
                        System.out.println("ошибка");
                }
            }
            return stroka.charAt(0);
        }

        public static int calc(int num1, int num2, char operation){
            switch (operation){
                case '+':
                    return num1 + num2;
                case '-':
                    return num1 - num2;
                case '*':
                    return num1 * num2;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Делить на нуль нельзя!");
                        if (num1 == 0){
                            return 0;
                        }else if(num1 < 0){
                            return -1;
                        }else {
                            return 1;
                        }
                    }else{
                        return num1 - num2;
                    }
                default:
                    System.out.println("ошибка");
                    return 0;
            }
        }

        public static void main(){
            System.out.println("Резкльтат: " + calc(getInt(), getInt(), getOperation()));
        }
    }
}
