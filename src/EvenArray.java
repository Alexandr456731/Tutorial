import java.util.Scanner;

public class EvenArray {
    public static int[] randomMassive(int length, int min, int max) {
        int[] massive = new int[length];
        for (int i = 0; i < massive.length; i++) {
            massive[i] = randint(min, max);
        }
        return massive;
    }

    public static int randint(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static String printMassive(int[] massive){
        String string = "";
        for(int i = 0; i < massive.length; i++){
            string += massive[i] + " ";
        }
        return string;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        while (true) {
            n = scan.nextInt();
            if (n < 4) {
                System.out.println("Введите число побольше");
            } else {
                break;
            }
        }

        int[] massive = randomMassive(n, 0, n);

        int[] mass;

        if (n % 2 == 0){
            mass = new int[n / 2];
        }else {
            mass = new int[(n - 1) / 2];
        }

        for (int i = 0; i < massive.length; i++) {
            if (i % 2 == 0){
                mass[i / 2] = massive[i];
            }
        }

        System.out.println(printMassive(massive));
        System.out.println(printMassive(mass));

    }
}
