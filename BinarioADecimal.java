class BinarioADecimal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int decimal = 0, digito, exponente = 0;
        System.out.print("Introduce el numero binario: ");
        int binario = sc.nextInt();
        for (int i = binario; i > 0; i /= 10) {
            digito = (int) (i % 10);
            decimal += digito * Math.pow(2, exponente);
            exponente++;
        }
        System.out.println("El numero decimal (" + binario + ") es: " + decimal);   
    }
}
