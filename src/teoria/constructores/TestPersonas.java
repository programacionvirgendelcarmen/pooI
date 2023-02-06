package teoria.constructores;

import strings.StringHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestPersonas {
    public static void main(String[] args) {
        //creamos lista de objetos persona
        List<Persona> personas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String sNPersonas = "";
        do {
            System.out.println("Nº personas a registrar (1-10)");
            sNPersonas = scanner.nextLine();
        } while (! sNPersonas.matches("[1-9]|10"));
        int iNpersonas = Integer.parseInt(sNPersonas);
        for (int i = 0; i < iNpersonas; i++) {
            //do while para el nombre, no puede haber números ni símbolos
            String nombrePersona = "";
            do {
                System.out.println("Indica el nombre de persona " + (i + 1));
                nombrePersona = scanner.nextLine();
            } while (! nombrePersona.toLowerCase().
                    matches("[a-záéíóúüñ -]+"));
            //do while para la edad 6-99
            String sEdad = "";
            do {
                System.out.println("Edad  (6-99) " + (i + 1));
                sEdad = scanner.nextLine();
            } while (! sEdad.matches("[6-9]|[1-9][0-9]"));
            int iEdad = Integer.parseInt(sEdad);
            //do while para teléfono, tiramos del check de la librería
            String telefono = "";
            do {
                System.out.println("Indica un teléfono correcto " + (i + 1));
                telefono = scanner.nextLine();
            } while (!StringHelper.checkPhoneNumber(telefono));
            //creo objeto persona
            Persona persona = new Persona(nombrePersona, telefono, iEdad);
            //añado a la lista
            personas.add(persona);
            System.out.println();
        }
        scanner.close();
        //llamar al método mostrar datos
        System.out.println("Datos personas");
        mostrarDatosPersonas(personas);
        //llamar al método que devuelve la persona(s) mas joven
        List<Persona> personasMasJovenes = obtenerPersonasJovenes(personas);
        System.out.println("Datos de jóvenes");
        System.out.println(personasMasJovenes);
    }

    private static List<Persona> obtenerPersonasJovenes(List<Persona> personas) {
        List<Persona> listaJovenes = new ArrayList<>();
        int edadMin = 100;
        for (Persona persona : personas){
            if (persona.getEdadPersona() == edadMin){
                listaJovenes.add(persona);
                continue;
            }
            if (persona.getEdadPersona() < edadMin){
                listaJovenes.clear();
                listaJovenes.add(persona);
                edadMin = persona.getEdadPersona();
            }
        }
        return listaJovenes;

    }

    private static void mostrarDatosPersonas(List<Persona> personas) {
        for(Persona persona : personas) System.out.println(persona);
    }
}
