package com.servicio.calificacion.services;

import java.util.List;

import com.servicio.calificacion.entity.Calificacion;

public interface CalificacionService {
	
	Calificacion create(Calificacion calificacion);
	
	List<Calificacion> getAllListCalificacion();
	
	List<Calificacion> getAllListusuarioId(String usuarioId);
	
	List<Calificacion> getAllListhotelId(String hotelId);
	
	
	

}
