package ejercicios.ejercicio1;

import java.util.Arrays;
import java.util.Scanner;

public class TestCilindro {
    public static void main(String[] args) {
        //coleccion para tres cilíndros
        final int NUMERO_CILINDROS = 3;
        Cilindro[] cilindros = new Cilindro[NUMERO_CILINDROS];
        //Scanner para leer datos
        Scanner scanner = new Scanner(System.in);
        String enteros1 = "([1-9]|1[0-9]|2[0-5])\\.?";
        String rangoCeroPunto1 = "0?\\.[2-9][0-9]*";
        String rangoUnoPuntoHasta26 = "([1-9]|1[0-9]|2[0-5])\\.[0-9][0-9]*";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(enteros1);
        stringBuilder.append('|');
        stringBuilder.append(rangoCeroPunto1);
        stringBuilder.append('|');
        stringBuilder.append(rangoUnoPuntoHasta26);
        String regex1 = stringBuilder.toString();
        String regex = "[0-9]*(\\.[0-9]*)?";
        for (int i = 0; i < NUMERO_CILINDROS; i++) {
            //leemos altura //chequemos que esa altura esté entre 0.2 y 25.9
            String sAltura = "";
            do {
                System.out.println("Introduce altura (0.2 a 25.9) del cilíndro " + (i + 1));
                sAltura = scanner.nextLine();
            } while (!sAltura.matches(regex1));
            float fAltura = Float.parseFloat(sAltura);
            //System.out.println(sAltura);
            //leemos radio //chequeamos que ese radio esté entre 0.1 y 9.8
            String sRadio = "";
            float fRadio = 0;
            do {
                do {
                    System.out.println("Introduce el radio (0.1-9.8) del cilíndro " + (i + 1));
                    sRadio = scanner.nextLine();
                    if (sRadio == ".")
                        sRadio = "0";
                } while (!sRadio.matches(regex));
                fRadio = Float.parseFloat(sRadio);
            } while (fRadio < 0.1 || fRadio > 9.8);
            Cilindro cilindro = new Cilindro(fRadio, fAltura);
            cilindros[i] = cilindro;
        }
        //mostramos datos
        System.out.println(Arrays.toString(cilindros));
        mostrarDatosCilindros(cilindros);
        //mostramos cilindro de mayor volumen
        Cilindro cilindroMayorVolumen = buscarCilindroMayorVolumen(cilindros);
        System.out.printf("Cilindro mayor volumen: %s%n", cilindroMayorVolumen);
        //mostramos cilindro de menor superficie
        Cilindro cilindroMenorSuperficie = buscarCilindroMenorSuperficie(cilindros);
        System.out.printf("Cilindro menor superficie: %s%n", cilindroMenorSuperficie);
    }

    private static Cilindro buscarCilindroMenorSuperficie(Cilindro[] cilindros) {
        float superficieChica = Float.MAX_VALUE;
        Cilindro CilindroMenorsuperficie = null;
        for (Cilindro cilindro : cilindros){
            if (cilindro.getSuperficie() < superficieChica) {
                superficieChica = cilindro.getSuperficie();
                CilindroMenorsuperficie = cilindro;
            }
        }
        return CilindroMenorsuperficie;
    }

    private static Cilindro buscarCilindroMayorVolumen(Cilindro[] cilindros) {
        float volumenGrande = 0;
        Cilindro cilindroMasVolumen = null;
        for (Cilindro cilindro : cilindros){
            if (cilindro.getVolumen() > volumenGrande) {
                volumenGrande = cilindro.getVolumen();
                cilindroMasVolumen = cilindro;
            }
        }
        return cilindroMasVolumen;
    }

    private static void mostrarDatosCilindros(Cilindro[] cilindros) {
        /*for (Cilindro cilindro : cilindros){
            System.out.println(cilindro);
        }*/
        for (int i = 0; i < cilindros.length; i++) {
            System.out.printf("%d.- %s%n", (i + 1), cilindros[i]);
        }
    }
}
