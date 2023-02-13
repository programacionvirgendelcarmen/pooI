package ejercicios.ejercicio2;


public class TrianguloRectangulo {
    private double cateto1;
    private double cateto2;

    public TrianguloRectangulo(double cateto1, double cateto2) {
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
    }

    public TrianguloRectangulo() {
    }
    public double getCateto1() {
        return cateto1;
    }

    public void setCateto1(double cateto1) {
        this.cateto1 = cateto1;
    }

    public double getCateto2() {
        return cateto2;
    }

    public void setCateto2(double cateto2) {
        this.cateto2 = cateto2;
    }
    public double getPerimetro() {
        return cateto1 + cateto2 + getHipotenusa();
    }
    public double getHipotenusa() {
        return Math.hypot(cateto1, cateto2);
    }

    public double getArea() {
        return cateto1 * cateto2 / 2.0;
    }


    @Override
    public String toString() {
        return String.format("%.2f;%.2f;%.2f;%.2f;%.2f",
                cateto1, cateto2, getHipotenusa(),
                getPerimetro(), getArea() );
    }
}
