import java.util.Objects;

public class Pair <T1, T2>{
    private int id;
    private final T1 el1;
    private final T2 el2;

    private Pair(T1 el1, T2 el2){
        this.el1 = el1;
        this.el2 = el2;
        this.hashCode();
    }

    public static <T1, T2>Pair  of(T1 el1, T2 el2){
        return new Pair<T1, T2>(el1, el2);
    }

    public T1 getFirst(){
        return this.el1;
    }

    public T2 getSecond(){
        return this.el2;
    }



    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null || getClass() != obj.getClass())
            return false;

        Pair pair = (Pair) obj;
        return  this.id == ((Pair<?, ?>)obj).id && this.el1.equals(((Pair<?, ?>) obj).el1) && this.el2.equals(((Pair<?, ?>) obj).el2);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.el1 != null ? this.el1.hashCode() : 0);
        result = 31 * result + (this.el2 != null ? this.el2.hashCode() : 0);
        return result;
    }
}
