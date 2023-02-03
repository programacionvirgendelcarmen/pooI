package teoria.inicial;

public class Rectangulo {
    private int alto = 1;
    private int ancho = 2;

    public int getAlto() {
        return alto;
    }



    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLongitud(){
        return 2 * alto + 2 * ancho;
    }

    public int getArea() {
        return alto * ancho;
    }

    @Override
    public String toString() {
        return String.format("%d,%d,%d,%d",
                alto, ancho, getLongitud(), getArea());
    }
}
