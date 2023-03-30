public class Supercola {
    Cola cola1 = new Cola(){
        Lista l = new Lista();
        @Override
        public void encolar(Integer nuevo) {
            System.out.println("hOLA");
            l.insertarFinal(nuevo);
        }
        @Override
        public Integer desencolar() {
            if(l.tabla.length == 0){
                return null;
            } else{
                return l.eliminar(0);
            }
            
        }
        @Override
        public int numeroElementos() {
            return l.tabla.length;
        }
    };

    Cola cola2 = new Cola(){
        Lista l = new Lista();
        @Override
        public void encolar(Integer nuevo) {
            System.out.println("hOLA");
            l.insertarFinal(nuevo);
        }
        @Override
        public Integer desencolar() {
            if(l.tabla.length == 0){
                return null;
            } else{
                return l.eliminar(0);
            }
            
        }
        @Override
        public int numeroElementos() {
            return l.tabla.length;
        }
    };

    Supercola(){}

    public void encolar1(Integer nuevo){
        cola1.encolar(nuevo);
    }

    public void encolar2(Integer nuevo){
        cola2.encolar(nuevo);
    }

    public Integer desencolar1(){
        if(cola1.numeroElementos() == 0){
            desencolar2();
        }
        return cola1.desencolar();
    }

    public Integer desencolar2(){
        if(cola2.numeroElementos() == 0){
            desencolar1();
        }
        return cola2.desencolar();
    }



}
