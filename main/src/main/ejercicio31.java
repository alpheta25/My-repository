package main;

public class ejercicio31 {
	
	int num = 0;
	int contador = 0;
	int num2 = 1;
	public static void main(String[] args) {
		ejercicio31 m = new ejercicio31();
		
		m.arrayRecursiva();
		System.out.println("---------------------------");
		m.arrayRecursivaHtml();
		System.out.println("---------------------------");
		m.calcularFiboI(1, 13);
	}
	
	public void arrayRecursiva() {
		String[] tecnologies = {"Markdown", "Regexp", "HTML", "CSS", "JS", "SQL", "Java"};
		
		
		if (num !=tecnologies.length) {
			System.out.println(tecnologies[0+num]);
			num++;
			arrayRecursiva();
		}
		num=0;
	}
	
	public void arrayRecursivaHtml() {
		String[] tecnologies = {"Markdown", "Regexp", "HTML", "CSS", "JS", "SQL", "Java"};
		
		
		int numMax= 3;
		if (num !=numMax) {
			System.out.println(tecnologies[0+num]);
			num++;
			arrayRecursivaHtml();
		}
		num=0;
	}
	
	int result = 0, resultWithStartValue = 0, maxValue = 0;

	public void calcularFiboII(int oldValue, int newValue) {
		if (maxValue > result) {
			result = oldValue + newValue;
			System.out.print(" " + result);
			oldValue = newValue;
			calcularFiboII(oldValue, result);
		}
	}
	
	public void calcularFiboI(int startInputValue, int maxInputValue) {
		if(maxInputValue > startInputValue) {
		maxValue = maxInputValue;
		System.out.print(startInputValue + " " + startInputValue);
		calcularFiboII(startInputValue, startInputValue);
		}else{
		System.err.println("El número es menor o igual");
		}
	
	}
}
	


