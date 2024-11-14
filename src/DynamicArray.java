public class DynamicArray<T> {

    private T[] Array;
    public int length;

    public  DynamicArray(){}
    public DynamicArray(T[] array){
        setArray(array);
    }

    private void setArray(T[] array){
        this.Array = array;
    }

    public void add(T el){
        T[] oldArray = this.Array;
        Object[] array = new Object[oldArray.length + 1];

        for(byte i = 0; i < oldArray.length; i++){
            array[i] = oldArray[i];
        }
        array[array.length - 1] = el;

        this.length = array.length;
        this.Array = (T[]) array;
    }
    public void remove(int index){
        T[] oldArray = this.Array;
        Object[] array = new Object[oldArray.length - 1];

        for(byte i = 0; i < oldArray.length; i++){
            if(i == index){
                continue;
            }else if(i < index) {
                array[i] = oldArray[i];
            }else{
                array[i - 1] = oldArray[i];
            }
        }

        this.length = array.length;
        this.Array = (T[]) array;
    }
    public T get(int index){
        return this.Array[index];
    }
}
