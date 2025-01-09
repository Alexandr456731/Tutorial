public class MassiveReverse {
    public static void main(String[] args){
        int[][] mass = new int[][]{
                {2, 6, 3},
                {3, 7, 4},
                {4, 8, 6},
                {5, 9, 7}
        };

        for(int i = 0; i < mass[0].length; i++){
            for(int j = 0; j < mass.length; j++){
                System.out.print(mass[j][i] + " ");
            }
            System.out.println();
        }
    }
}
