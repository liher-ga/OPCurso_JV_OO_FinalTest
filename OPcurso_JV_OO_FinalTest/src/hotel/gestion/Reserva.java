package hotel.gestion;

import java.time.LocalDate;
import java.util.Arrays;

import hotel.habitaciones.*;
import hotel.personas.*;

public class Reserva {
	
	

	private LocalDate fechaInicio;
	private int numeroDias;
	private Cliente cliente;
	private Huesped[] huespedes;
	private Habitacion habitacion;
	
	public Reserva(LocalDate fechaInicio, int numeroDias, Cliente cliente, Huesped[] huespedes, Habitacion habitacion) {
		super();
		this.fechaInicio = fechaInicio;
		this.numeroDias = numeroDias;
		this.cliente = cliente;
		this.huespedes = huespedes;
		this.habitacion = habitacion;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public int getNumeroDias() {
		return numeroDias;
	}

	public void setNumeroDias(int numeroDias) {
		this.numeroDias = numeroDias;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Huesped[] getHuespedes() {
		return huespedes;
	}

	public void setHuespedes(Huesped[] huespedes) {
		this.huespedes = huespedes;
	}

	public Habitacion getHabitacion() {
		return habitacion;
	}

	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
	}
	
	
	@Override
	public String toString() {
		return "Reserva [fechaInicio=" + fechaInicio + ", numeroDias=" + numeroDias + ", cliente=" + cliente
				+ ", huespedes=" + Arrays.toString(huespedes) + ", habitacion=" + habitacion + "]";
	}
	
	

}
