public class EDAStack {
    public int pila[];
    public int top;
    public int capacidad;

    public EDAStack(int capacidad) {
        this.capacidad = capacidad;
        pila = new int[capacidad];
        top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == capacidad);
    }

    public void push(int elemento) {
        if (isEmpty() == true) {
            pila[0] = elemento;
        }
        if (isFull() == false) {
            pila[++top] = elemento;
        } else {
            System.out.println("Stack Full");
        }
    }

    public int pop() {
        if (isEmpty() == false) {
            return pila[top--];
        } else {
            System.out.println("Cannot pop from empty stack");
        }
        return -1;
    }
}