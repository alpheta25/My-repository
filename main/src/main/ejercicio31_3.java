package main;

public class ejercicio31_3 {
	
	public static void main(String[] args) {
		ejercicio31_3 m = new ejercicio31_3();
		
		m.stringToChar("Supercalifragilisticoespialidoso", "");
		
	}

	public void stringToChar(String palabra, String vacio) {
		if (palabra.length()!=0) {
			vacio += String.valueOf(palabra.charAt(palabra.length()-1));
			palabra = String.valueOf(palabra.subSequence(0, palabra.length()-1));
			stringToChar(palabra, vacio);
		}else {
			System.out.println(vacio);
		}
	}
	
	

}
