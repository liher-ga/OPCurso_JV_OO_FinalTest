package app;

import hotel.gestion.Hotel;
import hotel.habitaciones.Habitacion;
import hotel.habitaciones.Suite;

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
		
		//crear Hotel
		
		Hotel hotelGranhotel = new Hotel(null, null, 10);
		
		// Inicializar las habitaciones del hotel, con sus datos (8 dobles y 2 suite).
		
		Habitacion habitacionDonbleN1 = new Habitacion(1,30.00f,"habitacion doble cama matrimonio");
		Habitacion habitacionDonbleN2 = new Habitacion(2,30.00f,"habitacion doble cama matrimonio");
		Habitacion habitacionDonbleN3 = new Habitacion(3,30.00f,"habitacion doble cama matrimonio");
		Habitacion habitacionDonbleN4 = new Habitacion(4,30.00f,"habitacion doble cama matrimonio");
		Habitacion habitacionDonbleN5 = new Habitacion(5,25.00f,"habitacion doble cama dos camas");
		Habitacion habitacionDonbleN6 = new Habitacion(6,25.00f,"habitacion doble cama dos camas");
		Habitacion habitacionDonbleN7 = new Habitacion(7,25.00f,"habitacion doble cama dos camas");
		Habitacion habitacionDonbleN8 = new Habitacion(8,40.00f,"habitacion doble cama matrimonio vistas al mar");

		Habitacion habitacionSuiteN1 = new Suite(1,120.00f,"Suite panoramica con vistas al cantabrico","Panoramix",4,"Champane ilimitado");
		Habitacion habitacionSuiteN2 = new Suite(2,90.00f,"Suite sencilla con vista montaña","Montañitas",3,"Relago de bien venida");
		
		
		
		
		

	}
	
	

}
