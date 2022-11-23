package poo;

public class car {
	private String Marca;
	private int Asientos;
	private int Puertas;
	
	
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		this.Marca = marca;
	}
	public int getAsientos() {
		return Asientos;
	}
	public void setAsientos(int asientos) {
		this.Asientos = asientos;
	}
	public int getPuertas() {
		return Puertas;
	}
	public void setPuertas(int puertas) {
		this.Puertas = puertas;
	}
	
	public car() {
		
	}
	
	public car(String Marca, int Asientos, int Puertas) {
		this.Marca = Marca;
		this.Asientos = Asientos;
		this.Puertas = Puertas;
	}
	
	public void getInfo() {
		System.out.println("Marca "+ getMarca() + ", Asientos " + getAsientos() + ", Puertas " + getPuertas() );
	}
}
