package consola;
import logica.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fecha f = new Fecha(15,4,2004);
		Fecha f1 = new Fecha(16,4,2004);
		Vehiculo v1 = new Vehiculo("BMW",30000, "1111", f);
		Vehiculo v2 = new Vehiculo("Vlkswagen",40000,"2222", f1);
		Moto m = new Moto("Honda", 2000, "3333", f1, 1000);
		Moto m1 = new Moto("susuki", 1000, "4444", f1, 2000);
		
		
		System.out.println(v1.toString());
		System.out.println(m.toString());
		
		
	}

	
}
