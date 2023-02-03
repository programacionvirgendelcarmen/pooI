package teoria.constructores;

public class Ejemplo {
    private int atributo1;
    private float atributo2;

    public Ejemplo() {
    }

    public Ejemplo(int atributo1) {
        this.atributo1 = atributo1;
    }

    public Ejemplo(float atributo2) {
        this.atributo2 = atributo2;
    }

    public Ejemplo(int atributo1, float atributo2) {
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
    }

    public int getAtributo1() {
        return atributo1;
    }

    public void setAtributo1(int atributo1) {
        this.atributo1 = atributo1;
    }

    public float getAtributo2() {
        return atributo2;
    }

    public void setAtributo2(float atributo2) {
        this.atributo2 = atributo2;
    }

    @Override
    public String toString() {
        return String.format("%d,%.2f", atributo1, atributo2);
    }
}














