package teoria.constructores;

public class Persona {
    private String nombrePersona;
    private String telefonoPersona;
    private int edadPersona;

    public Persona() {
    }

    public Persona(String nombrePersona, String telefonoPersona, int edadPersona) {
        this.nombrePersona = nombrePersona;
        this.telefonoPersona = telefonoPersona;
        this.edadPersona = edadPersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getTelefonoPersona() {
        return telefonoPersona;
    }

    public void setTelefonoPersona(String telefonoPersona) {
        this.telefonoPersona = telefonoPersona;
    }

    public int getEdadPersona() {
        return edadPersona;
    }

    public void setEdadPersona(int edadPersona) {
        this.edadPersona = edadPersona;
    }

    @Override
    public String toString() {
        return String.format("%S-%d-%s",
                nombrePersona, edadPersona, telefonoPersona);
    }
}
