package main;

import java.util.Random;

import javax.naming.event.NamespaceChangeListener;

public class ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(26%2==0? "par" : "impar");
		Random random = new Random();
		boolean valor1 = random.nextBoolean();
		boolean valor2 = random.nextBoolean();
		System.out.println(valor1 && valor2 ? "Blanco" : "Negro");
	
	}

}
