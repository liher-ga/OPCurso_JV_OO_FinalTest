package app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

import hotel.gestion.Hotel;
import hotel.gestion.Reserva;
import hotel.habitaciones.Habitacion;
import hotel.habitaciones.HabitacionDoble;
import hotel.habitaciones.Suite;
import hotel.personas.Cliente;
import hotel.personas.Huesped;
import hotel.personas.Persona;

public class app {

	public static void main(String[] args) {
		
		/*OPERACIONES QUE VAMOS A REALIZAR
			● Inicializar las habitaciones del hotel, con sus datos.
			● Agregar una reserva (sin comprobación).
			● Mostrar las reservas.
			● Identificar si una habitación está disponible.
			● Mostrar todas las habitaciones indicando su disponibilidad hoy.
			● Obtener todas las habitaciones disponibles de un tipo.
			● Agregar reserva (con comprobación).
			*/
		// Reservas
		
		//crear Hotel
		
		Hotel hotelGranhotel = new Hotel(null, null, 10);
		
		// Inicializar las habitaciones del hotel, con sus datos (8 dobles y 2 suite).
		
		Habitacion habitacionDonbleN1 = new HabitacionDoble(1,30.00f,"habitacion doble cama matrimonio");
		Habitacion habitacionDonbleN2 = new HabitacionDoble(2,30.00f,"habitacion doble cama matrimonio");
		Habitacion habitacionDonbleN3 = new HabitacionDoble(3,30.00f,"habitacion doble cama matrimonio");
		Habitacion habitacionDonbleN4 = new HabitacionDoble(4,30.00f,"habitacion doble cama matrimonio");
		Habitacion habitacionDonbleN5 = new HabitacionDoble(5,25.00f,"habitacion doble cama dos camas");
		Habitacion habitacionDonbleN6 = new HabitacionDoble(6,25.00f,"habitacion doble cama dos camas");
		Habitacion habitacionDonbleN7 = new HabitacionDoble(7,25.00f,"habitacion doble cama dos camas");
		Habitacion habitacionDonbleN8 = new HabitacionDoble(8,40.00f,"habitacion doble cama matrimonio vistas al mar");

		Habitacion habitacionSuiteN1 = new Suite(1,120.00f,"Suite panoramica con vistas al cantabrico","Panoramix",4,"Champane ilimitado");
		Habitacion habitacionSuiteN2 = new Suite(2,90.00f,"Suite sencilla con vista montaña","Montañitas",3,"Relago de bien venida");
		
		
		Habitacion[] habitacionesHotel = {habitacionDonbleN1,habitacionDonbleN2,habitacionDonbleN3,habitacionDonbleN4,
				habitacionDonbleN5,habitacionDonbleN6,habitacionDonbleN7,habitacionDonbleN8,habitacionSuiteN1,habitacionSuiteN2};
		hotelGranhotel.setHabitaciones(habitacionesHotel);
		
		// Agregar una reserva (sin comprobación).
		Cliente cliente1 = new Cliente("Carlos arguiñano","33456723T",34,"2345678901234");
		Huesped huesped1 = new Huesped("Jose carlos", "44505645A", 23);
		Huesped huesped2 = new Huesped("Untzane gorri", "44505645A", 23);
		Huesped huesped3 = new Huesped("Loretxo Jurraniz", "455505645A", 24);
		
		Huesped[] huespedes = {huesped1,huesped2,huesped3};
		
		
		LocalDate fechaReserva = LocalDate.now();;
		Reserva reserva1 = new Reserva(fechaReserva ,3,cliente1,huespedes,habitacionDonbleN3);
		Reserva[] reservas = {reserva1};

		hotelGranhotel.setReservas(reservas);
		
		//Mostrar las reservas.
		System.out.println("-------Mostrar las reservas.----------------");
		Reserva[] reservasExistentes = hotelGranhotel.getReservas();
		for (int i = 0; reservasExistentes.length -1 >= i; i++) {
		
			System.out.println(reservasExistentes[i].toString());
		}
		
		//Identificar si una habitación está disponible.
		System.out.println("-------Identificar si una habitación está disponible.----------------");
		Habitacion habitacionCheckear = habitacionDonbleN7;
		boolean disponible = true;
		System.out.println("¿Esta disponible la habitación numero " + habitacionCheckear.getNumero() + " "+ habitacionCheckear.getDescripcion() + " ?");
		
		
		for (int i = 0; reservasExistentes.length -1 >= i; i++) {
			if (reservasExistentes[i].getHabitacion().equals(habitacionCheckear)) {
				disponible = false;
			};
		}
		
		if (disponible) {
			System.out.println("La habitación numero " + habitacionCheckear.getNumero() + " " + habitacionCheckear.getDescripcion() + ", esta DISPONIBLE");
		}else{
			System.out.println("NO, la habitación numero " + habitacionCheckear.getNumero() + " " + habitacionCheckear.getDescripcion() + ", esta ocupada");
		};
		
		//Mostrar todas las habitaciones indicando su disponibilidad hoy.
		
		hotelGranhotel.disponibleParaUnaFecha(LocalDate.now());
		
		//Obtener todas las habitaciones disponibles de un tipo (para una fecha)
		System.out.println("-------Obtener todas las habitaciones disponibles de un tipo (para una fecha)----------------");
		//doble
		ArrayList<Habitacion> habitacionesDisponibles = hotelGranhotel.disponibleTipoParaUnaFecha("doble",LocalDate.now());
		
		for (Habitacion habitacion : habitacionesDisponibles) {
			System.out.println("La " + habitacion + " ESTA DISPONIBLE");
		}

		

	}
	
	

}
