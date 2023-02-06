package ejercicios.ejercicio1;

public class Cilindro {
    private float radio;
    private float altura;

    public Cilindro(float radio, float altura) {
        this.radio = radio;
        this.altura = altura;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getSuperficie() {
        return (float) (2.0 * Math.PI * Math.pow(radio, 2) + 2.0 * Math.PI * radio * altura);
    }

    public float getVolumen() {
        return (float) (Math.PI * Math.pow(radio, 2) * altura);
    }

    @Override
    public String toString() {
        return String.format("CILINDRO: altura %.2f, radio %.2f, superficie %.2f y volumen %.2f",
                altura, radio, getSuperficie(), getVolumen());
    }
}
