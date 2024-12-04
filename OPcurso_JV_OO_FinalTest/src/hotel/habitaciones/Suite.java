package hotel.habitaciones;

public class Suite extends Habitacion {

	String nombre;
	int numeroPlazas;
	String serviciosExtra;
	
	
	public Suite( int numero, float precio, String descripion) {
		super(numero, precio, descripion);
		
	}

	public Suite(int numero, float precio, String descripion, String nombre, int numeroPlazas, String serviciosExtra) {
		super(numero, precio, descripion);
		this.nombre = nombre;
		this.numeroPlazas = numeroPlazas;
		this.serviciosExtra = serviciosExtra;
	}
	
	
	
	

}
