public class HoraExacta extends Hora {
    protected int segundos;

    public HoraExacta(int hora, int minutos, int segundos) {
        super(hora, minutos);
        if (!setSegundos(segundos)) {
            System.out.println("Segundos incorrectos");
        }
    }

    public boolean setSegundos(int segundos) {
        boolean correcto = false;
        if (segundos >= 0 && segundos < 60) {
            this.segundos = segundos;
            correcto = true;
        }
        return correcto;
    }
    @Override
    public boolean equals(Object o) {
        HoraExacta otroReloj = (HoraExacta) o;
        boolean iguales;
        if (this.hora == otroReloj.hora 
        && this.minuto == otroReloj.minuto 
        && this.segundos == otroReloj.segundos) {
            iguales = true;
        } else {
            iguales = false;
        }
        return iguales;
    }

    @Override
    public void inc() {
        segundos++;
        if (segundos > 59) {
            segundos = 0;
            super.inc();
        }
    }

    @Override
    public String toString() {
        return super.toString() + ":" + segundos;
    }

}
