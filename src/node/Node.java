package node;

public class Node<T>{
    private T value;
    private Node<T> next;
    private Node<T> prev;

    public Node(T obj){
        this.value = obj;
        this.next = null;
        this.prev = null;
    }

    public T getValue(){
        return this.value;
    }

    public Node<T> getNext(){
        return this.next;
    }

    public Node<T> getPrev() {
        return prev;
    }

    public void setValue(T obj){
        this.value = obj;
    }

    public void setNext(Node<T> node){
        this.next = node;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }   
}