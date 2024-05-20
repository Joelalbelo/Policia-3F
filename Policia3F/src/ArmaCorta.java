public class ArmaCorta extends Arma{
    //Atributos
    private String tipo;

    //Constructor

    public ArmaCorta(Policia policia, int cantidadMun, int calibre, double alcance, String marca, String estado, String tipo) {
        super(policia, cantidadMun, calibre, alcance, marca, estado);
        this.tipo = tipo;
    }


    //Metodos


    @Override
    public String toString() {
        return "ArmaCorta{" +
                "tipo=" + tipo +
                ", alcance=" + alcance +
                ", calibre=" + calibre +
                ", cantidadMun=" + cantidadMun +
                ", estado='" + estado + '\'' +
                ", marca='" + marca + '\'' +
                ", policia=" + policia +
                '}';
    }

    public void saberAlcance(){
    if (this.alcance<=200){
        System.out.println("Alcance menor a 200m.");
    } else {
        System.out.println("Alcance mayor a 200m.");
    }
    }

    public void isTipo() {
        if (this.tipo.equals("automatica")){
            System.out.println("Esta arma es automatica.");
        } else {
            System.out.println("Esta arma no es automatica.");
        }
    }

    public void alcanceMax(){
        if (this.alcance>= 200){
            System.out.println("Esta arma es efectiva disparando a mas de 200m.");
        }else {
            System.out.println("Esta arma pierde el 90% de efectividad disparando a mas de 200m");
        }
    }


}
