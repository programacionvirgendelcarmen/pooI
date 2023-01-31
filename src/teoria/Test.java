package teoria;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //creamos una colección de objetos Circulo
        List<Circulo> circulos = new ArrayList<>();
        Circulo circulo1 = new Circulo();
        System.out.printf("Círculo con valor inicial de radio %d%n", circulo1.getRadio());
        // circulo1.radio = 7; no se puede acceder por ser radio private
        circulo1.setRadio(9);
        circulos.add(circulo1);
        System.out.printf("Círculo con radio %d%n", circulo1.getRadio());
        double area1 = circulo1.getArea();
        System.out.printf("área del círculo vale: %.2f%n", area1);
        System.out.printf("longitud del círculo vale: %.2f%n", circulo1.getLongitud());
        System.out.println(circulo1.toString());
        //creando otro círculo, de radio 12
        Circulo circulo2 = new Circulo();
        circulo2.setRadio(12);
        circulos.add(circulo2);
        System.out.printf("Círculo con radio %d%n", circulo2.getRadio());
        double area2 = circulo2.getArea();
        System.out.printf("área del círculo vale: %.2f%n", area2);
        System.out.printf("longitud del círculo vale: %.2f%n", circulo2.getLongitud());
        System.out.println(circulo2);
        System.out.println("===============V1====================");
        mostrarDatosDeCirculosV1(circulos);
        System.out.println("===============V2====================");
        mostrarDatosDeCirculosV2(circulos);
    }

    private static void mostrarDatosDeCirculosV2(List<Circulo> circulos) {
        for (int i = 0; i < circulos.size(); i++) {
            System.out.printf("%d.- %s%n", i + 1, circulos.get(i));
        }
    }

    private static void mostrarDatosDeCirculosV1(List<Circulo> circulos) {
        for (int i = 0; i < circulos.size(); i++) {
            System.out.printf("%d.- CÍRCULO, de radio %d, de longitud %.2f y área %.2f%n",
                    i + 1 , circulos.get(i).getRadio(),
                    circulos.get(i).getLongitud(), circulos.get(i).getArea());
        }
    }

    //creamos un método que pasamos la colección y muestre para cada objeto:
    // CÍRCULO x(1) de radio xxx con logitud xxx y área xxx
}