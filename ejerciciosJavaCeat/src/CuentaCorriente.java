
class CuentaCorriente {
    String nombre;
    String dni;
    double saldo;
    String numeroCuenta;

    CuentaCorriente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        saldo = 0;
        numeroCuenta = "";
    }
    boolean egreso(double cantidad) {
        boolean operacionPosible;
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
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Saldo: " + saldo + " $");
        System.out.println("Numero de cuenta: " + numeroCuenta);
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return this.numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

}
