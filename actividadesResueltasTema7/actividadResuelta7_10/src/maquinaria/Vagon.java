package maquinaria;
class Vagon {
    int numIdentificacion;
    int cargaMax;
    int cargaActual;
    String mercancia;

    public Vagon(int numIdentificacion, int cargaMax, int cargaActual, String mercancia){
        this.numIdentificacion = numIdentificacion;
        this.cargaMax = cargaMax;
        this.cargaActual = cargaActual;
        this.mercancia = mercancia;
    }
}
