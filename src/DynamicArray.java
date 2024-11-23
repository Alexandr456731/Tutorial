public class DynamicArray<T>  {

    private T[] array;
    private int length;
    private int V;


    public DynamicArray(){
        this.length = 0;
        this.V = 10;
        this.array = (T[]) new Object[this.V];
    }

    public void add(T el){
        if(this.V - this.length < 1){
            this.V += 5;
            T[] newArray = (T[]) new Object[this.V];
            System.arraycopy(this.array, 0, newArray, 0, this.length);
            this.array = newArray;
        }
        this.array[this.length] = el;
        this.length++;
    }
    public void remove(int index) {
        if(this.V - this.length > 4) {
            this.V -= 5;
        }

        T[] newArray = (T[]) new Object[this.V];
        System.arraycopy(this.array, 0 , newArray, 0, index);
        System.arraycopy(this.array, index + 1, newArray, index, this.length - index - 1);

        this.array = newArray;
        this.length--;
    }
    public int getLength(){
        return this.length;
    }

    public int getV() {
        return this.V;
    }

    public T get(int index){
        if(index >= this.length)
            throw new ArrayIndexOutOfBoundsException();
        return this.array[index];
    }
}
