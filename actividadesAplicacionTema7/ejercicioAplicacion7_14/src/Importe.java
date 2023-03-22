public class Importe {
    double importe;

    public double getImporte() {
        return this.importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    Importe(double importe) {
        this.importe = importe;
    }


    public void calcular() {
        double[] monedas = { 500, 200, 100, 50, 20, 10, 5, 2, 1, 0.5, 0.20, 0.10, 0.05, 0.02, 0.01 };
        double[] devolver = {monedas.length};
        for (int i = 0; i < monedas.length; i++) {
            if (getImporte() >= monedas[i]) {
                devolver[i] = Math.floor(getImporte() / monedas[i]);
                setImporte(getImporte() - (devolver[i] * monedas[i]));
                
            }
        }
        for (int i = 0; i < monedas.length; i++) {
            if (devolver[i] > 0) {
                if (monedas[i] > 2) {
                    System.out.println("Hay " + devolver[i] + " billetes de: " + monedas[i] + " Euros");
                } else {
                    System.out.println("Hay " + devolver[i] + " monedas de: " + monedas[i] + " Euros");
                }
            }
        }
    }

}