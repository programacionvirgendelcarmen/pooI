package teoria;

import java.util.Scanner;

public class TestRectangulo {
    private final static Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {

        int numeroRectangulos = solicitarAUsuarioNumRectangulos();
        Rectangulo[] rectangulos = new Rectangulo[numeroRectangulos];
        for (int i = 0; i < numeroRectangulos; i++) {
            Rectangulo rectangulo = crearRectangulo();
            rectangulos[i] = rectangulo;
        }
        mostrarRectangulos(rectangulos);
    }

    private static void mostrarRectangulos(Rectangulo[] rectangulos) {
        for (Rectangulo rectangulo : rectangulos) {
            System.out.println(rectangulo.toString());
        }
    }

    private static int solicitarAUsuarioNumRectangulos() {
        String sNumeroRectangulos = "";
        do {
            System.out.println("Indica el nº de rectángulos a crear (2-15) inclusive");
            sNumeroRectangulos = SCANNER.nextLine();
        } while (!sNumeroRectangulos.matches("[2-9]|1[0-5]"));
        int iNumeroRectangulos = Integer.parseInt(sNumeroRectangulos);
        return iNumeroRectangulos;
    }

    private static Rectangulo crearRectangulo() {
        Rectangulo rectangulo = new Rectangulo();
        String sAlto = "", sAncho = "";
        do {
            System.out.println("Dame alto del rectángulo (1-25) inclusive");
            sAlto = SCANNER.nextLine();
        } while (! sAlto.matches("[1-9]|1[0-9]|2[0-5]"));
        int iAlto = Integer.parseInt(sAlto);
        do {
            System.out.println("Dame ancho del rectángulo (1-60) inclusive");
            sAncho = SCANNER.nextLine();
        } while (! sAncho.matches("[1-9]|[1-5][0-9]|60"));
        int iAncho = Integer.parseInt(sAncho);
        rectangulo.setAlto(iAlto);
        rectangulo.setAncho(iAncho);
        return rectangulo;
    }
}
