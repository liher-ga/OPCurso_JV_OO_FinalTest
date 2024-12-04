package hotel.economia;
import hotel.personas.Cliente;
import hotel.gestion.*;

public class Factura {
	
	private Cliente cliente;
	private Reserva reserva;
	private Servicio[] servicios;
	

	public Factura(Cliente cliente, Reserva reserva, Servicio[] servicios) {
		this.cliente = cliente;
		this.reserva = reserva;
		this.servicios = servicios;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Reserva getReserva() {
		return reserva;
	}


	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}


	public Servicio[] getServicios() {
		return servicios;
	}


	public void setServicios(Servicio[] servicios) {
		this.servicios = servicios;
	}
	
	
	

}
