public class Cola extends Lista {

    public int ultimo;
    public int capacidad;

    public Cola(int capacidad) {
        this.ultimo = 0;
        this.capacidad = capacidad;
    }

    public boolean isEmpty() {
        return (ultimo == -1);
    }

    public boolean isFull() {
        return (ultimo == capacidad);
    }

    public void enqueue(int elemento) {
        if(isEmpty() == true){
            tabla[ultimo] = elemento;
        }
        if (isFull() == false) {
            tabla[ultimo++] = elemento;
        } else {
            System.out.println("No se puede encolar");
        }
    }

    public int dequeue() {
        if (isEmpty() == false) {
            int dato = tabla[0];
            ultimo=-2;
            for (int i = 0; i <= ultimo; i++) {
                tabla[i] = tabla[i + 1];
            }
            return dato;
        } else {
            System.out.println("No se puede desencolar");
        }
        return -1;
    }

}
