package ejercicios.ejercicio2;

public class TestTrianguloRectangulo {
    public static void main(String[] args) {

        TrianguloRectangulo t1 = new TrianguloRectangulo();
        System.out.println(t1);
        t1.setCateto1(5.5);
        t1.setCateto2(3.36);
        System.out.println(t1);

        TrianguloRectangulo t2 = new TrianguloRectangulo(9.98, 7);
        System.out.println(t2);
        t2.setCateto2(7.7);
        System.out.println(t2);
    }
}
