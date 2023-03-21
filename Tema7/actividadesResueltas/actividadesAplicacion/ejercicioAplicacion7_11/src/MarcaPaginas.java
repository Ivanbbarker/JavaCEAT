public class MarcaPaginas {
    public int paginaLeida;
    public int paginaMax;
    public int paginasRestantes;

    MarcaPaginas( int paginaLeida, int paginaMax ) {
        this.paginaLeida = 0;
        this.paginaMax = paginaMax;
        this.paginasRestantes = paginaMax;
    }

    public int incrementaPagina() {
        System.out.println("Leyendo pagina...");
        this.paginasRestantes--;
        return this.paginaLeida++;
    }
    public int getUltimaPagina() {
        return paginaLeida;
    }

    public int setPrincipio() {
        System.out.println("Volviendo a empezar el libro...");
        this.paginasRestantes = paginaMax;
        return paginaLeida = 0;
    }

    public int getPaginaMax() {
        return paginaMax;
    }
    public void setPaginaMax(int paginaMax) {
        this.paginaMax = paginaMax;
    }
    
    void mostrarInforcion(){
        System.out.println("La pagina leida es: " + paginaLeida);
        System.out.println("El numero de paginas restantes del libro es: " + paginasRestantes);
    }


}
