class DecimalABinario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroDecimal;

        System.out.print("Introduce el numero decimal: ");
        numeroDecimal = sc.nextInt();
        int cociente = numeroDecimal;
        int binario = 0 , controlador = 1;
        boolean terminar = false;
        while (terminar == false) {
            int resto = cociente % 2;
            cociente = cociente / 2;
            System.out.println(resto);
            binario = binario + (resto * controlador);
            if (cociente == 1) {
                terminar = true;
                if (resto == 1 || resto == 0) {
                    System.out.println(cociente);
                    controlador *=10;
                    binario = binario + (cociente * controlador);
                }
            }
            controlador *= 10;
        }
        System.out.println("El numero decimal ("+ numeroDecimal+ ") es: "+binario);
    }
}
