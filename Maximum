public class Maximum {
    public static void main(String[] args){
        int[] numbers = new int[12];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = randint(-15, 15);

        }

        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\n" + maximum(numbers));
    }


    public static int randint(int min, int max){
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static int maximum(int[] numbers){
        int max = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        return max;
    }
}
