public class CuentaCorriente {
    String dni;
    public String nombre;
    private double saldo;
    static private String nombreBanco = "International Java Bank";

    public CuentaCorriente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        saldo = 0;
    }

    public CuentaCorriente(String dni, double saldo) {
        this.dni = dni;
        this.nombre = "Sin asignar";
        this.saldo = saldo;
    }

    public CuentaCorriente(String dni, String nombre, double saldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    boolean egreso(double cantidad) {
        boolean operacionPosible = false;
        if (saldo >= cantidad) {
            saldo -= cantidad;
            operacionPosible = true;
        } else {
            System.out.println("No hay dinero suficiente");
            operacionPosible = false;
        }
        return operacionPosible;
    }

    void ingreso(double cantidad) {
        saldo += cantidad;
    }

    void mostrarInformacion() {
        System.out.println("DNI: " + dni);
        System.out.println("Nombre: " + nombre);
        System.out.println("Saldo: " + saldo + " euros");
    }

    static void setBanco(String nuevoBanco) {
        nombreBanco = nuevoBanco;
    }
    static String getBanco() {
        return nombreBanco;
    }
}