public class ArithmeticMean {
    public static int[] randomMassive(int length, int min, int max) {
        int[] massive = new int[length];
        for (int i = 0; i < massive.length; i++){
            massive[i] = randint(min, max);
        }
        return massive;
    }

    public static int randint(int min, int max){
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static String printMassive(int[] massive){
        String string = "";
        for(int i = 0; i < massive.length; i++){
            string += massive[i] + " ";
        }
        return string;
    }

    public static float arethmeticMean(int[] massive){
        float number = 0;
        for(int i = 0; i < massive.length; i++){
            number += massive[i];
        }
        number /= massive.length;
        return number;
    }

    public static void main(String[] args){
        int[] massive1 = randomMassive(5, 0, 5);
        int[] massive2 = randomMassive(5, 0, 5);

        System.out.println(printMassive(massive1));
        System.out.println(arethmeticMean(massive1));

        System.out.println(printMassive(massive2));
        System.out.println(arethmeticMean(massive2));
    }

}
