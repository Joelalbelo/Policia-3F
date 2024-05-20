abstract class Arma {
    //Atributos
    protected Policia policia;
    protected int cantidadMun, calibre;
    protected double alcance;
    protected String marca;
    protected String estado;

    //Constructor
    public Arma(Policia policia, int cantidadMun, int calibre, double alcance, String marca, String estado) {
        this.policia = policia;
        this.cantidadMun = cantidadMun;
        this.calibre = calibre;
        this.alcance = alcance;
        this.marca = marca;
        this.estado = estado;
    }

    //Metodos
    public void condicion(){
        if ((this.calibre >= 9) && (this.estado.equals("EN USO"))){
            System.out.println("ARMA EN CONDICIONES");
        } else {
            System.out.println("ARMA EN MANTENIMIENTO");
        }
    }

    @Override
    public String toString() {
        return "Arma{" +
                "alcance=" + alcance +
                ", cantidadMun=" + cantidadMun +
                ", calibre=" + calibre +
                ", marca='" + marca + '\'' +
                ", estado=" + estado +
                '}';
    }


    //Getters y Setters

    public double getAlcance() {
        return alcance;
    }

    public void setAlcance(double alcance) {
        this.alcance = alcance;
    }

    public int getCalibre() {
        return calibre;
    }

    public void setCalibre(int calibre) {
        this.calibre = calibre;
    }

    public int getCantidadMun() {
        return cantidadMun;
    }

    public void setCantidadMun(int cantidadMun) {
        this.cantidadMun = cantidadMun;
    }

    public String isEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
