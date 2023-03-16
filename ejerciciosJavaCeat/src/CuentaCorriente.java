
class CuentaCorriente {
    String nombre;
    String dni;
    double saldo;
    int numeroCuenta;

    CuentaCorriente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        saldo = 0;
        numeroCuenta = 0;
    }

    /*
     * int generarNumeroCuenta() {
     * Programa de generacion aleatoria en
     * }
     */
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

    public int getNumeroCuenta() {
        return this.numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

}
