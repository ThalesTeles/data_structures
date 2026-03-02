package linked_list;

public class EmptyListException extends Exception{
    @Override
    public String toString() {
        return "The List is Empty! Insert a node first before removing it";
    }
}
