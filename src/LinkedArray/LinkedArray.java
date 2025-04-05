import java.util.*;

public class LinkedArray<T> implements List<T>{
    private class Node {
        private Node lastNode;
        private T value;
        private Node nextNode;

        private Node(Node lastNode, T value, Node nextNode){
            this.lastNode = lastNode;
            this.value = value;
            this.nextNode = nextNode;
        }

        private Node(T value, Node nextNode){
            this.value = value;
            this.nextNode = nextNode;
        }

        private Node(Node lastNode, T value){
            this.lastNode = lastNode;
            this.value = value;
        }

        private Node(T value){
            this.value = value;
        }
    }

    private Node firstEl;
    private Node lastEl;
    private int size;

    public LinkedArray() {}

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return firstEl == null;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T t) {
        if (firstEl == null){
            Node node = new Node(t);
            firstEl = node;
            lastEl = node;
        } else {
            Node node = new Node(lastEl, t);
            lastEl.nextNode = node;
            lastEl = node;//перезаписать указатель
        }
        size++;

        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        lastEl = null;
        firstEl = null;
        size = 0;
    }

    @Override
    public T get(int index) {
        Node node = null;
        if (index >= 0) {
            if (index < size / 2) {
                for (int i = 0; i < index + 1; i++) {
                    if (node == null) {
                        node = firstEl;
                    } else {
                        node = node.nextNode;
                    }
                }
            } else {
                for (int i = 0; i < size - index; i++) {
                    if (node == null) {
                        node = lastEl;
                    } else {
                        node = node.lastNode;
                    }
                }
            }
            return node.value;
        }else{
            throw  new IllegalArgumentException();
        }
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return List.of();
    }

    @Override
    public void addFirst(T t) {
        if (firstEl == null){
            Node node = new Node(t);
            firstEl = node;
            lastEl = node;
        } else {
            Node node = new Node(t, firstEl);
            firstEl.lastNode = node;
            firstEl = node;//перезаписать указатель
        }
        size++;
    }

    @Override
    public void addLast(T t) {
        add(t);
    }

    @Override
    public T getFirst() {
        return firstEl.value;
    }

    @Override
    public T getLast() {
        return lastEl.value;
    }

    @Override
    public T removeFirst() {
        Node node = firstEl;
        firstEl = node.nextNode;
        firstEl.lastNode = null;
        size--;
        return node.value;

    }

    @Override
    public T removeLast() {
        Node node = lastEl;
        lastEl = node.lastNode;
        lastEl.nextNode = null;
        size--;
        return node.value;
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("[");

        Node node = null;
        for (int i = 0; i < size(); i++) {
            if (node == null){
                node = firstEl;
            }else{
                node = node.nextNode;
            }

            str.append(node.value.toString());

            if (i < size() - 1){
                str.append(", ");
            }
        }
        str.append("]");

        return str.toString();
    }
}
