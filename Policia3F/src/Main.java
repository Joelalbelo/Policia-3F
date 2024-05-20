
public class Main {
    public static void main(String[] args) {
        //Armas cortas
        Policia joel = new Policia("Joel", "Albelo", 112211);
        ArmaCorta glock = new ArmaCorta(joel, 20, 9, 199, "Glock ink", "EN USO", "Automatica");
        System.out.println("Glock: "+glock.toString());
        glock.saberAlcance();
        glock.isTipo();
        glock.alcanceMax();
        glock.condicion();
        System.out.println();


        Policia maria = new Policia("Maria", "Gonzalez", 223344);
        ArmaCorta beretta = new ArmaCorta(maria, 15, 9, 150, "Beretta", "EN USO", "Manual");
        System.out.println("Beretta: "+beretta.toString());
        beretta.condicion();
        beretta.isTipo();
        System.out.println();


        Policia pedro = new Policia("Pedro", "Lopez", 34455);
        ArmaCorta sigSauer = new ArmaCorta(pedro, 17, 9, 220, "SIG Sauer", "EN USO", "Automatica");
        System.out.println("SigSauer: " +sigSauer.toString());
        sigSauer.alcanceMax();

        System.out.println();
        System.out.println("######");
        System.out.println();


        //Armas Largas
        Policia pili =new Policia("Javier","Alonso",122);
        ArmaLarga kark = new ArmaLarga(pili,40,17,1000,"Kark INQ","EN USO","Arma historica, de guerra, con mira incluida. Posee muy bien alncance, siendo de los mejores rifles. Soicitada para escoltar al Presidente, en acto presidencial.",5,true);
        kark.condicion();
        System.out.println("Kark: "+kark.toString());
        kark.Renar();
        System.out.println();



        Policia laura = new Policia("Laura", "Fernandez", 123);
        ArmaLarga winchester = new ArmaLarga(laura, 15, 30,800, "Winchester Model 70", "EN USO", "Rifle de precisión, utilizado en operaciones tácticas. Reconocido por su fiabilidad y precisión. Solicitado para utilizacion en toma de rehenes", 4,true);
        System.out.println("Winchester: "+winchester.toString());
        System.out.println();


        Policia carlos = new Policia("Carlos", "Martinez", 124);
        ArmaLarga remington = new ArmaLarga(carlos, 5, 50, 1200, "Remington 700", "En mantenimiento","Arma de francotirador, ideal para largas distancias. Utilizada por fuerzas especiales en misiones críticas." , 3, true);
        System.out.println("Remington: "+remington.toString());
        remington.condicion();
        System.out.println();


        kark.comparar(winchester);
        remington.comparar(winchester);




    }
}