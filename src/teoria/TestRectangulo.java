package teoria;

import java.util.Arrays;
import java.util.Scanner;

public class TestRectangulo {
    private final static Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {

        int numeroRectangulos = solicitarAUsuarioNumRectangulos();
        Rectangulo[] rectangulos = new Rectangulo[numeroRectangulos];
        System.out.println(Arrays.toString(rectangulos)); //vemos los datos iniciales
        SCANNER.nextLine();
        for (int i = 0; i < rectangulos.length; i++) {
            rectangulos[i] = crearRectangulo();
        }
        mostrarRectangulos(rectangulos);
        SCANNER.close();
    }

    private static void mostrarRectangulos(Rectangulo[] rectangulos) {
        for (Rectangulo rectangulo : rectangulos) {
            System.out.println(rectangulo.toString());
        }
    }
    private static int devolverEnteroRegex(String mensaje, String regex) {
        String sNumero = "";
        do {
            System.out.println(mensaje);
            sNumero = SCANNER.nextLine();
        } while (!sNumero.matches(regex));
        int iNumero = Integer.parseInt(sNumero);
        return iNumero;
    }
    private static int solicitarAUsuarioNumRectangulos() {
        String mensaje = "Indica el nº de rectángulos a crear (2-15) inclusive";
        String regex = "[2-9]|1[0-5]";
        int iNumeroRectangulos = devolverEnteroRegex(mensaje, regex);
        return iNumeroRectangulos;
    }

    private static Rectangulo crearRectangulo() {

        Rectangulo rectangulo = new Rectangulo();
        System.out.printf("Rectángulo inicial: %s%n", rectangulo);

        String mensaje = "Dame alto del rectángulo (1-25) inclusive";
        String regex = "[1-9]|1[0-9]|2[0-5]";
        int iAlto = devolverEnteroRegex(mensaje, regex);

        mensaje = "Dame ancho del rectángulo (1-60) inclusive";
        regex = "[1-9]|[1-5][0-9]|60";
        int iAncho = devolverEnteroRegex(mensaje, regex);

        rectangulo.setAlto(iAlto);
        rectangulo.setAncho(iAncho);

        return rectangulo;
    }
}
