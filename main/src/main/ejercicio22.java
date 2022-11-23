package main;


public class ejercicio22 {

	public static void main(String[] args) {
		final String reset = "\033[0m";
		final String blue    = "\033[48;5;27m      " + reset;
		final String yellow  = "\033[48;5;3m      " + reset;
		final String blanco  = "\033[48;5;15m      " + reset;
		final String rojo    = "\033[48;5;1m      " + reset;
		final String black   = "\033[48;5;232m      " + reset;
		
		
		 //Bandera Ucrania
		 for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println(blue + blue);
			}
			System.out.println(yellow  + yellow + "\n" + yellow + yellow  + "\n");
							
		}
		 
		 
		 
		 //Bandera Francia
		for (int i = 0; i < 8; i++) {
			System.out.println(blue + blanco + rojo);
		}
		
		//Bandera España
		for (int i = 0; i < 1; i++) {
			System.out.println("\n" + rojo  + rojo  + "\n" + rojo + rojo);
			
			for (int j = 0; j < 4; j++) {
				System.out.println(yellow + yellow );
			}
			System.out.println(rojo +rojo +  "\n" + rojo  + rojo + "\n");
			
		}
		
		//Bandera Cataluña
		for (int i = 0; i < 5; i++) {
			System.out.println(yellow +  yellow);
			
			if (i <4) {
				System.out.println(rojo +  rojo );
			}
		}
		
		System.out.println();
		
		//Bandera Alemana
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println(black + black );
			}
			for (int j = 0; j < 2; j++) {
				System.out.println(rojo + rojo );
			}
			for (int j = 0; j < 2; j++) {
				System.out.println(yellow + yellow );
			}
			
			System.out.println();
		}
		
		//Bandera Greacia
		
		for (int i = 0; i < 1; i++) {
			
			System.out.println(blue + blanco + blue + blue + blue);
			System.out.println(blue + blanco + blue + blanco + blanco);
		
			System.out.println(blanco + blanco + blanco + blue + blue);
			
			System.out.println(blue + blanco + blue + blanco + blanco);
			System.out.println(blue + blanco + blue + blue + blue);
			for (int j = 0; j < 2; j++) {
				System.out.println(blanco + blanco + blanco + blanco + blanco);
				System.out.println(blue + blue + blue + blue + blue);
			}
		}

	}

}
