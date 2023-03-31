public class Pila extends Lista {
    
    public int top;
    public int capacidad;

    public Pila(int capacidad) {
        this.capacidad = capacidad;
        this.top = -1;
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == tabla.length);
    }

    public void push(int elemento) {
        if (isEmpty() == true) {
            tabla[0] = elemento;
        }
        if (isFull() == false) {
            tabla[++top] = elemento;
        } else {
            System.out.println("Stack Full");
        }
    }

    public int pop() {
        if (isEmpty() == false) {
            return tabla[top--];
        } else {
            System.out.println("Cannot pop from empty stack");
        }
        return -1;
    }



}