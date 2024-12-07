package hotel.gestion;

import java.time.LocalDate;
import java.util.ArrayList;

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
	
	public void disponibleParaUnaFecha(LocalDate fecha) {
		boolean disponible = true;
		Reserva[] reservasExistentes = this.reservas;
		Habitacion[] habitacionesHotelAux = this.habitaciones;
		disponible = true;
		for (int i = 0; habitacionesHotelAux.length -1 >= i; i++) {
			disponible = true;
			for (int k = 0; reservasExistentes.length -1 >= k; k++) {
				if (reservasExistentes[k].getHabitacion().equals(habitacionesHotelAux[i])) {
					if((reservasExistentes[k].getFechaInicio().isAfter(fecha) || reservasExistentes[k].getFechaInicio().isEqual(fecha))
							&& (reservasExistentes[k].getFechaInicio().isBefore(fecha) || reservasExistentes[k].getFechaInicio().isEqual(fecha))){
						disponible = false;
					}
				};
			}
			
			if (disponible) {
				System.out.println("La habitación numero " + habitacionesHotelAux[i].getNumero() + " " + habitacionesHotelAux[i].getDescripcion() + ", esta DISPONIBLE para el dia de HOY");
			}else{
				System.out.println("NO, la habitación numero " + habitacionesHotelAux[i].getNumero() + " " + habitacionesHotelAux[i].getDescripcion() + ", esta OCUPADA para el dia de HOY");
			};
			
		}
		
	}
	
	public ArrayList<Habitacion> disponibleTipoParaUnaFecha(String tipo, LocalDate fecha) {
		boolean disponible = true;
		//Habitacion[] habitacionesDisponibles= new Habitacion[8];
		ArrayList<Habitacion> habitacionesDisponibles = new ArrayList<>();
		Reserva[] reservasExistentes = this.reservas;
		Habitacion[] habitacionesHotelAux = this.habitaciones;
		int cont = 0;
		
		for (int i = 0; habitacionesHotelAux.length -1 >= i; i++) {
			disponible = true;
			
				for (int k = 0; reservasExistentes.length -1 >= k; k++) {
					if (reservasExistentes[k].getHabitacion().equals(habitacionesHotelAux[i])) {
						if((reservasExistentes[k].getFechaInicio().isAfter(fecha) || reservasExistentes[k].getFechaInicio().isEqual(fecha))
								&& (reservasExistentes[k].getFechaInicio().isBefore(fecha) || reservasExistentes[k].getFechaInicio().isEqual(fecha))){
							disponible = false;
						}
					};
				}
			
			//TODO que pasa si hay una reserva en la misma fecha para un suite y un doble (hay que hacer comprobacion antes)
			if (disponible) {
				if(tipo.equals("doble") && habitacionesHotelAux[i] instanceof HabitacionDoble) {
					habitacionesDisponibles.add(habitacionesHotelAux[i]);
				}else if (tipo.equals("suite") && habitacionesHotelAux[i] instanceof Suite){
					habitacionesDisponibles.add(habitacionesHotelAux[i]);
				}
			
			}
		}
		
		
		return habitacionesDisponibles;
		
		
		
		
		
	}
	
	
	
}
