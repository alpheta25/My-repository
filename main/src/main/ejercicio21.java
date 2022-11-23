package main;

public class ejercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(javaOrNull("java"));
		System.out.println(login("admin",null));
		System.out.println(imparOPar(2));
	}
	
	public static String javaOrNull(String java) {
		
		return java!="java"?"null": "java";
	}
	
	public static String login(String usuario, String contra) {
		return usuario == "admin" && contra == "1234"? "Login True" : "Login False";
		
	}
	public static String imparOPar(int num) {
		return num%2==0? "Par" : "Impar";
		
	}
	

}
