public class ColaL {
    private Lista listilla;

    ColaL() {
        listilla = new Lista();
    }

    public boolean isEmpty() {
        return (listilla.numeroElementos() == -1);
    }

    public int numeroElementos() {
        System.out.println(listilla.numeroElementos());
        return listilla.numeroElementos();
    }

    public void enqueue(int elemento) {
        if (isEmpty() == true) {
            listilla.insertarPrincipio(elemento);
        }
        else{
            listilla.insertarFinal(elemento);
        }
    }

    public int dequeue() {
        if (isEmpty() == false) {
            int dato = listilla.eliminar(0);
            return dato;
        } else {
            System.out.println("No hay elementos en la cola"); 
            return 0;
        }
    }

}
