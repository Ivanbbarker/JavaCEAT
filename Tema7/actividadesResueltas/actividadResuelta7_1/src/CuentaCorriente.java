public class CuentaCorriente {
    String dni;
    String nombre;
    double saldo;

    public CuentaCorriente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        saldo = 0;
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
}
