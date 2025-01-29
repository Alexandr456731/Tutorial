import java.util.*;

class ConsoleCalculator{
        private static Scanner scan = new Scanner(System.in);
        public static double getInt(){
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

        public static Type getOperation(){
            String stroka = "e";

            boolean work = true;
            System.out.println("\"+\" - сложение");
            System.out.println("\"-\" - вычитаение");
            System.out.println("\"*\" - умножение");
            System.out.println("\"/\" - деление");
            while (work){
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
            switch (stroka){
                case "+":
                    return Type.ADDITION;
                case "-":
                    return Type.SUBTRACTION;
                case "*":
                    return Type.MULTIPLICATION;
                case "/":
                    return Type.DIVISION;
                default:
                    throw new IllegalArgumentException("Вы ввели не то!");
            }
        }

        public static double calc(double num1, double num2, Type operation){
            switch (operation){
                case Type.ADDITION:
                    return num1 + num2;
                case Type.SUBTRACTION:
                    return num1 - num2;
                case Type.MULTIPLICATION:
                    return num1 * num2;
                case Type.DIVISION:
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
                    throw new IllegalArgumentException("Критическая ошибка");
            }
        }

        public static void main(String[] args){
            System.out.println("Резкльтат: " + calc(getInt(), getInt(), getOperation()));
        }

        private enum Type {
            ADDITION, SUBTRACTION, MULTIPLICATION, DIVISION}

    }
