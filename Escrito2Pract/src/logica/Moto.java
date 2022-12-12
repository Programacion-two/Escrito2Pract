package logica;

public class Moto extends Vehiculo {
	private int cilindrada;

	
	public double descuentoNeto() {
		if(cilindrada<100) {
			return cilindrada*0.10;
		}
		return cilindrada;
	}
	
	public Moto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Moto(String marca, double precio, String matricula, Fecha fechaCompra, int cilindrada) {
		super(marca, precio, matricula, fechaCompra);
		this.cilindrada=cilindrada;
		
		// TODO Auto-generated constructor stub
		
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return "Moto [cilindrada=" + cilindrada + ", descuento neto= " + super.descuentoNeto()+"]";
	}
	
	
}
