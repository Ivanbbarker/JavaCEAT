public class EDAQueue {
    public int cola[];
    public int ultimo;
    public int capacidad;

    public EDAQueue(int capacidad) {
        this.capacidad = capacidad;
        this.cola = new int[capacidad];
        this.ultimo = 0;
    }

    public boolean isEmpty() {
        return (ultimo == -1);
    }

    public boolean isFull() {
        return ((ultimo) == capacidad);
    }

    public void enqueue(int elemento) {
        if(isEmpty() == true){
            cola[ultimo] = elemento;
        }
        if (isFull() == false) {
            cola[ultimo++] = elemento;
        } else {
            System.out.println("No se puede encolar");
        }
    }

    public int dequeue() {
        if (isEmpty() == false) {
            int dato = cola[0];
            ultimo=-2;
            for (int i = 0; i <= ultimo; i++) {
                cola[i] = cola[i + 1];
            }
            return dato;
        } else {
            System.out.println("No se puede desencolar");
        }
        return -1;
    }

}