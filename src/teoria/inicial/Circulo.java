package teoria.inicial;

public class Circulo {
    //atribtutos
    private int radio = 5;

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public double getArea() {
        return Math.PI * radio * radio;
    }

    //método que calcule la longitud
    public double getLongitud(){
        return 2.0 * Math.PI * radio;
    }

    //toString CÍRCULO, de radio 9, de longitud 56,55 y área 254,47

    @Override
    public String toString() {
        return String.format(
                "CÍRCULO, de radio %d, de longitud %.2f y área %.2f",
                    radio, getLongitud(), getArea());
    }
}
