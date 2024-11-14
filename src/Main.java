public class Main {
    public static void main(String[] args) {
        DynamicArray<Integer> array = new DynamicArray<>(new Integer[]{325,321,3,4,4});

        array.remove(1);

        for(byte i = 0; i < array.length; i++){
            System.out.println(array.get(i));
        }
    }
}
