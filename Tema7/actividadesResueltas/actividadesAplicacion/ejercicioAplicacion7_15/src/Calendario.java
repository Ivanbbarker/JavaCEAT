public class Calendario {

    int año;
    int mes;
    int dia;

    public Calendario(int año, int mes, int dia) {
        this.año = año;
        this.mes = mes;
        this.dia = dia;
    }

    public void incrementarDia() {
        if (dia == 31 || (dia == 28 && mes == 2)) {
            this.dia = 1;
            mes++;
            if (mes == 13) {
                this.mes = 1;
                año++;
            }
        } else {
            dia++;
        }
    }

    public void incrementarMes() {
        if (mes == 13) {
            this.mes = 1;
            año++;
        } else {
            mes++;
        }
    }

    public void incrementarAño(int cantidad) {
        this.año = año + cantidad;
    }

    public void mostrarCalendario() {
        System.out.println("Año: " + año);
        System.out.println("Mes: " + mes);
        System.out.println("Dia: " + dia);
    }

    public boolean iguales(Calendario c) {
        if (this.año == c.año && this.mes == c.mes && this.dia == c.dia) {
            return true;
        } else {
            return false;
        }
    }

}