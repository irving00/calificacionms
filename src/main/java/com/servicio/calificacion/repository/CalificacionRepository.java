package com.servicio.calificacion.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.servicio.calificacion.entity.Calificacion;

public interface CalificacionRepository extends JpaRepository<Calificacion, Long> {
	

	List<Calificacion> findByUsuarioId(String usuarioId);
	
	List<Calificacion> findByHotelId(String hotelId);

	
	
}
