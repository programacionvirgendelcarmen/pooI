package ejercicios.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class TestEcuaciones {
    public static void main(String[] args) {
        List<SistemasEcuanciones> lista = new ArrayList<>();
        SistemasEcuanciones s1 = new SistemasEcuanciones(
                1, 1, 2, 2, 1, 2);
        lista.add(s1);
        SistemasEcuanciones s2 = new SistemasEcuanciones(
                2, 1, -1, 2, 7, -1);
        lista.add(s2);
        mostrarSoluciones(lista);
    }

    private static void mostrarSoluciones(List<SistemasEcuanciones> lista) {
        for (SistemasEcuanciones s : lista) {
            if (! s.esResoluble()) {
                System.out.println("Ecuación no resoluble");
                continue;
            }
            System.out.println(s);
        }
    }
}
