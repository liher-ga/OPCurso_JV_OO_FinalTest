package hotel.gestion;

import hotel.habitaciones.*;

public final class Hotel {

	
	private Habitacion[] habitaciones;
	private Reserva[] reservas;
	private int cantidadReservas;
	
	public Hotel(Habitacion[] habitaciones, Reserva[] reservas, int cantidadReservas) {
		this.habitaciones = habitaciones;
		this.reservas = reservas;
		this.cantidadReservas = cantidadReservas;
	}
	
	public Habitacion[] getHabitaciones() {
		return habitaciones;
	}
	public void setHabitaciones(Habitacion[] habitaciones) {
		this.habitaciones = habitaciones;
	}
	public Reserva[] getReservas() {
		return reservas;
	}
	public void setReservas(Reserva[] reservas) {
		this.reservas = reservas;
	}

	public int getCantidadReservas() {
		return cantidadReservas;
	}

	public void setCantidadReservas(int cantidadReservas) {
		this.cantidadReservas = cantidadReservas;
	}
	
	
	
}
