package node;

public class Node<T>{
    private T value;
    private T next;
    private T prev;

    public Node(T obj){
        this.value = obj;
        this.next = null;
        this.prev = null;
    }

    public T getValue(){
        return this.value;
    }

    public T getNext(){
        return this.next;
    }

    public T getPrev() {
        return prev;
    }

    public void setValue(T obj){
        this.value = obj;
    }

    public void setNext(T obj){
        this.next = obj;
    }

    public void setPrev(T prev) {
        this.prev = prev;
    }   
}