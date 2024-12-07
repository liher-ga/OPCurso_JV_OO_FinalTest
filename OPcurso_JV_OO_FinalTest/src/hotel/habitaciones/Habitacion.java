package hotel.habitaciones;

import java.util.Objects;

public class Habitacion {

	private int numero;
	private float precio;
	private String descripcion;
	
	public Habitacion(int numero,float precio, String descripion) {
		this.numero = numero;
		this.precio = precio;
		this.descripcion = descripion;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override

	public String toString() {
		return "Habitacion [numero=" + numero + ", precio=" + precio + ", descripcion=" + descripcion + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(descripcion, numero, precio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Habitacion other = (Habitacion) obj;
		return Objects.equals(descripcion, other.descripcion) && numero == other.numero
				&& Float.floatToIntBits(precio) == Float.floatToIntBits(other.precio);
	}
	
	

	
}
