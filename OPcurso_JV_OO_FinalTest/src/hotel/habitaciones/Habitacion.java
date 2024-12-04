package hotel.habitaciones;

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
	

	
}
