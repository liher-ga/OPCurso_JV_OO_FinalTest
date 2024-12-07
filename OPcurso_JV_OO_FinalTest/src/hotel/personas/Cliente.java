package hotel.personas;

public class Cliente extends Huesped{
	
	

	

	private String tarjetaCredito;
	
	public Cliente(String nombre, String dni, int edad,String tarjetaCredito) {
		super(nombre, dni, edad);
		this.tarjetaCredito = tarjetaCredito;
	}

	public String getTarjetaCredito() {
		return tarjetaCredito;
	}

	public void setTarjetaCredito(String tarjetaCredito) {
		this.tarjetaCredito = tarjetaCredito;
	}
	
	@Override
	public String toString() {
		return "Cliente [nombre=" + super.nombre + ", dni=" + super.dni + ", edad=" + super.edad + ", tarjetaCredito =" + tarjetaCredito + "]";
	}

}
