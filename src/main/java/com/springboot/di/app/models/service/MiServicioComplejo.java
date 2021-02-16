package com.springboot.di.app.models.service;

import org.springframework.stereotype.Service;

@Service("miServicioComplejo")
public class MiServicioComplejo implements IMiServicio{

	@Override
	public String operacion() {
		return "Ejecutando una operación de servicio complejo";
	}

}
