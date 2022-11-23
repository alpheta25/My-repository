package poo;

public class Tarjeta_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tarjeta tarjeta = new Tarjeta("BBVA", 487521, 828, "Raul Lozano");
		
		tarjeta.setActivo(false);
		tarjeta.getInfo();
		tarjeta.pagar(100);
		tarjeta.pagar(900);
		
		
	}

}
