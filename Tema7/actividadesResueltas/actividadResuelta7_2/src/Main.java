public class Main {
    public static void main(String[] args) throws Exception {
        CuentaCorriente c;
        c = new CuentaCorriente("12345678A","Pepe");
        c.ingreso(1000);
        c.egreso(300);
        c.mostrarInformacion();
        System.out.println("Puedo sacar 700 euros: "+ c.egreso(700));
        System.out.println("Puedo sacar 500 euros: "+ c.egreso(500));

        c = new CuentaCorriente("12345678-Z",200);
        c.mostrarInformacion();
    }
}
