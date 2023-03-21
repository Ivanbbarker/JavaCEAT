public class CuentaCorriente {
    String dni;
    public String nombre;
    private double saldo;
    static private String nombreBanco = "International Java Bank";
    Gestor gestor;

    CuentaCorriente(String dni, String nombre, Gestor gestor) {
        this(dni, nombre);
        this.gestor = gestor;
    }

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
        if (gestor == null) {
            System.out.println("Cuenta sin gestor");
        } else {
            System.out.println("Informacion del gestor");
            gestor.mostrarInformacion();
            System.out.println("Informacion de la cuenta");
            System.out.println("Nombre: " + nombre);
            System.out.println("Dni: " + dni);
            System.out.println("Saldo: " + saldo);
        }
    }

    static void setBanco(String nuevoBanco) {
        nombreBanco = nuevoBanco;
    }
    static String getBanco() {
        return nombreBanco;
    }

    void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }
}
