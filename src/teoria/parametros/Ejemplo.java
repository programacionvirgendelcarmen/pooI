package teoria.parametros;

public class Ejemplo {
    public static void main(String[] args) {
        calcularMedia1(new int[]{1, 2, 4, 5, 2, 5});
        calcularMedia2(1, 2, 3, 4, 2, 5);
    }
    public static void calcularMedia1 (int[] numeros){
        double suma = 0;
        for ( int  numero : numeros) {
            suma += numero;
        }
        System.out.printf("El valor medio es %.2f%n", suma / numeros.length);
    }
    public static void calcularMedia2 (int... numeros){
        double suma = 0;
        for ( int  numero : numeros) {
            suma += numero;
        }
        System.out.printf("El valor medio es %.2f%n", suma / numeros.length);
    }
}
