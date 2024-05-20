

public class ArmaLarga extends Arma implements Comparable{
    //Atributos
    private boolean sello;
    private String descripcion;
    private int nivel;

    //Constructor

    public ArmaLarga(Policia policia, int cantidadMun, int calibre, double alcance, String marca, String estado, String descripcion, int nivel, boolean sello) {
        super(policia, cantidadMun, calibre, alcance, marca, estado);
        this.descripcion = descripcion;
        this.nivel = nivel;
        this.sello = sello;
    }

    //Getter


    public int getNivel() {
        return nivel;
    }

    //Metodos
    public void Renar(){
        if (sello=true){
            System.out.println("HABILITADA CON SELLO RENAR");
        }else {
            System.out.println("Carece de SELLO RENAR");
        }
    }



    //Implementacion del metodo heredado por extender de Arma
    @Override
    public String toString() {
        return "ArmaLarga{" +
                "nivel=" + nivel +
                ", descripcion='" + descripcion + '\'' +
                ", sello=" + sello +
                ", alcance=" + alcance +
                ", calibre=" + calibre +
                ", estado='" + estado + '\'' +
                ", cantidadMun=" + cantidadMun +
                ", marca='" + marca + '\'' +
                ", policia=" + policia +
                '}';
    }


    @Override
    public void condicion() {
        super.condicion();
    }

    // Implementación del método heredado de la interfaz Comparable
        @Override
        public int comparar(ArmaLarga otra) {
            final int resultado;
            resultado =  Integer.compare(this.nivel, otra.nivel);
            if (resultado>0){
                System.out.println("Arma n1 es de mayor nivel");

            }else {
                System.out.println("Arma n2 es de mayor nivel");
            }
            return resultado;

        }
}

