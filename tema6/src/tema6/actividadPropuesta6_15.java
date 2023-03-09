package tema6;

/**
 *
 * @author java
 */
public class actividadesPropuestas6_15 {


    public static void construirEncabezado(String encabezado, String parrafo) {
        System.out.println("<DOCTYPE!>\n<html>\n\t<head>\n\t\t<title><h1 " + encabezado + " </h1></title>\n\t</head>"); 
        System.out.println("\t<body>\n\t\t<p> " + parrafo + " </p>\n\t</body>\n</html>");
    }
    
    public static String pedirEncabezado(){
        String encabezado;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el encabezado: ");
        encabezado = sc.nextLine();
        return encabezado;
    }
    
     public static String pedirParrafo(){
        String parrafo;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el parrafo: ");
        parrafo = sc.nextLine();
        return parrafo;
    }
    
    public static void main(String[] args) {
        construirEncabezado(pedirEncabezado(), pedirParrafo());
    }

}
