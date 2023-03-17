    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una palabra: ");
        String palabra = sc.next();
        System.out.print("Introduce un numero de letras a dividir: ");
        int n = sc.nextInt();
        mostrarPalabra(palabra, n, 0);
    }

    public static void mostrarPalabra(String palabra, int n, int inicio) {
        int contador = inicio;
        if (inicio + n > palabra.length()) {
            for (int i = inicio; i < palabra.length(); i++) {
                System.out.print(palabra.charAt(contador));
                contador++;
            }
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print(palabra.charAt(contador));
                contador++;

            }
            System.out.println("");
            mostrarPalabra(palabra, n, contador);
        }

    }
