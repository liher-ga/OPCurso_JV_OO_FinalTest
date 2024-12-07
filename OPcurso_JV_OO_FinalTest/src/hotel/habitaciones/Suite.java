package hotel.habitaciones;

import java.util.Objects;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(nombre, numeroPlazas, serviciosExtra);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Suite other = (Suite) obj;
		return Objects.equals(nombre, other.nombre) && numeroPlazas == other.numeroPlazas
				&& Objects.equals(serviciosExtra, other.serviciosExtra);
	}

	public String getServiciosExtra() {
		return serviciosExtra;
	}

	public void setServiciosExtra(String serviciosExtra) {
		this.serviciosExtra = serviciosExtra;
	}
	
	
	
	

}
