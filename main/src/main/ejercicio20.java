package main;

public class ejercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =0;
		
	do {
		
		for (int i = 0; i < 3; i++) {
			System.out.println(++num);
		}
	} while(num!=3);
		
	System.out.println("Has salido del bucle");
	
	while (num!=6) {
		for (int i = 0; i < 5; i++) {
			++num;
			if (num < 5) {
				System.out.println(num + "Iteracion ");
			}
		}
		System.out.println("Saliste de la iteracion pero no del bucle");
		break;
		
	}
	

		
		
		
		
		
	}

}
