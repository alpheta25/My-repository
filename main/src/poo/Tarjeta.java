package poo;

public class Tarjeta {

	private String entidad_bancaria;
	private int numero;
	private int fecha_caducidad;
	private String titular;
	
	private int saldo = 1000;
	
	public Tarjeta(String entidad, int numero, int fecha, String titular) {
		this.entidad_bancaria= entidad;
		this.numero = numero;
		this.fecha_caducidad= fecha;
		this.titular = titular;
	
		
	}
	
	public void getInfo() {
		System.out.println("Entidad "+ getEntidad_bancaria() + ", Numero " + getNumero() + ", Fecha Caducidad " + getFecha_caducidad()
		+ ", Titular " + getTitular() + ", Saldo " + getSaldo());

	}
	
	public void pagar(int pagar) {
		 int saldoactual = this.saldo;
		 
		 if (saldoactual !=0) {
			saldoactual = saldoactual - pagar;
			if (saldoactual <= 0) {
				saldoactual = 0;
				System.out.println("Saldo Actual:" + saldoactual);
				setSaldo(saldoactual);
			}
			System.out.println("Nuevo Saldo: " + saldoactual);
			setSaldo(saldoactual);
			 pagar(pagar);
		}else {
			System.out.println("saldo actual 0 o inferior a 0: " + saldoactual);
		}
		
		
	}


	public String getEntidad_bancaria() {
		return entidad_bancaria;
	}


	public void setEntidad_bancaria(String entidad_bancaria) {
		this.entidad_bancaria = entidad_bancaria;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public int getFecha_caducidad() {
		return fecha_caducidad;
	}


	public void setFecha_caducidad(int fecha_caducidad) {
		this.fecha_caducidad = fecha_caducidad;
	}


	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}


	public int getSaldo() {
		return saldo;
	}


	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	
	
	
	
}
