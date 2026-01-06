package com.servicio.calificacion.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.servicio.calificacion.entity.Calificacion;
import com.servicio.calificacion.repository.CalificacionRepository;
import com.servicio.calificacion.services.CalificacionService;

@Service
public class CalificacionServiceImpl implements CalificacionService {

	
	@Autowired
	private CalificacionRepository calificacionRepository;
	
	@Override
	public Calificacion create(Calificacion calificacion) {
		return calificacionRepository.save(calificacion);
	}

	@Override
	public List<Calificacion> getAllListCalificacion() {
	return calificacionRepository.findAll();
			
			
	}

	@Override
	public List<Calificacion> getAllListusuarioId(String usuarioId) {
		return calificacionRepository.findByUsuarioId(usuarioId);
	}

	@Override
	public List<Calificacion> getAllListhotelId(String hotelId) {
		return calificacionRepository.findByHotelId(hotelId);
		
	}
	
	

}
