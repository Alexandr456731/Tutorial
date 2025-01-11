public class randomMassive {
    public static String printMassive(int[] massive){
        String stroka = "";
        stroka += "[";
        for(int i = 0; i < massive.length; i++) {
            stroka += massive[i];
            if (i + 1 == massive.length) {
                break;
            } else {
                stroka += ", ";
            }
        }
        stroka += "]";

        return stroka;
    }


    public static int randint(int min, int max){
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static void main(String[] args) {
        int[] massive = new int[8];
        for (int i = 0; i < massive.length; i++) {
            massive[i] = randint(1, 10);
        }

        System.out.println(printMassive(massive));

        for(int i = 0; i < massive.length; i++){
            if(i % 2 != 0){
                massive[i] = 0;
            }
        }

        System.out.println(printMassive(massive));
    }
}
