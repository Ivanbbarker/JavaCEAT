public class Main {
    public static void main(String[] args) throws Exception {
        CuentaCorriente c1, c2;
        c1 = new CuentaCorriente("12345678-A","Pepe");
        c2 = new CuentaCorriente("999999-E","Ana");
        c1.mostrarInformacion();
        CuentaCorriente.setBanco("Banco Central");
        c1.mostrarInformacion();
        CuentaCorriente.setBanco("Caja de ahorros de Do-While");
        c1.mostrarInformacion();
        c2.mostrarInformacion();
    }
}
