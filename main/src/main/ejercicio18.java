package main;

public class ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String c = "* ";
        String b = "  ";
        int altura = 12;
        int ancho = 1;
        for (int i = 0; i < altura/4; i++){
            //dibuja los blancos
            for (int k = 0; k < altura - i; k++){
                System.out.print(b);
            }
            for (int j = 0; j < i*2 + ancho; j++){
                System.out.print(c);
            }
            
            System.out.print("\n");
        }
         for (int i = 0; i < altura/4; i++){
            //dibuja los blancos
            for (int k = 0; k < (altura - i) - 2; k++){
                System.out.print(b);
            }
            for (int j = 0; j < i*2 + 5; j++){
                System.out.print(c);
            }
            
            System.out.print("\n");
        }
        for (int i = 0; i < altura/4; i++){
            //dibuja los blancos
            for (int k = 0; k < (altura - i) - 4; k++){
                System.out.print(b);
            }
            for (int j = 0; j < i*2 + 9; j++){
                System.out.print(c);
            }
            
            System.out.print("\n");
        }
        for (int i = 0; i < altura/4; i++){
            //dibuja los blancos
            for (int k = 0; k < (altura - i) - 6; k++){
                System.out.print(b);
            }
            for (int j = 0; j < i*2 + 13; j++){
                System.out.print(c);
            }
            
            System.out.print("\n");
        }
        for (int i = 0; i < altura/6; i++){
            //dibuja los blancos
            for (int k = 0; k < altura -2; k++){
                System.out.print(b);
            }
            for (int j = 0; j < 4; j++){
                System.out.print(c);
            }
            
            System.out.print("\n");
        }
	}

}
