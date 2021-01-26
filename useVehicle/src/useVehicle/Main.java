package useVehicle;

public class Main {

	public static void main(String[] args) {
		Coche micoche1=new Coche();

        micoche1.setColor("rojo");

        Furgoneta mifurgoneta1= new Furgoneta(7, 580);

        mifurgoneta1.setColor("azul");

        mifurgoneta1.setAsientos("Si");

        mifurgoneta1.setClimatizador("si");

        System.out.println(micoche1.getDatos_generales() + ". " + micoche1.getColor());

        System.out.println(mifurgoneta1.getDatos_generales() + ". " + mifurgoneta1.getDatosFurgoneta());


    }
}