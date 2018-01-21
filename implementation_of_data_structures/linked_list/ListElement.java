public class ListElement<T> {
    private T data;
    private ListElement<T> next;

    public ListElement(T value) {
        data = value;
    }

    public T getData() {
        return data;
    }

    public void setData(T value) {
        data = value;   
    }

    public ListElement<T> getNext() {
        return next;
    }

    public void setNext(ListElement<T> element){
        next = element;
    }
}
