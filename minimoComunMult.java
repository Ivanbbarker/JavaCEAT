class minimoComunMult {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
       
        int n1, n2, nMin, maxDiv = 0;
        System.out.print("Introduce el primer numero: ");
        n1 = teclado.nextInt();
        System.out.print("Introduce el segundo numero: ");
        n2 = teclado.nextInt();
        
        nMin = n1 < n2 ? n1 : n2 ;
        
        for (int i = 1; i <= nMin; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                maxDiv = i;
            }
        }
        int mcm = (n1*n2)/maxDiv;
        System.out.println("El minimo comun multiplo es: " + mcm);
       teclado.close();
    }
}
