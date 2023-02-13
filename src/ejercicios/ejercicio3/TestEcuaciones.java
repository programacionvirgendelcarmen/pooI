package ejercicios.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class TestEcuaciones {
    public static void main(String[] args) {
        List<EcuacionSegundoGrado> lista = new ArrayList<>();
        EcuacionSegundoGrado e1 = new EcuacionSegundoGrado(3, -1, 7);
        EcuacionSegundoGrado e2 = new EcuacionSegundoGrado(-3, -1, 7);
        EcuacionSegundoGrado e3 = new EcuacionSegundoGrado(1, -2, 1);
        EcuacionSegundoGrado e4 = new EcuacionSegundoGrado(-1, 0, -2);
        EcuacionSegundoGrado e5 = new EcuacionSegundoGrado(-1, -1, 0);
        EcuacionSegundoGrado e6 = new EcuacionSegundoGrado(1, -0, 0);
        lista.add(e1); lista.add(e2); lista.add(e3);
        lista.add(e4); lista.add(e5); lista.add(e6);
        mostrarSoluciones(lista);
    }

    private static void mostrarSoluciones(List<EcuacionSegundoGrado> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Ecuación: " + (i + 1));
            if (!lista.get(i).esResoluble()){
                System.out.println("Ecuación no resoluble");
                continue;
            }
            if (lista.get(i).tieneUnaUnicaSolucion()){
                System.out.printf("Una única solución es %.1f%n", lista.get(i).getX1());
                continue;
            }
            System.out.println(lista.get(i));

        }
    }
}
