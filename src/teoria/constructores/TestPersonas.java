package teoria.constructores;

import java.util.Scanner;

public class TestPersonas {
    public static void main(String[] args) {
        //creamos lista de objetos persona
        Scanner scanner = new Scanner(System.in);
        String sNPersonas = "";
        do {
            System.out.println("Nº personas a registrar (1-10)");
            sNPersonas = scanner.nextLine();
        } while (! sNPersonas.matches("[1-9]|10"));
        int iNpersonas = Integer.parseInt(sNPersonas);
        for (int i = 0; i < iNpersonas; i++) {
            //do while para el nombre, no puede haber números ni símbolos
            //do while para la edad 6-99
            //do while para teléfono, tiramos del check de la librería
            //creo objeto persona
            //añado a la lista
        }
        //llamar al método mostrar datos
        //llamar al método que devuelve la persona(s) mas joven
    }
}
