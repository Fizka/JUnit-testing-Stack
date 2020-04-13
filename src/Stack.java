import java.util.LinkedList;

public class Stack<T> {

    private LinkedList<T> lista;

    public Stack()
    {
        lista = new LinkedList<>();
    }

    public boolean isEmpty()
    {
        return lista.isEmpty();
    }

    public void push(T t) {
        lista.add(t);
    }

    public T top() throws Exception {
        if(lista.getLast() == null) {
            throw new Exception("Stack is empty");
        }
        return lista.getLast();
    }

    public T pop() throws Exception {
        if(lista.isEmpty()) {
            throw new Exception("Stack is empty");
        }

        return lista.removeLast();
    }

    public int getSize() {
        return lista.size();
    }

    public void print() {
        System.out.println(lista);
    }
}
