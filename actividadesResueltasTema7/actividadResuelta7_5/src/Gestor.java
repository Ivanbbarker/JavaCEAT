class Gestor {
    public String nombre;
    private String tlf;
    double importeMax;

    public Gestor(String nombre, String tlf) {
        this.nombre = nombre;
        this.tlf = tlf;
        this.importeMax = 10000.0;
    }

    public Gestor(String nombre, String tlf, double importeMax) {
        this.nombre = nombre;
        this.tlf = tlf;
        this.importeMax = importeMax;
    }

    String getTlf(){
        return tlf;
    }
    
    void mostrarInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Tlf: " + tlf);
        System.out.println("Importe maximo: " + importeMax);
    }

}