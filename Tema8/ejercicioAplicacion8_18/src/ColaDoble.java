public class ColaDoble extends Cola {

    public ColaDoble(int capacidad) {
        super(capacidad);
    }

    public void encolarPrincipio(Integer elemento){
        super.insertarFinal(elemento);
    }
    
    public Integer desencolarFinal(){
        return super.eliminar(0);
    }
}
