public class Hora {
    protected int hora;
    protected int minuto;

    Hora(int hora, int minuto) {
        this.hora = 0;
        this.minuto = 0;
        if (!setHora(hora)) {
            System.out.println("La hora es incorrecta");
        }
        if (!setMinutos(hora)) {
            System.out.println("Los minutos no son válidos");
        }
    }

    public void inc() {
        minuto++;
        if (minuto > 59) {
            hora++;
            minuto = 0;
            if (hora > 23) {
                hora = 0;
            }
        }
    }

    public boolean setMinutos(int minutos) {
        boolean correcto = false;
        if (0 <= minutos && minutos < 60) {
            this.minuto = minutos;
            correcto = true;
        }
        return correcto;
    }

    public boolean setHora(int hora) {
        boolean correcto = false;
        if (0 <= hora && hora < 24) {
            this.hora = hora;
            correcto = true;
        }
        return correcto;
    }

    @Override
    public String toString() {
        return hora + ":" + minuto;
    }

}
