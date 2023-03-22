public class App {
    public static void main(String[] args) throws Exception {
        EDAQueue colita = new EDAQueue(5);
        colita.enqueue(10);
        colita.enqueue(2);
        colita.enqueue(1);
        colita.enqueue(12);
        colita.enqueue(3);
        int r = colita.dequeue();
        System.out.println(r);

    }
}
