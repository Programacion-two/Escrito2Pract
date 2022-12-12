package logica;
public class Vehiculo {

	private String marca;
	private double precio;
	private String matricula;
	private Fecha fechaCompra;
	
	
	public double descuentoNeto() {
		if(fechaCompra.getAnio()<2010) {
			return precio*0.20;
		}
		return precio;
	}
	
	

	public Vehiculo() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Vehiculo(String marca, double precio, String matricula, Fecha fechaCompra) {
		this.marca = marca;
		this.precio = precio;
		this.matricula = matricula;
		this.fechaCompra = fechaCompra;
	
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	
    }
    
	public double descontarPatente() {
		double monto=0;
		if (precio>10000)
		
		monto=precio*0.10; 
	    return monto;
	    
	}



	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", precio=" + precio + ", matricula=" + matricula + ", fechaCompra="
				+ fechaCompra + ", descuentoNeto()=" + descuentoNeto() + ", descontar patente=" + descontarPatente()
				+ "]";
	}

	
}

