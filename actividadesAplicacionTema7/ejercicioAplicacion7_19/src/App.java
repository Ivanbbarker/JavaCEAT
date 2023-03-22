public class App {
    public static void main(String[] args) throws Exception {
        EDAStack pilita = new EDAStack(5);
        pilita.push(1);
        pilita.push(12);
        pilita.push(3);
        pilita.push(4);
        pilita.push(5);
        int r = pilita.pop();
        System.out.println(r);
    }
}
