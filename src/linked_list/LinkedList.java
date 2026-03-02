package linked_list;

import node.Node;

//TODO: finish implementation
public class LinkedList<T> {
    Node<T> head = null;

    public LinkedList(){}

    // Initialize the list starting from the root node.
    public LinkedList(Node<T> node){
        this.head = node;
    }

    public void insert(Node<T> node){
        if(head == null){
            head = node;
        } else {
            
        }

    }

    // Returns true if the node was removed, false otherwise.
    public boolean remove(Node<T> node) throws EmptyListException{
        boolean result = false;
        if (head == null){
            throw new EmptyListException();
        }
        if(head.equals(node)){
            head = node.getNext();
            result = true;
        } else {
            Node<T> temp = head;
            while(temp != null && !temp.getNext().equals(node)){
                temp = temp.getNext();
            }
            if(temp != null){
                temp.setNext(node.getNext());
                result = true;
            }
        }

        return result;
    }

    public Node<T> search(Node<T> node){
        Node<T> temp = head;
        while(temp.getNext() != null){
            if(temp.equals(node)){
                return temp;
            }
            temp = temp.getNext();
        }
        return null;
    }
}
