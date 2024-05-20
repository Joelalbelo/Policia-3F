public class Policia {
    public String nombre, apellido;
    public int lejajo;


    public Policia(String nombre, String apellido, int lejajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.lejajo = lejajo;
    }

    @Override
    public String toString() {
        return "Policia{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", lejajo=" + lejajo +
                '}';
    }
}
