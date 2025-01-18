public class UpMassive {
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

    public static boolean ifUp(int[] massive){
        boolean up = true;
        for (int i = 0; i < massive.length - 1; i++){
            if (massive[i] >= massive[i + 1]){
                up = false;
                break;
            }
        }
        return up;
    }

    public static String printMassive(int[] massive){
        String string = "";
        for(int i = 0; i < massive.length; i++){
            string += massive[i] + " ";
        }
        return string;
    }

    public static void main(String[] args){
        int[] massive = randomMassive(4, 10, 99);
        System.out.println(printMassive(massive));
        System.out.println(ifUp(massive));
    }

}
